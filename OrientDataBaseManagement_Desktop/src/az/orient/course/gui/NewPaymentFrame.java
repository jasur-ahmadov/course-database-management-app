package az.orient.course.gui;

import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import az.orient.course.service.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class NewPaymentFrame extends javax.swing.JFrame {

    private PaymentService paymentService;
    private StudentService studentService;
    private LessonService lessonService;
    private TeacherService teacherService;
    private MainFrame mainFrame;

    public NewPaymentFrame(PaymentService paymentService, StudentService studentService, LessonService lessonService, TeacherService teacherService, MainFrame mainFrame) {

        initComponents();
        this.paymentService = paymentService;
        this.studentService = studentService;
        this.lessonService = lessonService;
        this.teacherService = teacherService;
        this.mainFrame = mainFrame;

        showStudentCombo();
        showLessonCombo();
        showTeacherCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        studentCmb = new javax.swing.JComboBox<>();
        lessonCmb = new javax.swing.JComboBox<>();
        teacherCmb = new javax.swing.JComboBox<>();
        amountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        studentCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));
        studentCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCmbActionPerformed(evt);
            }
        });

        lessonCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lesson" }));
        lessonCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonCmbActionPerformed(evt);
            }
        });

        teacherCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Teacher" }));

        jLabel1.setText("Student");

        jLabel2.setText("Lesson");

        jLabel3.setText("Teacher");

        jLabel4.setText("Amount");

        jLabel5.setText("AZN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lessonCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 126, Short.MAX_VALUE))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amountTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        try {

            Student student = (Student) studentCmb.getSelectedItem();
            Lesson lesson = (Lesson) lessonCmb.getSelectedItem();
            Teacher teacher = (Teacher) teacherCmb.getSelectedItem();
            Double amount = Double.parseDouble(amountTxt.getText());

            Payment payment = new Payment();
            payment.setStudent(student);
            payment.setLesson(lesson);
            payment.setTeacher(teacher);
            payment.setAmount(amount);

            paymentService.addPayment(payment);
            JOptionPane.showMessageDialog(null, "Payment has been successfully added!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problem! Payment has not been successfully added!", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        this.dispose();
        mainFrame.showPaymentData();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        studentCmb.setSelectedIndex(0);
        lessonCmb.setSelectedIndex(0);
        teacherCmb.setSelectedIndex(0);
        amountTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void lessonCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonCmbActionPerformed

    private void studentCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentCmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> lessonCmb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> studentCmb;
    private javax.swing.JComboBox<String> teacherCmb;
    // End of variables declaration//GEN-END:variables

    private void showStudentCombo() {

        try {

            DefaultComboBoxModel studentCombo = (DefaultComboBoxModel) studentCmb.getModel();
            List<Student> studentList = studentService.getStudentList();

            for (Student student : studentList) {
                studentCombo.addElement(student);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showLessonCombo() {

        try {

            DefaultComboBoxModel lessonCombo = (DefaultComboBoxModel) lessonCmb.getModel();
            List<Lesson> lessonList = lessonService.getLessonList();

            for (Lesson lesson : lessonList) {
                lessonCombo.addElement(lesson);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showTeacherCombo() {

        try {

            DefaultComboBoxModel teacherCombo = (DefaultComboBoxModel) teacherCmb.getModel();
            List<Teacher> teacherList = teacherService.getTeacherList();

            for (Teacher teacher : teacherList) {
                teacherCombo.addElement(teacher);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
