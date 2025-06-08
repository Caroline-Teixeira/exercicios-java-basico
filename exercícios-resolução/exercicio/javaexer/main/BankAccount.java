public class BankAccount {

  private double balance;
  private double overDraftLimit; // Limite de cheque especial
  private double overDraftUsed; // Valor utilizado do cheque especial
  private User user;

  // construtor
  public BankAccount(User user, double initialBalance) {
    this.user = user;
    this.balance = initialBalance;
    this.overDraftUsed = 0.0;

    if (initialBalance <= 500) {
      this.overDraftLimit = 50; // Define o limite de cheque especial com valor 50 reais
    } else {
      this.overDraftLimit = initialBalance * 0.5; // Define o limite de cheque especial como 50% do saldo inicial
    }
  }

  public double getBalance() {
    return balance;
  }

  public double getOverDraftLimit() {
    return overDraftLimit;
  }

  public double getOverDraftUsed() {
    return overDraftUsed;
  }

  public User getUser() {
    return user;
  }

  // métodos
  // Verificar saldo
  public void checkBalance() {
    System.out.printf("Saldo atual: R$ %.2f%n ", balance );
  }

  // Verificar limite de cheque especial
  public void checkOverDraft() {
    System.out.printf(
      "Limite de cheque especial: R$ %.2f%n  ", overDraftLimit
    );
    System.out.printf(
      "Valor utilizado do cheque especial: R$ %.2f%n ", overDraftUsed
    );
    System.out.printf("Valor disponível no cheque especial: R$ %.2f%n " ,
      (overDraftLimit - overDraftUsed));
  }

  // Depositar dinheiro
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.printf(
        "Depósito de R$ %.2f%n " , amount , " realizado com sucesso."
      );
    } else {
      System.out.println("Valor de depósito inválido.");
    }
    
  }
  private void depositFromTransfer(double amount) {
      balance += amount;
      System.out.printf(
        "Depósito de R$ %.2f%n " , amount , " realizado com sucesso.");
      
  }

  // Sacar dinheiro
  public void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Valor de saque inválido.");
      return;
    }

    double availableBalance = balance + (overDraftLimit - overDraftUsed);
    if (amount > availableBalance) {
      System.out.println(
        "Saldo insuficiente, incluindo limite do cheque especial!"
      );
      return;
    }

    if (amount <= balance) {
      balance -= amount;
      System.out.println("Saque realizado com sucesso!");
    } else {
      double overDraftAmount = amount - balance; // Valor que será retirado do cheque especial
      balance = 0; // Zera o saldo da conta
      overDraftUsed += overDraftAmount; // Atualiza o valor utilizado do cheque especial
      System.out.println("Saque realizado utilizando cheque especial!");
    }
    checkBalance();
  }

  // Pagar dívida
  public void payDebt() {
    if (overDraftUsed <= 0) {
            System.out.println("Não há dívida de cheque especial para pagar.");
            return;
        }
        
        double debtWithInterest = overDraftUsed * 1.20; // 20% de juros
        
        if (balance >= debtWithInterest) {
            balance -= debtWithInterest;
            System.out.printf("Dívida do cheque especial de R$ %.2f (com juros) paga com sucesso!%n", debtWithInterest);
            overDraftUsed = 0;
        } else {
            System.out.printf("Saldo insuficiente. Dívida total com juros: R$ %.2f%n", debtWithInterest);
        }
        checkBalance();
  }

  // pagar boleto
  public void payBill(double amount) {
    if (amount <= 0) {
      System.out.println("Valor de pagamento inválido.");
      return;
    }

    double availableBalance = balance + (overDraftLimit - overDraftUsed);
    if (amount > availableBalance) {
      System.out.println(
        "Saldo insuficiente, incluindo limite do cheque especial!"
      );
      return;
    }

    if (amount <= balance) {
      balance -= amount;
      System.out.println("Pagamento realizado com sucesso!");
    } else {
      double overDraftAmount = amount - balance; // Valor que será retirado do cheque especial
      balance = 0; // Zera o saldo da conta
      overDraftUsed += overDraftAmount; // Atualiza o valor utilizado do cheque especial
      System.out.println("Pagamento realizado utilizando cheque especial!");
    }
    checkBalance();
  }

  // Para verificar uso do limite do cheque especial
  public void checkOverDraftUsage() {
    if (overDraftUsed > 0) {
      System.out.printf(
        "Você está utilizando R$ %.2f " ,
        overDraftUsed ,
        " do seu limite de cheque especial."
      );
    } else {
      System.out.println("Você não está utilizando o cheque especial.");
    }
  }

  // Trasnferir dinheiro para outra conta
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        double availableBalance = balance + (overDraftLimit - overDraftUsed);
        if (amount > availableBalance) {
            System.out.println("Saldo insuficiente, incluindo limite do cheque especial!");
            return;
        }

        if (amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            double overDraftAmount = amount - balance;
            balance = 0;
            overDraftUsed += overDraftAmount;
            targetAccount.depositFromTransfer(amount);
            System.out.println("Transferência realizada utilizando cheque especial!");
            System.out.printf("Valor utilizado do cheque especial: R$ %.2f%n", overDraftAmount);
        }
        checkBalance();
    }

  // Para verificar o nome do usuário e número da conta
  public void displayAccountInfo() {
        String message = """
                ***************************
                Dados iniciais do cliente:
                Nome: %s
                Número da conta: %s
                Saldo inicial: R$ %.2f
                Cheque especial: R$ %.2f
                ***************************
                """.formatted(user.getName(), user.getAccountNumber(), balance, overDraftLimit);
        System.out.println(message);
    }
}
