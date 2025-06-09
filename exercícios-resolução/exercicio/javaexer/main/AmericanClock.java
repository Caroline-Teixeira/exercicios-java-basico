import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AmericanClock extends Clock {

    
    @Override
    public void displayTime(LocalTime time) {
        // Formato de 12 horas com AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Hora americana: " + time.format(formatter));
    }




}
