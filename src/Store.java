public class Store {
    private Person person;
    private String address;
    private int codeSap;
    private Product product;

    public Store(Person person, String address, int codeSap, Product product) {
        this.person = person;
        this.address = address;
        this.codeSap = codeSap;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Store{" +
                "person=" + person +
                ", address='" + address + '\'' +
                ", codeSap=" + codeSap +
                ", product=" + product +
                '}';
    }
}
