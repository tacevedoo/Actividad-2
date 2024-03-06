package EjercicioResuelto10;
public class clasePrincipal {
	public static void main(String[] args) {
		PedirDatos datos = new PedirDatos();
        datos.pedirInscripcion();
        datos.pedirNombre();
        datos.pedirPatrimonio();
        datos.pedirEstrato();
        Comparar com = new Comparar();
        double matricula = com.CompararPatrimonio(datos.patrimonio, datos.estrato_social);
        String cadena = "El estudiante con número de inscripción " + datos.n_inscripcion
                + " y de nombre " + datos.nombre + ", debe pagar: $" + (int) (matricula) + " de matrícula.";
        System.out.println(cadena);
	}
}
