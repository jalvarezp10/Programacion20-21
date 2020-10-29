package U2.Entregable;

import java.util.Scanner;

public class ejer3 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);

    String num = sc.nextLine();
    System.out.println("Introduce la posicion");
    int posicion = sc.nextInt();
    System.out.println("Introduce el numero para intercambiar");
    int nuevo_num = sc.nextInt();

    String p1 = num.substring(0, posicion - 1);
    String p2 = num.substring(posicion);
    String resultado = p1 + nuevo_num + p2;
    System.out.println(resultado);
  }
}
