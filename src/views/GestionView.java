/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.InventarioConrtoller;
import controllers.ProductController;
import controllers.SupplierController;
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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luis
 */
public class GestionView extends javax.swing.JFrame {
    DefaultTableModel tableProductModel;

    String[] header = {"id", "name"};
    String[][] data;

    User user;
    ArrayList<Supplier> supplierList;

    ProductController productController;
    InventarioConrtoller inventoryController;
    SupplierController supplierController;
   
    public GestionView() throws Exception{
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setText("GESTIÓN DE DISPOSITIVOS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 15ButtonSave.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        labelNombre.setText("NOMBRE");

        jLabel4.setText("PROVEEDOR");

        jLabel11.setText("FECHA DE ADQUISICIÓN");

        labelStock.setText("STOCK");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 22ButtonUpdate.png"))); // NOI18N

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

        labelNombre1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelNombre1)
                            .addGap(355, 355, 355)
                            .addComponent(jLabel11))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelNombre)
                            .addGap(314, 314, 314)
                            .addComponent(labelStock))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 24, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNombre1)
                        .addComponent(jLabel11))
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNombre)
                        .addComponent(labelStock))
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(1, 1, 1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        pack();
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GestionView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    public void setDataField(Product product) {
        txtID.setText(String.valueOf(product.getId()));
        txtNombre.setText(product.getName());
        txtStock.setText(String.valueOf(product.getStock()));
        jComboBox1.addItem(product.getSupplier().getName());
    }
    private Object[] getDataProductField() {
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
}
