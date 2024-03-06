package EjercicioPropuesto21;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese el primer lado del triángulo: ");
		double lado1 = sc.nextDouble();
		System.out.println("Ingrese el segundo lado del triángulo: ");
		double lado2 = sc.nextDouble();
		System.out.println("Ingrese el tercer lado del triángulo: ");
		double lado3 = sc.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		double perimetro = triangulo.calcularPerimetro();
		double semip = triangulo.calcularSemiperimetro();
		double area = triangulo.calcularArea();
		
		System.out.println("El perímetro del triángulo es: " + perimetro);
		System.out.println("El semiperímetro del triángulo es: " + semip);
		System.out.println("El área del triángulo es: " + area);
	}

}
