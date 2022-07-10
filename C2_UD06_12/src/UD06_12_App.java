import java.util.Arrays;
import java.util.Scanner;

public class UD06_12_App {

	public static void main(String[] args) {
		
//		12) Crea un array de números de un tamaño pasado por teclado, el array contendrá
//		números aleatorios entre 1 y 300 y mostrará aquellos números que acaben en un dígito que
//		nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
//		estos deben guardarse en un nuevo array.
//	
//		Por ejemplo, en un array de 10 posiciones le indicamos mostrar los números acabados en 5,
//		podría salir 155, 25, etc.

//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de numeros que quieres que contenga el array: ");
		int longitud = sc.nextInt();
		
		int[] arrayNumAleatorios = rellenarArrayRandom(longitud);
		
		System.out.print("Dime el ultimo dígito de los números que quieres guardar: ");
		int digito = sc.nextInt();
		while(digito > 9 || digito < 0) {
			System.out.print("Dime el ultimo dígito de los números que quieres guardar (0-9): ");
			digito = sc.nextInt();
		}
		sc.close();
		
		int arrayGuardados[] = guardarNumTerminadosEn(arrayNumAleatorios, digito);
		
		System.out.println("\nArray con todos los numeros:\n" + Arrays.toString(arrayNumAleatorios));
		System.out.println("\nArray con numeros terminados en " + digito + ":\n" + Arrays.toString(arrayGuardados));
	}
	
//	Método que devuelve un array con numeros aleatorios tan largo como se haya especificado.
	public static int[] rellenarArrayRandom(int longitud) {
		
		int arr[] = new int [longitud];
		
		for (int i = 0; i < longitud; i++) {
			arr[i] = (int) (Math.random() * (300 - 1)) + 1;
		}
		
		return arr;
	}
	
	public static int[] guardarNumTerminadosEn(int[] arrayNumAleatorios, int digito) {
		
		int cont = 0;
		
		for (int i = 0; i < arrayNumAleatorios.length; i++) {
			if(Math.abs(arrayNumAleatorios[i]) % 10 == digito) {
				cont++;
			}
		}
		
		int arrayGuardados[] = new int [cont];
		cont = 0;
		
		for (int i = 0; i < arrayNumAleatorios.length; i++) {
			if(Math.abs(arrayNumAleatorios[i]) % 10 == digito) {
				arrayGuardados[cont] = arrayNumAleatorios[i];
				cont++;
			}
		}
		
		return arrayGuardados;
	}

}
