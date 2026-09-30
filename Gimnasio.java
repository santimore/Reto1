package reto1;

import java.util.Scanner;

public class Gimnasio {

	public static void main(String[] args) {
		// TODO Auto-generated method

		Scanner sc = new Scanner(System.in);
		int usuariosRegistrados, usuario = 1, diasAcudidos, minutos = 0, numeros = 1, minutosTotal = 0, recoger = 0,
		maxMinutos = 0, maxUsuario = 0, granTotalMinutos = 0, granTotalDias = 0;
		double media;

		System.out.println("¿Cuantos usuarios se van a registrar?");
		usuariosRegistrados = sc.nextInt();
		while (usuariosRegistrados < 0) {
			System.out.println("ERROR, los usuarios a registrar no pueden ser menor que 0.");
			System.out.println("¿Cuantos usuarios se van a registrar?");
			usuariosRegistrados = sc.nextInt();
		}

		for (int i = 0; i < usuariosRegistrados; i++) {

			minutosTotal = 0;
			recoger = 0;

			System.out.println("¿Numero de dias que ha acudido el usuario " + usuario + " al gimnasio? ");
			diasAcudidos = sc.nextInt();
			while (diasAcudidos < 0 || diasAcudidos > 7) {
				System.out.println("ERROR, los dias a registrar no pueden ser menor que 0 y mayor a 7.");
				System.out.println("¿Numero de dias que ha acudido el usuario " + usuario + "?");
				diasAcudidos = sc.nextInt();
			}

			for (int d = 0; d < diasAcudidos; d++) {
				System.out.println("Introduzca el numero de minutos realizado de ejercicios ");
				System.out.println("Dia " + numeros + ": ");
				minutos = sc.nextInt();
				while (minutos < 0) {
					System.out.println("ERROR, los minutos a registrar no pueden ser menor que 0.");
					System.out.println("Introduzca el numero de minutos realizado ejercicios: ");
					System.out.println("Dia " + numeros + ": ");
					minutos = sc.nextInt();
				}

				if (minutos > 60) {
					recoger++;
				}

				minutosTotal += minutos;

				numeros++;

				if (numeros > diasAcudidos) {
					numeros = 1;
				}

			}

			media = (double) minutosTotal / diasAcudidos;

			System.out.println("*** Usuario " + usuario + " ***");
			System.out.println("Minutos totales en la semana: " + minutosTotal);
			System.out.println("Media de minutos por dia: " + media);
			System.out.println("Dias con mas de 60 minutos de ejercicio: " + recoger);

			if (minutosTotal > 300) {
				System.out.println("Enhorabuena, has alcanzado el objetivo semanal. Felicidades.");
			}

			

			if (minutosTotal > maxMinutos) {
				maxMinutos = minutosTotal;
				maxUsuario = usuario;
			}

			granTotalMinutos += minutosTotal;
			granTotalDias += diasAcudidos;

			usuario++;

		}
		System.out.println("\n*****************************************************");
		System.out.println("El usuario que realizo mas minutos de ejercicio es el " + maxUsuario + " con " + maxMinutos
				+ " minutos.");
		System.out.println("Total de minutos realizados entre todos los usuarios: " + granTotalMinutos);
		System.out.println("Total de dias de entrenamiento registrados: " + granTotalDias);
		System.out.println("\n*****************************************************");
		
		sc.close();
	}
	

}