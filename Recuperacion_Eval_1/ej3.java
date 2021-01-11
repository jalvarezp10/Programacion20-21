package examen_recuperacion;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero");
        long numero= sc.nextLong();
        int contador= 0;

        System.out.println("Introduzca la posición dentro del número: ");
        int posicion= sc.nextInt();
        System.out.println("Introduzca el nuevo digito");
        int nuevo_digito=sc.nextInt();
        while(numero>0){


            numero=numero/10;
            contador++;


        }
        numero= (long) (numero*(10*Math.exp(contador)));
        while (numero>0){

            int digitos= (int) (numero%10);
            numero=numero/10;
            int cant_digitos=contador;
            cant_digitos--;
            while (cant_digitos==posicion){
                digitos=nuevo_digito;
            }
            numero=numero*10;

        }
        System.out.println(numero);




    }
}
