/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.st.view;

/**
 *
 * @author baotr
 */
import com.hbt.st.bean.BeanList;
import com.hbt.st.controller.ScreenSwitch;
import java.util.ArrayList;
import java.util.List;
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setTitle("STAFF TRAINING MANAGEMENT");
                
        ScreenSwitch controller = new ScreenSwitch(jpnView);
        controller.setView(jpnIndex, jlbIndex);
        
        List<BeanList> listItem = new ArrayList<>();
        listItem.add(new BeanList("Index", jpnIndex, jlbIndex));
        listItem.add(new BeanList("Staff", jpnStaff, jlbStaff));
        listItem.add(new BeanList("Courses", jpnCourses, jlbCourses));
        listItem.add(new BeanList("Class", jpnClass, jlbClass));
        listItem.add(new BeanList("Report", jpnReport, jlbReport));
        
        controller.setEvent(listItem);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnIndex = new javax.swing.JPanel();
        jlbIndex = new javax.swing.JLabel();
        jpnStaff = new javax.swing.JPanel();
        jlbStaff = new javax.swing.JLabel();
        jpnCourses = new javax.swing.JPanel();
        jlbCourses = new javax.swing.JLabel();
        jpnClass = new javax.swing.JPanel();
        jlbClass = new javax.swing.JLabel();
        jpnReport = new javax.swing.JPanel();
        jlbReport = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(20, 20, 82));

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\image_header1.png")); // NOI18N
        jLabel2.setText("TRAINING MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpnIndex.setBackground(new java.awt.Color(0, 153, 153));

        jlbIndex.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbIndex.setForeground(new java.awt.Color(255, 255, 255));
        jlbIndex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbIndex.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\home.png")); // NOI18N
        jlbIndex.setText("Home");

        javax.swing.GroupLayout jpnIndexLayout = new javax.swing.GroupLayout(jpnIndex);
        jpnIndex.setLayout(jpnIndexLayout);
        jpnIndexLayout.setHorizontalGroup(
            jpnIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnIndexLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jpnIndexLayout.setVerticalGroup(
            jpnIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnIndexLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbIndex, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpnStaff.setBackground(new java.awt.Color(0, 153, 153));

        jlbStaff.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbStaff.setForeground(new java.awt.Color(255, 255, 255));
        jlbStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStaff.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\staff.png")); // NOI18N
        jlbStaff.setText("Staff Management");

        javax.swing.GroupLayout jpnStaffLayout = new javax.swing.GroupLayout(jpnStaff);
        jpnStaff.setLayout(jpnStaffLayout);
        jpnStaffLayout.setHorizontalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jpnStaffLayout.setVerticalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpnCourses.setBackground(new java.awt.Color(0, 153, 153));

        jlbCourses.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbCourses.setForeground(new java.awt.Color(255, 255, 255));
        jlbCourses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCourses.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\course.png")); // NOI18N
        jlbCourses.setText("Courses Management");

        javax.swing.GroupLayout jpnCoursesLayout = new javax.swing.GroupLayout(jpnCourses);
        jpnCourses.setLayout(jpnCoursesLayout);
        jpnCoursesLayout.setHorizontalGroup(
            jpnCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCoursesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jpnCoursesLayout.setVerticalGroup(
            jpnCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCoursesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpnClass.setBackground(new java.awt.Color(0, 153, 153));

        jlbClass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbClass.setForeground(new java.awt.Color(255, 255, 255));
        jlbClass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbClass.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\class.png")); // NOI18N
        jlbClass.setText("Class Management");

        javax.swing.GroupLayout jpnClassLayout = new javax.swing.GroupLayout(jpnClass);
        jpnClass.setLayout(jpnClassLayout);
        jpnClassLayout.setHorizontalGroup(
            jpnClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClassLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jpnClassLayout.setVerticalGroup(
            jpnClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClassLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbClass, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpnReport.setBackground(new java.awt.Color(0, 153, 153));

        jlbReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbReport.setForeground(new java.awt.Color(255, 255, 255));
        jlbReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbReport.setIcon(new javax.swing.ImageIcon("D:\\Trongj\\Netbeans Project\\StaffTraining\\image\\report.png")); // NOI18N
        jlbReport.setText("Report");

        javax.swing.GroupLayout jpnReportLayout = new javax.swing.GroupLayout(jpnReport);
        jpnReport.setLayout(jpnReportLayout);
        jpnReportLayout.setHorizontalGroup(
            jpnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReportLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jpnReportLayout.setVerticalGroup(
            jpnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReportLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbReport, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ha Bao Trong - 2020");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbClass;
    private javax.swing.JLabel jlbCourses;
    private javax.swing.JLabel jlbIndex;
    private javax.swing.JLabel jlbReport;
    private javax.swing.JLabel jlbStaff;
    private javax.swing.JPanel jpnClass;
    private javax.swing.JPanel jpnCourses;
    private javax.swing.JPanel jpnIndex;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnReport;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStaff;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
