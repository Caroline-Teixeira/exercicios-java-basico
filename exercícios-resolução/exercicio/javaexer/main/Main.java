import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("=== SISTEMA BANCÁRIO ===");
    System.out.println("Bem-vindo ao sistema bancário!");

    // Criar conta
    System.out.println("Digite seu nome: ");
    String name = scanner.nextLine();

    System.out.println("Digite o número da conta: ");
    String accountNumber = scanner.nextLine();

    System.out.printf("Digite o saldo inicial: R$ %.2f%n", 0.00);
    double initialBalance = scanner.nextDouble();

    User user = new User(name, accountNumber);
    BankAccount account = new BankAccount(user, initialBalance);

    System.out.println("\nConta criada com sucesso!");
    account.displayAccountInfo();

    // Menu de opções
    int option;

    do {
      showMenu();
      System.out.print("Escolha uma opção: ");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> account.checkBalance();
        case 2 -> account.checkOverDraft();
        case 3 -> {
          System.out.print("Digite o valor para depósito: R$ ");
          double depositAmount = scanner.nextDouble();
          account.deposit(depositAmount);
        }
        case 4 -> {
          System.out.print("Digite o valor para saque: R$ ");
          double withdrawAmount = scanner.nextDouble();
          account.withdraw(withdrawAmount);
        }
        case 5 -> {
          System.out.print("Digite o valor do boleto: R$ ");
          double billAmount = scanner.nextDouble();
          account.payBill(billAmount);
        }
        case 6 -> account.checkOverDraftUsage();
        case 7 -> account.payDebt();
        case 8 -> account.displayAccountInfo();
        case 9 -> { // transferência
                System.out.println("\n=== TRANSFERÊNCIA ===");
                    System.out.print("Digite o nome do destinatário: ");
                    String targetName = scanner.next();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o número da conta do destinatário: ");
                    String targetAccountNumber = scanner.next();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o valor para transferência: R$ ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();

                    // Cria uma conta temporária para o destinatário
                    User targetUser = new User(targetName, targetAccountNumber);
                    BankAccount targetAccount = new BankAccount(targetUser, 0.0);

                    // Realiza a transferência
                    account.transfer(targetAccount, transferAmount);
            }
        case 0 -> System.out.println(
          "Obrigado por usar nosso sistema bancário!"
        );
        default -> System.out.println("Opção inválida! Tente novamente.");
      }

      if (option != 0) {
        System.out.println("\n Pressione qualquer tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();
      }
    } while (option != 0);

    scanner.close();
  }

  private static void showMenu() {
    System.out.println("\n=== MENU PRINCIPAL ===");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Consultar cheque especial");
    System.out.println("3. Depositar dinheiro");
    System.out.println("4. Sacar dinheiro");
    System.out.println("5. Pagar boleto");
    System.out.println("6. Verificar uso do cheque especial");
    System.out.println("7. Pagar dívida do cheque especial");
    System.out.println("8. Exibir informações da conta");
    System.out.println("9. Transferir dinheiro");
    System.out.println("0. Sair");
    System.out.println("=====================");
  }
}
