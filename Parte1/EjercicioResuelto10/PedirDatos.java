package EjercicioResuelto10;
import java.util.Scanner;
public class PedirDatos {
    Scanner sc = new Scanner(System.in);
    int n_inscripcion = 0;
    String nombre = "";
    double patrimonio = 0;
    int estrato_social = 0;

    public void pedirInscripcion() {
        System.out.println("Digite su número de inscripción: ");
        n_inscripcion = sc.nextInt();
    }

    public void pedirNombre() {
        sc.nextLine();
        System.out.println("Digite su nombre: ");
        nombre = sc.nextLine();
    }

    public void pedirPatrimonio() {
        System.out.println("Digite patrimonio: ");
        patrimonio = sc.nextDouble();
    }

    public void pedirEstrato() {
        System.out.println("Digite su estrato: ");
        estrato_social = sc.nextInt();
    }

}
