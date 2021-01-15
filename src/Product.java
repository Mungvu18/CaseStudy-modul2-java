public class Product {
    private String name;
    private int amount;
    private double price;

    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
