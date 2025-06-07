import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new java.util.Scanner(
    System.in
  ).useDelimiter("\\n");
  private static PetMachine petMachine = new PetMachine();

  public static void main(String[] args) {
    System.out.println("Petshop - Banho e Tosa");

    var option = -1;

    do {
      System.out.println("##Escolha uma opção:##");
      System.out.println("1 - Colocar Pet na máquina");
      System.out.println("2 - Adicionar água");
      System.out.println("3 - Adicionar shampoo");
      System.out.println("4 - Verificar nível de água");
      System.out.println("5 - Verificar nível de shampoo");
      System.out.println("6 - Verificar se tem Pet na máquina");
      System.out.println("7 - Dar banho no Pet");
      System.out.println("8 - Remover Pet da máquina");
      System.out.println("9 - Limpar a máquina");
      System.out.println("0 - Sair");
      try {
        option = Integer.parseInt(scanner.nextLine().trim()); // Lê a linha e converte para inteiro
      } catch (NumberFormatException e) {
        option = -1; // Define como inválido se não for um número
        System.out.println("Opção inválida. Tente novamente.");
        continue;
      }

      switch (option) {
        case 1 -> setPetinPetMachine();
        case 2 -> setWater();
        case 3 -> setShampoo();
        case 4 -> checkWaterLevel();
        case 5 -> checkShampooLevel();
        case 6 -> checkIfHasPet();
        case 7 -> petMachine.shower();
        case 8 -> petMachine.removePet();
        case 9 -> petMachine.cleanMachine();
        case 0 -> {
          System.out.println("Saindo...");
          System.exit(0);
        }
        default -> System.out.println("Opção inválida. Tente novamente.");
      }
    } while (true);
  }

  public static void setPetinPetMachine() {
    var name = "";
    while (name == null || name.trim().isEmpty()) { // Usando trim() para ignorar espaços em branco
      System.out.println("Informe o nome do Pet: ");
      name = scanner.nextLine(); // Alterado para nextLine()
    }

    var pet = new Pet(name);
    petMachine.setPet(pet);
    //System.out.println("Pet: " + pet.getName() + " adicionado à máquina.");
  }

  private static void checkIfHasPet() {
    var hasPet = petMachine.hasPet();
    System.out.println(hasPet ? "Tem pet na máquina" : "A máquina está vazia"); // Ternário: if else
  }

  private static void checkWaterLevel() {
    var amount = petMachine.getWater();
    System.out.println("A máquina está com " + amount + " litros de água");
  }

  private static void checkShampooLevel() {
    var amount = petMachine.getShampoo();
    System.out.println("A máquina está com " + amount + " litros de shampoo");
  }

  private static void setWater() {
    System.out.println("Testando colocar água na máquina");
    petMachine.addWater();
  }

  private static void setShampoo() {
    System.out.println("Testando colocar shampoo na máquina");
    petMachine.addShampoo();
  }
}
