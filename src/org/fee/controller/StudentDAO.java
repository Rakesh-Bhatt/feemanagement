package org.fee.controller;

import org.fee.model.Student;
import java.sql.*;
import org.fee.util.DBConnection;
import java.util.*;//for List And array Lists
public class StudentDAO {
    public int insertData(Student ob)
    {
        int count=0;
        try
        {
           Connection con=DBConnection.getConnection();
           String sql="insert into student(name,faculty,total_fee,paid_amount,due_amount,remarks)values(?,?,?,?,?,?)";
           PreparedStatement st=con.prepareStatement(sql);
           st.setString(1,ob.getName());
           st.setString(2,ob.getFaculty());
           st.setInt(3,ob.getTotalfee());
           st.setInt(4,ob.getPaidamount());
           st.setInt(5,ob.getDueamount());
           st.setString(6,ob.getRemarks());
          count= st.executeUpdate();
           con.close();
           
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return count;
    }
    public List<Student> fetchData()
    {
        List<Student> studentList=new ArrayList();
        try
        {
           Connection con=DBConnection.getConnection();
           String sql="select * from student";
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               Student ob=new Student();
               ob.setId(rs.getInt("id"));
               ob.setName(rs.getString("name"));
               ob.setFaculty(rs.getString("faculty"));
               ob.setTotalfee(rs.getInt("total_fee"));
               ob.setPaidamount(rs.getInt("paid_amount"));
               ob.setDueamount(rs.getInt("due_amount"));
               ob.setRemarks(rs.getString("remarks"));
               studentList.add(ob); 
               
           }
           con.close();
           
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
        return studentList;
    }
    public static Student fetchDataById(int id){
       Student ob = new Student();
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from student where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               ob.setName(rs.getString(2));
               ob.setFaculty(rs.getString(3));
               ob.setTotalfee(rs.getInt(4));
               ob.setPaidamount(rs.getInt(5));
               ob.setDueamount(rs.getInt(6));
               ob.setRemarks(rs.getString(7)); 
           }
           con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return ob;
    }
    public int updateData(Student ob)
    {
        int count=0;
        try
        {
           Connection con=DBConnection.getConnection();
           String sql="update student set name=?,faculty=?,total_fee=?,paid_amount=?,due_amount=?,remarks=? where id=?";
           PreparedStatement st=con.prepareStatement(sql);
           st.setString(1,ob.getName());
           st.setString(2,ob.getFaculty());
           st.setInt(3,ob.getTotalfee());
           st.setInt(4,ob.getPaidamount());
           st.setInt(5,ob.getDueamount());
           st.setString(6,ob.getRemarks());
           st.setInt(7,ob.getId());
          count= st.executeUpdate();
           con.close();
           
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return count;
    }
    public int deleteData(Student ob)
    {
        int count=0;
        try
        {
           Connection con=DBConnection.getConnection();
           String sql="delete from student where id=?";
           PreparedStatement st=con.prepareStatement(sql);
           st.setInt(1,ob.getId());
          count= st.executeUpdate();
           con.close();
           
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return count;
    }
 
    
   
    
    public Student fetchData(int id)
    {
      Student ob=new Student();
        try
        {
           Connection con=DBConnection.getConnection();
           String sql="select * from student where id=?";
           PreparedStatement st=con.prepareStatement(sql);
           st.setInt(1, id);
           ResultSet rs=st.executeQuery();
           if(rs.next())
           {
               ob.setId(rs.getInt("id"));
               ob.setName(rs.getString("name"));
                ob.setFaculty(rs.getString("faculty")); 
                ob.setTotalfee(rs.getInt("total_fee"));
                ob.setPaidamount(rs.getInt("paid_amount"));
                ob.setDueamount(rs.getInt("due_amount"));
                ob.setFaculty(rs.getString("remarks"));
           }
           con.close(); 
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
        return ob;
    }
   
}