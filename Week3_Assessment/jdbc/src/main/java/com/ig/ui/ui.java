package com.ig.ui;

import java.util.Scanner;

import com.ig.service.*;

import com.ig.model.Scholar;

public class ui {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            ScholarService scholarService = new ScholarServiceImp();

            while (true) {
                System.out.println("1. Add Scholar\n2. View All Scholars\n3. Find Scholar by ID\n4. Delete Scholar\n5. Update Scholar Email\n6. Exit");
                System.out.print("Enter your choice: ");
                int choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Scholar ID: ");
                        int id = s.nextInt();
                        s.nextLine();  
                        System.out.print("Enter Name: ");
                        String name = s.nextLine();
                        System.out.print("Enter Email: ");
                        String email = s.nextLine();
                        System.out.print("Enter Mobile Number: ");
                        String mobile = s.nextLine();

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
                        int scholarId = s.nextInt();
                        System.out.println(scholarService.findScholarById(scholarId));
                        break;

                    case 4:
                        System.out.print("Enter Scholar ID to delete: ");
                        int delId = s.nextInt();
                        scholarService.deleteScholarById(delId);
                        break;

                    case 5:
                        System.out.print("Enter Scholar ID to update: ");
                        int updateId = s.nextInt();
                        s.nextLine();  
                        System.out.print("Enter New Email: ");
                        String newEmail = s.nextLine();
                        scholarService.updateScholarEmail(updateId, newEmail);
                        break;

                    case 6:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
