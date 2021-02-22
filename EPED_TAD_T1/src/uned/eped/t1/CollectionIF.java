package uned.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de colecciones
 *
 * Representa una colección de elementos, sin ningún tipo
 * de relación entre ellos más que la pertenencia a la misma
 * colección
 *
 * @param <E>
 */
public interface CollectionIF<E> {
	
	/**
	 * Devuelve el número de elementos en la colección
	 * @return
	 */
	public int size();
	
	/**
	 * Devuelve true si la colección no contiene elementos
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Devuelve true si e está en la colección
	 * @param e
	 * @return
	 */
	public boolean contains(E e);
	
	/**
	 * Elimina todos los elementos de la colección
	 */
	public void clear();
}
