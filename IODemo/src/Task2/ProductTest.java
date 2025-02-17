package Task2;

import java.util.List;
import java.util.Scanner;


public class ProductTest {

	public static void main(String[] args) {  //rest, run, ui,
		ProductService ps=new ProductService();
		Scanner s = new Scanner(System.in);
		//menu should be displayed, take user choice to perform operation, 1...5
		boolean running = true;
		while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Upgrade Product");
            System.out.println("4. Get Product by ID");
            System.out.println("5. Show All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            switch(choice) {
            case 1:
            	System.out.print("Enter Id:");
            	int id = s.nextInt();
            	System.out.print("Enter Product Name:");
            	String name = s.nextLine();
            	Product product = new Product(id,name);
            	System.out.println(ps.addProduct(product));
            	break;
            case 2:
            	System.out.print("Enter Product ID to delete: ");
            	int pid = s.nextInt();
            	Product p = ps.getProduct(pid);
            	if(p == null) System.out.println("Cant find the product");
            	else {
            		int result = ps.deleteProduct(p);
                    System.out.println(result == 1 ? "Product deleted successfully" : "Cant find the product");
            	}
            	break;
            case 3:
            	break;
            case 4:
            	System.out.print("Enter Product ID: ");
            	int pd = s.nextInt();
            	Product pro = ps.getProduct(pd);
            	if(pro == null) System.out.println("Cant find the product");
            	else System.out.println(pro);
            	break;
            case 5:
            	ps.listProducts();
            	break;
            case 6:
                running = false;
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }
		}
		s.close();

	}

}