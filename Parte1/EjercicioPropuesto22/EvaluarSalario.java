package EjercicioPropuesto22;
public class EvaluarSalario {
	public static String nombre;
	public static double sal_hora;
	public static double num_horas;
	
	public static void SalarioMensual() {
		System.out.println("El nombre del empleado es: " + nombre);
		double salario_mensual = sal_hora * num_horas;
		if(salario_mensual > 450000) {
			System.out.println("Salario mensual: " + (int)salario_mensual);
		}
	}
}
