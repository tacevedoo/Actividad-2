package EjercicioResuelto15;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese el peso de la esfera A: ");
		Esferas.peso_esf1 = sc.nextDouble();
		System.out.println("Ingrese el peso de la esfera B: ");
		Esferas.peso_esf2 = sc.nextDouble();
		System.out.println("Ingrese el peso de la esfera C: ");
		Esferas.peso_esf3 = sc.nextDouble();
		System.out.println("Ingrese el peso de la esfera D: ");
		Esferas.peso_esf4 = sc.nextDouble();
		Esferas.CompararEsferas();
	}
}
