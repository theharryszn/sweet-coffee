package lesson9;

import java.util.Scanner;

public class Bankify {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Bankify");

        System.out.print("Tell us your name: ");
        String name = input.nextLine();

        System.out.print("Create a password: ");
        String password = input.nextLine();

        Account newAccount = new Account(name, password);

        System.out.println("What will you like to do?: ");
        System.out.println("1. Show Account Name \t\t\t 2. Change Password");

        int option = input.nextInt();
        input.nextLine();

        switch (option) {
            case 1 -> System.out.println("Your account name is " + newAccount.getName());
            case 2 -> {
                System.out.println("Enter your password: ");
                String currentPassword = input.nextLine();

                System.out.println("Enter new password: ");
                String newPassword = input.nextLine();

                newAccount.changePassword(currentPassword, newPassword);
            }
            default -> System.out.println("Invalid Option");
        }

        System.out.println("Thanks for trusting Bankify");

    }
}

class Account {
    private final String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
        System.out.println("Account created successfully.");
    }

    public String getName() {
        return name;
    }

    public void changePassword(String currentPassword ,String newPassword) {
        if(this.password.equals(currentPassword)) {
            this.password = newPassword;
            System.out.println("Password Changed Successfully");
        }else {
            System.out.println("Invalid Password");
        }

    }
}



