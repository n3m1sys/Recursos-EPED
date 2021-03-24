package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de secuencia
 * 
 * Representa una secuencia, que es una colección de elementos 
 * que se organizan linealmente
 *
 * @param <E> Tipo de objetos que contiene la secuencia
 */
public interface SequenceIF<E> extends CollectionIF<E>{
	
	/**
	 * Devuelve el iterador sobre la secuencia. No necesita 
	 * parámetros puesto que el recorrido es lineal y único.
	 * 
	 * @return el iterador de la secuencia
	 */
	public IteratorIF<E> iterator();

}
