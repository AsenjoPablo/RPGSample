import java.util.Scanner;

public class RepetirNotasArray {

	public static void main (String [] args) {
		
	Scanner in = new Scanner (System.in);
	
	int[] numeros = new int[10];
	int input, contador, num;
	
	do {
		
		System.out.println("Introduce un número de 1 a 10.");
		System.out.println("Añade un numero inferior a superior a dichos valores para finalizar la secuencia y obtener el conteo.");
		input = in.nextInt();
		
		if (input>0 && input<11) {
			numeros[input-1]++;
			// -1 because arrays start in 0
			// and grades go from 1 to 10
			// we add +1, so in that position we have 1, then 2, then 3...
			//example: we input 1, so in position [1] we will have +1
		}
		
	} while (input>0 && input<11);
			
	System.out.println();
	
	for (contador = 0; contador < numeros.length; contador++) {
		
		// array is 0, so we add +1
		num = contador + 1;
		
		System.out.println("El número " + num + " se repite " + numeros[contador] + " veces");
		
		
	}
	
	
	in.close();
	}
	
}
