package EjercicioResuelto7;
public class Comparar {
	double A;
	double B;
	
	public Comparar(double A, double B) {
		this.A = A;
		this.B = B;
	}
	
	public void CompararNum() {
        if (A > B) {
            System.out.println("A ES MAYOR QUE B.");
        }else if (A == B) {
            System.out.println("A Y B SON IGUALES.");
        }else {
        	System.out.println("B ES MAYOR QUE A.");
        }
	}
}
