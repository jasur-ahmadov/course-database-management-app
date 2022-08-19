package az.orient.course.service;

import az.orient.course.model.Student;
import java.util.List;

public interface StudentService {

    List<Student> getStudentList() throws Exception;

    public void addStudent(Student st) throws Exception;

    Student getStudentByID(Long studentId) throws Exception;

    void updateStudent(Student student) throws Exception;

    void deleteStudent(Long studentId) throws Exception;

    public List<Student> searchStudentData(String keyword) throws Exception;
}