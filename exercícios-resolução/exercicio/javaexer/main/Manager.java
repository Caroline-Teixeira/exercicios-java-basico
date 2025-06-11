public class Manager {
    private final String name;
    private String email;
    private String password;
    private final Boolean Admin;

     protected Manager(String name, String email, String password, Boolean Admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.Admin = Admin;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getAdmin() {
        return Admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para verificar se o usuário é administrador
    public boolean isAdmin() {
        return Admin;
    }

    // Método gerar relatório
    public String generateReport() {
        System.out.println("Gerando relatório...");
        return "Relatório gerado com sucesso.";
        
    }

    // Método para consultar vendas
    public String consultSales() {
        return "Consultando vendas: " + name;
    }

    // Realizar login
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // Realizar logout
    public void logout() {
        System.out.println("Logout realizado com sucesso.");
    }

    // Método para atualizar informações do gerente
    public void updateInfo(String newEmail, String newPassword) {
        this.email = newEmail;
        this.password = newPassword;
        System.out.println("Informações atualizadas com sucesso.");
    }

    // Método para atualizar senha
    public void updatePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Senha atualizada com sucesso.");
    }
}