package EjercicioPropuesto18;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		CalculadoraSalario CS = new CalculadoraSalario();
		System.out.println("Ingrese el código: ");
		CalculadoraSalario.codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el nombre: ");
		CalculadoraSalario.nombre = sc.nextLine();
		System.out.println("Ingrese las horas trabajadas en el mes: ");
		CalculadoraSalario.horas = sc.nextDouble();
		System.out.println("Ingrese el valor de la hora: ");
		CalculadoraSalario.valor_hora = sc.nextDouble();
		System.out.println("Porcentaje de retención en la fuente: ");
		CalculadoraSalario.retencion = sc.nextDouble();
		double salario_bruto = CS.calcularSalarioBruto();
		double salario_neto = CS.calcularSalarioNeto(salario_bruto);
		System.out.println("Código: " + CalculadoraSalario.codigo);
		System.out.println("Nombre: " + CalculadoraSalario.nombre);
		System.out.println("Salario bruto: " + salario_bruto);
		System.out.println("Salario neto: " + salario_neto);
	}

}
