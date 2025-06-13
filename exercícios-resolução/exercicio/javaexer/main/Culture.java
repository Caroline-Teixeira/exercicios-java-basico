public class Culture implements Taxable {

    private String name;
    private double price;

    public Culture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.04; // 4% tax
    }

    @Override
    public String toString() {
        return String.format("Cultura { Produto = '%s', Preço R$ = %.2f, Taxa = %.2f }", name, price, calculateTax());
    }


}
