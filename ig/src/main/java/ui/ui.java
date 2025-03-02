package ui;

import java.util.Scanner;

import dao.DoctorDao;
import model.Doctor;
import service.DoctorService;
import service.DoctorServiceImp;

public class ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Scanner scanner = new Scanner(System.in);
            DoctorService doc = new DoctorServiceImp();

            while (true) {
                System.out.println("1. Add Doctor\n2. View All Doctors\n3. Find Doctor by ID\n4. Delete Doctor\n5.Update Doctor \n6. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Specialization: ");
                        String spec = scanner.nextLine();
                        Doctor d = new Doctor();
                        d.setId(id);
                        d.setName(name);
                        d.setSpec(spec);
                        doc.addDoctor(d);
                        break;
                    case 2:
                        doc.listAllProducts().forEach(x->System.out.println(x));
                        break;
                    case 3:
                        System.out.print("Enter Doctor ID: ");
                        int docId = scanner.nextInt();
                        System.out.println(doc.findDoctorById(docId));
                        break;
                    case 4:
                        System.out.print("Enter Doctor ID to delete: ");
                        int delId = scanner.nextInt();
                        doc.deleteDoctorById(delId);
                        break;
                    case 5:
                    	System.out.print("Enter Doctor ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Specialization: ");
                        String newspec = scanner.nextLine();
                        doc.updateDoctorspec(updateId, newspec);  
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
