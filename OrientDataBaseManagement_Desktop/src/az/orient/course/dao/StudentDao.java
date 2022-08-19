package az.orient.course.dao;

import az.orient.course.model.Student;
import java.util.List;

public interface StudentDao {

    List<Student> getStudentList() throws Exception;

    void addStudent(Student st) throws Exception;

    Student getStudentByID(Long studentId) throws Exception;

    void updateStudent(Student student) throws Exception;

    void deleteStudent(Long studentId) throws Exception;

    List<Student> searchStudentData(String keyword) throws Exception;
}