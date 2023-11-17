package views;

import controllers.InventarioConrtoller;
import controllers.ProductController;
import controllers.SupplierController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib.utils.DateTimeUtility;
import lib.utils.ErrorHandler;
import models.Inventory;
import models.Product;
import models.Supplier;
import models.User;

public class Gestion extends javax.swing.JPanel {

    DefaultTableModel tableProductModel;

    String[] header = {"id", "name"};
    String[][] data;

    User user;
    ArrayList<Supplier> supplierList;

    ProductController productController;
    InventarioConrtoller inventoryController;
    SupplierController supplierController;

    public Gestion(User user) throws SQLException {
        initComponents();

        this.user = user;

        productController = new ProductController();
        inventoryController = new InventarioConrtoller();
        supplierController = new SupplierController();

        createProductTable();
        initProductTable();

        loadSupplier();
        loadProductTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        labelStock = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(950, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GESTIÓN DE INVENTARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 15_1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 271, 33));

        labelNombre.setText("NOMBRE");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("PROVEEDOR");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 271, 33));

        jLabel11.setText("FECHA DE ADQUISICIÓN");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));
        add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 271, 35));

        labelStock.setText("STOCK");
        add(labelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel13.setText("BUSCAR PRODUCTO");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Id", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tableProduct);
        if (tableProduct.getColumnModel().getColumnCount() > 0) {
            tableProduct.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 410, 200));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        Inventory inventory = new Inventory();
        Supplier supplier;

        try {
            inventory.setFechaEntrada(DateTimeUtility.parerDate(txtFecha.getText()));
        } catch (ParseException ex) {
            ErrorHandler.formException(ex);
        }

        inventory.setUsuario(user);
        inventory.setProductos(getSelectedProducts());
        Supplier supplierSelected = getSelectedSupplier();
        supplier = new Supplier();
        supplier.setId(supplierSelected.getId());
        supplier.setName(supplierSelected.getName());
        inventory.setProveedor(supplier);

        try {
            inventoryController.saveInventory(inventory);
        } catch (SQLException ex) {
            ErrorHandler.formException(ex);
        }
    }//GEN-LAST:event_jLabel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelStock;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void initProductTable() {
        tableProduct.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableProduct.getSelectedRows();
//        tableProduct.setSelectionMode(new ListSelectionListener() {
//            public void valueChance
//        });
    }

    private void createProductTable() {
        tableProductModel = new DefaultTableModel(data, header);
        tableProduct.setModel(tableProductModel);
    }

    private void loadProductTable() throws SQLException {
        ArrayList<Product> productList = productController.getProducts();

        for (Product product : productList) {
            Object[] row = {product.getId(), product.getName()};
            tableProductModel.addRow(row);
        }
    }

    private ArrayList<Product> getSelectedProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        Product product;

        for (int row : tableProduct.getSelectedRows()) {
            Object value = tableProduct.getValueAt(row, 0);
            product = new Product();
            product.setId(Integer.parseInt((String.valueOf(value))));
            productList.add(product);
        }

        return productList;
    }

    private Supplier getSelectedSupplier() {
        String supplierName = String.valueOf(jComboBox1.getSelectedItem());
        for (Supplier supplier : supplierList) {
            if (supplier.getName().equalsIgnoreCase(supplierName)) {
                return supplier;
            }
        }

        return null;
    }

    private void loadSupplier() throws SQLException {
        supplierList = supplierController.getSuppliers();

        for (Supplier supplier : supplierList) {
            jComboBox1.addItem(supplier.getName());
        }
    }

}
