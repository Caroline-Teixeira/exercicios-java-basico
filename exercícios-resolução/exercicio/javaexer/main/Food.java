
public class Food implements Taxable {

    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.01; // 1% tax
    }

    @Override
    public String toString() {
        return String.format("Comida { Produto = '%s', Preço R$ = %.2f, Taxa = %.2f }", name, price, calculateTax());
    }

}
