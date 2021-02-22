package uned.eped.t1;


/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de árboles generales
 * 
 * Representa un árbol general de elementos, en el que un
 * nodo puede tener cualquier número de hijos
 *
 * @param <E>
 */
public interface GTreeIF<E> extends TreeIF<E> {

	/**
	 * Valor enumerado que indica los tipos de recorridos 
	 * ofrecidos por los árboles generales.
	 *
	 */
	public enum IteratorModes {
		PREORDER, POSTORDER, BREADTH
	}
	
	/**
	 * Modifica la raiz del árbol.
	 * @param e el elemento que se quiere poner como rariz del
	 * árbol.
	 */
	public void setRoot(E e);
	
	/**
	 * Obtiene los hijos delárbol llamante.
	 * @return la lista de los hijos del árbol (en el orden en que
	 * estén almacenados en el mismo).
	 */
	public ListIF<GTreeIF<E>> getChildren();
	
	/**
	 * Obtiee el hijo que ocupa la posición dada por el parámetro
	 * @param pos la posiciópn del hijo que se desea obtener,
	 * 	comenzando por el 1.
	 * @Pre 1 <= pos <= getChildren().size();
	 * @return el árbol hijo que ocupa la posición pos.
	 */
	public GTreeIF<E> getChild(int pos);
	
	/**
	 * Inserta un árbol como hijo den la posición pos.
	 * @param pos la posición que ocupará el árbol entre sus hermanos,
	 * 	comenzando en 1.
	 * Si pos == getChildren().size() + 1, se añade como último hijo.
	 * @param e el hijo ue se desea insertar.
	 * @Pre 1 <= pos <= getChildre().size() + 1
	 */
	public void addChild(int pos, GTreeIF<E> e);
	
	/**
	 * Elimina el hijo que ocupa la posición parámetro.
	 * @param pos la posición del hijo con base 1.
	 * @Pre 1 <= pos <= getChildren().size()
	 */
	public void removeChild(int pos);
	
}
