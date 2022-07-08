import java.util.Scanner;

public class UD06_05_App {

	public static void main(String[] args) {
		
//		5) Crea una aplicación que nos convierta un número en base decimal a binario. Esto lo
//		realizara un método al que le pasaremos el numero como parámetro, devolverá un String
//		con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
//		dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que
//		no se pueda dividir mas, el resto que obtengamos de cada división formara el numero
//		binario, de abajo a arriba.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime que numero quieres calcular el binario: ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		String numBinario = calcularBinario(num);
		System.out.println("El numero " + num + " en binario es " + numBinario);
	}
	
//	Método calcular binario del numero introducido por parametro y devolverlo en string.
	public static String calcularBinario(int num) {
		return Integer.toBinaryString(num);
	}

}
