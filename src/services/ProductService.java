package services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import lib.Fetch;
import models.Product;

public class ProductService {

    private Fetch<Product> fetch;
    private Connection cn;
    private CallableStatement cs;
    private ResultSet rs;
    private String query;

    public ProductService() {
        fetch = new Fetch<>("/managament/product/", Product.class);
    }

    public ArrayList<Product> getAllProducts() throws Exception {
        ArrayList<Product> list;

        list = fetch.get();

        return list;
    }

//    public ArrayList<Product> getAllProducts() throws SQLException {
//        ArrayList<Product> lista = new ArrayList<>();
//        Product product;
//        Supplier supplier;
//
//        try {
//            cn = SQLConnection.getConnection();
//            query = "{call getProductsAndSupplier}";
//
//            cs = cn.prepareCall(query);
//            rs = cs.executeQuery();
//
//            while (rs.next()) {
//                product = new Product();
//                product.setId(rs.getInt("id_product"));
//                product.setName(rs.getString("name_product"));
//                product.setStock(rs.getInt("stock"));
//                supplier = new Supplier();
//                supplier.setId(rs.getInt("id_supplier"));
//                supplier.setName(rs.getString("supplier_name"));
//                product.setSupplier(supplier);
//                lista.add(product);
//            }
//        } catch (SQLException ex) {
//            throw ex;
//        } finally {
//            cn.close();
//        }
//
//        return lista;
//    }
}
