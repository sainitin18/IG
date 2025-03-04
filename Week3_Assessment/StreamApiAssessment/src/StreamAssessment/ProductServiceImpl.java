package StreamAssessment;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductServiceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier s1 = new Supplier(1, "Supplier A");
        Supplier s2 = new Supplier(2, "Supplier B");

        List<Product> products = Arrays.asList(
            new Product(1, "Milk", "Dairy", 2.0, 50.0, LocalDate.now().plusDays(5), s1),
            new Product(2, "Butter", "Dairy", 1.0, 100.0, LocalDate.now().minusDays(1), s2),
            new Product(3, "Lentils", "Pulses", 3.0, 60.0, LocalDate.now().plusDays(15), s1),
            new Product(4, "Chips", "Snacks", 5.0, 30.0, LocalDate.now().plusDays(8), s2)
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

       // display count of products based on Supplier name.
        Map<String, Long> map = products.stream().collect(Collectors.groupingBy(p -> p.getSupplier().getSname(), Collectors.counting()));
        map.forEach((name,count)->System.out.println(name + ": " + count));
	}

}
