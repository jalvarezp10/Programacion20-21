import java.util.Random;

public class ej19 {
    public static void main(String[] args) {
        int a[]={714,81,9,11};
        System.out.println(ocurrencias(1,a));
    }
    public static int nEsimo(int[][] n, int posicion){
        int contador=0;
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n[i].length ; j++) {
                if (contador==posicion){
                    return n[i][j];
                }
                contador++;



            }

        }
        return -1;


    }
    public static int ocurrencias(int digito, int n){
        String numCadena= String.valueOf(n);
        int contador=0;
        for (int i = 0; i <numCadena.length() ; i++) {
            if (digito==numCadena.charAt(i)-'0'){
                contador++;
            }


        }
        return contador;



    }
    public static int ocurrencias(int digito, int[] a) {
        int contador=0;
        for (int i = 0; i <a.length ; i++) {
            contador+=ocurrencias(digito,a[i]);

        }
        return contador;


    }


}
