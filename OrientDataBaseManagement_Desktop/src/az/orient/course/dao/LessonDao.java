package az.orient.course.dao;

import az.orient.course.model.Lesson;
import java.util.List;

public interface LessonDao {

    List<Lesson> getLessonList() throws Exception;

    void deleteLesson(Long selectedId) throws Exception;

    void addLesson(Lesson lesson) throws Exception;

    Lesson getLessonByID(Long selectedId) throws Exception;

    void updateLesson(Lesson lesson) throws Exception;
}
