/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.controller;

import com.hbt.st.model.Staff;
import com.hbt.st.service.StaffService;
import com.hbt.st.service.StaffServiceImpl;
import com.hbt.st.utility.ClassTableModel;
import com.hbt.st.view.StaffJFrame;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
 
/**
 *
 * @author TVD
 */
public class StaffManageController {
 
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
 
    private ClassTableModel classTableModel = null;
 
    private final String[] COLUMNS = {"No","ID", "Name", "Birthday", "Phone Number", "Department","Status"};
 
    private StaffService staffService = null;
 
    private TableRowSorter<TableModel> rowSorter = null;
 
    public StaffManageController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
 
        this.classTableModel = new ClassTableModel();
 
        this.staffService = new StaffServiceImpl();
    }
 
    public void setDataToTable() {
        List<Staff> listItem = staffService.getList();
        DefaultTableModel model = classTableModel.setTableStaff(listItem, COLUMNS);
        JTable table = new JTable(model);
 
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
 
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
 
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
 
            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
 
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(e.getClickCount() == 2 && table.getSelectedRow() != -1){
                   DefaultTableModel model = (DefaultTableModel) table.getModel();
                   int selectedRowIndex = table.getSelectedRow();
                   selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                   
                   Staff staff = new Staff();
                   staff.setStaffID((int) model.getValueAt(selectedRowIndex, 1));
                   staff.setStaffName(model.getValueAt(selectedRowIndex, 2).toString());
                   staff.setStaffBirthday((Date) model.getValueAt(selectedRowIndex, 3));
                   staff.setStaffPhoneNumber(model.getValueAt(selectedRowIndex, 4).toString());
                   staff.setStaffDepartment(model.getValueAt(selectedRowIndex, 5).toString());
                   staff.setStatus((boolean) model.getValueAt(selectedRowIndex, 6));
                   
                   StaffJFrame frame = new StaffJFrame(staff);
                   frame.setTitle("Staff Information");
                   frame.setResizable(false);
                   frame.setLocationRelativeTo(null);
                   frame.setVisible(true);
               }
            }
            
        });
                
                
        // design
        table.getColumnModel().getColumn(0).setMaxWidth(45);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }
 
}