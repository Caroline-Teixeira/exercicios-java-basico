import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BrazilianClock extends Clock {

    @Override
    public void displayTime(LocalTime time) {
        // Formato de 24 horas (HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora brasileira: " + time.format(formatter));
    

        
    }


}
