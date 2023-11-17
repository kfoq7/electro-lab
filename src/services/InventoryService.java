package services;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Inventory;
import models.Product;

public class InventoryService {

    private Connection cn;
    private CallableStatement cs;
    private ResultSet rs;
    private String query;

    public InventoryService() {
    }

    public ArrayList<Inventory> getInvetarios() throws SQLException {
        ArrayList<Inventory> lista = new ArrayList<>();

        try {
            cn = SQLConnection.getConnection();
            query = "{call getProductsAndSupplier}";

        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }

        return lista;
    }

    public void createInventory(Inventory inventory) throws SQLException {
        try {
            cn = SQLConnection.getConnection();
            query = "{call SaveInventoryData(?, ?, ?, ?)}";

            Integer[] productIdsArray = new Integer[inventory.getProductos().size()];
            ArrayList<Product> productList = inventory.getProductos();
            for (int i = 0; i < productList.size(); i++) {
                productIdsArray[i] = productList.get(i).getId();
            }

//            java.sql.Array productosArray = cn.createArrayOf("INTEGER", productIdList);
            cs = cn.prepareCall(query);
            cs.setDate(1, new java.sql.Date(inventory.getFechaEntrada().getTime()));
            cs.setInt(2, inventory.getProveedor().getId());
//            cs.setArray(3, productosArray);
            cs.setInt(4, inventory.getUsuario().getId());

            SQLServerDataTable productsDataTable = new SQLServerDataTable();
            productsDataTable.addColumnMetadata("Value", java.sql.Types.INTEGER);

            // Populate the data into the DataTable
            for (Integer productId : productIdsArray) {
                productsDataTable.addRow(productId);
            }

            // Set the DataTable as a parameter
            cs.setObject(3, productsDataTable);

            rs = cs.executeQuery();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }
    }

}
