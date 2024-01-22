package refactorizar;

import java.util.Scanner;

public class Refactorizar_4 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final int junior = 950, senior = 1200, jefe = 1600;
        int estadoCivil, diasViaje, viaje = 30;


        System.out.println("¿Cuál es tu cargo? (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto)");
        int numUsuario = sc.nextInt();

        if (numUsuario == 1) {
            numUsuario = junior;
        } else if (numUsuario == 2) {
            numUsuario = senior;
        } else if (numUsuario == 3) {
            numUsuario = 1600;
        }

        System.out.println("Cuantos dias se ha ido de viaje?");
        diasViaje = sc.nextInt();
        int viajetotal = diasViaje * viaje;
        numUsuario = numUsuario + viajetotal;

        System.out.println("Su nomina sin restar el IRPF es de " + numUsuario + " euros");
        System.out.println("Y ha ganado un total de " + viajetotal + " por sus viajes");

        System.out.println("Introduzca su estado civil 0 - Soltero, 1 - Casado");
        estadoCivil = sc.nextInt();
        
        if (estadoCivil == 0) {
            numUsuario = (int) (numUsuario * 0.75);
        } else if (estadoCivil == 1) {
            numUsuario = (int) (numUsuario * 0.80);
        }

        System.out.println("Su nomina tras restar el IRPF es de: " + numUsuario);
        sc.close();
    }
}