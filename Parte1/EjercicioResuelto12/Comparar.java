package EjercicioResuelto12;
public class Comparar {
	 public double Salario(int h_t, double valor_h) {
		 int horas_extras = 0;
		 int horas_excedentes = 0;
		 double salario = 0;
		 if(h_t > 40) {
			 horas_extras = h_t - 40;
			 if(horas_extras > 8) {
				 horas_excedentes = horas_extras - 8;
				 salario = (40*valor_h)+(2*8*valor_h)+(horas_excedentes*3*valor_h);
			 }else {
				 salario = (40*valor_h)+(horas_extras*valor_h*2);
			 }
		 }else {
			 salario = h_t * valor_h;
		 }
		 return salario;
	 }
}
