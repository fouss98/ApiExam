package com.fouss.api.service;

/*import com.fouss.api.util.DBUtil;
import org.springframework.stereotype.Service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    Connection connection;
    int flag = 0;
    public UserServiceImpl() throws SQLException {
        connection= DBUtil.getConnection();
    }
    @Override
    public int loginValidation(String username, String password) {
        try {
            PreparedStatement statement =connection.prepareStatement("SELECT * FROM users WHERE username = '"+username+"'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                if (resultSet.getString(3).equals(username)&&resultSet.getString(4).equals(password)){
                    flag = 1;
                }else {
                    System.out.println("INCRRECT");
                    flag = 0;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return flag;
    }
}*/
