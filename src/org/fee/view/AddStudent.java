/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fee.view;

import javax.swing.JOptionPane;
import org.fee.controller.StudentDAO;
import org.fee.model.Student;

/**
 *
 * @author CIT
 */
public class AddStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddProduct
     */
    public AddStudent() {
        initComponents();
    }
    public void clearFields()
    {
        jTextField_Name.setText("");
        jTextField_Faculty.setText("");
        jTextField_TotalFee.setText("");
        jTextField_PaidAmount.setText("");
        jTextField_DueAmount.setText("");
        jTextArea_Remarks.setText("");
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
        jTextField_Name = new javax.swing.JTextField();
        jTextField_TotalFee = new javax.swing.JTextField();
        jTextField_PaidAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Remarks = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_DueAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Faculty = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Name");

        jTextField_TotalFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TotalFeeKeyTyped(evt);
            }
        });

        jTextField_PaidAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PaidAmountActionPerformed(evt);
            }
        });
        jTextField_PaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PaidAmountKeyTyped(evt);
            }
        });

        jTextArea_Remarks.setColumns(20);
        jTextArea_Remarks.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Remarks);

        jLabel2.setText("Total fee");

        jLabel3.setText("Paid Amount");

        jLabel4.setText("Remarks");

        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Due Amount");

        jTextField_DueAmount.setEditable(false);
        jTextField_DueAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DueAmountActionPerformed(evt);
            }
        });

        jLabel6.setText("Faculty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Save)
                                    .addComponent(jLabel4))
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(9, 9, 9))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Name)
                            .addComponent(jTextField_TotalFee)
                            .addComponent(jTextField_PaidAmount)
                            .addComponent(jTextField_DueAmount)
                            .addComponent(jTextField_Faculty))))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_TotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_DueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Save))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PaidAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PaidAmountActionPerformed
       int Totalfee=Integer.parseInt(jTextField_TotalFee.getText()); 
       int Paidamt=Integer.parseInt(jTextField_PaidAmount.getText());
       int Dueamt=Totalfee-Paidamt;
       jTextField_DueAmount.setText(Dueamt+"");
    }//GEN-LAST:event_jTextField_PaidAmountActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        String name=jTextField_Name.getText();
        String faculty=jTextField_Faculty.getText();
        int totalfee =Integer.parseInt(jTextField_TotalFee.getText());
        int paidamount =Integer.parseInt(jTextField_PaidAmount.getText());
        int dueamount =Integer.parseInt(jTextField_DueAmount.getText());
        String remarks=jTextArea_Remarks.getText();
        //Set These Values In the "Model Class- product " Object
        Student ob=new Student();//in the student class
        ob.setName(name);
        ob.setFaculty(faculty);
        ob.setTotalfee(totalfee);
        ob.setPaidamount(paidamount);
        ob.setDueamount(dueamount);
        ob.setRemarks(remarks);
//Now handover This Object To the "Contoller Class  ProductDAO"
        StudentDAO pDAO=new StudentDAO();
       int count = pDAO.insertData(ob);
        if(count>0)
        {
            JOptionPane.showMessageDialog(null,"Record Saved");
        }
        clearFields();
        
        
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jTextField_TotalFeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TotalFeeKeyTyped
            char ch=evt.getKeyChar();
		if(evt.getSource()==jTextField_TotalFee)
                {
		if(!(ch>='0' && ch<='9'))	
			 {
				 evt.consume();
			 }
                }
    }//GEN-LAST:event_jTextField_TotalFeeKeyTyped

    private void jTextField_PaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PaidAmountKeyTyped
        char ch=evt.getKeyChar();
		if(evt.getSource()==jTextField_PaidAmount)
                {
		if(!(ch>='0' && ch<='9'))	
			 {
				 evt.consume();
			 }
                } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PaidAmountKeyTyped

    private void jTextField_DueAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DueAmountActionPerformed
      
    }//GEN-LAST:event_jTextField_DueAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Remarks;
    private javax.swing.JTextField jTextField_DueAmount;
    private javax.swing.JTextField jTextField_Faculty;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_PaidAmount;
    private javax.swing.JTextField jTextField_TotalFee;
    // End of variables declaration//GEN-END:variables
}
