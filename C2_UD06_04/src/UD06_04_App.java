import java.util.Scanner;

public class UD06_04_App {

	public static void main(String[] args) {
		
//		4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
//		realizara mediante un método al que le pasamos el número como parámetro. Para calcular
//		el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si
//		introducimos un 5, realizara esta operación 5*4*3*2*1=120:
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime que numero quieres calcular el factorial: ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		calcularFactorial(num);

	}
	
//	Método calcular factorial del número introducido por parametro
	public static void calcularFactorial(int num) {
		
		int fact = 1;
		
		while (num != 0) {
			fact *= num--;
		}
		
		System.out.println("El factorial de numero introducido es: " + fact);
	}

}
