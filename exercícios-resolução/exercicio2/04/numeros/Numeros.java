public class Numeros {

    /*4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados */
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        var keyboard = new java.util.Scanner(System.in);

        int number = 0;
        
        while (true) {
            try {
                if (number == 0) {
                    System.out.println("Informe um número inicial: ");
                    number = keyboard.nextInt();
                    continue;
                } 
                
                System.out.println("Informe outro número para verificação: ");
                int nextNumber = keyboard.nextInt();

                if (nextNumber < number) {
                    System.out.println("Número menor que o inicial, ignorando...");
                    continue;
                }

                if (nextNumber % number != 0) {
                    System.out.println("Resto diferente de 0 na divisão, encerrando...");
                    break;
                }

            System.out.println("Número válido: " + nextNumber);

            }
            catch (Exception e){
                System.out.println("Entrada inválida, por favor insira um número inteiro.");
                keyboard.next(); // 
            }
        }
        
            
        }
        

        
    }


