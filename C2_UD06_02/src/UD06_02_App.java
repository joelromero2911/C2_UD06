import java.util.Scanner;

public class UD06_02_App {

	public static void main(String[] args) {
		
//		2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
//		nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
//		que números queremos que los genere, podemos pedirlas por teclado antes de generar los
//		números. Este método devolverá un número entero aleatorio. Muestra estos números por
//		pantalla.

//		Variables
		Scanner sc = new Scanner(System.in);
		int randomNum;
		
//		Programa
		System.out.print("Cuantos numeros quieres generar: ");
		int numTotal = Integer.parseInt(sc.nextLine());
		System.out.print("De que numero a que numero?\nMinimo: ");
		int min = Integer.parseInt(sc.nextLine());
		System.out.print("Maximo: ");
		int max = Integer.parseInt(sc.nextLine());
		
		for(int cont = 0; cont < numTotal; cont++) {
			System.out.println(randomNum = getRandomNum(min, max));
		}

	}
	
//	Metodo calcular un numero aleatorio entre un rango especificado
	public static int getRandomNum(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

}
