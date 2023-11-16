CREATE DATABASE SchinchSell

USE ShinchSell

CREATE TABLE Employee (
	id_employee INT IDENTITY(1, 1) PRIMARY KEY NOT NULL,
	[name] NVARCHAR(50) NOT NULL,
	lastname NVARCHAR(50) NOT NULL,
	salary MONEY NOT NULL, 
	username NVARCHAR(50) NOT NULL,
	[password] NVARCHAR(50) NOT NULL
)

CREATE TABLE Supplier (
	id_supplier INT IDENTITY(1, 1) PRIMARY KEY NOT NULL,
	[name] NVARCHAR(50) NOT NULL,
)

CREATE TABLE Inventory (
	id_inventory INT IDENTITY(1, 1) PRIMARY KEY NOT NULL,
	delivery_day DATE NOT NULL,
	id_employee INT NOT NULL,
	FOREIGN KEY (id_employee) REFERENCES Employee(id_employee)
)

CREATE TABLE Product (
	id_product INT IDENTITY(1, 1) PRIMARY KEY NOT NULL,
	name_product NVARCHAR(100) NOT NULL,
	stock INT NOT NULL,
	id_supplier INT NOT NULL,
	FOREIGN KEY (id_supplier) REFERENCES Supplier(id_supplier),
)

-- ALTER TABLE Product DROP COLUMN id_inventory
SELECT *, p.id_supplier AS id FROM Product AS P INNER JOIN Supplier AS S ON P = s.id_supplier
SELECT 
    p.id_product AS product_id,
    p.name_product AS product_name,
    p.stock AS product_stock,
    Supplier.id AS supplier_id,
    Supplier.name AS supplier_name
FROM 
    Product as p
INNER JOIN 
    Supplier ON Product.supplier_id = Supplier.id;
GO

CREATE PROCEDURE getProductsAndSupplier
AS
BEGIN
    SELECT 
        p.*,
        s.[name] AS supplier_name
    FROM
        Product AS p
    INNER JOIN
        Supplier AS s ON p.id_supplier = s.id_supplier;
END;

SELECT 
    Product.id_product AS product_id,
    Product.name_product AS product_name,
    Product.stock AS product_stock,
    Supplier.id_supplier AS supplier_id,
    Supplier.name_supplier AS supplier_name
FROM 
    Product
INNER JOIN 
    Supplier ON Product.id_supplier = Supplier.id_supplier;
GO
-- DROP TABLE Product
CREATE TABLE InventoryDetail (
	id_product INT,
    id_inventory INT,
    PRIMARY KEY (id_product, id_inventory),
    FOREIGN KEY (id_product) REFERENCES Product(id_product),
    FOREIGN KEY (id_inventory) REFERENCES Inventory(id_inventory)
)

ALTER TABLE Employee DROP COLUMN [password]
ALTER TABLE Employee ADD [password] VARBINARY(256)
GO

SELECT * FROM Employee

INSERT INTO Employee ([name], lastname, salary, username, [password])
VALUES ('Admin', 'Admin', 10000, 'Admin', HASHBYTES('SHA2_256', '1234'));

DECLARE @EmployeeID INT;
DECLARE @HashedPassword VARBINARY(256);

-- Retrieve the hashed password and user ID for the given username
SELECT @HashedPassword = [password],
        @EmployeeID = id_employee
FROM Employee
WHERE username = 'Admin';
if @HashedPassword = HASHBYTES('SHA2_256', '1234')
	print @HashedPassword;

GO


CREATE PROCEDURE getEmployeeByID
    @employeeID INT
AS
BEGIN
    SELECT *
    FROM Employee
    WHERE id_employee = @employeeID;
END;
GO

IF EXISTS (
    SELECT 1
    FROM Employee
    WHERE id_employee = 1
      AND HashedPassword = HASHBYTES('SHA2_256', @InputPassword)
)
    PRINT 'Login successful';
ELSE
    PRINT 'Login failed';
GO

CREATE PROCEDURE  authenticateEmployee
    @InputUsername NVARCHAR(50),
    @InputPassword NVARCHAR(50),
    @AuthenticationResult BIT OUTPUT
