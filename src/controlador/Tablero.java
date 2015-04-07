package controlador;

import modelo.JugadorDos;
import modelo.JugadorUno;

public class Tablero {
	
	char[][] casillas = new char[3][3];
	private int cantidadJugadas=0;
	
	public int getCantidadJugadas() {
		return cantidadJugadas;
	}
	public void setCantidadJugadas(int cantidadJugadas) {
		this.cantidadJugadas = cantidadJugadas;
	}
	public boolean hayGanador(){
		if(casillas[0][0]==casillas[0][1]&&casillas[0][1]==casillas[0][2]&&casillas[0][0]!='\u0000')
			return true;
		else if(casillas[1][0]==casillas[1][1]&&casillas[1][1]==casillas[1][2]&&casillas[1][0]!='\u0000')
			return true;
		else if(casillas[2][0]==casillas[2][1]&&casillas[2][1]==casillas[2][2]&&casillas[2][0]!='\u0000')
			return true;
		else if(casillas[0][0]==casillas[1][0]&&casillas[1][0]==casillas[2][0]&&casillas[0][0]!='\u0000')
			return true;
		else if(casillas[0][1]==casillas[1][1]&&casillas[1][1]==casillas[2][1]&&casillas[0][1]!='\u0000')
			return true;
		else if(casillas[0][2]==casillas[1][2]&&casillas[1][2]==casillas[2][2]&&casillas[0][2]!='\u0000')
			return true;
		else if(casillas[0][0]==casillas[1][1]&&casillas[1][1]==casillas[2][2]&&casillas[0][0]!='\u0000')
			return true;
		else if(casillas[0][2]==casillas[1][1]&&casillas[1][1]==casillas[2][0]&&casillas[0][2]!='\u0000')
			return true;
		else return false;
	}
	public void anotarJugada(char jugada, int casilla1, int casilla2,JugadorUno jugador){
		if(this.puedeJugar(casilla1,casilla2)){
		this.casillas[casilla1][casilla2]=jugada;
		cantidadJugadas++;
		}
		else {System.out.println("No puede anotar en esta casilla");
		jugador.jugar(this);}
	}
	public void anotarJugada(char jugada, int casilla1, int casilla2,JugadorDos jugador){
		if(this.puedeJugar(casilla1,casilla2)){
		this.casillas[casilla1][casilla2]=jugada;
		cantidadJugadas++;
		}
		else {System.out.println("No puede anotar en esta casilla");
		jugador.jugar(this);}
	}
	
	public Tablero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean puedeJugar(int casilla1, int casilla2){
		if(casillas[casilla1][casilla2] == '\u0000')
			return true;
		else return false;
		
	}
	public void mostrarTablero() {
		System.out.println(this.casillas[0][0]+" | "+ this.casillas[1][0]+ " | "+ this.casillas[2][0]+"\n"+
				this.casillas[0][1]+" | "+ this.casillas[1][1]+" | "+ this.casillas[2][1]+"\n"+
				this.casillas[0][2]+" | "+this.casillas[1][2]+" | "+this.casillas[2][2]);
		
	}
	
	
	
}
