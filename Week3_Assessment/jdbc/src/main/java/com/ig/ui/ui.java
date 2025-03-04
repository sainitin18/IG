package com.ig.ui;

import java.util.Scanner;

import com.ig.service.*;

import com.ig.model.Scholar;

public class ui {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ScholarService scholarService = new ScholarServiceImp();

            while (true) {
                System.out.println("1. Add Scholar\n2. View All Scholars\n3. Find Scholar by ID\n4. Delete Scholar\n5. Update Scholar Email\n6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Scholar ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Mobile Number: ");
                        String mobile = scanner.nextLine();

                        Scholar scholar = new Scholar();
                        scholar.setScholarId(id);
                        scholar.setName(name);
                        scholar.setEmail(email);
                        scholar.setMobile(mobile);

                        scholarService.addScholar(scholar);
                        System.out.println("Scholar added successfully.");
                        break;

                    case 2:
                        scholarService.listAllScholars().forEach(System.out::println);
                        break;

                    case 3:
                        System.out.print("Enter Scholar ID to search: ");
                        int scholarId = scanner.nextInt();
                        System.out.println(scholarService.findScholarById(scholarId));
                        break;

                    case 4:
                        System.out.print("Enter Scholar ID to delete: ");
                        int delId = scanner.nextInt();
                        scholarService.deleteScholarById(delId);
                        break;

                    case 5:
                        System.out.print("Enter Scholar ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Enter New Email: ");
                        String newEmail = scanner.nextLine();
                        scholarService.updateScholarEmail(updateId, newEmail);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
