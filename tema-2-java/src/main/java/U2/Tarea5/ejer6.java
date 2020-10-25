package U2.Tarea5;

import java.util.Scanner;

public class ejer6 {
  public static void main(String[] args) {
    System.out.println("Introduce el tiempo para saber la velocidad");
    Scanner sc = new Scanner(System.in);
    double gravedad = 9.8;
    double tiempo = sc.nextDouble();
    double velocidad = gravedad * tiempo;
    System.out.println(velocidad + " m/s es la velocidad");
  }
}
