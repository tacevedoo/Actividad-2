package EjercicioResuelto15;
public class Esferas {
	public static double peso_esf1;
	public static double peso_esf2;
	public static double peso_esf3;
	public static double peso_esf4;
	
	public static void CompararEsferas(){
		if(peso_esf1 == peso_esf2 && peso_esf1 == peso_esf3) {
			if(peso_esf4 > peso_esf1) {
				System.out.println("La esfera distinda es la D y es de mayor peso");
			}else {
				System.out.println("La esfera distinda es la D y es de menor peso");
			}
		}else if(peso_esf1 == peso_esf2 && peso_esf1 == peso_esf4) {
			if(peso_esf3 > peso_esf1) {
				System.out.println("La esfera distinda es la C y es de mayor peso");
			}else {
				System.out.println("La esfera distinda es la C y es de menor peso");
			}
		}else if(peso_esf1 == peso_esf3 && peso_esf1 == peso_esf4) {
			if(peso_esf2 > peso_esf1) {
				System.out.println("La esfera distinda es la B y es de mayor peso");
			}else {
				System.out.println("La esfera distinda es la B y es de menor peso");
			}
		}else {
			if(peso_esf1 > peso_esf2) {
				System.out.println("La esfera distinda es la A y es de mayor peso");
			}else {
				System.out.println("La esfera distinda es la A y es de menor peso");
			}
		}
	}
}
