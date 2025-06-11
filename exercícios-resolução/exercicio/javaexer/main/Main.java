import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  // Estrutura para armazenar filmes e preços
  static class Movie {

    String name;
    double price;

    Movie(String name, double price) {
      this.name = name;
      this.price = price;
    }
  }

  // Array de filmes e preços
  private static final Movie[] movies = {
    new Movie("Vingadores: Ultimato", 30.0),
    new Movie("O Rei Leão", 25.0),
    new Movie("Interestelar", 28.0),
    new Movie("Parasita", 27.0),
    new Movie("Matrix", 26.0),
  };

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MovieTicket ticket = null;
    int choice = 0;
    boolean validInput;

    do {
      displayMenu();
      System.out.print("Escolha uma opção: ");
      validInput = false;
      try {
        choice = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        validInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida! Digite um número inteiro.");
        scanner.nextLine(); // Limpar buffer
      }

      if (validInput) {
        switch (choice) {
          case 1 -> ticket = selectMovie(scanner);
          case 2 -> showTicketInfo(ticket);
          case 3 -> System.out.println(
            "Saindo... Obrigado por usar o sistema de compra de ingressos!"
          );
          default -> System.out.println("Opção inválida! Tente novamente.");
        }
      }
    } while (choice != 3);

    scanner.close();
  }

  // Exibe o menu principal
  private static void displayMenu() {
    System.out.println("\n=== Sistema de Compra de Ingressos ===");
    System.out.println("1) Escolha o filme");
    System.out.println("2) Mostrar informações do ticket");
    System.out.println("3) Sair");
  }

  // Método para selecionar filme,
  private static MovieTicket selectMovie(Scanner scanner) {
    int movieChoice = 0;
    boolean subtitles = false;
    int ticketType = 0;
    boolean validInput;

    // Exibe filmes disponíveis
    System.out.println("\n=== Filmes disponíveis ===");
    for (int i = 0; i < movies.length; i++) {
      System.out.printf(
        "%d) %s - R$%.2f%n",
        (i + 1),
        movies[i].name,
        movies[i].price
      );
    }

    // Escolha do filme
    do {
      System.out.print("Escolha o número do filme: ");
      validInput = false;
      try {
        movieChoice = scanner.nextInt();
        scanner.nextLine();
        if (movieChoice >= 1 && movieChoice <= movies.length) {
          validInput = true;
        } else {
          System.out.println(
            "Filme inválido! Escolha um número entre 1 e " + movies.length
          );
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida! Digite um número inteiro.");
        scanner.nextLine();
      }
    } while (!validInput);

    // Escolha dublado ou legendado
    do {
      System.out.print("Deseja legendado? (1 - Sim / 2 - Não): ");
      validInput = false;
      try {
        int input = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        if (input == 1 || input == 2) {
          subtitles = input == 1;
          validInput = true;
        } else {
          System.out.println(
            "Opção inválida! Digite 1 para Sim ou 2 para Não."
          );
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida! Digite um número inteiro.");
        scanner.nextLine(); // Limpar buffer
      }
    } while (!validInput);

    // Escolha do tipo de ingresso
    do {
      System.out.print(
        "Tipo de ingresso (1 - Ingresso Normal/ 2 - Ingresso família): "
      );
      validInput = false;
      try {
        ticketType = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        if (ticketType == 1 || ticketType == 2) {
          validInput = true;
        } else {
          System.out.println(
            "Opção inválida! Digite 1 para Meia entrada ou 2 para Ingresso família."
          );
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida! Digite um número inteiro.");
        scanner.nextLine(); // Limpar buffer
      }
    } while (!validInput);

    // Cria o ingresso com base no tipo
    Movie selectedMovie = movies[movieChoice - 1];
    if (ticketType == 1) {
      int age = 0;
      do {
        System.out.print("Digite sua idade: ");
        validInput = false;
        try {
          age = scanner.nextInt();
          scanner.nextLine(); // Limpar buffer
          if (age >= 0) {
            validInput = true;
          } else {
            System.out.println(
              "Idade inválida! Digite um número não negativo."
            );
          }
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida! Digite um número inteiro.");
          scanner.nextLine(); // Limpar buffer
        }
      } while (!validInput);
      return new HalfPriceTicked(
        selectedMovie.name,
        selectedMovie.price,
        subtitles,
        age
      );
    } else {
      int members = 0;
      do {
        System.out.print("Digite o número de pessoas: ");
        validInput = false;
        try {
          members = scanner.nextInt();
          scanner.nextLine(); // Limpar buffer
          if (members >= 1) {
            validInput = true;
          } else {
            System.out.println(
              "Número de pessoas inválido! Digite um número maior ou igual a 1."
            );
          }
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida! Digite um número inteiro.");
          scanner.nextLine(); // Limpar buffer
        }
      } while (!validInput);
      return new FamilyTicked(
        selectedMovie.name,
        selectedMovie.price,
        subtitles,
        members
      );
    }
  }

  // Método para exibir informações do ingresso
  private static void showTicketInfo(MovieTicket ticket) {
    if (ticket == null) {
      System.out.println(
        "Nenhum ingresso selecionado! Escolha um filme primeiro."
      );
    } else {
      ticket.printTicketInfo();
    }
  }
}
