package views;

import controllers.InventarioConrtoller;
import controllers.UsuarioController;
import java.io.IOException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import models.Usuario;
import utils.DateTimeUtility;

public class Home extends javax.swing.JPanel {

    DefaultTableModel tableModel;

    String[] cabezera = {"Usuario", "Fecha", "Hora"};
    String[][] data;

    InventarioConrtoller controller;
    UsuarioController usuarioController;

    public Home() throws IOException, ClassNotFoundException {
        initComponents();

        tableModel = new DefaultTableModel(data, cabezera);
        tablaInventario.setModel(tableModel);

        controller = new InventarioConrtoller();
        usuarioController = new UsuarioController();

        for (Usuario usuario : usuarioController.getUsuarios()) {
            System.out.println(usuario.getNombre());
            for (Date fecha : usuario.getFechaEntrada()) {
                String date = DateTimeUtility.getDateFrom(fecha);
                String time = DateTimeUtility.getTimeFrom(fecha);
                Object[] row = {usuario.getUsername(), date, time};
                tableModel.addRow(row);
            }
        }
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

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 12(1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 11(1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 100));

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables

}
