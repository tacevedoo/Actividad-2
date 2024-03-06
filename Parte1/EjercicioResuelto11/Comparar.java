package EjercicioResuelto11;
public class Comparar {
	public void compararMayor(int n1, int n2, int n3) {
		if(n1 == n2 && n1 == n3) {
			System.out.println("Los números son iguales");
		}else if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el número mayor");
		}else if(n2 > n3 && n2 > n1) {
			System.out.println(n2 + " es el número mayor");
		}else {
			System.out.println(n3 + " es el número mayor");
		}
	}
}
