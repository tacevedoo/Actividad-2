package EjercicioResuelto11;
import java.util.Scanner;
public class PedirDatos {
	    Scanner sc = new Scanner(System.in);
	    int n1 = 0;
	    int n2 = 0;
	    int n3 = 0;

	    public void pedirNumeroUno() {
	        System.out.println("Digite su primer número: ");
	        n1 = sc.nextInt();
	    }

	    public void pedirNumeroDos() {
	        System.out.println("Digite su segundo número: ");
	        n2 = sc.nextInt();
	    }

	    public void pedirNumeroTres() {
	        System.out.println("Digite su tercer número: ");
	        n3 = sc.nextInt();
	    }

}
