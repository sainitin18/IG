package StreamTask2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Map;

public class Product {
	Integer id;
    String name;
    String type;
    Double qty;
    Double price;
    LocalDate expiryDate;
    
	public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.qty = qty;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ ", expiryDate=" + expiryDate + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = Arrays.asList(
                new Product(1, "Milk", "dairy", 1.0, 50.0, LocalDate.of(2024, 2, 20)),
                new Product(2, "Chana Dal", "pulses", 2.0, 120.0, LocalDate.of(2025, 6, 10)),
                new Product(3, "Red Chilli Powder", "spices", 0.5, 80.0, LocalDate.of(2025, 1, 15)),
                new Product(4, "Olive Oil", "oils", 1.0, 400.0, LocalDate.of(2026, 12, 5)),
                new Product(5, "Chips", "snacks", 0.2, 30.0, LocalDate.of(2024, 3, 1)),
                new Product(6, "Butter", "dairy", 0.5, 250.0, LocalDate.of(2024, 3, 3)),
                new Product(7, "Almonds", "snacks", 1.0, 600.0, LocalDate.of(2026, 11, 25)),
                new Product(8, "Chicken", "protien", 1.0, 300.0, LocalDate.of(2025, 3, 9))
        );
		
		// list Highest priced product
		Optional<Product> o = products.stream().max(Comparator.comparing(p->p.price));
		System.out.println("Highest Priced Product:" + o);

	    //list lowest priced product
		Optional<Product> l = products.stream().min(Comparator.comparing(p->p.price));
		System.out.println("Lowest Priced Product:" + l);
		
		//list  product that already expired
		products.stream().filter(x->x.expiryDate.isBefore(LocalDate.now())).forEach(System.out::println);
		 
		//list product names list that will expire in next 10 days
		System.out.println("Expire in 10 days");
		products.stream().filter(x->x.expiryDate.equals(LocalDate.now().plusDays(10))).forEach(System.out::println);

		// display count of  products of different types
	    Map<String,Long> m = products.stream().collect(Collectors.groupingBy(x->x.type,Collectors.counting()));
	    m.forEach((type, count) -> System.out.println(type + ": " + count));
	}
}
