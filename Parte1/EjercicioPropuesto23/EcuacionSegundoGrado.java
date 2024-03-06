package EjercicioPropuesto23;
public class EcuacionSegundoGrado {
	public static double A;
	public static double B;
	public static double C;
	
	public static void PosiblesSoluciones(){
		double x1, x2;
		if(Math.sqrt(Math.pow(B, 2)-(4.0*A*C)) > 0) {
			x1 = ((-1.0 * B) + (Math.sqrt(Math.pow(B, 2) - (4.0 * A * C)))) / (2.0 * A);
			x2 = ((-1.0 * B) - (Math.sqrt(Math.pow(B, 2) - (4.0 * A * C)))) / (2.0 * A);
			System.out.println("La primera solución es: " + x1);
			System.out.println("La segunda solución es: " + x2);
		}else if(Math.sqrt(Math.pow(B, 2)-(4.0*A*C)) == 0) {
			x1 = (-1.0 * B)/(2.0*A);
			System.out.println("La única solución es: " + x1);
		}else {
			System.out.println("La ecuación no tiene solución en los reales");
		}
	}
}
