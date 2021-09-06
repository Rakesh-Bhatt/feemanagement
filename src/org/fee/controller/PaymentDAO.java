package org.fee.controller;

import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.fee.model.Payment;
import org.fee.model.Student;
import org.fee.util.DBConnection;

public class PaymentDAO {

    public void saveData(Payment ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into payment(sname,faculty,paid_amount,date,remarks) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getName());
            pst.setString(2, ob.getFaculty());
            pst.setInt(3, ob.getPaidamt());
            pst.setDate(4,new java.sql.Date(System.currentTimeMillis()));
            pst.setString(5, ob.getRemarks());
            pst.execute();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
