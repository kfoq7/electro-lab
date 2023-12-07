package services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Supplier;

public class SupplierService {

    private Connection cn;
    private Statement st;
    private ResultSet rs;
    private String query;
    
    private Fetch<Supplier> fetch;

    public SupplierService() {
        fetch = new Fetch<>("/entities/supplier", Supplier.class);
    }
    
//    public Array
    
//
//    public ArrayList<Supplier> getAllSupplier() throws SQLException {
//        ArrayList<Supplier> list = new ArrayList<>();
//        Supplier supplier;
//
//        try {
//            cn = SQLConnection.getConnection();
//            query = "SELECT * FROM Supplier";
//
//            st = cn.createStatement();
//            rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                supplier = new Supplier();
//                supplier.setId(rs.getInt("id_supplier"));
//                supplier.setName(rs.getString("name"));
//                list.add(supplier);
//            }
//        } catch (SQLException ex) {
//            throw ex;
//        } finally {
//            cn.close();
//        }

//        return list;
//    }

}
