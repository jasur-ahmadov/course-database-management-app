package az.orient.course.dao;

import java.io.FileReader;
import java.sql.*;
import java.util.*;

public class DBHelper {

    public static Connection getConnection() throws Exception {

        Locale.setDefault(Locale.ENGLISH);
        Properties p = new Properties();
        p.load(new FileReader("nbproject\\private\\config.properties"));
        Class.forName(p.getProperty("db.driver"));
        Connection c = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
        return c;
    }
}