import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int altura=1;
        int altura_introducida=5;
        int espacios=altura_introducida-1;
        while(altura<=altura_introducida){
            for (int i = 1; i <=espacios ; i++) {
                System.out.print(" ");


            }
            for (int i = 1; i <altura ; i++) {
                System.out.print(i);

            }
            for (int i = altura; i >0; i--) {
                System.out.print(i);

            }
            System.out.println();
            altura++;
            espacios--;


        }



    }
}
