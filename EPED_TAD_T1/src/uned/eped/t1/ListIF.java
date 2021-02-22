package uned.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de listas
 * 
 * Representa una lista de elementos. Una lista es una
 * secuencia que permite modificar o acceder a cualquiera de
 * sus elementos de forma no destructiva.
 *
 * @param <E>
 */
public interface ListIF<E> extends SequenceIF<E> {
	
	/**
	 * Devuelve el elemento de la lista que ocupa la posición
	 * indicada por el parámetro.
	 * @param pos posición del elemento a acceder comenzando en 1
	 * @Pre 1 <= pos <= size();
	 * @return el elemento de la posición pos
	 */
	public E get(int pos);
	
	/**
	 * Modifica la posición dada por el parámetro pos para que
	 * contenfa el vcalor dado por el parámetro e.
	 * @param pos la posición cuyo valor se debe modificar, 
	 * 	comenzando en 1.
	 * @param e el valor que debe adoptar la posición pos.
	 * @Pre 1 <= pos <= size()
	 */
	public void set(int pos, E e);
	
	/**
	 * inserta un elemento en la lista
	 * @param pos La posicion en la que se debe añadir el elem
	 * @param elem El elemento que hay que añadir.
	 * @Pre 1 <= pos <= size()+1
	 */
	public void insert(int pos, E elem);
	
	/**
	 * Elimina el elemento que ocupa la posición del parametro
	 * @param pos la posición que ocupa el elemento a eliminar
	 * @Pre 1 <= pos >= size()
	 */
	public void remove(int pos);
	

}
