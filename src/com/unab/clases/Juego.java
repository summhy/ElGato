package com.unab.clases;

public class Juego {
	
	protected String nombre;
	protected int jugadores;
	protected int filas;
	protected int columnas;
	protected char tablero[][]; 
	
	public Juego(String nombre, int jugadores, int filas, int columnas) {
		this.nombre= nombre;
		this.jugadores = jugadores;
		this.filas = filas;
		this.columnas = columnas;
		tablero = new char[filas][columnas];
	
	}
	public String saludar() {
		return "Bienvenidos a Juegos de Mesa";
	}

	/**
	 * @return the tablero
	 */
	public char[][] getTablero() {
		return tablero;
	}
	
	

}

