public class Clothes implements Taxable {

    private String name;
    private double price;

    public Clothes(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.025; // 2.5% tax
    }

    @Override
    public String toString() {
        return String.format("Roupas { Produto = '%s', Preço R$ = %.2f, Taxa = %.2f }", name, price, calculateTax());
    }
}
