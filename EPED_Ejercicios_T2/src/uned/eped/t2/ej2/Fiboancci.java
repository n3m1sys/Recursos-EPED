package uned.eped.t2.ej2;

/**
 * Métodos para la secuencia de fibonacci
 * 
 * @author n3m1dotsys
 */
public class Fiboancci {
	
	/**
	 * @param n el número de iteraciones a la secuencia de fibonacci
	 * @pre n es un número entero positivo o 0
	 * @return El resultado de la secuencia de fibonacci para n iteraciones
	 */
	public static int fibonacciRecursive(int n) {
		if (n > 0) return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
		else if (n == 1 || n == 0) return 1;
		else return -1;
	}
	
	
	/**
	 * @param n el número de iteraciones a la secuencia de fibonacci
	 * @pre n es un número entero positivo o 0
	 * @return El resultado de la secuencia de fibonacci para n iteraciones
	 */
	public static int fibonacciDynamic(int n) {
		// Declaración de variables
		int i;
		int[] t = new int[n+1];
		// Algoritmo
		if (n <= 1) return 1;
		else {
			t[0] = 1;
			t[1] = 1;
			for(i = 0; i<=n; n++){
				t[i] = t[i-1] + t[i-2];
			}
			return t[i];
		}
	}
	
	/**
	 * @param n el número de iteraciones a la secuencia de fibonacci
	 * @pre n es un número entero positivo o 0
	 * @return El resultado de la secuencia de fibonacci para n iteraciones
	 */
	public static int fibonacciDynamicOpt(int n) {
		// Declaración de variables
		int i;
		int suma = 0;
		int f;
		int g;
		// Algoritmo
		if (n <= 1) return 1;
		else {
			f = 1;
			g = 1;
			for (i = 2; i <= n; i++){
				suma = f + g;
				g = f;
				f = suma;
			}
			return suma;
		}
	}
	
}
