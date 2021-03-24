package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de colas
 * 
 * Representa una cola de elementos. Una cola es una 
 * especialización de una secuenci, que mantiene el orden
 * de almacenamiento de sus elementos y una política de 
 * acceso First In First Out (FIFO)
 *
 * @param <E> Tipo de objetos que contiene la cola
 */
public interface QueueIF<E> {

	/**
	 * Devuelve el primer elemento de la cola.
	 * @pre !isEmpty()
	 * @return la cavbeza de la cola (su primer elemento)
	 */
	public E getFirst();
	
	/**
	 * Incluye un elemento al final de la cola. Modifica el 
	 * tamaño de la misma.
	 * @param elem el elemento que debe encola (añadir).
	 */
	public void enqueue(E elem);
	
	/*
	 * Elimina el primer elemento de la cola. Modifica el 
	 * tramaño de la misma.
	 * @pre !isEmpty()
	 */
	public void dequeue();
	
}
