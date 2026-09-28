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
		
		System.out.println("Bienvenido");
		System.out.println("¿Cuantas personas se van a registrar? ");
		registro=sc.nextInt();
		while(registro<0) {
			System.out.println("Error! El numero debe ser positivo");
			System.out.println("¿Cuantas personas se van a registrar? ");
			registro=sc.nextInt();
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
				System.out.println("¿Cual quieres elegir? ");
				opcion=sc.nextInt();
				while(opcion <=0 || opcion>7) {
					System.out.println("Error! No se puede elegir ese numero ");
					System.out.println("¿Cual quieres elegir? ");
					opcion=sc.nextInt();
				}
				
				switch(opcion) {
					case 1:
						System.out.println("¿Cuantos kilometros has recorrido? ");
						km=sc.nextDouble();
						gasto=0.21*km;
						gastoPersona = gastoPersona + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 2: 
						System.out.println("¿Cuantos kilometros has recorrido? ");
						km=sc.nextDouble();
						gasto=0.10*km;
						gastoPersona = gastoPersona + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 3:
						System.out.println("¿Cuantos kilometros has recorrido? ");
						km=sc.nextDouble();
						gasto=0*km;
						gastoPersona = gastoPersona + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 4:
						System.out.println("Has usado la placha: (1=si, 0=no)");
						plancha=sc.nextInt();
						while(plancha!=1 && plancha!=0) {
							System.out.println("Error! El numero debe ser 1 o 0 ");
							System.out.println("Has usado la placha: (1=si, 0=no)");
							plancha=sc.nextInt();
						}
						if(plancha == 1 || plancha == 0) {
							if(plancha == 1) {
								System.out.println("¿Cuantas horas lo has utilizado? ");
								uso=sc.nextDouble();
								gasto=0.7*uso;
								gastoPersona = gastoPersona + gasto;
								System.out.println("El consumo de CO2 es: "+ gasto);
							}
						}
						
						
						break;
					case 5: 
						System.out.println("¿Cuantas horas has utilizado el ordendor? ");
						uso=sc.nextDouble();
						gasto=0.08*uso;
						gastoPersona = gastoPersona + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 6:
						System.out.println("¿Cuantas horas has utilizado el ordendor? ");
						uso=sc.nextDouble();
						gasto=0.02*uso;
						gastoPersona = gastoPersona + gasto;
						System.out.println("El consumo de CO2 es: " + gasto);
						break;
					case 7:
						 
						 break;							
				}
			}while(opcion!=7);
			System.out.println("El consumo de " + nombre + " " + apellido + " es: " + gastoPersona + " kg de CO2");
			gastoGrupo = gastoGrupo + gastoPersona;
		}
		
		System.out.println("El consumo total del grupo es: " + gastoGrupo + " kg de CO2");
		
		
		sc.close();
	}
}
