package az.orient.course.service;

import az.orient.course.model.LoginUser;

public interface LoginUserService {

    LoginUser login(String username, String password) throws Exception;
}