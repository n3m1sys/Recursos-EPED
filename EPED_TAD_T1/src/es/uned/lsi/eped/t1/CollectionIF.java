package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de colecciones
 *
 * Representa una colección de elementos, sin ningún tipo
 * de relación entre ellos más que la pertenencia a la misma
 * colección
 *
 * @param <E> Tipo de objetos que contiene la colección
 */
public interface CollectionIF<E> {
	
	/**
	 * Devuelve el número de elementos en la colección
	 * @return número de elementos en la colección
	 */
	public int size();
	
	/**
	 * Devuelve true si la colección no contiene elementos
	 * @return true si la colección está vacía
	 */
	public boolean isEmpty();
	
	/**
	 * Devuelve true si e está en la colección
	 * @param e elemento a comprobar
	 * @return true si está en la colección
	 */
	public boolean contains(E e);
	
	/**
	 * Elimina todos los elementos de la colección
	 */
	public void clear();
}
