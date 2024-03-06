package EjercicioResuelto7;
import java.util.Scanner;
public class clasePrincipal {
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        double A = datoEntradaA();
        double B = datoEntradaB();
        
        Comparar com = new Comparar(A, B);
        com.CompararNum();
    }

    public static double datoEntradaA() {
        System.out.println("Digite un primer número(A): ");
        double var = sc.nextInt();
        return var;
    }

    public static double datoEntradaB() {
        System.out.println("Digite un segundo número(B): ");
        double var = sc.nextInt();
        return var;
    }

}
