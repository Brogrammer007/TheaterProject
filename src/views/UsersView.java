package views;

import models.Users;

import java.util.Scanner;

public class UsersView {
    public static Users Login(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        return new Users(username,password);

    }
}
