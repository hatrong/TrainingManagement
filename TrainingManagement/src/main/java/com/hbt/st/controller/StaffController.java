/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.controller;

import com.hbt.st.model.Staff;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author baotr
 */
public class StaffController {
    
    private JButton btnSubmit;
    private JTextField jtfID;
    private JTextField jtfName;
    private JTextField jtfDepartment;
    private JTextField jtfPhone;
    private JDateChooser jdcBirthday;
    private JCheckBox jcbStatus;

    public StaffController(JButton btnSubmit, JTextField jtfID, JTextField jtfName, JTextField jtfDepartment, JTextField jtfPhone, JDateChooser jdcBirthday, JCheckBox jcbStatus) {
        this.btnSubmit = btnSubmit;
        this.jtfID = jtfID;
        this.jtfName = jtfName;
        this.jtfDepartment = jtfDepartment;
        this.jtfPhone = jtfPhone;
        this.jdcBirthday = jdcBirthday;
        this.jcbStatus = jcbStatus;
    }
    
    public void setView(Staff staff){
        jtfID.setText(" #"+ staff.getStaffID());
        jtfName.setText("  " + staff.getStaffName());
        jtfDepartment.setText("  " + staff.getStaffDepartment());
        jtfPhone.setText("  " + staff.getStaffPhoneNumber());
        jdcBirthday.setDate(staff.getStaffBirthday());
        jcbStatus.setSelected(staff.isStatus());
    }
    
    
    
    
}
