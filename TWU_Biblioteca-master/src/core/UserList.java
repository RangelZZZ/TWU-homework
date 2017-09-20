package core;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();

    public UserList() {
        this.users.add(new User("rangel", "18792561236@163.com", "18792561236", "xian"));
        this.users.add(new User("guoru", "11111@163.com", "11111", "xian"));
        this.users.add(new User("wanlin", "222222@163.com", "22222", "xian"));
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

}
