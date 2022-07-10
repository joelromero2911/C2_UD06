import java.util.Scanner;

public class UD06_10_App {

	public static void main(String[] args) {
		
//		10) Crea un array de números de un tamaño pasado por teclado, el array contendrá
//		números aleatorios primos entre los números deseados, por último nos indicará cual es el
//		mayor de todos.
//	
//		Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
//		métodos que necesites.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de numeros que quieres que contenga el array: ");
		int cantidad = sc.nextInt();
		System.out.print("Dime el numero mas pequeño: ");
		int min = sc.nextInt();
		System.out.print("Dime el numero mas grande: ");
		int max = sc.nextInt();
		
		sc.close();
		
		rellenarArray(cantidad, min, max);

	}
	
	public static void rellenarArray(int cantidad, int min, int max) {
		
		int arrayNum[] = new int [cantidad];
		int mayor = 0;
		
		for (int i = 0; i < arrayNum.length; i++) {
			
			while (true) {
				arrayNum[i] = (int) (Math.random() * (max - min)) + min;
				if (esPrimo(arrayNum[i])) {
					break;
				}else {
					arrayNum[i] = (int) (Math.random() * (max - min)) + min;
				}
			}
			
			mayor = ((arrayNum[i] > mayor) ? arrayNum[i] : mayor);
			
			System.out.println("Array de numeros [" + i + "] = " + arrayNum[i]);
		}
		
		System.out.println("El mayor numero es: " + mayor);
	}
	
	public static boolean esPrimo(int num) {
		
		for(int cont = 2; cont < num; cont++) {
	        if(num%cont == 0)
	            return false;
	    }
	    return true;
	}

}
