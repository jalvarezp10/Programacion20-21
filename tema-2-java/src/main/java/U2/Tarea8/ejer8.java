package U2.Tarea8;

import java.util.Scanner;

public class ejer8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero para dar su factorial");
    int num = sc.nextInt();
    int producto = 1;
    for (int i = num; i > 0; i--) {
      producto = producto * i;
      System.out.println(producto);
    }
  }
}
