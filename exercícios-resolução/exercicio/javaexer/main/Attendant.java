public class Attendant extends Manager {
    private double cashBalance; // Valor do caixa recebido pelo atendente

    public Attendant(String name, String email, String password, double cashBalance) {
        super(name, email, password, false);
        this.cashBalance = cashBalance;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    // Método para fechar caixa
    public void closeCash() {
        System.out.println("Caixa fechado com sucesso. Saldo final: " + cashBalance);
        this.cashBalance = 0;
    }

    // Método para receber pagamento
    public void receivePayment(double amount) {
        if (amount > 0) {
            this.cashBalance += amount;
            System.out.println("Pagamento recebido: " + amount + ". Total no caixa: " + this.cashBalance);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    // Sobrescreve isAdmin para retornar o valor do atributo Admin
    @Override
    public boolean isAdmin() {
        return getAdmin(); // Sempre false, definido na superclasse
    }

    // Método para atualizar informações do atendente
    @Override
    public void updateInfo(String newEmail, String newPassword) {
        setEmail(newEmail);
        setPassword(newPassword);
        System.out.println("Informações do atendente atualizadas com sucesso.");
    }

    // Método para atualizar senha
    @Override
    public void updatePassword(String newPassword) {
        setPassword(newPassword);
        System.out.println("Senha do atendente atualizada com sucesso.");
    }
}