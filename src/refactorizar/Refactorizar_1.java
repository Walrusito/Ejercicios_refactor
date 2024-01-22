package refactorizar;

import java.util.Scanner;

public class Refactorizar_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
  
        

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        

        int salarioSemanal = 0;
        
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12;
        } else {
            
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (40 * 12) + (horasExtras * 16);
        }
        

        System.out.println("El salario semanal es: " + salarioSemanal + " euros");
        

        sc.close();
    }
}