import java.util.Scanner;

public class UD06_09_App {

	public static void main(String[] args) {
		
//		9) Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de numeros que quieres que contenga el array: ");
		int cantidad = sc.nextInt();
		
		sc.close();
		
		rellenarSumarMostrar(cantidad);

	}
	
//	Crea un array tan grande como se le indique por parametro, lo rellena con números aleatorios entre 0 y 9,
//	muestra las posiciones del array con sus valores por pantalla, hace la suma de total de todos los números y
//	la muestra por pantalla.
	public static void rellenarSumarMostrar(int cantidad) {
		
		int arrayNum[] = new int [cantidad];
		int suma = 0;
		
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = (int) (Math.random() * (9 - 0)) + 0;
			suma += arrayNum[i];
			System.out.println("Array de numeros [" + i + "] = " + arrayNum[i]);
		}
		
		System.out.println("Suma de todos los numeros: " + suma);

	}

}
