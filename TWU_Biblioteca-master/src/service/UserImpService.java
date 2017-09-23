package service;

import core.User;
import core.UserList;

public class UserImpService implements UserService{

    private UserList userList = new UserList();

    @Override
    public User findUser(String userName) {
        return userList.findUser(userName);
    }

    @Override
    public User checkLogin(String userName,String password) {
        return userList.checkLogin(userName,password);
    }
}
