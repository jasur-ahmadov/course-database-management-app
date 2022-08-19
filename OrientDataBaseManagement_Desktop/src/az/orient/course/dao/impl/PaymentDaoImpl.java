package az.orient.course.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import az.orient.course.dao.DBHelper;
import az.orient.course.dao.PaymentDao;
import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;

public class PaymentDaoImpl implements PaymentDao {

    @Override
    public List<Payment> getPaymentList() {

        List<Payment> paymentList = new ArrayList<>();

        String sql = "SELECT    P.ID             AS PAYMENT_ID,\n"
                + "         S.ID             AS STUDENT_ID,\n"
                + "         S.NAME           AS STUDENT_NAME,\n"
                + "         S.SURNAME        AS STUDENT_SURNAME,\n"
                + "         L.ID             AS LESSON_ID,\n"
                + "         L.NAME           AS LESSON_NAME,\n"
                + "         T.ID             AS TEACHER_ID,\n"
                + "         T.NAME           AS TEACHER_NAME,\n"
                + "         T.SURNAME        AS TEACHER_SURNAME,\n"
                + "         P.PAY_AMOUNT     AS PAYMENT_AMOUNT,\n"
                + "         P.DATA_DATE       AS PAYMENT_DATE\n"
                + "    FROM PAYMENT P\n"
                + "         INNER JOIN STUDENT S ON P.STUDENT_ID = S.ID\n"
                + "         INNER JOIN LESSON L ON P.LESSON_ID = L.ID\n"
                + "         INNER JOIN TEACHER T ON P.TEACHER_ID = T.ID\n"
                + "   WHERE P.ACTIVE = 1\n"
                + "ORDER BY P.ID";

        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(
                sql);  ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {

                Student student = new Student();
                student.setId(rs.getLong("STUDENT_ID"));
                student.setName(rs.getString("STUDENT_NAME"));
                student.setSurname(rs.getString("STUDENT_SURNAME"));

                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("LESSON_ID"));
                lesson.setName(rs.getString("LESSON_NAME"));

                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("TEACHER_ID"));
                teacher.setName(rs.getString("TEACHER_NAME"));
                teacher.setSurname(rs.getString("TEACHER_SURNAME"));

                Payment payment = new Payment();
                payment.setId(rs.getLong("PAYMENT_ID"));
                payment.setStudent(student);
                payment.setLesson(lesson);
                payment.setTeacher(teacher);
                payment.setAmount(rs.getDouble("PAYMENT_AMOUNT"));
                payment.setDataDate(rs.getDate("PAYMENT_DATE"));

                paymentList.add(payment);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return paymentList;
    }

    @Override
    public void addPayment(Payment payment) throws Exception {

        String sql = "INSERT INTO PAYMENT "
                + "VALUES(PAYMENT_SEQ.NEXTVAL, ?, ?, ?, ?, SYSDATE, 1)";

        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, payment.getStudent().getId());
            ps.setLong(2, payment.getLesson().getId());
            ps.setLong(3, payment.getTeacher().getId());
            ps.setDouble(4, payment.getAmount());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public Payment getPaymentById(Long paymentId) throws Exception {

        Payment payment = new Payment();

        String sql = "SELECT    P.ID             AS PAYMENT_ID,\n"
                + "         S.ID             AS STUDENT_ID,\n"
                + "         S.NAME           AS STUDENT_NAME,\n"
                + "         S.SURNAME        AS STUDENT_SURNAME,\n"
                + "         L.ID             AS LESSON_ID,\n"
                + "         L.NAME           AS LESSON_NAME,\n"
                + "         L.PRICE           AS LESSON_PRICE,\n"
                + "         T.ID             AS TEACHER_ID,\n"
                + "         T.NAME           AS TEACHER_NAME,\n"
                + "         T.SURNAME        AS TEACHER_SURNAME,\n"
                + "         P.PAY_AMOUNT     AS PAYMENT_AMOUNT,\n"
                + "         P.DATA_DATE       AS PAYMENT_DATE\n"
                + "    FROM PAYMENT P\n"
                + "         INNER JOIN STUDENT S ON P.STUDENT_ID = S.ID\n"
                + "         INNER JOIN LESSON L ON P.LESSON_ID = L.ID\n"
                + "         INNER JOIN TEACHER T ON P.TEACHER_ID = T.ID\n"
                + "   WHERE P.ACTIVE = 1\n"
                + " AND P.ID = ?";

        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setLong(1, paymentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Student student = new Student();
                student.setId(rs.getLong("STUDENT_ID"));
                student.setName(rs.getString("STUDENT_NAME"));
                student.setSurname(rs.getString("STUDENT_SURNAME"));

                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("LESSON_ID"));
                lesson.setName(rs.getString("LESSON_NAME"));
                lesson.setPrice(rs.getDouble("LESSON_PRICE"));

                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("TEACHER_ID"));
                teacher.setName(rs.getString("TEACHER_NAME"));
                teacher.setSurname(rs.getString("TEACHER_SURNAME"));

                payment.setId(rs.getLong("PAYMENT_ID"));
                payment.setStudent(student);
                payment.setLesson(lesson);
                payment.setTeacher(teacher);
                payment.setAmount(rs.getDouble("PAYMENT_AMOUNT"));
                payment.setDataDate(rs.getDate("PAYMENT_DATE"));

            }

        }
        return payment;
    }

    @Override
    public void updatePayment(Payment payment) throws Exception {

        String sql = "UPDATE PAYMENT SET STUDENT_ID=? , LESSON_ID = ?, TEACHER_ID=?, PAY_AMOUNT=? "
                + "WHERE ID = ?";

        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, payment.getStudent().getId());
            ps.setLong(2, payment.getLesson().getId());
            ps.setLong(3, payment.getTeacher().getId());
            ps.setDouble(4, payment.getAmount());
            ps.setLong(5, payment.getId());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public void deletePayment(Long paymentId) {

        String sql = "UPDATE PAYMENT SET ACTIVE = 0 WHERE ID = ?";

        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, paymentId);
            ps.execute();
            c.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
