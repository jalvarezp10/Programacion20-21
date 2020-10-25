package U2.Tarea1;

import java.util.Scanner;

public class ejer5 {
  public static void main(String[] args) {
    System.out.println("Introduce los grados");
    Scanner sc = new Scanner(System.in);
    float grados = sc.nextFloat();
    System.out.println(" Los Fahrenheit son " + 9 * grados / 5 + 32 + " F");
  }
}
