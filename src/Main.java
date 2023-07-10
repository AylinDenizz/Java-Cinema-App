import Service.AdminService;
import Service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read user input
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter 1 for administration or press any button to access the Ticket System. Press 9 for exit.");
            String adminRequest = sc.next();
            System.out.println(adminRequest);
            if (adminRequest.equals("1")) {
                System.out.println("Redirecting to Administration");
                AdminService adminService = new AdminService();
                AdminService.AdminLoop();
            } else if (adminRequest.equals("9")) {
                break;
            } else{
                System.out.println("Redirecting to Ticket System");
                UserService userService = new UserService();
                UserService.UserLoop();
                sc.close();
            }


        }
    }

}