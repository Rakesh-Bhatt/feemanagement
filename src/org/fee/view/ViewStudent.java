/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fee.view;

import java.util.List;
import javax.swing.JOptionPane;
import org.fee.controller.StudentDAO;
import org.fee.model.Student;
//import java.sales.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIT
 */
public class ViewStudent extends javax.swing.JInternalFrame {

   DefaultTableModel model;
    public ViewStudent() {
        initComponents();
        model=new DefaultTableModel(null,new String[]{"ID","NAME","FACULTY","TOTAL FEE","PAID AMOUNT","DUE AMOUNT","REMARKS"});
        jTable_Student.setModel(model);
    }
    public void loadData()
    {
        StudentDAO pDAO=new StudentDAO();
            List<Student>studentList=pDAO.fetchData();
            clearTable();
            for(Student p:studentList)
            {
                
                model.addRow(new Object[]{
                    p.getId(),p.getName(),p.getFaculty(),p.getTotalfee(),p.getPaidamount(),p.getDueamount(),p.getRemarks()});
            }
    }
    
    public void clearTable()
    {
        int count=jTable_Student.getRowCount();
        for(int i=0;i<count;i++)
        {
            model.removeRow(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Student = new javax.swing.JTable();
        jButton_LoadData = new javax.swing.JButton();

        setClosable(true);

        jTable_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Student);

        jButton_LoadData.setText("Load Data");
        jButton_LoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_LoadData)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton_LoadData)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadDataActionPerformed
            //call fetchData() method of controller class
            loadData();
    }//GEN-LAST:event_jButton_LoadDataActionPerformed

    private void jTable_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_StudentMouseClicked
       
    }//GEN-LAST:event_jTable_StudentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LoadData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Student;
    // End of variables declaration//GEN-END:variables
}
