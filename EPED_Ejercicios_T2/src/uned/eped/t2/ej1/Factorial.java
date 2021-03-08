package uned.eped.t2.ej1;

/**
 * Método recursivo para el calculo de factorial
 * @author n3m1dotsys
 */
public class Factorial {

	/**
	 * Método recursico para el calculo de facotorial
	 * @param n número a hacer factorial
	 * @return el facotiral de n
	 */
	public static int factorial(int n) {
		if (n == 0) return 1;
		else return n * factorial(n-1);
	}
	
}
