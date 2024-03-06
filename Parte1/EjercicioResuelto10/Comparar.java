package EjercicioResuelto10;
public class Comparar {

	public double CompararPatrimonio(double patrimonio, int estrato){
		double pago_patri = 50000;
		if(patrimonio > 2000000 && estrato > 3) {
			pago_patri = pago_patri + 0.03*patrimonio;
		}
		return pago_patri;
	}
}