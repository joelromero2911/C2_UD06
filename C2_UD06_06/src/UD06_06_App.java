import java.util.Scanner;

public class UD06_06_App {

	public static void main(String[] args) {
		
//		6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo
//		(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
//		el número por parámetro, devolverá el número de cifras.

//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime un numero positivo: ");
		int num = sc.nextInt();
		sc.close();
		
		if (num > 0) {
			int numCifras = calcularNumCifras(num);
			System.out.println("El numero " + num + " tiene " + numCifras + " cifras.");
		}else {
			System.out.println("Ha de ser positivo!");
		}
		

	}
	
//	Método para calcular número de cifras de un número introducido por parámetro.
	public static int calcularNumCifras(int num) {
		
		int cifras = 0;
		
		while(num != 0){
			num = num / 10;
			cifras++;
		}
		return cifras;
	}

}
