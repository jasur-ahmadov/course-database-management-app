package az.orient.course.gui;

import az.orient.course.model.*;
import az.orient.course.service.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class EditPaymentFrame extends javax.swing.JFrame {

    private PaymentService paymentService;
    private StudentService studentService;
    private LessonService lessonService;
    private TeacherService teacherService;
    private Long selectedId;
    private MainFrame mainFrame;

    public EditPaymentFrame(PaymentService paymentService, StudentService studentService, LessonService lessonService, TeacherService teacherService, Long selectedId, MainFrame mainFrame) {

        try {
            initComponents();
            this.paymentService = paymentService;
            this.studentService = studentService;
            this.lessonService = lessonService;
            this.teacherService = teacherService;
            this.selectedId = selectedId;
            this.mainFrame = mainFrame;

            Payment payment = this.paymentService.getPaymentById(selectedId);
            editStudentCombo(payment.getStudent());
            editLessonCombo(payment.getLesson());
            editTeacherCombo(payment.getTeacher());
            amountTxt.setText(String.valueOf(payment.getAmount()));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editStudentCombo(Student s) {

        try {

            DefaultComboBoxModel studentCombo = (DefaultComboBoxModel) studentCmb.getModel();
            List<Student> studentList = studentService.getStudentList();

            for (Student student : studentList) {
                studentCombo.addElement(student);
            }

            studentCombo.setSelectedItem(s);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editLessonCombo(Lesson l) {

        try {

            DefaultComboBoxModel lessonCombo = (DefaultComboBoxModel) lessonCmb.getModel();
            List<Lesson> lessonList = lessonService.getLessonList();

            for (Lesson lesson : lessonList) {
                lessonCombo.addElement(lesson);
            }

            lessonCombo.setSelectedItem(l);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editTeacherCombo(Teacher t) {

        try {

            DefaultComboBoxModel teacherCombo = (DefaultComboBoxModel) teacherCmb.getModel();
            List<Teacher> teacherList = teacherService.getTeacherList();

            for (Teacher teacher : teacherList) {
                teacherCombo.addElement(teacher);
            }

            teacherCombo.setSelectedItem(t);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherCmb = new javax.swing.JComboBox<>();
        amountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        studentCmb = new javax.swing.JComboBox<>();
        lessonCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        teacherCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Teacher" }));

        jLabel1.setText("Student");

        jLabel2.setText("Lesson");

        jLabel3.setText("Teacher");

        jLabel4.setText("Amount");

        jLabel5.setText("AZN");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        studentCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));

        lessonCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lesson" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel4))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(amountTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lessonCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try {

            Student student = (Student) studentCmb.getSelectedItem();
            Lesson lesson = (Lesson) lessonCmb.getSelectedItem();
            Teacher teacher = (Teacher) teacherCmb.getSelectedItem();
            Double amount = Double.parseDouble(amountTxt.getText());

            Payment payment = paymentService.getPaymentById(selectedId);
            payment.setStudent(student);
            payment.setLesson(lesson);
            payment.setTeacher(teacher);
            payment.setAmount(amount);

            paymentService.updatePayment(payment);
            JOptionPane.showMessageDialog(null, "Payment has been successfully updated!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problem! Payment has not been successfully updated!", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        this.dispose();
        mainFrame.showPaymentData();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        studentCmb.setSelectedIndex(0);
        lessonCmb.setSelectedIndex(0);
        teacherCmb.setSelectedIndex(0);
        amountTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> lessonCmb;
    private javax.swing.JComboBox<String> studentCmb;
    private javax.swing.JComboBox<String> teacherCmb;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
