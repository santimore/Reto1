import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int registro;
		String nombre;
		String apellido;
		int opcion;
		double km;
		double gasto;
		double uso;
		int plancha;
		double gastoGrupo = 0;
		
		double gastoCoche = 0;
		double gastoAutobus = 0;
		double gastoBicicleta = 0;
		double gastoPlancha = 0;
		double gastoOrdenador = 0;
		double gastoMovil = 0;
		double gastoDucha = 0;
		double gastoCalefaccion = 0;
		
		System.out.println("Bienvenido");
		System.out.println("¿Cuantas personas se van a registrar? ");
		registro=sc.nextInt();
		while(!sc.hasNextInt()) {
			System.out.println("Error! Debes introducir un numero");
			sc.next(); 
		}
		registro = sc.nextInt(); 
		while(registro <= 0) {
			System.out.println("Error! El numero debe ser positivo"); 
			System.out.println("¿Cuantas personas se van a registrar? "); 
			while(!sc.hasNextInt()) { 
				System.out.println("Error! Debes introducir un numero"); 
				sc.next(); 
			} 
			registro = sc.nextInt();
		}
		
		
		
		for(int i=0; i<registro;i++) {
			double gastoPersona = 0;
			System.out.println("Introduce tu nombre: ");
			nombre=sc.next();
			System.out.println("Introduce tu apellido: ");
			apellido=sc.next();
			
			do {			
				
				System.out.println("Menu de actividades: ");
				System.out.println("1- Transporte en coche");
				System.out.println("2- Transporte en autobus");
				System.out.println("3- Transporte en bicileta");
				System.out.println("4- Uso de plancha");
				System.out.println("5- Uso del ordenador");
				System.out.println("6- Uso del movil");
				System.out.println("7- Finalizar actividades del dia"); 
				System.out.println("8- Uso de ducha");
				System.out.println("9- Uso de calefaccion");
				System.out.println("¿Cual quieres elegir? ");
				opcion=sc.nextInt();
				while(!sc.hasNextInt()) {
				    System.out.println("Error! Debes introducir un numero");
				    sc.next();
				}

				opcion=sc.nextInt();
				while(opcion <=0 || opcion>9) {
					System.out.println("Error! No se puede elegir ese numero ");
					System.out.println("¿Cual quieres elegir? ");
					opcion=sc.nextInt();
				}
				
				switch(opcion) {
					case 1:
						System.out.println("¿Cuantos kilometros has recorrido en coche? ");
						km=sc.nextDouble();
						while(!sc.hasNextDouble()) {
						    System.out.println("Error! Debes introducir un numero");
						    sc.next();
						}

						km=sc.nextDouble();

						while(km<0) {
						    System.out.println("Error! El numero debe ser positivo");

						    while(!sc.hasNextDouble()) {
						        System.out.println("Error! Debes introducir un numero");
						        sc.next();
						    }

						    km=sc.nextDouble();
						}
						gasto=0.21*km;
						gastoPersona = gastoPersona + gasto;
						gastoCoche = gastoCoche + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 2: 
						System.out.println("¿Cuantos kilometros has recorrido en autobus? ");
						km=sc.nextDouble();
						while(!sc.hasNextDouble()) {
						    System.out.println("Error! Debes introducir un numero");
						    sc.next();
						}

						km=sc.nextDouble();

						while(km<0) {
						    System.out.println("Error! El numero debe ser positivo");

						    while(!sc.hasNextDouble()) {
						        System.out.println("Error! Debes introducir un numero");
						        sc.next();
						    }

						    km=sc.nextDouble();
						}
						gasto=0.10*km;
						gastoPersona = gastoPersona + gasto;
						gastoAutobus = gastoAutobus + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 3:
						System.out.println("¿Cuantos kilometros has recorrido en bicicleta? ");
						km=sc.nextDouble();
						while(!sc.hasNextDouble()) {
						    System.out.println("Error! Debes introducir un numero");
						    sc.next();
						}

						km=sc.nextDouble();

						while(km<0) {
						    System.out.println("Error! El numero debe ser positivo");

						    while(!sc.hasNextDouble()) {
						        System.out.println("Error! Debes introducir un numero");
						        sc.next();
						    }

						    km=sc.nextDouble();
						}
						gasto=0*km;
						gastoPersona = gastoPersona + gasto;
						gastoBicicleta = gastoBicicleta + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 4:
						System.out.println("Has usado la placha: (1=si, 0=no)");
						plancha=sc.nextInt();
						while(!sc.hasNextInt()) {
							System.out.println("Error! El numero debe ser 1 o 0"); 
							sc.next(); 
						} 
						plancha = sc.nextInt();
						
						while(plancha!=1 && plancha!=0) {
							System.out.println("Error! El numero debe ser 1 o 0 ");
							System.out.println("Has usado la placha: (1=si, 0=no)");
							while(!sc.hasNextInt()) {
								System.out.println("Error! El numero debe ser 1 o 0");
								sc.next(); 
							} 
							plancha = sc.nextInt();
						}
						if(plancha == 1 || plancha == 0) {
							if(plancha == 1) {
								System.out.println("¿Cuantas horas has utilizado la plancha? ");
								while(!sc.hasNextDouble()) {
									System.out.println("Error! Debes introducir un numero"); 
									sc.next(); 
								}
								uso=sc.nextDouble();
								while(uso<0) {
								    System.out.println("Error! El numero debe ser positivo");
								    while(!sc.hasNextDouble()) {
										System.out.println("Error! Debes introducir un numero"); 
										sc.next(); 
									}
								    uso=sc.nextDouble();
								} 
								gasto=0.7*uso;
								gastoPersona = gastoPersona + gasto;
								gastoPlancha = gastoPlancha + gasto;
								System.out.println("El consumo de CO2 es: "+ gasto);
							}
						}
						
						
						break;
					case 5: 
						System.out.println("¿Cuantas horas has utilizado el ordendor? ");
						while(!sc.hasNextDouble()) {
							System.out.println("Error! Debes introducir un numero"); 
							sc.next(); 
						}
						uso=sc.nextDouble();
						while(uso<0) {
							System.out.println("Error! El numero debe ser positivo");
							while(!sc.hasNextDouble()) {
								System.out.println("Error! Debes introducir un numero"); 
								sc.next(); 
							}
							uso=sc.nextDouble();
						}
						gasto=0.08*uso;
						gastoPersona = gastoPersona + gasto;
						gastoOrdenador = gastoOrdenador + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 6:
						System.out.println("¿Cuantas horas has utilizado el movil? ");
						while(!sc.hasNextDouble()) {
							System.out.println("Error! Debes introducir un numero"); 
							sc.next(); 
						}
						uso=sc.nextDouble();
						while(uso<0) {
							System.out.println("Error! El numero debe ser positivo");
							while(!sc.hasNextDouble()) {
								System.out.println("Error! Debes introducir un numero"); 
								sc.next(); 
							}
							uso=sc.nextDouble();
						}
						
						gasto=0.02*uso;
						gastoPersona = gastoPersona + gasto;
						gastoMovil = gastoMovil + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 7:
						 
						 break;	
					case 8: 
						System.out.println("Cuantas horas has usado la ducha? ");
						while(!sc.hasNextDouble()) {
							System.out.println("Error! Debes introducir un numero"); 
							sc.next(); 
						}
						uso=sc.nextDouble();
						while(uso<0) {
							System.out.println("Error! El numero debe ser positivo");
							while(!sc.hasNextDouble()) {
								System.out.println("Error! Debes introducir un numero"); 
								sc.next(); 
							}
							uso=sc.nextDouble();
						}
						
						gasto=0.05*uso;
						gastoPersona = gastoPersona + gasto;
						gastoDucha = gastoDucha + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 9:
						System.out.println("Cuantas horas has usado la calefaccion? ");
						while(!sc.hasNextDouble()) {
							System.out.println("Error! Debes introducir un numero"); 
							sc.next(); 
						}
						uso=sc.nextDouble();
						while(uso<0) {
							
							while(!sc.hasNextDouble()) {
								System.out.println("Error! Debes introducir un numero"); 
								sc.next(); 
							}System.out.println("Error! El numero debe ser positivo");
							uso=sc.nextDouble();
						}
						
						gasto=0.011*uso;
						gastoPersona = gastoPersona + gasto;
						gastoCalefaccion = gastoCalefaccion + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
				}
			}while(opcion!=7);
			System.out.println("El consumo de " + nombre + " " + apellido + " es: " + gastoPersona + " kg de CO2");
			gastoGrupo = gastoGrupo + gastoPersona;
		}
		
		System.out.println("El consumo total del grupo es: " + gastoGrupo + " kg de CO2");
		
		double gastoMayor = gastoCoche;
		String actividadMayor = "Coche";

		if(gastoAutobus > gastoMayor) {
			gastoMayor = gastoAutobus;
			actividadMayor = "Autobus";
		}

		if(gastoBicicleta > gastoMayor) {
			gastoMayor = gastoBicicleta;
			actividadMayor = "Bicicleta";
		}

		if(gastoPlancha > gastoMayor) {
			gastoMayor = gastoPlancha;
			actividadMayor = "Plancha";
		}

		if(gastoOrdenador > gastoMayor) {
			gastoMayor = gastoOrdenador;
			actividadMayor = "Ordenador";
		}

		if(gastoMovil > gastoMayor) {
			gastoMayor = gastoMovil;
			actividadMayor = "Movil";
		}

		if(gastoDucha > gastoMayor) {
			gastoMayor = gastoDucha;
			actividadMayor = "Ducha";
		}

		if(gastoCalefaccion > gastoMayor) {
			gastoMayor = gastoCalefaccion;
			actividadMayor = "Calefaccion";
		}

		System.out.println("La actividad que mas contribuye es: " + actividadMayor);
		System.out.println("El gasto de esta actividad es: " + gastoMayor + " kg de CO2");

		System.out.println("El mayor margen de mejora esta en reducir el uso de " + actividadMayor);
		
		sc.close();
	}
}
