import java.util.Random;

public class ej18 {
    public static void main(String[] args) {
        Random random=new Random();
        int num[]=new int[10];
        for (int i = 0; i < num.length ; i++) {
            num[i]=random.nextInt(100-2)+2;

        }
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num[i])==true&&capicua(num[i])==true){
                System.out.println(num[i]+" Es primo y capicua");
            }else if (esPrimo(num[i])==false&&capicua(num[i])==true){
                System.out.println(num[i]+" No es primo y capicua");
            }else if (esPrimo(num[i])==false&&capicua(num[i])==false){
                System.out.println(num[i]+" No es primo y  no es capicua");

            }else if (esPrimo(num[i])==true&&capicua(num[i])==false){
                System.out.println(num[i]+" Es primo y  no es capicua");


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
    public static boolean capicua(int num){
        if (num==voltea(num)){
            return true;
        }
        return false;

    }
    public static int voltea(int num){
        int numero_invertido=0;
        while(num>0){
            int resto=num%10;
            num=num/10;
            numero_invertido=numero_invertido*10+resto;
        }
        return numero_invertido;


    }
}
