package az.orient.course.gui;

import az.orient.course.model.*;
import az.orient.course.service.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame {

    private StudentService studentService;
    private TeacherService teacherService;
    private LessonService lessonService;
    private PaymentService paymentService;
    private LoginUser loginUser;
    private String globBtnName = "";

    public MainFrame(StudentService studentService, TeacherService teacherService, LessonService lessonService, PaymentService paymentService, LoginUser loginUser) {

        initComponents();
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.lessonService = lessonService;
        this.paymentService = paymentService;
        this.loginUser = loginUser;
        nameSurnameTxt.setText(this.loginUser.getName() + " " + this.loginUser.getSurname());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        studentDataBtn = new javax.swing.JButton();
        teacherDataBtn = new javax.swing.JButton();
        lessonDataBtn = new javax.swing.JButton();
        paymentDataBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameSurnameTxt = new javax.swing.JLabel();
        keywordTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        studentDataBtn.setText("Student Data");
        studentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDataBtnActionPerformed(evt);
            }
        });

        teacherDataBtn.setText("Teacher Data");
        teacherDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDataBtnActionPerformed(evt);
            }
        });

        lessonDataBtn.setText("Lesson Data");
        lessonDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonDataBtnActionPerformed(evt);
            }
        });

        paymentDataBtn.setText("Payment Data");
        paymentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentDataBtnActionPerformed(evt);
            }
        });

        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lessonDataBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(paymentDataBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(teacherDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lessonDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(logOutBtn)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Welcome,");

        nameSurnameTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameSurnameTxt.setText("Name Surname");

        keywordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordTxtActionPerformed(evt);
            }
        });
        keywordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keywordTxtKeyReleased(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameSurnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn)
                        .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(nameSurnameTxt))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDataBtnActionPerformed

        keywordTxt.setText("");
        try {
            showStudentData(studentService.getStudentList());
            globBtnName = "student";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_studentDataBtnActionPerformed

    private void teacherDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDataBtnActionPerformed
        keywordTxt.setText("");
        showTeacherData();
        globBtnName = "teacher";

    }//GEN-LAST:event_teacherDataBtnActionPerformed

    private void lessonDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonDataBtnActionPerformed
        keywordTxt.setText("");
        showLessonData();
        globBtnName = "lesson";
    }//GEN-LAST:event_lessonDataBtnActionPerformed

    private void paymentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentDataBtnActionPerformed
        keywordTxt.setText("");
        showPaymentData();
        globBtnName = "payment";
    }//GEN-LAST:event_paymentDataBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed

        switch (globBtnName) {
            case "student":
                NewStudentFrame newStudentFrame = new NewStudentFrame(studentService, this);
                newStudentFrame.setVisible(true);
                break;
            case "teacher":
                NewTeacherFrame newTeacherFrame = new NewTeacherFrame(teacherService, this);
                newTeacherFrame.setVisible(true);
                break;
            case "lesson":
                NewLessonFrame newLessonFrame = new NewLessonFrame(lessonService, this);
                newLessonFrame.setVisible(true);
                break;
            case "payment":
                NewPaymentFrame newPaymentFrame = new NewPaymentFrame(paymentService, studentService, lessonService, teacherService, this);
                newPaymentFrame.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please, select menu!");
        }
    }//GEN-LAST:event_newBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        int rowIndex = jTable1.getSelectedRow();

        if (rowIndex != -1) {

            Long selectedId = (Long) jTable1.getValueAt(rowIndex, 0);

            switch (globBtnName) {

                case "student":
                    EditStudentFrame editStudentFrame = new EditStudentFrame(studentService, selectedId, this);
                    editStudentFrame.setVisible(true);
                    break;
                case "teacher":
                    EditTeacherFrame editTeacherFrame = new EditTeacherFrame(teacherService, selectedId, this);
                    editTeacherFrame.setVisible(true);
                    break;
                case "lesson":
                    EditLessonFrame editLessonFrame = new EditLessonFrame(lessonService, selectedId, this);
                    editLessonFrame.setVisible(true);
                    break;
                case "payment":
                    EditPaymentFrame editPaymentFrame = new EditPaymentFrame(paymentService, studentService, lessonService, teacherService, selectedId, this);
                    editPaymentFrame.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please, select menu!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please, select menu!");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed

        int rowIndex = jTable1.getSelectedRow();
        int isConfirmed;

        try {
            if (rowIndex != -1) {

                Long selectedId = (Long) jTable1.getValueAt(rowIndex, 0);

                switch (globBtnName) {
                    case "student":
                        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Student", JOptionPane.YES_NO_OPTION);
                        if (isConfirmed == JOptionPane.YES_OPTION) {
                            studentService.deleteStudent(selectedId);
                            JOptionPane.showMessageDialog(null, "Student has been successfully deleted!");
                            showStudentData(studentService.getStudentList());
                        }
                        break;
                    case "teacher":

                        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Teacher", JOptionPane.YES_NO_OPTION);
                        if (isConfirmed == JOptionPane.YES_OPTION) {
                            teacherService.deleteTeacher(selectedId);
                            JOptionPane.showMessageDialog(null, "Teacher has been successfully deleted!");
                            showTeacherData();
                        }

                        break;
                    case "lesson":

                        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Lesson", JOptionPane.YES_NO_OPTION);
                        if (isConfirmed == JOptionPane.YES_OPTION) {
                            lessonService.deleteLesson(selectedId);
                            JOptionPane.showMessageDialog(null, "Lesson has been successfully deleted!");
                            showLessonData();
                        }
                        break;
                    case "payment":

                        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Payment", JOptionPane.YES_NO_OPTION);
                        if (isConfirmed == JOptionPane.YES_OPTION) {
                            paymentService.deletePayment(selectedId);
                            JOptionPane.showMessageDialog(null, "Payment has been successfully deleted!");
                            showPaymentData();
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please, select menu!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please, select menu!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problem! " + globBtnName + " has not been successfully deleted!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked

    }//GEN-LAST:event_editBtnMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        try {
            String keyword = keywordTxt.getText();

            switch (globBtnName) {
                case "student":
                    List<Student> studentList = studentService.searchStudentData(keyword);
                    showStudentData(studentList);
                    break;
                case "teacher":
                    break;
                case "lesson":
                    break;
                case "payment":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please, select menu!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void keywordTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keywordTxtKeyReleased
        searchBtnActionPerformed(null);
    }//GEN-LAST:event_keywordTxtKeyReleased

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed

        int isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure?", "Log Out", JOptionPane.YES_NO_OPTION);

        if (isConfirmed == JOptionPane.YES_OPTION) {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void keywordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField keywordTxt;
    private javax.swing.JButton lessonDataBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel nameSurnameTxt;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton paymentDataBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton studentDataBtn;
    private javax.swing.JButton teacherDataBtn;
    // End of variables declaration//GEN-END:variables

    public void showStudentData(List<Student> studentList) {

        try {

            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of Birth");
            model.addColumn("Phone");

//            List<Student> studentList = studentService.getStudentList();
            for (Student s : studentList) {
                Object[] data = new Object[]{
                    s.getId(), s.getName(), s.getSurname(), s.getAddress(), s.getDob(), s.getPhone()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void showTeacherData() {

        try {

            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of Birth");
            model.addColumn("Phone");
            model.addColumn("Work Experience");
            List<Teacher> teacherList = teacherService.getTeacherList();
            for (Teacher t : teacherList) {
                Object[] data = new Object[]{
                    t.getId(), t.getName(), t.getSurname(), t.getAddress(), t.getDob(), t.getPhone(), t.getWorkExperience()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void showLessonData() {

        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Time");
            model.addColumn("Price");
            List<Lesson> lessonList = lessonService.getLessonList();
            for (Lesson l : lessonList) {
                Object[] data = new Object[]{
                    l.getId(), l.getName(), l.getDuration(), l.getPrice()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void showPaymentData() {

        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Student Fullname");
            model.addColumn("Lesson Name");
            model.addColumn("Teacher Fullname");
            model.addColumn("Payment Amount");
            model.addColumn("Payment Date");

            List<Payment> paymentList = paymentService.getPaymentList();
            for (Payment p : paymentList) {
                Object[] data = new Object[]{
                    p.getId(), p.getStudent().getName() + " " + p.getStudent().getSurname(),
                    p.getLesson().getName(), p.getTeacher().getName() + " " + p.getTeacher().getSurname(),
                    p.getAmount(), p.getDataDate()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
