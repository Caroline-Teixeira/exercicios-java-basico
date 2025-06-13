public class HealthandCare implements Taxable {

    private String name;
    private double price;

    public HealthandCare(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.015; // 1.5% tax
    }

    @Override
    public String toString() {
        return String.format("Saúde e Bem-estar { Produto = '%s', Preço R$ = %.2f, Taxa = %.2f }", name, price, calculateTax());
    }


}
