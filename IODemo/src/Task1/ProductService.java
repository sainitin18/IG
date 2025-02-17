package Task1;

import java.util.List;

class ProductService{
	public Double getPriceById(Integer id, List<Product> products) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product.getPrice();
            }
        }
        return null;
    }
	
    public Product getProductById(Integer id, List<Product> products) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
    public List<Product> listProducts(List<Product> products) {
        return products;
    }
}
