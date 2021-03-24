package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de contenedores
 * 
 * Representa un contenedo, que es una colección de elementos 
 * que no guardan ningún tipo de orden entre sí
 *
 * @param <E> tipo de objetos que contiene el contenedor
 */
public interface ContainerIF<E> extends CollectionIF<E> {
	
	/**
	 * Añade un elmento al conetendo
	 * @param e el elemento
	 */
	public void add(E e);
	
	/**
	 * Elimina un elemento e del conetenedor
	 * @param e el elemento
	 * @pre this.cointains(e)
	 * @post !this.cointains(e)
	 */
	public void remove(E e);

	/**
	 * Devuelve un iterador para el contenedor
	 * @return Devuelve un iterador para el contenedor
	 */
	public IteratorIF<E> iterator();
	
}
