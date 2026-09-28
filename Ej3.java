
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diaActual;
		int mesActual;
		int anioActual;
		String registro;
		int numID;
		int diaRevision;
		int mesRevision;
		int anioRevision;
		int contRe = 0;
		int contNoRe = 0;

		System.out.println("Introduce el año actual: ");
		anioActual = sc.nextInt();
		while (anioActual < 2026) {
			System.out.println("Error! Introduce el año actual: ");
			anioActual = sc.nextInt();
		}
		System.out.println("Introduce el mes actual: ");
		mesActual = sc.nextInt();
		while (mesActual < 1 || mesActual > 12) {
			System.out.println("Error! Introduce el mes actual");
			mesActual = sc.nextInt();
		}

		System.out.println("Introduce el dia actual: ");
		diaActual = sc.nextInt();

		if (mesActual == 2) {
			if (anioActual % 4 == 0) {
				while (diaActual <= 0 || diaActual > 29) {
					System.out.println("Error! Introduzca un dia valido:");
					diaActual = sc.nextInt();
				}
			}else {
				while (diaActual <= 0 || diaActual > 28) {
					System.out.println("Error! Introduzca un dia valido: ");
					diaActual = sc.nextInt();
				}
			}

		} else if (mesActual == 4 || mesActual == 6 || mesActual == 9 || mesActual == 11) {
			while (diaActual <= 0 || diaActual > 30) {
				System.out.println("Error! Introduzca un dia valido:");
				diaActual = sc.nextInt();
			}
		} else {
			while (diaActual <= 0 || diaActual > 31) {
				System.out.println("Error! Introduzca un dia valido:");
				diaActual = sc.nextInt();
			}
		}

		do {
			System.out.println("Quieres registrar otra bicicelta? Conteste S o N");
			registro = sc.next();
			while (!registro.equalsIgnoreCase("S") && !registro.equalsIgnoreCase("N")) {
				System.out.println("Error! La respuesta debe ser S o N");
				registro = sc.next();
			}

				if (registro.equalsIgnoreCase("S")) {
					System.out.println("Introduce el numero de identificacion de la bicicleta: ");
					numID = sc.nextInt();

					System.out.println("Introduce el ultimo año de la revision: ");
					anioRevision = sc.nextInt();
					while (anioRevision <= 0 || anioRevision > anioActual) {
						System.out.println("Error! Introduce el año de la revision:");
						anioRevision = sc.nextInt();
					}
					System.out.println("Introduce el ultimo mes de la revision: ");
					mesRevision = sc.nextInt();
					while (mesRevision < 1 || mesRevision > 12) {
						System.out.println("Error! Introduce el mes de la revision: ");
						mesRevision = sc.nextInt();
					}

					System.out.println("Introduce el ultimo dia de la revision: ");
					diaRevision = sc.nextInt();
					if (mesRevision == 2) {
						if (anioRevision % 4 == 0) {
							while (diaRevision <= 0 || diaRevision > 29) {
								System.out.println("Error! Introduzca un dia valido:");
								diaRevision = sc.nextInt();
							}
						}else {
							while (diaRevision <= 0 || diaRevision > 28) {
								System.out.println("Error! Introduzca un dia valido: ");
								diaRevision = sc.nextInt();
							}
						}
					} else if (mesRevision == 4 || mesRevision == 6 || mesRevision == 9 || mesRevision == 11) {
						while (diaRevision <= 0 || diaRevision > 30) {
							System.out.println("Error! Introduzca un dia valido:");
							diaRevision = sc.nextInt();
						}
					} else {
						while (diaRevision <= 0 || diaRevision > 31) {
							System.out.println("Error! Introduzca un dia valido:");
							diaRevision = sc.nextInt();
						}
					}

					while (anioRevision > anioActual || (anioRevision == anioActual && mesRevision > mesActual)
							|| (anioRevision == anioActual && mesRevision == mesActual && diaRevision > diaActual)) {

						System.out.println("Error! La fecha de revision no puede ser posterior a la fecha actual.");

						 System.out.println("Introduce el ultimo año de la revision: ");
						    anioRevision = sc.nextInt();

						    while (anioRevision <= 0 || anioRevision > anioActual) {
						        System.out.println("Error! Introduce un año valido: ");
						        anioRevision = sc.nextInt();
						    }

						    System.out.println("Introduce el ultimo mes de la revision: ");
						    mesRevision = sc.nextInt();

						    while (mesRevision < 1 || mesRevision > 12) {
						        System.out.println("Error! Introduce un mes valido: ");
						        mesRevision = sc.nextInt();
						    }

						    System.out.println("Introduce el ultimo dia de la revision: ");
						    diaRevision = sc.nextInt();

						    if (mesRevision == 2) {
								if (anioRevision % 4 == 0) {
									while (diaRevision <= 0 || diaRevision > 29) {
										System.out.println("Error! Introduzca un dia valido:");
										diaRevision = sc.nextInt();
									}
								}else {
									while (diaRevision <= 0 || diaRevision > 28) {
										System.out.println("Error! Introduzca un dia valido: ");
										diaRevision = sc.nextInt();
									}
								}
							} else if (mesRevision == 4 || mesRevision == 6 || mesRevision == 9 || mesRevision == 11) {
								while (diaRevision <= 0 || diaRevision > 30) {
									System.out.println("Error! Introduzca un dia valido:");
									diaRevision = sc.nextInt();
								}
							} else {
								while (diaRevision <= 0 || diaRevision > 31) {
									System.out.println("Error! Introduzca un dia valido:");
									diaRevision = sc.nextInt();
								}
							}
					}

					if (anioActual - anioRevision > 1) {
						System.out.println("Esta bicicleta necesita revision");
						contRe++;
					} else if (anioActual - anioRevision == 1) {
						if (mesActual > mesRevision) {
							System.out.println("Esta bicicleta necesita revision");
							contRe++;
						} else if (mesActual == mesRevision && diaActual > diaRevision) {
							System.out.println("Esta bicicleta necesita revision");
							contRe++;
						} else {
							System.out.println("Esta bicicleta no necesita revision");
							contNoRe++;
						}
					} else {
						System.out.println("Esta bicicleta no necesita revision");
						contNoRe++;
					}
				}

			

		} while (registro.equalsIgnoreCase("s"));

		System.out.println("Bicicletas que necesitan revision: " + contRe);
		System.out.println("Bicicletas que no necesitan revision: " + contNoRe);

		sc.close();

	}
}
