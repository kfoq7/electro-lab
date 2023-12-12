package views;

import controllers.InventarioConrtoller;
import controllers.ProductController;
import controllers.SupplierController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.management.StringValueExp;
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

    public Gestion(User user) throws Exception {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        labelNombre1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(950, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setText("GESTIÓN DE DISPOSITIVOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 15ButtonSave.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 271, 33));

        labelNombre.setText("NOMBRE");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setText("PROVEEDOR");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 271, 30));

        jLabel11.setText("FECHA DE ADQUISICIÓN");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));
        add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 271, 30));

        labelStock.setText("STOCK");
        add(labelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 22ButtonUpdate.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableProduct);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 270, 180));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 271, 33));

        labelNombre1.setText("ID");
        add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
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
        getDataProductField(); 
    }//GEN-LAST:event_jLabel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelStock;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

  
    public Object[] getDataProductField() {
        Object[] data = {
            txtID.getText(),
            txtNombre.getText(),
            txtStock.getText(),
        };
        return data;
    }
            
    
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

    private void loadProductTable() throws Exception {
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

    private void loadSupplier() throws Exception {
        supplierList = supplierController.getSuppliers();

        for (Supplier supplier : supplierList) {
            jComboBox1.addItem(supplier.getName());
        }
    }

}
