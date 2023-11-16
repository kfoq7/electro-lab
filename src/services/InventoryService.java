package services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Inventory;

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

            java.sql.Array productosArray = cn.createArrayOf("INTEGER", inventory.getProductos().toArray());
            cs.setArray(3, productosArray);

            cs = cn.prepareCall(query);
            cs.setDate(1, new java.sql.Date(inventory.getFechaEntrada().getTime()));
            cs.setInt(2, inventory.getProveedor().getId());
            cs.setArray(3, (java.sql.Array) inventory.getProductos());
            cs.setInt(4, inventory.getUsuario().getId());

            rs = cs.executeQuery();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }
    }

}
