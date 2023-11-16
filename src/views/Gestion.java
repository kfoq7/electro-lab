package views;

import javax.swing.table.DefaultTableModel;

public class Gestion extends javax.swing.JPanel {

    DefaultTableModel tableModel;

    int a;

    public Gestion() {
        initComponents();

        tableModel = new DefaultTableModel();
        tableProduct.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProveedor = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        labelStock = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(950, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GESTIÓN DE INVENTARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 15_1.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 271, 33));

        labelNombre.setText("NOMBRE");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("PROVEEDOR");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        add(jTextFieldProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 271, 33));
        add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 271, 33));

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
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldProveedor;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelStock;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
