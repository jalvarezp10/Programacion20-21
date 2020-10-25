package U2.Tarea4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejer4 {
  public static void main(String[] args) {
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    System.out.println("Hora actual: " + dateFormat.format(date));

    //
  }
}
