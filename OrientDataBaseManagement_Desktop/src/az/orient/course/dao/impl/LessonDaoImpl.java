package az.orient.course.dao.impl;

import az.orient.course.dao.*;
import az.orient.course.model.Lesson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class LessonDaoImpl implements LessonDao {

    @Override
    public List<Lesson> getLessonList() throws Exception {

        List<Lesson> lessonList = new ArrayList<>();

        String sql = "SELECT ID, NAME, DURATION, PRICE FROM LESSON "
                + "WHERE ACTIVE = 1 ORDER BY ID";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery(sql);) {

            while (rs.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("ID"));
                lesson.setName(rs.getString("NAME"));
                lesson.setDuration(rs.getInt("DURATION"));
                lesson.setPrice(rs.getDouble("PRICE"));
                lessonList.add(lesson);
            }

        }
        return lessonList;
    }

    @Override
    public void deleteLesson(Long selectedId) throws Exception {

        String sql = "UPDATE LESSON SET ACTIVE = 0 WHERE ID = ?";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, selectedId);
            ps.execute();
            c.commit();
        }
    }

    @Override
    public void addLesson(Lesson lesson) throws Exception {

        String sql = "INSERT INTO LESSON(ID, NAME, DURATION, PRICE) "
                + "VALUES(LESSON_SEQ.NEXTVAL, ?, ?, ?)";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, lesson.getName());
            ps.setInt(2, lesson.getDuration());
            ps.setDouble(3, lesson.getPrice());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public Lesson getLessonByID(Long lessonId) throws Exception {

        Lesson lesson = new Lesson();

        String sql = "SELECT ID, NAME, DURATION, PRICE FROM LESSON "
                + "WHERE ACTIVE = 1 AND ID = ?";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, lessonId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lesson.setId(rs.getLong("ID"));
                lesson.setName(rs.getString("NAME"));
                lesson.setDuration(rs.getInt("DURATION"));
                lesson.setPrice(rs.getDouble("PRICE"));
            }
        }
        return lesson;
    }

    @Override
    public void updateLesson(Lesson lesson) throws Exception {

        String sql = "UPDATE LESSON SET NAME = ?, DURATION = ?, PRICE = ? "
                + "WHERE ID = ?";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, lesson.getName());
            ps.setInt(2, lesson.getDuration());
            ps.setDouble(3, lesson.getPrice());
            ps.setLong(4, lesson.getId());
            ps.execute();
            c.commit();
        }
    }
}
