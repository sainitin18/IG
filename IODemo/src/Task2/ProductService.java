package Task2;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	static List<Product> plist=new ArrayList<>();
	
	public String addProduct(Product p) {
		plist.add(p);
		return "success";
		
	}
	public int deleteProduct(Product p) { //to be  implement
			if(plist.remove(p)) {
				return 1;
			}
		return 0;
	}
	public int updateProduct(Product p) {//to be  implement
		for(Product product : plist) {
			if(product.equals(p)) {
				
			}
		}
		return 1;
	}
	public void  listProducts(){
		plist.forEach(x->System.out.println(x));
	}
	public Product getProduct(Integer id) {//to be  implement
        for (Product product : plist) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // Product not found
    }
}