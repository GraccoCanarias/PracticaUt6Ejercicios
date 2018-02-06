package com.cip.program;

import java.util.Scanner;

public class PracticaUt6 {

	int[] numero = new int[20];
	int mayor = 0;
	int menor = 10;
	int media = 0;
	int repeticion = 0;
	
	
	public int[] getNumero() {
		return numero;
	}

	public void setNumero(int[] numero) {
		this.numero = numero;
	}

	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}

	public int getMenor() {
		return menor;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	

	// Valor Mayor

	public int  valorMayor() {

		
		for (int i = 0; i < 19; i++) {
			if (numero[i] > mayor) {
				mayor = numero[i];
				// System.out.println(" ");
				// System.out.println("el valor mayor" + mayor);
			}
		}
		return mayor;
	}

	// Valor Menor
	public int valorMenor() {

		
		for (int i = 0; i < 19; i++) {
			if (numero[i] < menor) {
				menor = numero[i];
				// System.out.println(" ");
				// System.out.println("el valor menor" + menor);
			}

		}
		return menor;
	}

	// Valor Media
	public int valorMedia() {

		
		for (int i = 0; i < 19; i++) {
			media = ((media + numero[i]/numero.length));
		}
		 return media;
		//media = media / numero.length;
		// System.out.println("el valor Media" + media);
	}

	// Introducir Valor
	int valor = 0;

	public int valor() {
		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();
		if (valor < 0 && valor > 10) {
			System.out.println("Introdusca un valor entre 1 y 10");
			sc.close();
		}
		return valor;
	}

	// Numero de Repeticiones
	public void repeticion() {

		
		for (int i = 0; i < 19; i++) {
			if (valor == numero[i]) {
				repeticion++;
				System.out.println("Numero de Repeticion" + repeticion);
			}
			
		}
		
	}
	
}
