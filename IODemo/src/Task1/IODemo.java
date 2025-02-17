package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        List<Product> productList = new ArrayList<>();
        FileReader f1=new FileReader("C:\\\\Users\\\\SainitinMadireddy\\\\OneDrive - Insight Global, LLC\\\\Documents\\\\IG\\\\product.txt");
		BufferedReader b=new BufferedReader(f1);
		String line=null;
		while( (line=b.readLine())!=null) {
			System.out.println(line);
			String[] data = line.split(",");
			Integer id = Integer.parseInt(data[0].trim());
	        String name = data[1].trim();
	        Integer quantity = Integer.parseInt(data[2].trim());
	        Double price = Double.parseDouble(data[3].trim());
	        productList.add(new Product(id, name, quantity, price));
		}
		
        ProductService ps = new ProductService();
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get Price of a Product by ID");
            System.out.println("2. Get Product Details by ID");
            System.out.println("3. Show All Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int priceId = s.nextInt();
                    Double price = ps.getPriceById(priceId, productList);
                    if (price != null) {
                        System.out.println("Price of product: " + price);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = s.nextInt();
                    Product product = ps.getProductById(productId, productList);
                    if (product != null) {
                        System.out.println("Product Details: " + product);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case 3:
                    System.out.println("Product List:");
                    for (Product p : productList) {
                        System.out.println(p);
                    }
                    break;

                case 4:
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