import java.util.Scanner;

public class UD06_08_App {

	public static void main(String[] args) {
		
//		8) Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
//		consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
//		otro para mostrar.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		int arrayNum[] = new int [10];
		
//		Programa
		arrayNum = pedirNumeros(sc);
		mostrarNumero(arrayNum);
		
		sc.close();

	}
	
//	Método que pide números al usuario hasta rellenar las 10 posiciones del array.
	public static int[] pedirNumeros(Scanner sc) {
		
		int arrayNumeros[] = new int [10];
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.print("Dime un numero: ");
			arrayNumeros[cont] = sc.nextInt();
		}
		return arrayNumeros;
	}
	
//	Muestra las posiciones del array y su valor.
	public static void mostrarNumero(int arrayNumeros[]) {
		
		for (int cont = 0; cont < arrayNumeros.length; cont++) {
			System.out.println("Array de numeros [" + cont + "] = " + arrayNumeros[cont]);
		}
	}

}
