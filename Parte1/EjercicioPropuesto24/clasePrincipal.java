package EjercicioPropuesto24;
import java.util.Scanner;
public class clasePrincipal {
	 Scanner sc = new Scanner(System.in);
	    static int esferaA;
	    static int esferaB;
	    static int esferaC;

	    public static void main(String[] args) {
	        clasePrincipal pedir = new clasePrincipal();
	        pedir.pedirDatos();
	        Comparar.CompararEsferas(esferaA, esferaB, esferaC);
	    }

	    public void pedirDatos() {
	        System.out.println("\nDigite el peso de la esfera A: ");
	        esferaA = sc.nextInt();
	        System.out.println("\nDigite el peso de la esfera B:");
	        esferaB = sc.nextInt();
	        System.out.println("\nDigite el peso de la esfera C:");
	        esferaC = sc.nextInt();
	    }
}
