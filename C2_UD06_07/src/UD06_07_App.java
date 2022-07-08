import java.util.Scanner;

public class UD06_07_App {

	public static void main(String[] args) {
		
//		7) Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
//		moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
//		cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
//		mostrara un mensaje indicando el cambio (void).
//	
//		El cambio de divisas son:
//		· 0.86 libras es un 1€
//		· 1.28611$ es un 1€
//		· 129.852 yenes es un 1€
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime la cantidad de euros: ");
		float euros = sc.nextInt();
		System.out.print("Dime la moneda a la que lo quieres convertir (dolares, yenes o libras): ");
		String moneda = sc.next();
		sc.close();
		
		convertirEuros(euros, moneda);

	}
	
//	Método para convertir una catidad introducida en euros a una de las 3 monedas disponibles introducida por parámetro.
	public static void convertirEuros(float euros, String moneda) {
		
		switch (moneda) {
		case "dolares":
			System.out.println(euros + " euros son " + euros*1.28611 + " dolares.");
			break;
		case "yenes":
			System.out.println(euros + " euros son " + euros*129.852 + " yenes.");
			break;
		case "libras":
			System.out.println(euros + " euros son " + euros*0.86 + " libras.");
			break;

		default:
			System.out.println("No has introducido una moneda correcta.");
			break;
		}
	}

}
