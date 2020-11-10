import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        com.company.User user = new com.company.User();
        com.company.Admin admin = new com.company.Admin();

        com.company.UserService userService = new com.company.UserService();


        com.company.AdminService adminService = new com.company.AdminService();
        adminService.check(user);
        adminService.check(admin);
    }
}
