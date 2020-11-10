package hw_1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User();
        Admin admin = new Admin();

        UserService userService = new UserService();


        AdminService adminService = new AdminService();
        adminService.check(user);
        adminService.check(admin);
    }
}
