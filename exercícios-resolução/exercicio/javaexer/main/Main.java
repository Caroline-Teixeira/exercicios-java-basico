public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("João", "joao@empresa.com", "senha123", true);
        Seller seller = new Seller("Maria", "maria@empresa.com", "senha456", 0);
        Attendant attendant = new Attendant("Pedro", "pedro@empresa.com", "senha789", 0.0);

        // Testando Gerente
        System.out.println("=== Teste Gerente ===");
        System.out.println("É administrador? " + manager.isAdmin());
        System.out.println(manager.generateReport());
        System.out.println(manager.consultSales());
        System.out.println("Login: " + manager.login("joao@empresa.com", "senha123"));
        manager.updateInfo("joao.novo@empresa.com", "novaSenha123");
        manager.logout();

        // Testando Vendedor
        System.out.println("\n=== Teste Vendedor ===");
        System.out.println("É administrador? " + seller.isAdmin());
        seller.makeSale();
        seller.makeSale();
        System.out.println(seller.consultSales());
        System.out.println("Login: " + seller.login("maria@empresa.com", "senha456"));
        seller.updateInfo("maria.nova@empresa.com", "novaSenha456");
        seller.logout();

        // Testando Atendente
        System.out.println("\n=== Teste Atendente ===");
        System.out.println("É administrador? " + attendant.isAdmin());
        attendant.receivePayment(100.50);
        attendant.receivePayment(50.25);
        attendant.closeCash();
        System.out.println("Login: " + attendant.login("pedro@empresa.com", "senha789"));
        attendant.updateInfo("pedro.novo@empresa.com", "novaSenha789");
        attendant.logout();
    }
}