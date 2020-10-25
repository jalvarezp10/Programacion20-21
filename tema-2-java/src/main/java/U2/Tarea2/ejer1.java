package U2.Tarea2;

import java.util.Scanner;

public class ejer1 {
  public static void main(String[] args) {
    System.out.println("introduce dos numeros de dos cifras");
    Scanner sc = new Scanner(System.in);
    byte num1 = sc.nextByte();
    byte num2 = sc.nextByte();
    System.out.println("el resultado es " + (num1 + num2));
  }
}