AS
BEGIN
    SET NOCOUNT ON;

	DECLARE @EmployeeID INT;
    DECLARE @HashedPassword VARBINARY(256);

    -- Retrieve the hashed password and user ID for the given username
    SELECT @HashedPassword = [password],
           @EmployeeID = id_employee
    FROM Employee
    WHERE username = @InputUsername;
	PRINT @InputPassword
	if @HashedPassword = HASHBYTES('SHA2_256', @InputPassword)
		print @HashedPassword;

    -- Check if the provided password matches the hashed password
	IF @HashedPassword = HASHBYTES('SHA2_256', '1234')
		BEGIN
	        -- Set the authentication result to 1 (true) on successful authentication
			SET @AuthenticationResult = 1;

	        -- Return user details on successful authentication
			SELECT *
			FROM Employee
			WHERE id_employee = @EmployeeID;
		END;
END;
GO

SELECT [password], id_employee
    FROM Employee
    WHERE username = 'Admin';

DROP PROCEDURE authenticateEmployee

DECLARE @Username NVARCHAR(50) = 'Admin';
DECLARE @Password NVARCHAR(50) = '1234';
DECLARE @AuthenticationResult BIT;

-- Execute the stored procedure
EXEC authenticateEmployee
    @InputUsername = @Username,
    @InputPassword = @Password,
    @AuthenticationResult = @AuthenticationResult OUTPUT;

-- Check the authentication result
IF @AuthenticationResult = 1
BEGIN
    -- Authentication successful
    PRINT 'Authentication successful';
    -- You can add additional logic or print user details here
END
ELSE
BEGIN
    -- Authentication failed
    PRINT 'Authentication failed';
END;
-- Insert random suppliers
INSERT INTO Supplier ([name]) VALUES ('Farnell');
INSERT INTO Supplier ([name]) VALUES ('Mouser Electronics');
INSERT INTO Supplier ([name]) VALUES ('RS Components');
INSERT INTO Supplier ([name]) VALUES ('Digi-Key');


SELECT * FROM Supplier

GO
-- CREATE PROCEDURE createProduct 

CREATE PROCEDURE getInventoryDetails
AS
BEGIN
    SELECT
        ID.id_inventory,
        P.id_product,
        P.*,
        I.*,
        ID.*
    FROM
        InventoryDetail ID
    INNER JOIN
        Product P ON ID.id_product = P.id_product
    INNER JOIN
        Inventory I ON ID.id_inventory = I.id_inventory;
END;

DROP PROCEDURE getInventoryDetails

EXEC getInventoryDetails;
GO

CREATE PROCEDURE createInventory
	@Nombre VARCHAR(50),
    @FechaAdquisicion DATE,
    @EmployeeId INT,
    @ProductId INT
AS
BEGIN
    DECLARE @InventoryId INT;

    -- Insert data into Inventory table
    INSERT INTO Inventory (delivery_day, id_employee) VALUES (@FechaAdquisicion, @EmployeeId);
    SET @InventoryId = SCOPE_IDENTITY();

    -- Insert data into InventoryDetail table
    INSERT INTO InventoryDetail (id_product, id_inventory) VALUES (@ProductId, @InventoryId);
END;
GO

CREATE TYPE dbo.ProductIdList AS TABLE
(
    ProductId INT
);
GO

CREATE PROCEDURE SaveInventoryData
    @fechaEntrada DATE,
    @proveedorId INT,
    @productos dbo.ProductIdList READONLY,
    @employeeId INT
AS
BEGIN
    -- Declare variables to store individual product IDs
    DECLARE @ProductId INT;

    -- Create a cursor to loop through the product IDs
    DECLARE productCursor CURSOR FOR SELECT ProductId FROM @productos;

    -- Open the cursor
    OPEN productCursor;

    -- Fetch the first product ID
    FETCH NEXT FROM productCursor INTO @ProductId;

    -- Insert a new record into the Inventory table
    INSERT INTO Inventory (delivery_day, id_employee)
    VALUES (@fechaEntrada, @employeeId);

    -- Get the ID of the newly inserted inventory record
    DECLARE @InventoryId INT;
    SET @InventoryId = SCOPE_IDENTITY();

    -- Loop through the product IDs
    WHILE @@FETCH_STATUS = 0
    BEGIN
        -- Your logic to associate each product ID with the inventory
        -- For example, you might insert into the InventoryDetail table

        INSERT INTO InventoryDetail (id_product, id_inventory)
        VALUES (@ProductId, @InventoryId);

        -- Fetch the next product ID
        FETCH NEXT FROM productCursor INTO @ProductId;
    END;

    -- Close and deallocate the cursor
    CLOSE productCursor;
    DEALLOCATE productCursor;
END;
	

DROP PROCEDURE SaveInventoryData;

