package com.cip.program;

public class ArrayAleatorio {

	public static void main(String[] args) {

		// Array Aleatoria

		        int[] numero = new int[20];
		
				for (int i = 0; i <= 19; i++) {
					int x = (int) (Math.random() * 10.01) + 1;
					numero[i] = x;
					System.out.print(" " + numero[i]);
				}

	}

}
