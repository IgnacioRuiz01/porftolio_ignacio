import javax.xml.bind.annotation.XmlType;
import java.util.Scanner;

public class TIMMY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iPos = 1;
        int jPos = 1;
        String posicion;
        boolean fin = false;



        for (int c = 0; c > -1; c++) {

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (j == 0 || j == 19 || i == 0 || i == 19) {
                        System.out.print("*");
                    } else if (i == 18 && j == 18) {
                        System.out.print("H");

                    } else if (i == jPos && j == iPos) {
                        System.out.print("T");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            if (iPos == 18 && jPos == 18) {
                fin = true;
                if (fin) {

                    System.out.println("ERES UN CRACK");
                    break;
                }
            }
            if (iPos == 0 || iPos == 19 || jPos == 0 || jPos == 19) {
                System.out.println("GAME OVER...");
                break;

            }


            System.out.println("¿Cual es su siguiente paso?\n N para moverse hacia" +
                    "arriba, S para moverse hacia abajo, E para moverse a la derecha, u O para moverse a la\n" +
                    "izquierda (Norte, Sur, Este y Oeste).");
            posicion = sc.next();

            switch (posicion) {
                case "N":
                    jPos = jPos - 1;
                    System.out.println("Timmi se encuentra aqui: "+iPos + " " + jPos);
                    break;
                case "S":
                    jPos = jPos + 1;
                    System.out.println("Timmi se encuentra aqui: "+iPos + " " + jPos);
                    break;

                case "E":
                    iPos = iPos + 1;
                    System.out.println("Timmi se encuentra aqui: "+iPos + " " + jPos);
                    break;
                default:
                    iPos = iPos - 1;
                    System.out.println("Timmi se encuentra aqui: "+iPos + " " + jPos);
                    break;

            }
            if (posicion.equals("STOP")) {
                System.out.println("FIN DEL JUEGO");
                break;
            }
        }
    }


}



