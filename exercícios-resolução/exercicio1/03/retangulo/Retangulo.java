package retangulo;

import java.util.Scanner;

/*Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
   - fórmula: área=base X altura*/
public class Retangulo {

  public static void main(String[] args) {
    double altura = 0.0;
    double comprimento = 0.0;
    boolean validEntry1 = false;
    boolean validEntry2 = false;

    @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);

    while (!validEntry1) {
      try {
        System.out.println("Digite a altura (cm): ");
        altura = keyboard.nextDouble();

        if (altura <= 0) {
          System.out.println(
            "O número deve ser um número positivo. Tente novamente."
          );
          continue;
        } else {
          validEntry1 = true;
        }
      } catch (Exception e) {
        System.out.println("Erro, digite um número válido.");
        keyboard.next(); // Limpa o scanner para evitar loop infinito
      }
    }

    while (!validEntry2) {
      try {
        System.out.println("Digite o comprimento (cm): ");
        comprimento = keyboard.nextDouble();

        if (comprimento <= 0) {
          System.out.println(
            "O número deve ser um número positivo. Tente novamente."
          );
          continue;
        } else {
          validEntry2 = true;
          System.out.printf(
            "O retângulo de altura %.2f e comprimento %.2f, posssui uma área de %.2f cm\n",
            altura,
            comprimento,
            (altura * comprimento)
          );
        }
      } catch (Exception e) {
        System.out.println("Erro, digite um número válido.");
        keyboard.next(); // Limpa o scanner para evitar loop infinito
      }
    }
  }
}
