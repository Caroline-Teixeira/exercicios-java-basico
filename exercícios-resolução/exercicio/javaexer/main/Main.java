public class Main {
    public static void main(String[] args) {
        // Array de produtos tributáveis
        Taxable[] products = new Taxable[] {
            new Food("Arroz", 25.00),
            new HealthandCare("Vitamina C", 45.00),
            new Clothes("Camiseta", 80.00),
            new Culture("Livro", 60.00),
            new Food("Feijão", 15.00)
        };

        // Exibindo informaçõe e tributos de cada produto
        double totalTax = 0;
        System.out.println("Lista de Produtos e Tributos:");
        System.out.println("-----------------------------");
        for (Taxable product : products) {
            System.out.println(product.toString());
            totalTax += product.calculateTax();
        }

        // Exibindo o total de tributos
        System.out.println("-----------------------------");
        System.out.printf("Total de Tributos: R$ %.2f%n", totalTax);
    }
}