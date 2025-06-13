
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Mensagens Automáticas");
    System.out.println("=========================================");

    int option;

    do {
      displayMenu();
      try {
        option = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Entrada inválida! Digite um número válido.");
        scanner.nextLine(); // Limpa o buffer do scanner
        option = -1; // Define uma opção inválida para continuar o loop
      }

      switch (option) {
        case 1 -> sendSMS();
        case 2 -> sendEmail();
        case 3 -> sendInstagram();
        case 4 -> sendWhatsApp();
        case 5 -> sendX();
        case 0 -> System.out.println("Saindo...");
        default -> System.out.println("Opção inválida. Tente novamente.");
      }
    } while (option != 0);
  }

  public static void displayMenu() {
    System.out.println("Escolha uma opção:");
    System.out.println("1. SMS");
    System.out.println("2. Email");
    System.out.println("3. Instagram");
    System.out.println("4. WhatsApp");
    System.out.println("5. X");
    System.out.println("0. Sair");
  }

  public static void sendSMS() {
    SMS sms = new SMS();
    System.out.println(sms.Messages());
    System.out.println("=========================================");
  }

  public static void sendEmail() {
    Email email = new Email();
    System.out.println(email.Messages());
    System.out.println("=========================================");
  }

  public static void sendInstagram() {
    Instagram instagram = new Instagram();
    System.out.println(instagram.Messages());
    System.out.println("=========================================");
  }

  public static void sendWhatsApp() {
    Whatsapp whatsApp = new Whatsapp();
    System.out.println(whatsApp.Messages());
    System.out.println("=========================================");
  }

  public static void sendX() {
    X x = new X();
    System.out.println(x.Messages());
    System.out.println("=========================================");
  }
}
