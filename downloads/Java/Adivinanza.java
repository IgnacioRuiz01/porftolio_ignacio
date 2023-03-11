import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=(int)Math.floor(Math.random() * 101);
        int r=0;
        int c=0;

        do {
            System.out.println("Adivina el numero entre 1-100:");
            r=sc.nextInt();
            if (r<1||r>100){
                System.out.println("ERROR, introduzca un numero valido (1-100)");
            }else if (r>x){
                System.out.println("El numero que has puesto es mayor");
            } else if (r<x) {
                System.out.println("El numero que has puesto es menor");

            }

            c++;


        }while (r!=x);

        System.out.println("Felicidades has acertado el numero con "+c+" intentos");






    }
}