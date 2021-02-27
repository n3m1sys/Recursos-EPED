package uned.eped.t1.ej2;

/**
 * Define una lista primero siguiente, en las que el acceso y
 * modificación de elementos sólo puede realizarse en el primer
 * elemento de la lista, además de que todas las operaciones 
 * deberán devolver un valor.
 * 
 * @author n3m1dotsys
 *
 * @param <E>
 */
public interface ListHTIF<E> {

	/**
	 * Obtiene el valor de la cabeza de la lista
	 * @return valor de la cabeza
	 */
	public E getHead();
	
	/**
	 * Obtiene el valor de la cabeza de la lista y lo elimina de ella
	 * @return previo valor de la cabeza
	 */
	public E getAndPop();
	
	/**
	 * Intruduce un elemento en la lista
	 * @param e elemento a insertar en la lista
	 * @param pos posición del elemento
	 * @return tamaño de la lista
	 */
	public int push(E e, int pos);
	
	/**
	 * Cambia el valor de la cabeza de la lista
	 * @param e valor a settear
	 * @return tamaño de la lista
	 */
	public int set(E e);
	
}
