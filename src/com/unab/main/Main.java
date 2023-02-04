package com.unab.main;

import java.util.Scanner;

import com.unab.clases.Gato;
import com.unab.clases.Juego;

public class Main {

	
	public static void mostrarTablero(char[][] tablero) {

		for(int i =0; i < tablero.length; i++) { //filas
			for(int j=0; j < tablero[i].length; j++) { //columnas
				System.out.print(" " + tablero[i][j]+" " );
			}
			System.out.println();		
		}
		System.out.println();	
	}
	
	public static void jugada(Gato partida ) {
		int fila, columna;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese fila");
		fila = entrada.nextInt();
		System.out.println("Ingrese columna");
		columna = entrada.nextInt();
		partida.jugada(fila-1, columna -1);
	}
	
	public static void main(String[] args) {
		
		Gato partida = new Gato('S','L');
		Juego j = new Juego("nuevo",0,0,0);

		System.out.println(j.saludar());
		System.out.println(partida.saludar());
		

		System.out.println(partida.retornar(1));
		System.out.println(partida.retornar("Hola"));
		
		mostrarTablero(partida.getTablero());
		
		for(int i = 0; i< 9; i++) {
			jugada(partida);
			mostrarTablero(partida.getTablero());
		}
		
	}

}
