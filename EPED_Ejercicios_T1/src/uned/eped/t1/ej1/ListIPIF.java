package uned.eped.t1.ej1;

import uned.eped.t1.SequenceIF;

/**
 * Define una lista con punto de interés. Este tipo de lista
 * permite despalazarse hacia delante y hacia atrás, mientras 
 * que las consultas solo se realizan en la posición del puntero
 * 
 * @author n3m1dotsys
 *
 * @param <E> Tipo de objetos contenidos en la lista
 */
public interface ListIPIF<E> extends SequenceIF<E>{
	
	/**
	 * Obitiene el elemento en la posición del puntero
	 * @return
	 */
	public E get();
	
	/**
	 * Establece el valor del elemento en la posición del puntero
	 * @param elem
	 */
	public void set(E elem);
	
	/**
	 * Elimina el elemento de la lista en la posición del puntero
	 */
	public void remove();

	/**
	 * Aumenta el puntero de la lista al siguiente punto de interes
	 */
	public void next();
	
	/**
	 * Decrementa el puntero de la lista al previo punto de interes
	 */
	public void prev();
	
	/**
	 * Inserta un elemento en la lista
	 * @param elem
	 */
	public void insert(E elem);
	
}
