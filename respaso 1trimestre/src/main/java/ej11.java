import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        System.out.println(convierteEnMorse(213 ));




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

    public static int siguientePrimo (int num){

        boolean encontrado=false;
        do {
            num++;
            if (esPrimo(num)){
                encontrado=true;
            }


        }while(encontrado==false);
        return num;



    }
    public static int potencia(int base, int exponente){
        int resultado=1;
        for (int i = 0; i <exponente ; i++) {
            resultado=resultado*base;


        }
        return resultado;




    }
    public static int digitos(int num){
        int contador=0;
        while(num>0){
             num=num/10;
            contador++;
        }
        return contador;
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
    public static int digitoN(int num, int posicion){
        String aux=Integer.toString(num);
        if (posicion<aux.length()){
            return aux.charAt(posicion)-'0';
        }
        return -1;



    }
    public static boolean capicua(int num){
        if (num==voltea(num)){
            return true;
        }
        return false;

    }
    public static int posicionDeDigito(int num,int numbuscado){
        int numeros[]= new int[Integer.toString(num).length()];
        for (int i = numeros.length-1; i >=0 ; i--) {
            numeros[i]=num%10;
            num=num/10;



        }
        for (int i = 0; i <numeros.length ; i++) {
            if (numeros[i]==numbuscado){
                return i;
            }


        }
        return -1;


    }
    public static int quitaPorDetras(int num, int poscionQuitar){


        for (int i = 0; i <poscionQuitar ; i++) {
            num=num/10;


        }
        return num;



    }
    public static  int quitaPorDelante(int num,int posicionQuitar){
        int numeroInvertido=voltea(num);
        for (int i = 0; i <posicionQuitar ; i++) {
            numeroInvertido=numeroInvertido/10;


        }
        return voltea(numeroInvertido);



    }
    public static int pegaPorDetras(int num, int digitoAnadido){
        return num*10+digitoAnadido;
    }
    public static int pegaPorDelante(int num, int digitoAnadido){
        int numeroInvertido=voltea(num);
        return voltea(numeroInvertido*10+digitoAnadido);

    }
    public static int trozoDeNumero(int num ,int posicion1, int posicion2){
        int numeros[]= new int[Integer.toString(num).length()];
        int contador=0;
        for (int i = numeros.length-1; i >=0 ; i--) {
            numeros[i]=num%10;
            num=num/10;



        }
        for (int i = posicion1; i <=posicion2 ; i++) {
            contador=contador*10+numeros[i];

        }
        return contador;

    }




    public static int[] filtraPrimos(int x[]){
        int contador=0;
        int []primos;
        //for para denominar la longitud del array de primos
        for (int i = 0; i <x.length ; i++) {
            if (esPrimo(x[i])){
                contador++;

            }

        }
        if (contador!=0){
             primos= new int[contador];
            int poscionNuevoArray=0;

            for (int i = 0; i <x.length ; i++) {
                if (esPrimo(x[i])==true){
                    primos[poscionNuevoArray]=x[i];
                    poscionNuevoArray++;

                }

            }

        }else {
             primos=new int [1];
            primos[0]=-1;



        }
        return primos ;

    }
    public static String convierteEnMorse(int n){
        String numCadena= String.valueOf(n);
         String[] morse = new String[10];
         
        morse[0] =  " _ _ _ _ _" ;
        morse[1] =  ". _ _ _ _";
        morse[2] =  ". . _ _ _";
        morse[3] =  ". . . _ _" ;
        morse[4] =  " . . . . _" ;
        morse[5] =  ". . . . ." ;
        morse[6] =  "_ . . . ." ;
        morse[7] =  "_ _ . . ." ;
        morse[8] =  "_ _ . . ." ;
        morse[9] =  "_ _ . . ." ;
        String cadena="";
        for (int i = 0; i <numCadena.length() ; i++) {
            int num=numCadena.charAt(i)-'0';
            cadena+=morse[num];
            cadena+=" ";
        }
        return cadena;
        

    }
    public static int[] filtraCapicuas(int x[]){
        int contador=0;
        //for para denominar la longitud del array de primos
        for (int i = 0; i <x.length ; i++) {
            if (capicua(x[i])==true){
                contador++;

            }

        }
        int capicua[]=new int[contador];
        int posicionNueva=0;
        for (int i = 0; i <x.length ; i++) {
            if (capicua(x[i])==true){
                capicua[posicionNueva]=x[i];
                posicionNueva++;

            }

        }

        return capicua;



    }




}


