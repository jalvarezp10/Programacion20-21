public class ej8 {
    public static void main(String[] args) {
        int num[]={20,5,7,4,32,9,2,14,11,6};
        int poscion_intercambiar=0;
        int aux;
        for (int i = 0; i <num.length ; i++) {
            if (esPrimo(num[i])){
                aux=num[poscion_intercambiar];
                num[poscion_intercambiar]=num[i];
                num[i]=aux;
                poscion_intercambiar++;

            }

        }
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i]+ " ");

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

