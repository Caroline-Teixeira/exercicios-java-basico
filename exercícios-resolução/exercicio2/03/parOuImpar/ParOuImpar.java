public class ParOuImpar {

  /*3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente; */

  public static void main(String[] args) {
    int firstNumber = 0;
    int secondNumber = 0;
    String choice = "";
    boolean validInput = false;

    @SuppressWarnings("resource")
    var keyboard = new java.util.Scanner(System.in);

    while (!validInput) {
      try {
        System.out.println("Digite o primeiro número: ");
        firstNumber = keyboard.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro): ");
        secondNumber = keyboard.nextInt();

        if (secondNumber <= firstNumber) {
          System.out.println("O segundo número deve ser maior que o primeiro.");
        } else {
          validInput = true;
        }
      } catch (Exception e) {
        System.out.println(
          "Entrada inválida, por favor insira números inteiros."
        );
        keyboard.next();
      }
    }

    keyboard.nextLine();

    while (true) {
      System.out.println("Escolha 'par' ou 'impar': ");
      choice = keyboard.nextLine().toLowerCase();

      if (choice.equals("par") || choice.equals("impar")) {
        break;
      } else {
        System.out.println(
          "Opção inválida, por favor escolha 'par' ou 'impar'."
        );
      }
    }

    System.out.println(
      "Números " +
      choice +
      "es no intervalo de " +
      firstNumber +
      " a " +
      secondNumber +
      ":"
    );

    for (int i = secondNumber; i >= firstNumber; i--) {
      if (
        (choice.equals("par") && i % 2 == 0) ||
        (choice.equals("impar") && i % 2 != 0)
      ) {
        System.out.println(i + " ");
      }
    }
  }
}
