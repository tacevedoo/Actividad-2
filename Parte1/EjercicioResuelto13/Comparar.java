package EjercicioResuelto13;
public class Comparar {
	public double CalcularDescuento(String color, double v_compra) {
		double v_pagar;
		if(color.equalsIgnoreCase("BLANCO")) {
			v_pagar = v_compra - (0 * v_compra);
		}else if(color.equalsIgnoreCase("VERDE")) {
			v_pagar = v_compra - (0.1 * v_compra);
		}else if(color.equalsIgnoreCase("AMARILLO")) {
			v_pagar = v_compra - (0.25 * v_compra);
		}else if(color.equalsIgnoreCase("AZUL")) {
			v_pagar = v_compra - (0.5 * v_compra);
		}else {
			v_pagar = v_compra - (1 * v_compra);
		}
		return v_pagar;
	}
}
