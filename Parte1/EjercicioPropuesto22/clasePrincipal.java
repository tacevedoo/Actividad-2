package EjercicioPropuesto22;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese su nombre: ");
		EvaluarSalario.nombre = sc.nextLine();
		System.out.println("Ingrese su salario por horas: ");
		EvaluarSalario.sal_hora = sc.nextDouble();
		System.out.println("Ingrese el número de horas trabajadas en el mes: ");
		EvaluarSalario.num_horas = sc.nextDouble();
		EvaluarSalario.SalarioMensual();
	}

}
