package U2.Tarea1;

import java.util.Scanner;

public class ejer3 {
  public static void main(String[] args) {
    Scanner division = new Scanner(System.in);
    System.out.println("Introduce el primer numero");
    int num1 = division.nextInt();
    System.out.println("Introduce el segundo numero");
    int num2 = division.nextInt();
    System.out.println(num1 / num2);
  }
}
