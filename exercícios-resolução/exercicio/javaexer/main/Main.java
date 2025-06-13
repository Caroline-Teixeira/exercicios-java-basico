import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Calculando a Área de Figuras Geométricas");
    System.out.println("=========================================");

    int option;

    do {
      displayMenu();
      try{
      option = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Entrada inválida! Digite um número válido.");
        scanner.nextLine(); // Limpa o buffer do scanner
        option = -1; // Define uma opção inválida para continuar o loop
      }
      
      
      switch (option) {
        case 1 -> calculateRectangle();
        case 2 -> calculateSquare();
        case 3 -> calculateSphere();
        case 0 -> System.out.println("Saindo...");
        default -> System.out.println("Opção inválida. Tente novamente.");
      }
    } while (option != 0);
  }

  public static void displayMenu() {
    System.out.println("Escolha uma opção:");
    System.out.println("1. Retângulo");
    System.out.println("2. Quadrado");
    System.out.println("3. Esfera");
    System.out.println("0. Sair");
  }

  public static void calculateRectangle() {
    try{
        System.out.print("Digite o comprimento do retângulo (cm): ");
        double length = scanner.nextDouble();
        System.out.print("Digite a largura do retângulo (cm): ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.printf(
        "A área do retângulo é: %.2f%n",
        rectangle.calculateArea()
        );

    } catch (InputMismatchException e) {
       System.out.println("Entrada inválida! Digite um número válido.");
       scanner.nextLine(); // Limpa o buffer do scanner
    }
    System.out.println("=========================================");
  }

  public static void calculateSquare() {
    try {
    System.out.print("Digite o lado do quadrado (cm): ");
    double side = scanner.nextDouble();

    Square square = new Square(side);
    System.out.printf("A área do quadrado é: %.2f%n", square.calculateArea());
    
    } catch (InputMismatchException e) {
       System.out.println("Entrada inválida! Digite um número válido.");
       scanner.nextLine(); // Limpa o buffer do scanner
    }
    System.out.println("=========================================");
}

  public static void calculateSphere() {
    try {
    System.out.print("Digite o raio da esfera (cm): ");
    double radius = scanner.nextDouble();

    Sphere sphere = new Sphere(radius);
    System.out.printf("A área da esfera é: %.2f%n", sphere.calculateArea());
    }
    catch(InputMismatchException e) {
       System.out.println("Entrada inválida! Digite um número válido.");
       scanner.nextLine(); // Limpa o buffer do scanner
  }
    System.out.println("=========================================");

  }
}