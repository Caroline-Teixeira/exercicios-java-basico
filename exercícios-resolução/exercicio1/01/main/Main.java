import java.util.Scanner;
import java.time.Year;

public class Main {

    // 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        String name = "";
        Year currentYear = Year.now();
        int currentYearValue = currentYear.getValue();
        boolean validNameEntry = false;
        boolean validYearEntry = false;

        while (!validNameEntry) {
            try {
                 System.out.printf("Qual seu nome? ");
                name = keyboard.nextLine();

                if (name.isEmpty()) {
                    System.out.println("Nome não pode ser vazio. Tente novamente.");
                    continue;
                }
                else if (name.length() < 3) {
                    System.out.println("Nome deve ter pelo menos 3 caracteres. Tente novamente.");
                    continue;
                }
                else if (name.length() > 50) {
                    System.out.println("Nome não pode ter mais de 50 caracteres. Tente novamente.");
                    continue;
                }
                else if (!name.matches("[\\p{L}\\s]+")) {
                    System.out.println("Nome deve conter apenas letras (incluindo acentos) e espaços. Tente novamente.");
                    continue;
                }
                else {
                    validNameEntry = true;}

            }
            catch (Exception e) {
                    System.out.println("Erro, digite um nome válido.");
            }

    
}
        while (!validYearEntry) {
                try {
                    System.out.printf("Qual seu ano de nascimento? ");
                    int yearOfBirth = keyboard.nextInt();
                    
                    if (yearOfBirth > currentYearValue) {
                        System.out.println("Ano de nascimento não pode ser maior que o ano atual. Tente novamente.");
                        continue;
                    }
                    else if (yearOfBirth < currentYearValue - 120) {
                        System.out.println("Ano de nascimento não pode ser menor que 120 anos atrás. Tente novamente.");
                        continue;
                    }
                    else {
                        validYearEntry = true;
                        System.out.printf("Olá %s, você tem %d anos\n", name, currentYearValue - yearOfBirth);
                        
                    }
                    }
                    catch (Exception e) {
                        System.out.println("Erro, digite uma idade válida.");
                        keyboard.nextLine();
                }
                
            }
            
            
        }
}