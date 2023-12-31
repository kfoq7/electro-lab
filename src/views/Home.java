package views;

import controllers.ProductController;
import controllers.SupplierController;
import controllers.UsuarioController;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Product;
import models.Supplier;
import models.User;

public class Home extends javax.swing.JPanel {

    User user;
    ProductController controllerProduct;
    DefaultTableModel tableModel;

    SupplierController controllerSupplier;
    String[] cabezera = {"Usuario", "Fecha", "Hora"};
    String[][] data;

    UsuarioController usuarioController;

    public Home() throws Exception {
        initComponents();

        controllerProduct = new ProductController();
        ProductLabel.setText(String.valueOf(controllerProduct.getProducts().size()));

        controllerSupplier = new SupplierController();
//        SupplierLabel.setText(String.valueOf(controllerSupplier.getSuppliers().size()));

        tableModel = new DefaultTableModel(data, cabezera);
        tablaInventario.setModel(tableModel);

        usuarioController = new UsuarioController();

//        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        ProductLabel = new javax.swing.JLabel();
        SupplierLabel = new javax.swing.JLabel();

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 12(1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 11(1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 100));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaInventario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1000, 390));

        ProductLabel.setText("jLabel1");
        jPanel1.add(ProductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        SupplierLabel.setText("jLabel1");
        jPanel1.add(SupplierLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables

    private void updateTable() throws SQLException {
//        for (User user : usuarioController.getUsuarios()) {
//            LocalDate date = LocalDate.now();
//        }
    }
//    private void updateTable() throws SQLException {
//        for (User usuario : usuarioController.getUsuarios()) {
//            for (Date fecha : usuario.getEntryDates()) {
//                String date = DateTimeUtility.getDateFrom(fecha);
//                String time = DateTimeUtility.getTimeFrom(fecha);
//                Object[] row = {usuario.getUsername(), date, time};
//                tableModel.addRow(row);
//            }
//        }
//    }

}
