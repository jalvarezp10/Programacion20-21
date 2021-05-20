import java.util.Collections;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int digito;
        int suma_pares=0;
        String num_pares="";

        System.out.print("digitos pares: ");
        while (num>0){
            digito=(int)num%10;
            if (digito%2==0){
                suma_pares+=digito;
                num_pares+=String.valueOf(digito);


            }
            num=num/10;



        }

        for (int i = num_pares.length()-1; i >=0 ; i--) {
            System.out.print(num_pares.charAt(i));

        }

        System.out.println();
        System.out.println("La suma de los pares es: "+suma_pares);

    }
}
