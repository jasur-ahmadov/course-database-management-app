package az.orient.course.gui;

import az.orient.course.dao.*;
import az.orient.course.dao.impl.*;
import az.orient.course.model.LoginUser;
import az.orient.course.service.*;
import az.orient.course.service.impl.*;

public class LoginFrame extends javax.swing.JFrame {

    StudentDao studentdao = new StudentDaoImpl();
    StudentService studentService = new StudentServiceImpl(studentdao);

    TeacherDao teacherdao = new TeacherDaoImpl();
    TeacherService teacherService = new TeacherServiceImpl(teacherdao);

    LessonDao lessondao = new LessonDaoImpl();
    LessonService lessonService = new LessonServiceImpl(lessondao);

    PaymentDao paymentDao = new PaymentDaoImpl();
    PaymentService paymentService = new PaymentServiceImpl(paymentDao);

    LoginUserDao loginUserDao = new LoginUserDaoImpl();
    LoginUserService loginUserService = new LoginUserServiceImpl(loginUserDao);

    public LoginFrame() {
        initComponents();
        errorMsg.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        logInBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        errorMsg.setForeground(new java.awt.Color(255, 51, 51));
        errorMsg.setText("error message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logInBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordTxt)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logInBtn)
                    .addComponent(clearBtn))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed

        String username = usernameTxt.getText();
        String password = passwordTxt.getText();

        try {

            if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {

                LoginUser loginUser = loginUserService.login(username, password);

                if (loginUser != null) {
                    errorMsg.setVisible(false);
                    MainFrame mainFrame = new MainFrame(studentService, teacherService, lessonService, paymentService, loginUser);
                    mainFrame.setVisible(true);
                    mainFrame.showStudentData(studentService.getStudentList());
                    this.dispose();
                } else {
                    errorMsg.setVisible(true);
                    errorMsg.setText("username or password is invalid!");
                }

            } else {
                errorMsg.setVisible(true);
                errorMsg.setText("username or password is empty!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        usernameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
