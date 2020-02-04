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

public class Courses implements Serializable {

    private int courseID;
    private String courseName;
    private String courseDecription;
    private Date startDate;
    private Date finishDate;
    private boolean status;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDecription() {
        return courseDecription;
    }

    public void setCourseDecription(String courseDecription) {
        this.courseDecription = courseDecription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}