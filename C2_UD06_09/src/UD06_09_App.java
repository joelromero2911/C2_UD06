import java.util.Scanner;

public class UD06_09_App {

	public static void main(String[] args) {
		
//		9) Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.
		
//		Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
//		números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
//		array.

		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de numeros que quieres que contenga el array: ");
		int cantidad = sc.nextInt();
		
		sc.close();
		
		int arrayNum[] = new int [cantidad];
		arrayNum = rellenarArray(cantidad);
		sumarMostrar(arrayNum);

	}
	
	public static int[] rellenarArray(int cantidad) {
		
		int arrayNum[] = new int [cantidad];
		
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = (int) (Math.random() * (9 - 0)) + 0;
		}
		
		return arrayNum;
	}
	
	public static void sumarMostrar(int[] arrayNum) {
		
		int suma = 0;
		
		for (int i = 0; i < arrayNum.length; i++) {
			suma += arrayNum[i];
			System.out.println("Array de numeros [" + i + "] = " + arrayNum[i]);
		}
		
		System.out.println("Suma de todos los numeros: " + suma);
	}

}
