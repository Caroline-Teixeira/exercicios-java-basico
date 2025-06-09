//import java.util.Scanner;

import java.time.LocalTime;

public class Main {

  public static void main(String[] args) {
    

    LocalTime localTime = LocalTime.now();

        // Instancia dos relógios
        BrazilianClock brClock = new BrazilianClock();
        AmericanClock amClock = new AmericanClock();

        // formatos
        System.out.println("===== RELÓGIO LOCAL =====");
        brClock.displayTime(localTime);
        amClock.displayTime(localTime);
  

}
}