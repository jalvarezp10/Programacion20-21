package U2.Tarea2;

import java.util.Scanner;

public class ejer4 {
  public static void main(String[] args) {
    System.out.println("Introduce el numero de millas");
    Scanner sc = new Scanner(System.in);
    float millas = sc.nextInt();
    System.out.println("Los kilometros son: " + millas * 1609);
  }
}
