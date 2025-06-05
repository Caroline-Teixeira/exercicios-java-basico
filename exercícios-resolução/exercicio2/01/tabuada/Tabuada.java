public class Tabuada {

  /* 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;*/

  public static void main(String[] args) {
    int number = 0;
    boolean validNumber = false;

    @SuppressWarnings("resource")
    var keyboard = new java.util.Scanner(System.in);

    while (!validNumber) {
      try {
        System.out.println("Digite um número inteiro: ");
        number = keyboard.nextInt();
        validNumber = true;
      } catch (Exception e) {
        System.out.println(
          "Entrada inválida, por favor insira um número inteiro."
        );
        keyboard.nextLine();
      }
    }
    for (int i = 0; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + (number * i));
    }
  }
}
