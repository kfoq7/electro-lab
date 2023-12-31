package views;

import controllers.ProductController;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
import lib.ActionTypes;
import models.Product;
import models.Supplier;
import models.User;

public class InventoryPanel extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private String[] header = {"id", "nombre", "stock", "proveedor"};
    private String[][] data;
    private GestionView gestionView;
    private ArrayList<Product> products;

    User user = new User();
    GestionView gestionPanel = new GestionView(); 

//    InventarioConrtoller controller;
    ProductController controller;

    public InventoryPanel() throws Exception {
        initComponents();

        txtSearch.setText(" BUSCAR PRODUCTO");
        controller = new ProductController();

        products = controller.getProducts();

        //ADD PRODUCTS
//        
//        Supplier supplier1 = new Supplier();
//        supplier1.setId(1);
//        supplier1.setName("Supplier 1");
//
//        Supplier supplier2 = new Supplier();
//        supplier2.setId(2);
//        supplier2.setName("Supplier 2");
//
//        
//        Product product1 = new Product();
//        product1.setId(1);
//        product1.setName("Product 1");
//        product1.setStock(10);
////        product1.setDate(LocalDate.now());
//        product1.setSupplier(supplier1); 
//
//        Product product2 = new Product();
//        product2.setId(2);
//        product2.setName("Product 2");
//        product2.setStock(20);
////        product2.setDate(LocalDate.now().minusDays(1));
//        product2.setSupplier(supplier2); 
//
//        Product product3 = new Product();
//        product3.setId(3);
//        product3.setName("Product 3");
//        product3.setStock(15);
////        product3.setDate(LocalDate.now().minusDays(2)); 
//        product3.setSupplier(supplier1); 
//
//        Product product4 = new Product();
//        product4.setId(4);
//        product4.setName("Product 4");
//        product4.setStock(8);
////        product4.setDate(LocalDate.now().minusDays(3)); 
//        product4.setSupplier(supplier2); 
//
//        Product product5 = new Product();
//        product5.setId(5);
//        product5.setName("Product 5");
//        product5.setStock(25);
////        product5.setDate(LocalDate.now().minusDays(4)); 
//        product5.setSupplier(supplier1); 
//
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);
//        products.add(product5);
        //END
        tableModel = new DefaultTableModel(header, 0);
        tableInventory.setModel(tableModel);
        updateTable();

        txtSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filter();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonConsult = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JLabel();
        ButtonAdd = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(950, 590));

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableInventory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableInventory);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 930, 420));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel1.setText("INVENTARIO");
        jLabel1.setPreferredSize(new java.awt.Dimension(550, 86));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 40));

        ButtonConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 15ButtonConsultar.png"))); // NOI18N
        ButtonConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonConsultMousePressed(evt);
            }
        });
        ButtonConsult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonConsultKeyPressed(evt);
            }
        });
        jPanel1.add(ButtonConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSearchMousePressed(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 200, 40));

        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 23ButtonEliminar.png"))); // NOI18N
        ButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonDeleteMousePressed(evt);
            }
        });
        jPanel1.add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        ButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 17ButtonAñadir.png"))); // NOI18N
        ButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonAddMousePressed(evt);
            }
        });
        jPanel1.add(ButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMousePressed
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMousePressed

    private void ButtonConsultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonConsultKeyPressed
        try {
            gestionView = new GestionView(ActionTypes.UPDATE);
            System.out.println("printing");
            gestionView.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(InventoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonConsultKeyPressed

    private void ButtonAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAddMousePressed
        try {
            gestionView = new GestionView(ActionTypes.CREATE);
            gestionView.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(InventoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonAddMousePressed

    private void ButtonDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDeleteMousePressed
        int id = (Integer) tableModel.getValueAt(tableInventory.getSelectedRow(), 0);
        Product productFound = searchProduct(id);
        products.remove(products.indexOf(productFound));
        updateTable();
    }//GEN-LAST:event_ButtonDeleteMousePressed

    private void ButtonConsultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConsultMousePressed
        // TODO add your handling code here:

        int id = (Integer) tableModel.getValueAt(tableInventory.getSelectedRow(), 0);
        Product productFound = searchProduct(id);
        gestionPanel.setDataField(productFound);
        gestionPanel.setVisible(true);
        gestionPanel.details(false);
    }//GEN-LAST:event_ButtonConsultMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonAdd;
    private javax.swing.JLabel ButtonConsult;
    private javax.swing.JLabel ButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInventory;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private Product searchProduct(int id) {
        for (Product product : products) {
            if ((product.getId() == id)) {
                return product;
            }

        }
        return null;
    }

    private void updateTable() {
        for (Product product : products) {
            Object[] row = {product.getId(), product.getName(), product.getStock(), product.getSupplier().getName()};
            tableModel.addRow(row);
        }
    }

    private void updateTable(ArrayList<Product> productList) {
        for (Product product : productList) {
            Object[] row = {product.getId(), product.getName(), product.getStock(), product.getSupplier().getName()};
            tableModel.addRow(row);
        }
    }

    private void filter() {
        String text = txtSearch.getText();
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredProducts.add(product);
            }
        }

        tableModel.setRowCount(0);
        updateTable(filteredProducts);
    }

}
