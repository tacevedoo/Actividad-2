package EjercicioResuelto14;
public class Salarios {
	public static double ventas_dep1;
	public static double ventas_dep2;
	public static double ventas_dep3;
	public static double salario;
	
	
	public static String SalarioVendedores(double porven) {
		double salario1, salario2, salario3;
		if(ventas_dep1 > porven) {
			salario1 = salario + (0.2 * salario);
		}else {
			salario1 = salario;
		}
		
		if(ventas_dep2 > porven) {
			salario2 = salario + (0.2 * salario);
		}else {
			salario2 = salario;
		}
		
		if(ventas_dep3 > porven) {
			salario3 = salario + (0.2 * salario);
		}else {
			salario3 = salario;
		}
		
		String texto = "Salario vendedores depto1: " + salario1 + "\nSalario vendedores depto2: " + salario2 + "\nSalario vendedores depto3: " + salario3;
		return texto;
	}
}
