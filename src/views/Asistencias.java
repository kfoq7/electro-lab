/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.StudentController;
import java.util.ArrayList;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import models.Product;
import models.Student;

/**
 *
 * @author Enma
 */
public class Asistencias extends javax.swing.JPanel {
    
    DefaultTableModel tableModel;
    StudentController controllerS = new StudentController();
    ArrayList<Student> studentsList;
    
    String[] header = {"CODIGO", "CARRERA", "APPELLIDO Y NOMBRE", "FECHA/HORA", "CICLO", "ASITENCIA"};
    
    public Asistencias() {
        initComponents();
        
        tableModel = new DefaultTableModel(header, 0) {
            @Override
            public Class<?> getColumnClass(int index) {
                if (index == 5) {
                    return Boolean.class;
                }
                return super.getColumnClass(index);
            }
        }; 
        
        studentsList = controllerS.getStudents();
        
        for (Student student : studentsList) {
            Object[] ros = {String.valueOf(student.getStudent_code()), student.getCareer(), student.getNames(), student.getDate().toString(), String.valueOf(student.getCycle()), false};
            tableModel.addRow(ros);
        }
        tableStudent.setModel(tableModel);
        
        
        txtSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println(txtSearch.getText());
                filter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println(txtSearch.getText());
                filter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println(txtSearch.getText());
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
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonConsult = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableStudent);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel1.setText("ASISTENCIA");
        jLabel1.setPreferredSize(new java.awt.Dimension(550, 86));

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

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSearchMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(ButtonConsult)
                .addGap(16, 16, 16))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConsult))
                .addContainerGap(461, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConsultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConsultMousePressed
        // TODO add your handling code here:
        
        int id = (Integer) tableModel.getValueAt(tableStudent.getSelectedRow(), 0);
        Student studentFound = searchProduct(id);
        
       
    }//GEN-LAST:event_ButtonConsultMousePressed

    private void ButtonConsultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonConsultKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_ButtonConsultKeyPressed

    private void txtSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMousePressed
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMousePressed

    private void filter() {
        String text = txtSearch.getText();
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getNames().toLowerCase().contains(text.toLowerCase())) {
                filteredStudents.add(student);
            }
        }
        
        tableModel.setRowCount(0);
        updateTable(filteredStudents);
    }
    private void updateTable(ArrayList<Student> StudentList) {
        for (Student student : StudentList) {
            Object[] ros = {String.valueOf(student.getStudent_code()), student.getCareer(), student.getNames(), student.getDate().toString(), String.valueOf(student.getCycle()), false};
            
            tableModel.addRow(ros);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonConsult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private Student searchProduct(int id) {
        for (Student student : studentsList) {
            if (student.getStudent_code() == id) {
                return student;
            }
        }
        return null;
    }
}
