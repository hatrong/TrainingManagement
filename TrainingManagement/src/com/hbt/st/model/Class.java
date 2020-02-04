/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.model;

/**
 *
 * @author baotr
 */
import java.io.Serializable;
import java.sql.Date;

public class Class implements Serializable {

    private int classID;
    private Courses course;
    private Staff staff;
    private Date startDate;
    private boolean status;

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public Courses getCourses() {
        return course;
    }

    public void setCourses(Courses course) {
        this.course = course;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}