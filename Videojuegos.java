package dami;

import java.util.Scanner;

public class Videojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int jugadores, partidas, puntos, puntostotaljugador = 0, derrotados = 0, derrotadostotaljugador = 0,
			puntostotal = 0, derrotadostotal = 0, cont = 1, cont2 = 1, mejorjugador = 0, maspuntos = 0;

		System.out.println("Bienvenido");
		System.out.println("Cuantos jugadores van a registrarse?");
		jugadores = teclado.nextInt();
		while (jugadores < 1) {
			System.out.println("Tiene que haber al menos 1 jugador,introduce de nuevo el numero de jugadores:");
			jugadores = teclado.nextInt();
		}
		while (cont <= jugadores) {
			System.out.println("Hola jugador numero " + cont);
			System.out.println("¿Cuantas partidas has jugado?");
			partidas = teclado.nextInt();
			while (partidas < 1) {
				System.out.println("Cada jugador debe de haber jugado al menos una partida,introduce de nuevo el numero de partidas:");
				partidas = teclado.nextInt();
			}
			cont2 = 1;
			while (cont2 <= partidas) {
				System.out.println("Cuantos puntos has conseguido en la partida numero " + cont2);
				puntos = teclado.nextInt();
				while (puntos < 0) {
					System.out.println(
							"El minimo de puntos en una partida es 0,vuelve a introducir los puntos del jugador:");
					puntos = teclado.nextInt();
				}
				System.out.println("Cuantos enemigos has derrotado en la partida numero " + cont2);
				derrotados = teclado.nextInt();
				while (derrotados < 0) {
					System.out.println(
							"No puedes haber derrotado a un numero negativo de enemigos, introduce de nuevo el numero:");
					derrotados = teclado.nextInt();
				}
				if (puntos > 999) {
					puntos = puntos + 100;
				}
				puntostotaljugador = puntostotaljugador + puntos;
				derrotadostotaljugador = derrotadostotaljugador + derrotados;

				cont2++;
			}
			System.out.println("La puntuacion total del jugador numero " + cont + " es: " + puntostotaljugador);
			System.out.println("Los enemigos derrotados por el jugador numero " + cont + " es: " + derrotadostotaljugador);
			System.out.println("La puntuacion media del jugador numero " + cont + " es: " + puntostotaljugador / partidas);
			System.out.println("*********************************");

			if (cont == 1) {
				mejorjugador = 1;
				maspuntos = puntostotaljugador;
			}
			if (puntostotaljugador > maspuntos) {
				maspuntos = puntostotaljugador;
				mejorjugador = cont;
			}
			puntostotal = puntostotal + puntostotaljugador;
			puntostotaljugador = 0;
			derrotadostotal = derrotadostotal + derrotadostotaljugador;
			derrotadostotaljugador = 0;

			cont++;
		}
		System.out.println("La puntuacion total de todos los jugadores es: " + puntostotal);
		System.out.println("El total de enemigos derrotados entre todos es: " + derrotadostotal);
		System.out.println("El jugador con mayor puntuacion es el jugador numero " + mejorjugador + " con " + maspuntos+ " puntos");
		teclado.close();

	}

}
