public class CalculoIMC {

  /*
  * 2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
  */

  public static void main(String[] args) {
    double height = 0;
    double weight = 0;
    //boolean validInput = false;

    @SuppressWarnings("resource")
    var keyboard = new java.util.Scanner(System.in);

    while (true) {
      try {
        System.out.println("Digite sua altura em metros (ex: 1,75): ");
        height = keyboard.nextDouble();
        if (height <= 0) {
          System.out.println("Altura inválida, deve ser maior que zero.");
        } else {
          break;
        }
      } catch (Exception e) {
        System.out.println(
          "Entrada inválida, por favor insira uma altura válida"
        );
        keyboard.next(); //
      }
    }
    while (true) {
      try {
        System.out.println("Digite sua massa corporal em Kg (ex: 60,00): ");
        weight = keyboard.nextDouble();
        if (weight <= 0) {
          System.out.println(
            "Massa corporal inválida, deve ser maior que zero."
          );
        } else {
          break;
        }
      } catch (Exception e) {
        System.out.println(
          "Entrada inválida, por favor insira uma massa corporal válida"
        );
        keyboard.next(); //
      }
    }

    double imc = weight / (height * height);
    System.out.printf("Seu IMC é: %.2f%n", imc);
    System.out.println("Classificação do IMC:");

    if (imc <= 18.5) {
      System.out.println("Abaixo do peso");
    } else if (imc <= 24.9) {
      System.out.println("Peso ideal");
    } else if (imc <= 29.9) {
      System.out.println("Levemente acima do peso");
    } else if (imc <= 34.9) {
      System.out.println("Obesidade Grau I");
    } else if (imc <= 39.9) {
      System.out.println("Obesidade Grau II (Severa)");
    } else {
      System.out.println("Obesidade III (Mórbida)");
    }
  }
}
