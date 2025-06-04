package diferencaIdade;

import java.util.Scanner;

public class DiferencaIdade {
//4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

public static void main(String[] args) {

    String name1 = "";
    String name2 = "";
    int age1 = 0 , age2 = 0;
    boolean validAge = false;

    @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);

   
    while (true) {
    try {
        System.out.print("Digite o nome da primeira pessoa: ");
        name1 = keyboard.nextLine().trim();

        if (name1.isEmpty()) {
            System.out.println("Erro: Nome não pode estar vazio. Tente novamente.");
        } else if (name1.length() < 2) {
            System.out.println("Erro: Nome deve ter pelo menos 2 letras. Tente novamente.");
        } else if (name1.length() > 50) {
            System.out.println("Erro: Nome não pode ter mais de 50 letras. Tente novamente.");
        } else if (!name1.matches("[\\p{L}\\s]+")) {
            System.out.println("Erro: Nome deve conter apenas letras (incluindo acentos) e espaços. Tente novamente.");
        } else {
            break;
        }
    } catch (Exception e) {
        System.out.println("Erro, digite um nome válido.");
    }
}

    while (true) {
    try {
        System.out.print("Digite o nome da segunda pessoa: ");
        name2 = keyboard.nextLine().trim();

        if (name2.isEmpty()) {
            System.out.println("Erro: Nome não pode estar vazio. Tente novamente.");
        } else if (name2.length() < 2) {
            System.out.println("Erro: Nome deve ter pelo menos 2 letras. Tente novamente.");
        } else if (name2.length() > 50) {
            System.out.println("Erro: Nome não pode ter mais de 50 letras. Tente novamente.");
        } else if (!name2.matches("[\\p{L}\\s]+")) {
            System.out.println("Erro: Nome deve conter apenas letras (incluindo acentos) e espaços. Tente novamente.");
        } else {
            break;
        }
    } catch (Exception e) {
        System.out.println("Erro, digite um nome válido.");
    }
}

    
    while (!validAge) {
        try {
            System.out.print("Digite a idade da primeira pessoa: ");
            age1 = keyboard.nextInt();
            System.out.print("Digite a idade da segunda pessoa: ");
            age2 = keyboard.nextInt();

            if (age1 < 0 || age2 < 0) {
                System.out.println("Idade não pode ser negativa. Tente novamente.");
                continue;
            } else {
                validAge = true;
                int ageDifference = age1 - age2;
                System.out.printf("A diferença de idade entre %s e %s é de %d ano(s).\n", name1, name2, ageDifference);
            }
        } catch (Exception e) {
            System.out.println("Erro, digite uma idade válida.");
            keyboard.next(); // Limpa o scanner para evitar loop infinito
        }
    }
    
}

}
