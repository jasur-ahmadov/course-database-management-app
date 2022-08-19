package az.orient.course.util;

import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import java.util.List;

public class Utility {

    public static void showStudentList(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.getId() + " -- " + s.getName()
                    + " -- " + s.getSurname() + " -- " + s.getDob()
                    + " -- " + s.getAddress() + " -- " + s.getPhone());
        }
    }

    public static void showTeacherList(List<Teacher> teachers) {
        for (Teacher t : teachers) {
            System.out.println(t.getId() + " -- " + t.getName()
                    + " -- " + t.getSurname() + " -- " + t.getDob()
                    + " -- " + t.getAddress() + " -- " + t.getPhone()
                    + " -- " + t.getWorkExperience());
        }
    }
}
