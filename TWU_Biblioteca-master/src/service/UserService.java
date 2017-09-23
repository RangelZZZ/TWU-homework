package service;

import core.User;

public interface UserService {
    User findUser(String userName);
    User checkLogin(String userName,String password);
}
