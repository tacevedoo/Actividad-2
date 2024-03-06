package EjercicioPropuesto21;
public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
	public double calcularSemiperimetro() {
		double semip = (lado1 + lado2 + lado3)/2;
		return semip;
	}
	
	public double calcularArea() {
		double semip = (lado1 + lado2 + lado3)/2;
		double area = Math.sqrt((semip * (semip - lado1) * (semip - lado2) * (semip - lado3)));
		return area;
	}
}