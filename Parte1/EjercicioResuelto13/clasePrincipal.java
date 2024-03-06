package EjercicioResuelto13;
import java.util.Scanner;
public class clasePrincipal {
	Scanner sc = new Scanner(System.in);
    static String color;
    static double v_compra;
    static double v_pagar;

    public static void main(String[] args) {
        clasePrincipal pedir = new clasePrincipal();
        pedir.pedirDatos();
        Comparar com = new Comparar();
        v_pagar = com.CalcularDescuento(color, v_compra);
        pedir.mostrarValor();
    }

    public void pedirDatos() {
        System.out.println("\nDigite el valor de la compra: ");
        v_compra = sc.nextDouble();
        sc.nextLine();
        System.out.println("\nDigite el color de la bola: ");
        color = sc.nextLine();
    }

    public void mostrarValor() {
        String texto = "\nEl cliente debe pagar: $" + (int)v_pagar;
        System.out.println(texto);
    }


}
