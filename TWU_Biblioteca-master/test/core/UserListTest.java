package core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class UserListTest {

    private UserList userList = new UserList();

    @Test
    public void should_get_all_user_from_when_given_fake_date() {
        assertThat(userList.getUsers().size(), is(3));
        assertThat(userList.getUsers().get(0).getName(),is("rangel"));
    }

    @Test
    public void should_find_user_by_user_name_correctly() throws Exception {
        User user = userList.findUser("rangel");

        assertThat(user.getEmail(),is("18792561236@163.com"));
        assertThat(user.getPhoneNumber(),is("18792561236"));

    }
    @Test
    public void should_return_null_when_user_do_not_exist() throws Exception {
        User user = userList.findUser("rangelzzz");
        assertNull(user);
    }
}
