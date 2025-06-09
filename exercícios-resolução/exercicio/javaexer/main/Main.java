import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("\n===== RELOGIO =====");
    Scanner keyboard = new Scanner(System.in);
    /*try (Scanner keyboard = new Scanner(System.in)) {
      Car car = new Car();
      int option = -1;
      
      do {
        System.out.println("\n===== MENU CARRO =====");
        System.out.println("1. Ligar carro");
        System.out.println("2. Desligar carro");
        System.out.println("3. Acelerar");
        System.out.println("4. Frear");
        System.out.println("5. Virar à direita");
        System.out.println("6. Virar à esquerda");
        System.out.println("7. Trocar marcha");
        System.out.println("8. Verificar velocidade");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        
        String input = keyboard.nextLine();

        try {
            option = Integer.parseInt(input);}
        catch (NumberFormatException e) {
            option = -1; // Define como inválido se não for um número
            System.out.println("Opção inválida. Tente novamente.");
            continue;
        }
        
        
        switch (option) {
          case 1 -> car.start();
          case 2 -> car.stop();
          case 3 -> car.accelerate();
          case 4 -> car.brake();
          case 5 -> car.turnRight();
          case 6 -> car.turnLeft();
          case 7 -> {
            System.out.print("Digite a nova marcha (0-6): ");
            String newGearInput = keyboard.nextLine();
            int newGear;
            try {
              newGear = Integer.parseInt(newGearInput);
              car.changeGear(newGear);
            } catch (NumberFormatException e) {
                System.out.println("Marcha inválida.");
          }
          }
          case 8 -> car.checkSpeed();
          case 0 -> {
              if (car.isOn()) {
                  System.out.println("O carro está ligado. Desligue o carro antes de sair.");
              } else {
                  System.out.println("Saindo do carro.");
                  System.exit(0);
                }  
        }
          
         
         
        }
        
      } while (true);
    }*/
    
    
  }
}
