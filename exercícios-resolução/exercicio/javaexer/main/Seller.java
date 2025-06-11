public class Seller extends Manager {
    private int sales; // Número de vendas realizadas pelo vendedor

    public Seller(String name, String email, String password, int sales) {
        super(name, email, password, false);
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    // Método para realizar venda
    public void makeSale() {
        this.sales++;
        System.out.println("Venda realizada com sucesso. Total de vendas: " + this.sales);
    }

    // Método para consultar vendas
    @Override
    public String consultSales() {
        return "Relatório de Vendas: \n" +
               "Nome: " + getName() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Número de vendas: " + sales;
    }

    // Sobrescreve isAdmin para retornar o valor do atributo Admin
    @Override
    public boolean isAdmin() {
        return getAdmin(); // Sempre false, definido na superclasse
    }

    // Método para atualizar informações do vendedor
    @Override
    public void updateInfo(String newEmail, String newPassword) {
        setEmail(newEmail);
        setPassword(newPassword);
        System.out.println("Informações do vendedor atualizadas com sucesso.");
    }

    // Método para atualizar senha
    @Override
    public void updatePassword(String newPassword) {
        setPassword(newPassword);
        System.out.println("Senha do vendedor atualizada com sucesso.");
    }
}