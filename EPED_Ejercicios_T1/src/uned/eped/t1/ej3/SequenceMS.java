package uned.eped.t1.ej3;

import uned.eped.t1.SequenceIF;

/**
 * Define las secuencias con tamaño máximo limitado
 * 
 * @author n3m1dotsys
 *
 * @param <E>
 */
public interface SequenceMS<E> extends SequenceIF<E>{
	
	/**
	 * Establece la longitud de la secuencia
	 * @pre s > 0
	 */
	public void setSize(int s);
	
	/**
	 * Devuelve la longitud máxima de la secuencia
	 * @return la longitud máxima de la secuancia
	 */
	public int maxSize();
	
}
