package views;

import controllers.ProductoController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import models.Producto;

public class MainFrame extends javax.swing.JFrame {

    DefaultTableModel inventarioTableModel;

    String[] header = {"Usuario", "Fecha", "Hora"};
    String[][] data;

    ProductoController productoController;
    ArrayList<Producto> productos;

    public MainFrame() throws IOException {
        initComponents();

        inventarioTableModel = new DefaultTableModel(data, header);
//        inventarioTable.setModel(inventarioTableModel);

        productoController = new ProductoController();
        productos = productoController.getProducts();

        actulizarTable();
        
        setForm(new Home());

        setLocationRelativeTo(null);
    }
//
//    public MainFrame(Login login) throws IOException {
//        initComponents();
//
//        inventarioTableModel = new DefaultTableModel(data, header);
////        inventarioTable.setModel(inventarioTableModel);
//
//        productoController = new ProductoController();
//        productos = productoController.getProducts();
//
//        actulizarTable();
//
//        setLocationRelativeTo(null);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navegacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        inicioButton = new javax.swing.JLabel();
        inventario = new javax.swing.JPanel();
        inventarioButton = new javax.swing.JLabel();
        inicioButton2 = new javax.swing.JPanel();
        gestionInventarioButton1 = new javax.swing.JLabel();
        cabezera = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navegacion.setBackground(new java.awt.Color(30, 29, 38));
        navegacion.setForeground(new java.awt.Color(50, 59, 65));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style=\"text-align:center\"> LABORATORIO DE ELECTRONICA</div></html");
        jLabel1.setDoubleBuffered(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        inicio.setBackground(new java.awt.Color(255, 255, 255));

        inicioButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inicioButton.setForeground(new java.awt.Color(50, 59, 65));
        inicioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioButton.setText("Inicio");
        inicioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicioButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        inventario.setBackground(new java.awt.Color(255, 255, 255));

        inventarioButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inventarioButton.setForeground(new java.awt.Color(50, 59, 65));
        inventarioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventarioButton.setText("Inventario");
        inventarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventarioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventarioButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout inventarioLayout = new javax.swing.GroupLayout(inventario);
        inventario.setLayout(inventarioLayout);
        inventarioLayout.setHorizontalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        inventarioLayout.setVerticalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        inicioButton2.setBackground(new java.awt.Color(255, 255, 255));

        gestionInventarioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gestionInventarioButton1.setForeground(new java.awt.Color(50, 59, 65));
        gestionInventarioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionInventarioButton1.setText("Gestion Inventario");
        gestionInventarioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionInventarioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gestionInventarioButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout inicioButton2Layout = new javax.swing.GroupLayout(inicioButton2);
        inicioButton2.setLayout(inicioButton2Layout);
        inicioButton2Layout.setHorizontalGroup(
            inicioButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionInventarioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inicioButton2Layout.setVerticalGroup(
            inicioButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioButton2Layout.createSequentialGroup()
                .addComponent(gestionInventarioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navegacionLayout = new javax.swing.GroupLayout(navegacion);
        navegacion.setLayout(navegacionLayout);
        navegacionLayout.setHorizontalGroup(
            navegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navegacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navegacionLayout.setVerticalGroup(
            navegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navegacionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        cabezera.setBackground(new java.awt.Color(17, 5, 89));
        cabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 250, 252));
        jLabel3.setText("UNIVERSIDAD CESAR VALLEJO");
        cabezera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 15, 387, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("29/10/2023");
        cabezera.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 30, 111, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 250, 252));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("PAULINO AQUINO LUIS");
        cabezera.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 24, 284, 40));

        mainPanel.setEnabled(false);
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabezera, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(navegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cabezera, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioButtonMousePressed
        setForm(new Gestion());
    }//GEN-LAST:event_inventarioButtonMousePressed

    private void gestionInventarioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionInventarioButton1MousePressed
        setForm(new Inventario());
    }//GEN-LAST:event_gestionInventarioButton1MousePressed

    private void inicioButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioButtonMousePressed
        setForm(new Home());
    }//GEN-LAST:event_inicioButtonMousePressed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cabezera;
    private javax.swing.JLabel gestionInventarioButton1;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel inicioButton;
    private javax.swing.JPanel inicioButton2;
    private javax.swing.JPanel inventario;
    private javax.swing.JLabel inventarioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navegacion;
    // End of variables declaration//GEN-END:variables

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void actulizarTable() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
            Object[] row = {producto.getId(), producto.getNombre(), producto.getStock()};
            inventarioTableModel.addRow(row);
        }
    }

}
