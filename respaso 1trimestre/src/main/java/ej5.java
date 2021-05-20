import java.util.Scanner;

public class ej5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = num; i <num+5 ; i++) {
            if (esPrimo(i)){
                System.out.println(i+" Es primo");
            }else {
                System.out.println(i+" No es primo");

            }

        }


    }
    public static boolean esPrimo(int num){
        int contador=0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                contador++;
            }


        }
        if (contador==2){
            return true;
        }else {
            return false;
        }

    }
}

