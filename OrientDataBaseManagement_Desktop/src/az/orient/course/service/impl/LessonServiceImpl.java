package az.orient.course.service.impl;

import az.orient.course.dao.LessonDao;
import az.orient.course.model.Lesson;
import az.orient.course.service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {

    private LessonDao lessonDao;

    public LessonServiceImpl(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public List<Lesson> getLessonList() throws Exception {
        return lessonDao.getLessonList();
    }

    @Override
    public void deleteLesson(Long lessonId) throws Exception {
        lessonDao.deleteLesson(lessonId);
    }

    @Override
    public void addLesson(Lesson lesson) throws Exception {
        lessonDao.addLesson(lesson);
    }

    @Override
    public Lesson getLessonByID(Long lessonId) throws Exception {
        return lessonDao.getLessonByID(lessonId);
    }

    @Override
    public void updateLesson(Lesson lesson) throws Exception {
        lessonDao.updateLesson(lesson);
    }
}
