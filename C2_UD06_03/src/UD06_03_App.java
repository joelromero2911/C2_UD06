import java.util.Scanner;

public class UD06_03_App {

	public static void main(String[] args) {
		
//		3) Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
//		por parámetro para que nos indique si es o no un número primo, debe devolver true si es
//		primo sino false.
//		Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo 25 no es
//		primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Dime que numero quieres saber si es primo: ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		if(numEsPrimo(num)) {
			System.out.println("El numero " + num + " es primo.");
		}else {
			System.out.println("El numero " + num + " NO es primo.");
		}
		
	}
	
//	Método para saber si un número pasado por parámetro es primo o no.
	public static boolean numEsPrimo(int num) {
		
	    for(int cont = 2; cont < num; cont++) {
	        if(num%cont == 0)
	            return false;
	    }
	    return true;
	}

}
