/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.service;

import com.hbt.st.dao.StaffDAO;
import com.hbt.st.dao.StaffDAOImpl;
import com.hbt.st.model.Staff;
import java.util.List;

/**
 *
 * @author baotr
 */
public class StaffServiceImpl implements StaffService{

    private StaffDAO hocVienDAO = null;
 
    public StaffServiceImpl() {
        this.hocVienDAO = new StaffDAOImpl();
    }
 
    @Override
    public List<Staff> getList() {
        return hocVienDAO.getList();
    }
    
}
