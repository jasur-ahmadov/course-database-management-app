package az.orient.course.service.impl;

import az.orient.course.dao.LoginUserDao;
import az.orient.course.model.LoginUser;
import az.orient.course.service.LoginUserService;

public class LoginUserServiceImpl implements LoginUserService {

    LoginUserDao loginUserDao;

    public LoginUserServiceImpl(LoginUserDao loginUserDao) {
        this.loginUserDao = loginUserDao;
    }

    @Override
    public LoginUser login(String username, String password) throws Exception {
        return loginUserDao.login(username, password);
    }
}