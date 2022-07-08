import java.util.Scanner;

public class UD06_01_App {

	public static void main(String[] args) {
		
//		1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
//		que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
//		para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá
//		un número real. Muestra el resultado por pantalla.
//
//		Aquí te mostramos que necesita cada figura:
//		· Circulo: (radio^2)*PI
//		· Triangulo: (base * altura) / 2
//		· Cuadrado: lado * lado
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Introduce el nombre de la figura la cual quieres calcular el area (Circulo, Triangulo, Cuadrado): ");
		String respuesta = sc.nextLine();
		
		switch (respuesta.toLowerCase()) {
		case "circulo":
			calcularAreaCirculo(sc);
			break;
		case "triangulo":
			calcularAreaTriangulo(sc);
			break;
		case "cuadrado":
			calcularAreaCuadrado(sc);
			break;
		default:
			System.out.println("No has introducido un nombre correcto.");
			break;
		}
		
		sc.close();

	}
	
//	Método calcular área circulo
	public static void calcularAreaCirculo(Scanner sc) {
		
		System.out.print("Introduce el radio del circulo: ");
		String radioStr = sc.nextLine();
		
		float radio = Float.parseFloat(radioStr);
		
		System.out.println("Area circulo: " + (Math.pow(radio, 2)*Math.PI));
	}
	
//	Método calcular área triangulo
	public static void calcularAreaTriangulo(Scanner sc) {
			
		System.out.print("Introduce la base del triangulo: ");
		String baseStr = sc.nextLine();
		System.out.print("Introduce la altura del triangulo: ");
		String alturaStr = sc.nextLine();
		
		float base = Float.parseFloat(baseStr);
		float altura = Float.parseFloat(alturaStr);

		System.out.println("Area triangulo: " + ((base * altura)/2));
	}
	
//	Método calcular área cuadrado
	public static void calcularAreaCuadrado(Scanner sc) {
		
		System.out.print("Introduce un lado del cuadrado: ");
		String lado1Str = sc.nextLine();
		System.out.print("Introduce el otro lado del triangulo: ");
		String lado2Str = sc.nextLine();
		
		float lado1 = Float.parseFloat(lado1Str);
		float lado2 = Float.parseFloat(lado2Str);

		System.out.println("Area cuadrado: " + (lado1 * lado2));
	}

}
