package ejerciciosReto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String DNI;
		int carreras;
		int minutos;
		int segundos;
		int modalidad;
		int nParticipantes = 0;
		char opcion = 'S';
		int menos60 = 0;
		int carreras3 = 0;
		double tiempomins=0; 
		double mediamins = 0;
		double totalmins  = 0;
		int mejorparticipante = 0;
		double mejortiempo = 0;

		while (opcion == 'S') {
			System.out.println("Buenos días. Por favor, introduzca su DNI: ");
			DNI = teclado.next().toUpperCase();
			while (!DNI.matches("\\d{8}[A-Z]")) {
				System.out.println("Error. Por favor introduzca un DNI válido: ");
				DNI = teclado.next().toUpperCase();
			}
			System.out.println("DNI válido. Su DNI es " + DNI);
			nParticipantes++;			
			do {
				System.out.println("Ahora ponga si ha participado en la carrera individual o con parejas: ");
				System.out.println("1- Individual");
				System.out.println("2- Por parejas");
				modalidad = teclado.nextInt();
				switch (modalidad) {
				case 1:
					System.out.println("Participa en la modalidad de carrera individual");
					break;
				case 2:
					System.out.println("Participa en la modalidad de carrera por parejas");
					break;
				default:
					System.out.println("Error. Por favor seleccione una de las modalidades disponibles");
				}
			} while (modalidad < 1 | modalidad > 2);
			System.out.println("Introduzca el número de carreras en las que ha participado anteriormente:");
			carreras = teclado.nextInt();
			while (carreras < 0) {
				System.out.println("Error. Introduzca un númerode carreras válido.");
				System.out.println("Introduzca el número de carreras en las que ha participado anteriormente:");
				carreras = teclado.nextInt();
			}
				if (carreras >3) {
					carreras3++;
				}
				
			
			System.out.println("Ponga el tiempo que tardo en acabar la carrera en minutos");
			minutos = teclado.nextInt();
			while (minutos < 0) {
				System.out.println("Error. Introduzca un número válido para los minutos");
				System.out.println("Ponga el tiempo que tardo en acabar la carrera en minutos");
				minutos = teclado.nextInt();
			}

			System.out.println("Ponga el tiempo que tardo en acabar la carrera en segundos entre 0 y 59");
			segundos = teclado.nextInt();
			while (segundos > 59 | segundos < 0) {
				System.out.println("Error. Introduzca un número válido para los segundos.");
				System.out.println("Ponga el tiempo que tardo en acabar la carrera en segundos entre 0 y 59");
				segundos = teclado.nextInt();
			}
			
			System.out.println("Ha tardado " + minutos + " minutos y " + segundos + " segundos en acabar la carrera.");
			
			
			/*AQUI DAMOS VALOR A LAS VARIABLES QUE NECESITAREMOS USAR POSTERIORMENTE  */
			tiempomins= minutos + (segundos/60.00);/*ESTA VARIABLE CONVIERTE MINUTOS Y SEGUNDOS EN SOLO MINUTOS CON DECIMALES */
			totalmins= totalmins + tiempomins;/*ESTA GUARDA LOS MINUTOS TOTALES DE TODOS LOS PARTICIPANTES*/
			mediamins= totalmins / nParticipantes ;/*ESTA CALCULA LA MEDIA DE TIEMPO DE TODOS LOS PARTICIPANTES*/
			
			if (nParticipantes==1) {/*ESTE CONDICIONAL SOLO SE DARÁ EN EL PRIMER BUCLE*/
				mejorparticipante=1;  /*AQUI LE DAMOS EL VALOR AL MEJOR PARTICIPANTE*/
				mejortiempo=totalmins;  /*AQUI LE DAMOS EL VALOR AL MEJOR TIEMPO*/
			}
			
			if (mejortiempo > tiempomins) {/*ESTE CONDICIONAL SE DARA CUANDO EL TIEMPO DE UN NUEVO PARTICIPANTE SEA MEJOR QUE EL REGISTRADO COMO MEJOR TIEMPO*/
				mejortiempo=tiempomins;/*AQUI SE SOBREESCRIBE EL MEJOR TIEMPO Y SE GUARDA EL NUMERO DEL PARTICIPANTE CON EL NUEVO MEJOR TIEM*/
				mejorparticipante = nParticipantes;
			}
			if (minutos <60) {
				menos60++;
				System.out.println("El participante ha acabado la carrera en menos de 60 minutos.");
			}	
		
			
			System.out.println("Quieres registrar a otro participante? (S/N)");
			opcion = teclado.next().charAt(0);
			while (opcion != 'S' & opcion != 'N') {
				System.out.println("Error. ¿Quieres registrar a otro participante? (S/N)");
				opcion = teclado.next().charAt(0);
			}
		}
		if (opcion == 'N');
		System.out.println("El número total de participantes es " +nParticipantes);
		System.out.println("El número total de participantes que han tardado menos de 60 minutos es " +menos60);
		System.out.println("El número total de participantes que han corrido más de 3 carreras anteriormente es  " +carreras3);
		System.out.println("El tiempo medio de las carreras de todos los participantes es " +mediamins);
		System.out.println("El mejor participante ha sido el participante nº" +mejorparticipante+ " , con un tiempo de " +mejortiempo);
		teclado.close();
	}
}
