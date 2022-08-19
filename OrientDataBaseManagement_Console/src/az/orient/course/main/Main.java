package az.orient.course.main;

import java.util.*;
import az.orient.course.dao.impl.*;
import az.orient.course.dao.*;
import az.orient.course.model.*;
import az.orient.course.service.*;
import az.orient.course.service.impl.*;
import az.orient.course.util.Utility;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        StudentDao studentdao = new StudentDaoImpl();
        StudentService studentService = new StudentServiceImpl(studentdao);

        TeacherDao teacherdao = new TeacherDaoImpl();
        TeacherService teacherService = new TeacherServiceImpl(teacherdao);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("student or teacher");

            switch (sc.next()) {

                case "student":

                    System.out.println("Which method? view, add, update, delete, search");
                    switch (sc.next()) {

                        case "view":
                            Utility.showStudentList(studentService.getStudentList());
                            break;

                        case "add":

                            System.out.println("Enter name:");
                            String name = sc.next();
                            System.out.println("Enter surname:");
                            String surname = sc.next();
                            System.out.println("Enter dob, Example: 16/02/1995");
                            String dob = sc.next();
                            System.out.println("Enter address:");
                            String address = sc.next();
                            System.out.println("Enter phone:");
                            String phone = sc.next();

                            Student st = new Student();
                            st.setName(name);
                            st.setSurname(surname);
                            st.setDob(df.parse(dob));
                            st.setAddress(address);
                            st.setPhone(phone);

                            studentService.addStudent(st);
                            System.out.println("Student has been successfully added!");
                            break;

                        case "update":

                            Utility.showStudentList(studentService.getStudentList());

                            System.out.println("Which student? Please, enter student's id:");
                            Long studentId = sc.nextLong();
                            Student student = studentService.getStudentByID(studentId);

                            if (student == null) {
                                System.out.println("There is no student related to the given id!");
                                return;
                            }

                            System.out.println("Old Student name: " + student.getName());
                            System.out.println("Old Student surname: " + student.getSurname());
                            System.out.println("Old Student address: " + student.getAddress());
                            System.out.println("Old Student DOB: " + student.getDob());
                            System.out.println("Old Student phone: " + student.getPhone());

                            System.out.println("Enter new name:");
                            name = sc.next();
                            System.out.println("Enter new surname:");
                            surname = sc.next();
                            System.out.println("Enter new dob, Example: 16/02/1995");
                            dob = sc.next();
                            System.out.println("Enter new address:");
                            address = sc.next();
                            System.out.println("Enter new phone:");
                            phone = sc.next();

                            student.setName(name);
                            student.setSurname(surname);
                            student.setDob(df.parse(dob));
                            student.setAddress(address);
                            student.setPhone(phone);

                            studentService.updateStudent(student);
                            System.out.println("Student has been successfully updated!");
                            break;

                        case "delete":

                            Utility.showStudentList(studentService.getStudentList());

                            System.out.println("Which student? Please, enter the student's id to delete:");
                            Long studentID = sc.nextLong();
                            Student studentToDelete = studentService.getStudentByID(studentID);

                            if (studentToDelete == null) {
                                System.out.println("There is no student related to the given id!");
                                return;
                            }

                            studentService.deleteStudent(studentID);
                            System.out.println("Student has been successfully deleted!");

                            break;

                        case "search":

                            Utility.showStudentList(studentService.getStudentList());

                            System.out.println("Enter the keyword:");
                            String keyword = sc.next();

                            List<Student> searchedStudents = studentService.searchStudentData(keyword);
                            System.out.println("Result:");
                            Utility.showStudentList(searchedStudents);
                            break;
                        default:
                            System.out.println("Invalid method!");
                    }

                    break;

                case "teacher":

                    System.out.println("Which method? view, add, update, delete, search");

                    switch (sc.next()) {

                        case "view":
                            Utility.showTeacherList(teacherService.getTeacherList());
                            break;

                        case "add":
                            System.out.println("Enter name:");
                            String name = sc.next();
                            System.out.println("Enter surname:");
                            String surname = sc.next();
                            System.out.println("Enter dob, Example: 16/02/1995");
                            String dob = sc.next();
                            System.out.println("Enter address:");
                            String address = sc.next();
                            System.out.println("Enter phone:");
                            String phone = sc.next();
                            System.out.println("Enter work experience:");
                            Integer workExp = sc.nextInt();

                            Teacher teach = new Teacher();
                            teach.setName(name);
                            teach.setSurname(surname);
                            teach.setDob(df.parse(dob));
                            teach.setAddress(address);
                            teach.setPhone(phone);
                            teach.setWorkExperience(workExp);

                            teacherService.addTeacher(teach);
                            System.out.println("Teacher has been successfully added!");
                            break;

                        case "update":

                            Utility.showTeacherList(teacherService.getTeacherList());

                            System.out.println("Which teacher? Please, enter teacher's id:");
                            Long teacherId = sc.nextLong();
                            Teacher te = teacherService.getTeacherByID(teacherId);

                            if (te == null) {
                                System.out.println("There is no teacher related to the given id!");
                                return;
                            }

                            System.out.println("Old Teacher name: " + te.getName());
                            System.out.println("Old Teacher surname: " + te.getSurname());
                            System.out.println("Old Teacher address: " + te.getAddress());
                            System.out.println("Old Teacher DOB: " + te.getDob());
                            System.out.println("Old Teacher phone: " + te.getPhone());
                            System.out.println("Old Teacher work experience: " + te.getWorkExperience());

                            System.out.println("Enter new name:");
                            name = sc.next();
                            System.out.println("Enter new surname:");
                            surname = sc.next();
                            System.out.println("Enter new dob, Example: 16/02/1995");
                            dob = sc.next();
                            System.out.println("Enter new address:");
                            address = sc.next();
                            System.out.println("Enter new phone:");
                            phone = sc.next();
                            System.out.println("Enter new work experience:");
                            workExp = sc.nextInt();

                            te.setName(name);
                            te.setSurname(surname);
                            te.setDob(df.parse(dob));
                            te.setAddress(address);
                            te.setPhone(phone);
                            te.setWorkExperience(workExp);

                            teacherService.updateTeacher(te);
                            System.out.println("Teacher has been successfully updated!");
                            break;
                        case "delete":

                            Utility.showTeacherList(teacherService.getTeacherList());

                            System.out.println("Which teacher? Please, enter teacher's id:");
                            Long teacherIdd = sc.nextLong();
                            Teacher tee = teacherService.getTeacherByID(teacherIdd);

                            if (tee == null) {
                                System.out.println("There is no teacher related to the given id!");
                                return;
                            }

                            teacherService.deleteTeacher(teacherIdd);
                            System.out.println("Teacher has been successfully deleted!");

                            break;

                        case "search":

                            Utility.showTeacherList(teacherService.getTeacherList());

                            System.out.println("Enter the keyword:");
                            String keyword = sc.next();

                            List<Teacher> searchedTeachers = teacherService.searchTeacherData(keyword);
                            System.out.println("Result:");
                            Utility.showTeacherList(searchedTeachers);
                            break;

                        default:
                            System.out.println("Invalid method!");
                            break;
                    }

                    break;

                default:
                    System.out.println("Invalid method!");
                    break;
            }

            main(args);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
