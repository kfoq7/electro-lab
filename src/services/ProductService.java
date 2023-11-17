package services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Product;
import models.Supplier;

public class ProductService {

    private Connection cn;
    private CallableStatement cs;
    private ResultSet rs;
    private String query;

    public ProductService() {

    }

    public ArrayList<Product> getAllProducts() throws SQLException {
        ArrayList<Product> lista = new ArrayList<>();
        Product product;
        Supplier supplier;

        try {
            cn = SQLConnection.getConnection();
            query = "{call getProductsAndSupplier}";

            cs = cn.prepareCall(query);
            rs = cs.executeQuery();

            while (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id_product"));
                product.setName(rs.getString("name_product"));
                product.setStock(rs.getInt("stock"));
                supplier = new Supplier();
                supplier.setId(rs.getInt("id_supplier"));
                supplier.setName(rs.getString("supplier_name"));
                product.setSupplier(supplier);
                lista.add(product);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }

        return lista;
    }

    public void createProduct(Product product) throws SQLException {
        String query;

        try {
            cn = SQLConnection.getConnection();
            query = "{call (?, ?, ?, ?, ?, ?)}";

            cs = cn.prepareCall(query);
            cs.setInt(1, product.getId());
//            cs.set
        } catch (Exception ex) {
            throw ex;
        } finally {
            cn.close();
        }
    }

}
