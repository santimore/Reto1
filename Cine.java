package dami;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int clientes, adulto, infantil, cont = 1, total;
		int mejorcliente = 0, masentradas = 0, totalentradas = 0, totaladulto = 0, totalinfantil = 0;
		double precio = 0, preciodescuento = 0, totaldinero = 0;

		System.out.println("¿Cuantos clientes vas a registrar?");
		clientes = teclado.nextInt();
		while (clientes < 1) {
			System.out.println("No puedes registrar clientes negativos,vuelve a intentarlo.");
			System.out.println("¿Cuantos clientes vas a registrar?");
			clientes = teclado.nextInt();
		}
		while (cont <= clientes) {
			System.out.println("Hola cliente numero " + cont);
			System.out.println("¿Cuantas entradas de adulto quieres comprar?");
			adulto = teclado.nextInt();
			while (adulto < 0) {
				System.out.println("No puedes comprar entradas negativas,vuelve a intentarlo");
				System.out.println("¿Cuantas entradas de adulto quieres comprar?");
				adulto = teclado.nextInt();
			}
			totaladulto = totaladulto + adulto;
			System.out.println("¿Cuantas entradas infantiles quieres comprar?");
			infantil = teclado.nextInt();
			while (infantil < 0) {
				System.out.println("No puedes comprar entradas negativas,vuelve a intentarlo");
				System.out.println("¿Cuantas entradas infantiles quieres comprar?");
				infantil = teclado.nextInt();
			}
			totalinfantil = totalinfantil + infantil;
			System.out.println("Numero de entradas de adulto compradas: " + adulto);
			System.out.println("Numero de entradas infantiles compradas: " + infantil);
			total = adulto + infantil;
			totalentradas = totalentradas + total;
			System.out.println("Numero total de entradas compradas: " + total);

			if (total > 5) {
				preciodescuento = (adulto * 9 + infantil * 6) * 0.9;
				System.out.println("Al haber comprado mas de 5 entradas tienes un 10% de descuento. El precio final es: "+ preciodescuento);
				totaldinero = totaldinero + preciodescuento;
			} else {
				precio = (adulto * 9 + infantil * 6);
				System.out.println("El precio final es: " + precio);
				totaldinero = totaldinero + precio;

			}
			System.out.println("*****************************************************");
			if (total > masentradas) {
				masentradas = total;
				mejorcliente = cont;
			}
			cont++;
		}
		System.out.println("**********************************************");
		System.out.println("El dinero total recaudado es: " + totaldinero);
		System.out.println("El numero total de entradas de adulto es: " + totaladulto);
		System.out.println("El numero total de entradas infantiles es: " + totalinfantil);
		System.out.println("El cliente que compro mas entradas es el cliente numero " + mejorcliente + " y compró "+ masentradas + " entradas");
		teclado.close();
	}

}
