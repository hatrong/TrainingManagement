/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.dao;

import com.hbt.st.model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baotr
 */
public class StaffDAOImpl implements StaffDAO{

    @Override
    public List<Staff> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "select * from db_stafftraining.staff";
        List<Staff> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setStaffID(rs.getInt("staffID"));
                staff.setStaffName(rs.getString("staffName"));
                staff.setStaffPhoneNumber(rs.getString("staffPhoneNumber"));
                staff.setStaffDepartment(rs.getString("staffDepartment"));
                staff.setStaffBirthday(rs.getDate("staffBirthday"));
                staff.setStatus(rs.getBoolean("status"));
                list.add(staff);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
    
