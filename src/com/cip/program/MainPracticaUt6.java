package com.cip.program;

import java.util.Scanner;

public class MainPracticaUt6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;

		PracticaUt6 AA = new PracticaUt6();
		ArrayAleatorio BB = new ArrayAleatorio();
		
		do {
			// Imprimir Menu
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1.- Imprimir el Valor Mayor");
			System.out.println("2.- Imprimir el Valor Menor");
			System.out.println("3.- Imprimir la Media");
			System.out.println("4.- Imprimir Los Valores de la Array");
			System.out.println("5.- Introducir Valor");
			System.out.println("6.- Imprimir numeros de Repeticones del valor");
			System.out.println("0.- Salir");
			System.out.println("Su Opcion:");

			// pedir opcion al usuario
			opcion = sc.nextInt();

			// metodo swicht para menu
			switch (opcion) {
			case 1:
				//AA.valorMayor();
				System.out.println(" ");
				System.out.println("el valor mayor" + AA.valorMayor());
				break;
			case 2:
				AA.valorMenor();
				break;
			case 3:
				AA.valorMedia();
				break;
			case 4: System.out.print(numero[i]);	
				break;
			case 5:
				AA.valor();
				break;
			case 6:
				AA.repeticion();
				break;
			case 0:
				System.out.println("Hasta Pronto");
				break;
			default:
				System.out.println("Por favor, introduzca un valor entre cero y seis");
			}

		} while (opcion != 0);

		sc.close();
	}

}
