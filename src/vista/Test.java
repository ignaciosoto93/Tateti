package vista;

import modelo.JugadorDos;
import modelo.JugadorUno;
import controlador.Tablero;

public class Test {
public static void main(String[] args) {
	Tablero tablero = new Tablero();
	JugadorUno jugador1 = new JugadorUno();
	JugadorDos jugador2 = new JugadorDos();
	
	while(tablero.getCantidadJugadas()<=9 && !tablero.hayGanador()){
		jugador1.jugar(tablero);
		tablero.mostrarTablero();
		if(tablero.hayGanador()){
			System.out.println("\n El jugador 1 ha ganado!!");
			break;
		}
		if(tablero.getCantidadJugadas()==9){
			System.out.println("\n El partido termino en empate!!!");
			break;
			
		}
		jugador2.jugar(tablero);
		tablero.mostrarTablero();
		if(tablero.hayGanador()){
			System.out.println("\n El jugador 2 ha ganado!!");
			break;
		}
	}
	if(tablero.getCantidadJugadas()==9 && !tablero.hayGanador()){
	System.out.println("El partido termino en empate!");	
	}
	
	
}
}
