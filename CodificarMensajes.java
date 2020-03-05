import java.util.Scanner;

public class CodificarMensajes {
	
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner (System.in);
		
		String mensaje = "";
		int codigoTrans;

			System.out.println("Generando un número al azar...");
			
			int numeroAlAzar = (int) (Math.random() * 8 ) + 1; 
			
			System.out.println("Resultado: " + numeroAlAzar);
			
			switch (numeroAlAzar) {
			case 1:
				System.out.println("¡Buenos días, Manhattan!");
				break;
			
			case 2:
				System.out.println("¡Buenos días, París!");
				break;
				
			case 3:
				System.out.println("¡Buenos días, Londres!");
				break;
				
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("Por favor, introduce una palabra u oración completa");
				mensaje = teclado.nextLine();
				
				for (int indice = 0; indice < mensaje.length(); indice++) {
					
					if (
								(mensaje.charAt(indice) == ' ') 
							|| ((mensaje.charAt(indice) == '.' ))
							|| ((mensaje.charAt(indice) == ';' ))
							|| ((mensaje.charAt(indice) == ',' ))
							|| ((mensaje.charAt(indice) == '¡' ))
							|| ((mensaje.charAt(indice) == '!' ))
							|| ((mensaje.charAt(indice) == '¿' ))
							|| ((mensaje.charAt(indice) == '?' ))
						)
					
					{
						System.out.print((char) mensaje.charAt(indice));
					}
					
					else 
						{
							int codigo = mensaje.charAt(indice);
							int clave = numeroAlAzar;
							codigoTrans = codigo + clave;
							int mensajeTrans = (char) codigoTrans;
								System.out.print((char) mensajeTrans );
						}
				}
				
				;
				System.out.println("");
				System.out.println("*****************");
				System.out.println("¡Secuencia codificada!" );
				
				break;
			
			}
		
	System.out.println("******************************");	
	System.out.println("¡Gracias por usar mi programa!");
	teclado.close();
	}

}
