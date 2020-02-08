/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.utility;

import com.hbt.st.model.Staff;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baotr
 */
 
public class ClassTableModel {
 
    public DefaultTableModel setTableStaff(List<Staff> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
 
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        Staff staff = null;
        for (int i = 0; i < num; i++) {
            staff = listItem.get(i);
            obj = new Object[columns];
            obj[0] = i+1;
            obj[1] = staff.getStaffID();
            obj[2] = staff.getStaffName();
            obj[3] = staff.getStaffBirthday();
            obj[4] = staff.getStaffPhoneNumber();
            obj[5] = staff.getStaffDepartment();
            obj[6] = staff.isStatus();
            dtm.addRow(obj);
        }
        return dtm;
    }
 
}