/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.controller;

import com.hbt.st.bean.BeanList;
import com.hbt.st.view.ClassJPanel;
import com.hbt.st.view.CoursesJPanel;
import com.hbt.st.view.HomePageJPanel;
import com.hbt.st.view.ReportJPanel;
import com.hbt.st.view.StaffJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author baotr
 */
public class ScreenSwitch {
    
    private JPanel root;
    private String kindSelected = "";

    private List<BeanList> listItem = null;
            
    public ScreenSwitch(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "Index";
        jpnItem.setBackground(new Color(96,100,191));
        jpnItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new HomePageJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<BeanList> listItem){
        this.listItem = listItem;
        for(BeanList item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{

        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
         
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "Index":
                    node = new HomePageJPanel();
                    break;
                case "Staff":
                    node = new StaffJPanel();
                    break;
                case "Courses":
                    node = new CoursesJPanel();
                    break;
                case "Class":
                    node = new ClassJPanel();
                    break;
                case "Report":
                    node = new ReportJPanel();
                    break;
              
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(0,153,153));
                jlbItem.setBackground(new Color(0,153,153));
            }
        }
        
    }
    
    private void setChangeBackground(String kind){
        for(BeanList item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
            }
            else{
                item.getJpn().setBackground(new Color(0,153,153));
                item.getJlb().setBackground(new Color(0,153,153));
            }
        }
    }
    
}