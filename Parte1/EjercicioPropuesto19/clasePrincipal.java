package EjercicioPropuesto19;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese el lado del triángulo: ");
		double lado = sc.nextDouble();
		
		TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);
		double perimetro = triangulo.calcularPerimetro();
		double area = triangulo.calcularArea();
		double altura = triangulo.calcularAltura(area);
		
		System.out.println("El perímetro del triángulo es: " + perimetro);
		System.out.println("La altura del triángulo es: " + altura);
		System.out.println("El área del triángulo es: " + area);
	}

}
