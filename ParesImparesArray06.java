public class ParesImparesArray {

	
	public static void main (String[] args) {
	
		esPar(generarArray());
			
		
		
	}
	
	private static int[] generarArray() {
		
		int[] array = new int [20];
				
			for (int i = 0; i<array.length; i++) {
				
				array[i] = (int) (Math.random() * 100) + 1 ; //numbers 1 to 100
		
				}
			System.out.println("Array generado: ");
			
			for (int i = 0; i<array.length; i++) {
				
				System.out.print(array[i] + " ");
				
			}
			
			System.out.println("\n");
			
			return array;
	}
	
	//even if called array, it's not related to previous when unless inserted
	private static void esPar ( int [] array) {
		
		int numPar = 0;
		int numImpar = 0;
		
		//even and odd number count below
		//so we can know the size of  both arrays
		for (int i = 0; i<array.length; i++) {
			
			if (array[i] % 2 == 0) {
				numPar += 1;
			} else {
				numImpar += 1;
			}
			
		}
		
		int arrayPares[] = new int [numPar];
		int arrayImpares[] = new int [numImpar];
		
		
		//three counters, one per array
		int i = 0, ii = 0, iii = 0;
		
		while (i<array.length) {
			
			if (array[i] % 2 == 0) {
				arrayPares[ii] = array [ i];
				ii++;
			}
			else
			{
				arrayImpares[iii] = array[i];
				iii++;
			}
			i++;
			
		}
		
		//both arrays have been created, so:
		for (i=0; i<arrayPares.length; i++) {
			System.out.print(arrayPares[i] + " ");
		}
		System.out.println("\n");
		
		for (i=0; i<arrayImpares.length; i++) {
			System.out.print(arrayImpares[i] + " ");
		}
		System.out.println("\n");
		
		
		
	}
	
	
}
	

