package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para las estrcuturas de datos de árboles binarios.
 * 
 * Representa un árbol binario de elementos, en el que un
 * nodo puede tener, a los usmo, dos hijos (fanout &lt;= 2
 * para todos los nodos).
 *
 * @param <E> Tipo de objetos que contiene el árbol
 */
public interface BTreeIF<E> extends TreeIF<E>{

	/**
	 * Valor enumerado que indica los tipos de recorrido
	 * ofrecidos por los árboles binarios
	 *
	 */
	public enum IteratorModes {
		PREORDER, POSTORDER, BREADTH, INORDER, RLBREADTH
	}
	
	/**
	 * Modifica la raíz del árbol
	 * @param e el elemento que se quiere poner como raíz
	 * 	del árbol
	 */
	public void setRoot(E e);
	
	/**
	 * Obtiene el hijo izquierdo del árbol llamante.
	 * @return el hijo izquierdo del árbol llamante.
	 */
	public BTreeIF<E> getLeftChild();
	
	/**
	 * Pone el árbol parámetro com hijo izquierdo del árbol
	 * llamante. Si ya había hijo izquierdo, el anitguo 
	 * dejará de ser accesible (se pierde).
	 * @pre !isEmpty()
	 * @param child el árbol que se debe poner como hijo
	 * 	izquiedo
	 */
	public void setLeftChild(BTreeIF<E> child);
	
	/**
	 * Elimina el hijo izquierdo
	 */
	public void removeLeftChild();
	
	/**
	 * Obtiene el hijo derecho del árbol llamante.
	 * @return el hijo derecho del árbol llamante.
	 */
	public BTreeIF<E> getRightChild();
	
	/**
	 * Pone el árbol parámetro com hijo derecho del árbol
	 * llamante. Si ya había hijo derecho, el anitguo 
	 * dejará de ser accesible (se pierde).
	 * @pre !isEmpty()
	 * @param child el árbol que se debe poner como hijo
	 * 	derecho
	 */
	public void setRightChild(BTreeIF<E> child);
	
	/**
	 * Elimina el hijo derecho
	 */
	public void removeRightChild();
	
}
