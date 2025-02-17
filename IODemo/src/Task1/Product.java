package Task1;

class Product {
    private Integer id;
    private String name;
    private Integer qty;
    private Double price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public Product(Integer id, String name, Integer qty, Double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
    }
}
