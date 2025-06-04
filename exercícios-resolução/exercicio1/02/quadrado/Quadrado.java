package quadrado;

import java.util.Scanner;

public class Quadrado {
    /*2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
   - fórmula: área=lado X lado */

   public static void main(String[] args) {

    double lado = 0.0;
    boolean validEntry1 = false;
    
        @SuppressWarnings("resource")
        Scanner keyborard = new Scanner(System.in);
        
    while (!validEntry1){
        try {
            System.out.println("Digite o lado do quadrado: ");
            lado = keyborard.nextDouble();

            if (lado <=0) {
                System.out.println("Lado deve ser um número positivo. Tente novamente.");
                continue;
            } else {
                validEntry1 = true;
                double area = lado * lado;
                System.out.println("A área do quadrado é: " + area);
            }
        } 
        catch (Exception e) {
            System.out.println("Erro, digite um número válido.");
            keyborard.next(); 
        }


    }

   }
}

