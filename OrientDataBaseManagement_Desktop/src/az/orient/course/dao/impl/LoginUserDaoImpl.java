package az.orient.course.dao.impl;

import az.orient.course.dao.DBHelper;
import az.orient.course.dao.LoginUserDao;
import az.orient.course.model.LoginUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import az.orient.course.model.Role;

public class LoginUserDaoImpl implements LoginUserDao {

    @Override
    public LoginUser login(String username, String password) throws Exception {

        LoginUser loginUser = new LoginUser();

        String sql = "SELECT LU.ID           AS LU_ID,"
                + "       LU.USERNAME     AS LU_USERNAME,"
                + "       LU.NAME         AS LU_NAME,"
                + "       LU.SURNAME      AS LU_SURNAME,"
                + "       R.ID            AS R_ID,"
                + "       R.ROLE_NAME     AS R_ROLE_NAME"
                + "  FROM LOGIN_USER LU INNER JOIN ROLE R ON LU.ROLE_ID = R.ID"
                + " WHERE LU.ACTIVE = 1 AND LU.USERNAME = ? AND LU.PASSWORD = ?";

        try (Connection c = DBHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                loginUser.setId(rs.getLong("LU_ID"));
                loginUser.setUsername(rs.getString("LU_USERNAME"));
                loginUser.setName(rs.getString("LU_NAME"));
                loginUser.setSurname(rs.getString("LU_SURNAME"));

                Role role = new Role();
                role.setId(rs.getLong("R_ID"));
                role.setRoleName(rs.getString("R_ROLE_NAME"));

                loginUser.setRole(role);

            } else {
                loginUser = null;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return loginUser;
    }
}
