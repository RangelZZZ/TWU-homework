package core;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();

    public UserList() {
        this.users.add(new User("rangel", "18792561236@163.com", "18792561236", "xian", "12345678"));
        this.users.add(new User("guoru", "11111@163.com", "11111", "xian", "12345678"));
        this.users.add(new User("wanlin", "222222@163.com", "22222", "xian", "12345678"));
    }

    public List<User> getUsers() {
        return this.users;
    }

    public User findUser(String userName) {
        User user = this.users.stream().filter(p -> p.getName().equals(userName)).findFirst().orElse(null);
        if (user == null) {
            return null;
        }

        return user;
    };

    public User checkLogin(String userName, String password) {
        User user = this.users.stream().filter(p -> p.getName().equals(userName) && p.getPassword() .equals(password)). findFirst().orElse(null);
        if (user == null) {
            return null;
        }

        return user;
    }


}
