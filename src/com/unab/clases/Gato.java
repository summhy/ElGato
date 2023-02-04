package com.unab.clases;

public class Gato extends Juego {
	
	private char[] simbolos = new char[jugadores];
	private int flag;
	 
	
	public Gato(char simbolo1, char simbolo2) {
		super("Gato", 2, 3, 3);
		simbolos[0] = simbolo1;
		simbolos[1] = simbolo2;
		flag=0;
		for(int i =0; i < filas; i++) { //filas
			for(int j=0; j < columnas; j++) { //columnas
				tablero[i][j] = '*';
			}
		}	
	}
	
	public void jugada(int fila, int columna) {
		tablero[fila][columna] = simbolos[flag];
		if(flag%2 == 0) {
			flag=1;
		}else {
			flag=0;
		}
		
	}
	
	public String saludar() {
		return "Bienvenidos al Juego Gato";
	}
	
	
	public int retornar(int valores) {
		return valores +100;
	}
	
	
	public String retornar(String valores) {
		return valores;
	}
	
	
	 
	
	
	
	
	
}
