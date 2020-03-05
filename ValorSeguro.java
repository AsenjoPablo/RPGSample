package finalJava;
import java.util.Scanner;

public class ValorSeguro {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int opcionElegida;
		
		do {
			
		System.out.println("Escoja una de las siguientes opciones: ");
		System.out.println("Opción 1: calcular mi seguro.");
		System.out.println("Opción 2: salir del programa.");
		opcionElegida = in.nextInt();
		
		} while ((opcionElegida != 1) & (opcionElegida != 2));
		
		if (opcionElegida == 1) {
		Conductor();
		} else if (opcionElegida == 2) {
			SalirPrograma();
		}
		
		
		in.close();
	}
	
	//************************************************************************


	static void Conductor()  {
		
		Scanner in = new Scanner (System.in);
		
		int edad, tiempo, respuestaSexo;
		boolean esHombre = false;
		
		//************************************************************************
	
		
		System.out.println("Por favor, indique su edad.");
		edad = in.nextInt();
	
		do {
			System.out.println("Ahora, indique '1' si es hombre, o '2' si es mujer.");
			respuestaSexo = in.nextInt();
			
			if (respuestaSexo == 1) {
				esHombre = true;
			} else if (respuestaSexo == 2) {
				esHombre = false;
			}
			
			
		} while ((respuestaSexo !=1) & (respuestaSexo !=2));
		
		System.out.println("¿Cuánto lleva sin dar un parte de accidente? (años)");
		tiempo = in.nextInt();

		String tipo;
		int tarifa, tarifaFinal;
		int descuento, descuentoEuros;
		
		do {
			System.out.println("¿Qué tipo de coche tiene usted? Inserte la letra correspondiente.");
			System.out.println("Un coche grande (g)");
			System.out.println("Un coche mediano (m)");
			System.out.println("Un coche pequeño (p)");
			tipo = in.next(); 
		} while ((!tipo.contentEquals("g")) & (!tipo.contentEquals("m")) & (!tipo.contentEquals("p")));
		
		
		//Realización de cálculos
		
		switch (tipo) {
		
		case "g":
			
			tarifa = 500;
			
			if ((edad >= 27) & (esHombre == false) & (tiempo >= 1)) {
				descuento = 25;
			} else if
				((edad >= 27) & (esHombre == true) & (tiempo >= 2)) {
					descuento = 20;
				} else if 
					((edad <= 26) & (esHombre == true) & (tiempo >= 5)) {
						descuento = 10;
				} else {
					descuento = 5;
				}
			
			descuentoEuros= (tarifa * descuento) / 100;
			tarifaFinal = tarifa - descuentoEuros;
			
			System.out.println("************************");
			System.out.println("Su tarifa es de: " + tarifa + ". Su descuento es de: " 
			+ descuento + "%. El precio final de su tarifa es de: " + tarifaFinal);
			
			break;
			
		case "m":
			
			tarifa = 400;
			
			if ((edad >= 27) & (esHombre == false) & (tiempo >= 1)) {
				descuento = 25;
			} else if
				((edad >= 27) & (esHombre == true) & (tiempo >= 2)) {
					descuento = 20;
				} else if 
					((edad <= 26) & (esHombre == true) & (tiempo >= 5)) {
						descuento = 10;
				} else {
					descuento = 5;
				}
			
			descuentoEuros= (tarifa * descuento) / 100;
			tarifaFinal = tarifa - descuentoEuros;
			
			System.out.println("************************");
			System.out.println("Su tarifa es de: " + tarifa + ". Su descuento es de: " 
			+ descuento + "%. El precio final de su tarifa es de: " + tarifaFinal);
		
			break;
			
		case "p":
			
			tarifa = 300;
			
			if ((edad >= 27) & (esHombre == false) & (tiempo >= 1)) {
				descuento = 25;
			} else if
				((edad >= 27) & (esHombre == true) & (tiempo >= 2)) {
					descuento = 20;
				} else if 
					((edad <= 26) & (esHombre == true) & (tiempo >= 5)) {
						descuento = 10;
				} else {
					descuento = 5;
				}
			
			descuentoEuros= (tarifa * descuento) / 100;
			tarifaFinal = tarifa - descuentoEuros;
			
			System.out.println("************************");
			System.out.println("Su tarifa es de: " + tarifa + ". Su descuento es de: " + descuento + "%. El precio final de su tarifa es de: " + tarifaFinal + ".");
			
			break;
		}
		
		//*Retorna al inicio del programa con ligera variación
	
		
		int opcionElegida;
		
		do {
			
			System.out.println("************************");
			System.out.println("¿Qué desea hacer ahora?");
			System.out.println("Opción 1: calcular otro seguro.");
			System.out.println("Opción 2: salir del programa.");
			System.out.println("************************");
			opcionElegida = in.nextInt();
		
		} while ((opcionElegida != 1) & (opcionElegida != 2));
		
		if (opcionElegida == 1) {
			Conductor();
		} else if (opcionElegida == 2) {
			SalirPrograma();
		}
	
		
		//************************************************************************
	
		
		in.close();
	
	}
	
	//************************************************************************
	
		
	static void SalirPrograma() {
		System.out.println("************************");
		System.out.println("Saliendo del programa...");
		System.out.println("Éxito.");
	}
	
	
	}
