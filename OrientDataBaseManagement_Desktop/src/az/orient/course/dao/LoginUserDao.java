package az.orient.course.dao;

import az.orient.course.model.LoginUser;

public interface LoginUserDao {

    LoginUser login(String username, String password) throws Exception;
}