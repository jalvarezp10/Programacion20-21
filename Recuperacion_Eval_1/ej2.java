package examen_recuperacion;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca una la altura de la pecera (como minimo 4)");
        int altura=sc.nextInt();
        System.out.println("Ahora introduce el ancho de la pecera (como minimo 4)");
        int ancho=sc.nextInt();
        for (int i = 1; i <=altura ; i++) {

            for (int j = 1; j <=ancho ; j++) {
                int pez_altura= (int)(Math.random() * altura);
                int pez_anchura=(int) (Math.random()*ancho);

                if (i==1 && i==altura){
                    System.out.print("*");


                }else if (j==1 && j==ancho){
                    System.out.println("*");

                }
                System.out.println();
                while (j==pez_anchura && i==pez_altura){
                    System.out.println("&");
                    break;
                }


            }

        }


    }
}
