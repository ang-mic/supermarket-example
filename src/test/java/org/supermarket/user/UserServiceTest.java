package org.supermarket.user;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserServiceTest {

    @Test
    public void createUser() {
        final UserService   userService = UserService.Instance();
        final User user = new User();
        final boolean isUserSaved = userService.saveUser(user);

        assertTrue("Provide a non null User object", isUserSaved);
    }
}


class UserService {
    private static UserService ourInstance = new UserService();

    public static UserService Instance() {
        return ourInstance;
    }

    private UserService() {
    }

    public boolean saveUser(User user) {
        if (user != null) return true;
        else return false;
    }
}

