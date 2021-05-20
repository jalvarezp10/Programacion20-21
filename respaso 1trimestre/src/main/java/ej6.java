import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        long num= sc.nextLong();
        int contador=0;
        System.out.println("Introduce la posicion que deseas cambiar: ");
        int posicion= sc.nextInt();
        System.out.println("Numero que quieres introducir: ");
        int num_intro=sc.nextInt();
        int array_num[]= new int[Integer.toString( (int) num).length()];
        System.out.println("Numero introducido :"+ num_intro);
        while (num>0){
            array_num[contador]=(int)num%10;
            num=num/10;
            contador++;
        }
        array_num[array_num.length-posicion]=num_intro;

        for (int i = array_num.length-1; i >=0; i--) {
            System.out.print(array_num[i]);
        }


    }
}
