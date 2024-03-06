package EjercicioPropuesto24;
public class Comparar {
	public static void CompararEsferas(int A, int B, int C) {
		if(A > B && A > C) {
			System.out.println("\nLa esfera A tiene el mayor peso.");
		}else if(B > A && B > C) {
			System.out.println("\nLa esfera B tiene el mayor peso.");
		}else if(C > A && C > B) {
			System.out.println("\nLa esfera C tiene el mayor peso.");
		}else {
			System.out.println("\nLas esferas tienen el mismo peso");
		}
	}
}
