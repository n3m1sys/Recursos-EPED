package uned.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para las estrcuturas de datos de árboles de  busqueda
 * binaria.
 *
 * Representa un árbol de búsqueda binaria
 *
 * @param <E>
 */
public interface BSTreeIF<E extends Comparable<E>> extends TreeIF<E>{

	/**
	 * Valor enumerado que indica los tipos de recorrido 
	 * offrecidos por los árboles de búsqueda binaria
	 *
	 */
	public enum IteratorModes {
		DIRECTORDER, REVERSEORDER
	}
	
	/**
	 * Valor enumerado que indica cuál es la ordenación de
	 * los elementos dentro del árbol (ascendente o descendente).
	 *
	 */
	public enum Order {
		ASCENDING, DESCENDING
	}
	
	/**
	 * Añade un elemento no contenido previamente en el árbol
	 * @Pre !contains(e)
	 * @Post contains(e)
	 * @param e elemento a añadir
	 */
	public void add(E e);
	
	/**
	 * Elimina un elemento previamente contenido en el árbol
	 * @Pre contains(e)
	 * @Post !contians(e)
	 * @param e elemento a eliminar
	 */
	public void remove(E e);
	
	/**
	 * Devuelve el orden de almacenamiento de los elementos en
	 * el árbol
	 * @return el orden de almacenamiento del árbol
	 */
	public Order getOrder();
	
}
