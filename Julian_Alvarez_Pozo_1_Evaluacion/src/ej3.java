
       import java.util.Scanner;

        public class ej3 {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Introduce la altura");
                int altura1= sc.nextInt();
                System.out.println("Introduce la altura de la segunda piramide");
                int altura2 = sc.nextInt();

                int asteriscos1 = 1;
                int asteriscos2 = 1;

                for(int j = 1; j<=altura1; j++){
                    //Espacios en blanco
                    for(int blancos = 1; blancos<=altura1-j; blancos++){
                        System.out.print(" ");
                    }

                    //Asteriscos
                    for(int i=1; i<=asteriscos1; i++){
                        System.out.print("* ");
                    }


                    //La j es la fila en la que estamos actualente y tiene que llegar hasta la fila que hayamos introducido en la primera priamide
                    //Si la altura1(piramide1) - la j (fila en la que estmamos) es menor a la altura de la piramide 2 significa que ya tenemos que
                    // empezar a pintar la piramide dos
                    if(altura1-j < altura2-1){

                        //Espacios en blanco * 2 para que pinte más espacios
                        for(int blancos = 1; blancos<=((altura1-j)*2)+1; blancos++){
                            System.out.print(" ");
                        }
                        //Asteriscos
                        for(int i=1; i<=asteriscos2; i++){
                            System.out.print("* ");
                        }
                        asteriscos2++;
                    }



                    System.out.println("");
                    asteriscos1++;
                }




            }
        }