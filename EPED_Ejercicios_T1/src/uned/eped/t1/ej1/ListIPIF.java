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
	
	public E get();
	
	public void set(E elem);
	
	public void remove();

	
	
}
