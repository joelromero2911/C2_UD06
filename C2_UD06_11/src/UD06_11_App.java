import java.util.Arrays;
import java.util.Scanner;

public class UD06_11_App {

	public static void main(String[] args) {
		
//		11) Crea dos arrays de números con la dimensión pasada por teclado.
//		Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
//		reasigna los valores del segundo array con valores aleatorios.
//	
//		Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
//		con la multiplicación de la posición O del array1 con el del array2 y así sucesivamente.
//	
//		Por último, muestra el contenido de cada array.

//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de numeros que quieres que contengan los arrays: ");
		int longitud = sc.nextInt();
		sc.close();
		
//		Primera parte del enunciado.
		int[] array1 = rellenarArrayRandom(longitud);
		int[] array2 = array1;
		
		System.out.println("\n1a parte\narray1 = " + Arrays.toString(array1) + "\narray2 = " + Arrays.toString(array2));
		
//		Reasignando los valores del segundo array con números aleatorios.
		array2 = rellenarArrayRandom(longitud);
		System.out.println("\n2a parte (array2 contenido reasignado)\narray1 = " + Arrays.toString(array1) + "\narray2 = " + Arrays.toString(array2));
		
//		Creando array con el contenido de multiplicar de array1 con el de array2.
		int[] arrayMultiplicado = multiplicarIndicesArr(array1, array2);
		System.out.println("\nMostrando el contenido de cada array\narray1 = " + Arrays.toString(array1) + "\narray2 = " + Arrays.toString(array2) + "\narrayMultiplicado = " + Arrays.toString(arrayMultiplicado));
	}
	
//	Método que devuelve un array con numeros aleatorios tan largo como se haya especificado.
	public static int[] rellenarArrayRandom(int longitud) {
		
		int arr[] = new int [longitud];
		
		for (int i = 0; i < longitud; i++) {
			arr[i] = (int) (Math.random() * (99 - 0)) + 0;
		}
		
		return arr;
	}
	
//	Multiplica la posición 0 del primer array con la del segundo y así sucesivamente. Devuelve un array con los resultados.
	public static int[] multiplicarIndicesArr(int[] array1, int[] array2) {
		
		int arr[] = new int [array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			arr[i] = array1[i] * array2[i];
		}
		
		return arr;
	}

}
