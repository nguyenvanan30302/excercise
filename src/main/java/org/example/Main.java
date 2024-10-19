package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1. Add User");
                System.out.println("2. Fix User");
                System.out.println("3. Display Users");
                System.out.println("4. Find Users by Id");
                System.out.println("5. Delete 1 User");
                System.out.println("6. Clear User");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: UserManagement.addUser(); break;
                    case 2: break;
                    case 3: UserManagement.displayUser(); break;
                    case 4: UserManagement.findById(); break;
                    case 5: UserManagement.deleteInformation(); break;
                    case 6: UserManagement.deleteUser(); break;
                }
            }
    }
}