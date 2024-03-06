package EjercicioResuelto12;
import java.util.Scanner;
public class clasePrincipal {
	
	Scanner sc = new Scanner(System.in);
    static String nombre;
    static int h_trabajadas;
    static double valor_hora;
    static double salario;

    public static void main(String[] args) {
        clasePrincipal pedir = new clasePrincipal();
        pedir.pedirDatos();
        Comparar com = new Comparar();
        salario = com.Salario(h_trabajadas, valor_hora);
        pedir.mostrarSalario();
    }

    public void pedirDatos() {
        System.out.println("\nDigite el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.println("\nDigite la cantidad de horas trabajadas de " + nombre + ": ");
        h_trabajadas = sc.nextInt();
        System.out.println("\nDigite el valor por hora trabajada:");
        valor_hora = sc.nextDouble();
    }

    public void mostrarSalario() {
        String texto = "\nEl trabajador " + nombre + " devengo: $" + salario;
        System.out.println(texto);
    }
}
