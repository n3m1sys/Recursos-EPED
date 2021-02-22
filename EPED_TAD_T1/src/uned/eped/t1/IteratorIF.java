package uned.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para los iteradores
 * 
 * Representa un iterador de elementos
 *
 * @param <E>
 */
public interface IteratorIF<E> {
	
	/**
	 * Obtiene el siguiente elemento de la iteración
	 * @Pre hasNext()
	 * @return el siguiente elemento de la iteración
	 */
	public E getNext();
	
	/**
	 * Comprueba si aún quedan elementos por iterar
	 * @return true si el iterador dispone de más elementos.
	 */
	public boolean hasNext();
	
	/**
	 * Vuelve la posición del iterador al principio. Esto
	 * permiote reutiliza un iterador sin crear otro nuevo.
	 */
	public void reset();

}
