package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de árboles
 * 
 * Representa un árbol, que es una coleccióon cuyos elementos
 * se organizan jerárquicamente.
 *
 * @param <E> Tipo de objetos que contiene el árbol
 */
public interface TreeIF<E> extends CollectionIF<E> {
	
	/**
	 * Obtiene el elemento situado en la raíz del árbol
	 * @pre !isEmpty()
	 * @return el elemento que ocupa la raíz del árbol.
	 */
	public E getRoot();
	
	/**
	 * Decide si el árbol es una hoja (no tiene hijos)
	 * @return true si el áborl es no vacío y no tiene 
	 * 	hijos
	 */
	public boolean isLeaf();
	
	/**
	 * Devuelve el número de hijos del árbol
	 * @return número de hijos
	 */
	public int getNumChildren();
	
	/**
	 * Devuelve el fanout del árbol: el número máximo de
	 * hijos que tiene cualquier nodo del árbol
	 * @return el fanout
	 */
	public int getFanOut();
	
	/**
	 * Devuelve la altura del árbol: la distancia másxima desde 
	 * la raiz a cualquiera de sus hojas
	 * @return La altura del árbol
	 */
	public int getHeight();
	
	/**
	 * Obtiene un iterador para el árbol.
	 * @param mode el tipo de recorrido indicado por los valores
	 * 	enumerados definidos en cada TAD concreto.
	 * @return el iterador del árbol
	 */
	public IteratorIF<E> iterator(Object mode);

}
