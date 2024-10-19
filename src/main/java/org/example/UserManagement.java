package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement {
   static Scanner sc = new Scanner(System.in);
   static List <User> userList = new ArrayList<>();
   public static void addUser() {
      System.out.println("Enter id ");
      int id  = sc.nextInt();
      System.out.println("Enter name");
      String name  = sc.nextLine();
      sc.nextLine();
      System.out.println("Enter age");
      int age  = sc.nextInt();
      User user = new User (id ,name, age );
      userList.add(user);
      System.out.println("User added");
   }

   public static void findById() {
      System.out.println("Enter id ");
      int k = sc.nextInt();
     for (User user : userList) {
        if (user.getId() == k) {
           System.out.printf("Information of id " + k + " is " + user);
        }
     }
   }

   public static void displayUser(){
      if (userList.isEmpty()){
         System.out.println("No data");
      }else {
         for (User user : userList) {
            System.out.printf(String.valueOf(user));
         }
      }
   }
   public static void deleteUser(){
      userList.clear();
      System.out.printf("Deleted");
   }

   public static void deleteInformation(){
      System.out.println("Enter id you want to delete");
      int id = sc.nextInt();
      userList.removeIf(u -> u.getId() == id);
   }
}








