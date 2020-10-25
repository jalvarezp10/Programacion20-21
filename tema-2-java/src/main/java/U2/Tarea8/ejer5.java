package U2.Tarea8;

import java.util.Scanner;

public class ejer5 {
  public static void main(String[] args) {
    System.out.println("Introduce un maximo y un minimo");
    Scanner sc = new Scanner(System.in);
    int maxima = sc.nextInt();
    int minimo = sc.nextInt();
    System.out.println("Introduce un numero que este entre el maximo y minimo introducido");
    int num = sc.nextInt();
    while (num > maxima || num < minimo) {
      System.out.println("Ese numero no esta entre el rango");
      num = sc.nextInt();
    }
    System.out.println("Perfecto");
  }
}
