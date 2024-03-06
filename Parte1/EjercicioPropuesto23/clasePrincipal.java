package EjercicioPropuesto23;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese el valor de A: ");
		EcuacionSegundoGrado.A = sc.nextDouble();
		System.out.println("Ingrese el valor de B: ");
		EcuacionSegundoGrado.B = sc.nextDouble();
		System.out.println("Ingrese el valor de C: ");
		EcuacionSegundoGrado.C = sc.nextDouble();
		EcuacionSegundoGrado.PosiblesSoluciones();
	}

}
