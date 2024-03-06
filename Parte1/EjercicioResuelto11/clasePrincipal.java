package EjercicioResuelto11;
public class clasePrincipal {
	public static void main(String[] args) {
		PedirDatos datos = new PedirDatos();
        datos.pedirNumeroUno();
        datos.pedirNumeroDos();
        datos.pedirNumeroTres();
        Comparar com = new Comparar();
        com.compararMayor(datos.n1, datos.n2, datos.n3);
	}
}
