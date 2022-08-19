package az.orient.course.service.impl;

import az.orient.course.dao.*;
import az.orient.course.model.Teacher;
import az.orient.course.service.TeacherService;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao = null;

    public TeacherServiceImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        return teacherDao.getTeacherList();
    }

    @Override
    public void addTeacher(Teacher teacher) throws Exception {
        teacherDao.addTeacher(teacher);
    }

    @Override
    public Teacher getTeacherByID(Long teacherId) throws Exception {
        return teacherDao.getTeacherByID(teacherId);
    }

    @Override
    public void updateTeacher(Teacher teacher) throws Exception {
        teacherDao.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Long teacherId) throws Exception {
        teacherDao.deleteTeacher(teacherId);
    }

    @Override
    public List<Teacher> searchTeacherData(String keyword) throws Exception {
        return teacherDao.searchTeacherData(keyword);
    }
}