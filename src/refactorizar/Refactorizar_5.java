package refactorizar;

import java.util.Scanner;

public class Refactorizar_5 {

	public static void main(String[] args) {

			var sc=new Scanner(System.in);
			int dia,mes,año;
			System.out.println("Introduzca un dia");
			dia=sc.nextInt();
			System.out.println("Introduzca un mes");
			mes=sc.nextInt();
			System.out.println("Introduzca un año");
			año=sc.nextInt();
			if (dia<28||dia>31||dia<0) {
				System.out.println("Fecha incorrecta");
			if(mes<0||mes>12)
				System.out.println("Fecha incorrecta");
			if(año<0)
				System.out.println("Fecha incorrecta");
			sc.close();	}
			}
		}
