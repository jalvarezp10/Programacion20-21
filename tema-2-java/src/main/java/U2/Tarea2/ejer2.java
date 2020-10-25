package U2.Tarea2;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {
    System.out.println("Introduce el año de actual y el año nacimiento");
    Scanner sc = new Scanner(System.in);
    short ano_act = sc.nextShort();
    short ano_nac = sc.nextShort();

    short resultado = (short) (ano_act - ano_nac);
    System.out.println("Tu edad es de  " + resultado + " años");
  }
}
