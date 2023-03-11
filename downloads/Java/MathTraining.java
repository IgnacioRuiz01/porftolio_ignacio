import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego...");
        System.out.println("Estas apunto de iniciar una aventura para explorar tus habilidades de calculo...");
        System.out.println("¿Estas seguro de que quieres inciar esta aventura?");

        Scanner sc=new Scanner(System.in);

        System.out.print("Elige: ");
        System.out.println("SI o NO");
        String resp=sc.next();


        String afir="SI";
        String afi="si";
        String nega="NO";
        int cont=0;
        int r=0;
        int o=0;
        if (resp.equals(afir)||resp.equals(afi)){
            System.out.println("De acuerdo comenzamos...");
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
            System.out.println("EMPEZAMOS");

            long startTime,endTime;
            startTime=System.nanoTime();
            boolean b;



            do {

                int numero1 = (int) Math.floor(Math.random() * 101);
                int numero2 = (int) Math.floor(Math.random() * 101);
                int operacion = (int) Math.floor(Math.random() * 5);

                switch (operacion) {


                    case 1:
                        System.out.println("1.Suma");
                        System.out.println(numero1 + "+" + numero2);
                        o=numero1+numero2;
                         r = sc.nextInt();
                        if (r == o) {
                            System.out.println("CORRECTO");
                            cont++;
                            System.out.println("Numero de aciertos: " + cont);

                        } else {
                            System.out.println("GAME OVER");
                            System.out.println("ACIERTOS: "+cont);
                            break;
                        }

                    case 2:
                        System.out.println("2.Multiplicación");
                        System.out.println(numero1 + "*" + numero2);
                        o=numero1*numero2;
                         r = sc.nextInt();
                        if (r == o) {
                            System.out.println("CORRECTO");
                            cont++;
                            System.out.println("Numero de aciertos: " + cont);

                        } else {
                            System.out.println("GAME OVER");
                            System.out.println("ACIERTOS: "+cont);
                            break;
                        }

                    case 3:
                        System.out.println("3.Resta");
                        System.out.println(numero1 + "-" + numero2);
                        o=numero1-numero2;
                         r = sc.nextInt();
                        if (r == o) {
                            System.out.println("CORRECTO");
                            cont++;
                            System.out.println("Numero de aciertos: " + cont);

                        } else {
                            System.out.println("GAME OVER");
                            System.out.println("ACIERTOS: "+ cont);
                            break;
                        }

                    case 4:
                        System.out.println("4.División");
                        System.out.println(numero1 + "/" + numero2);
                        o=numero1/numero2;
                         r = sc.nextInt();
                        if (r == o) {
                            System.out.println("CORRECTO");
                            cont++;
                            System.out.println("Numero de aciertos: " + cont);



                        } else {
                            System.out.println("GAME OVER");
                            System.out.println("ACIERTOS: "+cont);
                            break;
                        }

                }
                endTime = System.nanoTime();

                System.out.println("Cronometro: " + (endTime - startTime)/1000000000 + " segundos");


            }while (r==o);




        }else {
            System.out.println("RECORD DE ACIERTOS: "+cont);
            System.out.println("De acuerdo, entonces aqui finaliza tu camino...");

        }


    }
}