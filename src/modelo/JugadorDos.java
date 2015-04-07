package modelo;

import java.util.Scanner;

import controlador.Tablero;

public class JugadorDos {
	public void jugar(Tablero tablero){
		boolean flag=true;
		int casilla1 = 0;
		int casilla2 = 0;
		while(flag==true){
			System.out.println("\n Turno Jugador 2!!\n");
			Scanner input = new Scanner(System.in);
			System.out.println("Ingrese columna:\n");
			String valor = input.nextLine();
			casilla1 = Integer.parseInt(valor);
		
			System.out.println("Ingrese fila:\n");
			valor = input.nextLine();
			casilla2 = Integer.parseInt(valor);
			if(casilla1>=0&&casilla1<3&&casilla2>=0&&casilla2<3)
				flag=false;
			
			
		}
		
		tablero.anotarJugada('O',casilla1 , casilla2,this);

	}

	public JugadorDos() {
		super();
		// TODO Auto-generated constructor stub
	}

}
