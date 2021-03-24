package es.uned.lsi.eped.t2.ej5;

/**
 * Ejercicio 5 del tema 2
 * 
 * La entrada del programa es una lista de números enteros, y la salida es el resultado de sumarlos todos.
 * 
 * Utilícese la definición recursiva de una lista, es decir:
 * 
 * Una lista de enteros es, o bien una lista vacá, o bien un primer elemento y una lista con el resto de elementos.
 * Supóngase disponibles los métodos isEmpty(), first() y rest()
 * 
 * 
 * @author n3m1dotsys
 *
 */
public class SumaLista {
	
	/**
	 * Cálucla la suma total de los elementos de una lista de enteros
	 * @param lista la lista de la cual se quiere calcular la suma
	 * @return la suma de la lista 
	 */
	public static int sumaLista(ListRec<Integer> lista) {
		if (lista.rest().isEmpty()) {
			// Nos encontramos al final de la lista ya que no quedan elementos así que devolvemos el elemento
			return lista.first();
		} else {
			// Si no devolvemos la suma del elemento actual más la de los siguientes
			return lista.first() + sumaLista(lista.rest());
		}
	}
	
}
