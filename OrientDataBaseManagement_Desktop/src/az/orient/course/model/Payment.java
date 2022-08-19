package az.orient.course.model;

import java.util.Date;

public class Payment extends CourseModel {

    private Student student;
    private Lesson lesson;
    private Teacher teacher;
    private Double amount;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" + "student=" + student + ", lesson=" + lesson + ", teacher=" + teacher + ", amount=" + amount + '}';
    }
}