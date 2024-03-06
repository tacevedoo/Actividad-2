package EjercicioResuelto14;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese las ventas del depto 1:");
		Salarios.ventas_dep1 = sc.nextDouble();
		System.out.println("Ingrese las ventas del depto 2:");
		Salarios.ventas_dep2 = sc.nextDouble();
		System.out.println("Ingrese las ventas del depto 3:");
		Salarios.ventas_dep3 = sc.nextDouble();
		System.out.println("Ingrese el salario que reciben los vendedores:");
		Salarios.salario = sc.nextDouble();

		double total_ventas = Salarios.ventas_dep1 + Salarios.ventas_dep2 + Salarios.ventas_dep3;
		double porven = 0.33 * total_ventas;
		
		String texto = Salarios.SalarioVendedores(porven);
		System.out.println(texto);
	}

}
