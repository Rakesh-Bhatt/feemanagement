package org.fee.model;

public class Student {
    private int id;
    private String name;
    private String faculty;
    private int totalfee;
    private int paidamount;
    private int dueamount;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }

    public int getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(int paidamount) {
        this.paidamount = paidamount;
    }

    public int getDueamount() {
        return dueamount;
    }

    public void setDueamount(int dueamount) {
        this.dueamount = dueamount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}