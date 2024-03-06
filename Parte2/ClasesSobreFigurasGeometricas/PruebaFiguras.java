package ClasesSobreFigurasGeometricas;
public class PruebaFiguras {
	public static void main(String[] args) {
		circulo figura1 = new circulo(2);
		rectangulo figura2 = new rectangulo(1,2);
		cuadrado figura3 = new cuadrado(3);
		TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
		System.out.println("El área del círculo es = " + figura1.calcularArea());
		System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
		System.out.println();
		System.out.println("El área del rectángulo es = " + figura2.calcularArea());
		System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
		System.out.println();
		System.out.println("El área del cuadrado es = " + figura3.calcularArea());
		System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
		System.out.println();
		System.out.println("El área del triángulo es = " + figura4.calcularArea());
		System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
		figura4.determinarTipoTriangulo();
	}

}
