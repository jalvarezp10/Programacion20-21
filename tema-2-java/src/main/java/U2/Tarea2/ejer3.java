package U2.Tarea2;

import java.util.Scanner;

public class ejer3 {
  public static void main(String[] args) {
    System.out.println("Introduce dos numeros");
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double resultado = num1 / num2;
    System.out.println("El resultado " + resultado);
  }
}
