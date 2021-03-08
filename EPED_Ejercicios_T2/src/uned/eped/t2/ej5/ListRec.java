package uned.eped.t2.ej5;

import uned.eped.t1.IteratorIF;
import uned.eped.t1.ListIF;

/**
 * Clase de lista recursiva necesaria para el ejercicio 5.
 * El concepto es muy similar a la de una lista ligada (Mirar: LinkedList del jdk)
 * 
 * @author n3m1dotsys
 *
 * @param <E> tipo de elementos en la lista
 */
public class ListRec<E> implements ListIF<E> {

	/**
	 * Nodo de la lista
	 */
	private E node;
	
	/**
	 * Siguentes elementos de la lista
	 */
	private ListRec<E> next;
	
	/**
	 * Crea un nodo inicial o intermedio de la lista
	 * @param pNode nodo de la lista
	 * @param pNext elementos siguientes de la lista
	 */
	public ListRec(E pNode, ListRec<E> pNext) {
		this.node = pNode;
		this.next = pNext;
	}
	
	/**
	 * Crea un nodo final para la lista
	 * @param pNode nodo a crear
	 */
	public ListRec(E pNode) {
		this(pNode, new ListRec<E>());
	}
	
	/**
	 * Crea una lista recursiva vacía
	 */
	public ListRec() {
		this(null, null);
	}
	
	@Override
	/**
	 * @return iterador de la lista
	 */
	public IteratorIF<E> iterator() {
		
		// Es necesario implementar los metodos de la interfaz para crear un objeto de tipo iterador
		return new IteratorIF<E>() {

			/**
			 * Lista en la que se encuentra el iterador
			 */
			private ListRec<E> puntero;
			
			/**
			 * Recordatorio de donde se encuentra el inicio de la lista original
			 */
			private ListRec<E> start;
			
			@Override
			/**
			 * @return Siguiente elemento de la lista
			 */
			public E getNext() {
				E r = puntero.get(0);
				puntero = puntero.rest();
				return r;
			}

			@Override
			/**
			 * @return True si tiene más elementos la lista
			 */
			public boolean hasNext() {
				return !puntero.rest().isEmpty();
			}

			@Override
			/**
			 * Devuelve el puntero al inicio de la lista
			 */
			public void reset() {
				this.puntero = this.start;				
			}
		
		};
	}

	@Override
	/**
	 * Elimina los contenidos de la lista
	 */
	public void clear() {
		this.node = null;
		this.next = null;
	}

	@Override
	/**
	 * @param e elemento a buscar en la lista
	 * @return si la lista contiene e
	 */
	public boolean contains(E e) {
		if (node == e) {
			// Si el nodo actual de la lista es el que buscamos devolvemos true
			return true;
		} else if (next != null) {
			// Si no y tenemos más lista que explorar seguimos buscando recursivamente
			return next.contains(e);
		} else {
			// Si llegamos al final de la lista y no hemos encontrado nada devolvemos false
			return false;
		}
	}

	@Override
	/**
	 * @return true si está vacía
	 */
	public boolean isEmpty() {
		return node == null;
	}

	@Override
	/**
	 * @return tamaño de la lista
	 */
	public int size() {
		// Comenzamos diciendo que la lista está vacía
		int s = 0;
		if (!this.isEmpty()) {
			// Si no está vacía sumamos 1 a nuestro contador
			s++;
			if(this.next != null) {
				// Si hay más elementos en la lista, contamos recursivamente en los siguientes elementos
				s += next.size();
			}
		}
		// Devolvemos lo que hayamos contado
		return s;
	}

	@Override
	/**
	 * Devuelve el elemento en la posición pos
	 * @param pos posición del elemento
	 */
	public E get(int pos) {
		if (pos == 0) {
			// Si estamos en el nodo en el que se encuentra el elemento lo devolvemos
			return this.node;
		}
		else {
			// Si no seguimos avanzando recursivamente
			return this.next.get(pos-1);
		}
	}

	@Override
	/**
	 * Inserta el elemento e en la posición pos
	 * @param pos posición
	 * @param e elemento
	 */
	public void insert(int pos, E e) {
		if (pos == 0) {
			// Si estamos en el nodo en el que queremos insertar, lo insertamos
			this.next = new ListRec<E>(e, this.next);
		} else {
			// Si no seguimos avanzando recursivamente
			this.next.insert(pos-1, e);
		}
		
	}

	@Override
	/**
	 * Elimina el elemento de la posición pos
	 * @param pos posición
	 */
	public void remove(int pos) {
		if (pos == 1) {
			// Eliminamos el elemento siguiente haciendo que next apunter a la lista que contenía el siguiente nodo
			this.next = this.next.rest();
		} else {
			// Continuamos buscando recursivamente
			this.next.remove(pos-1);
		}
		
	}

	@Override
	/**
	 * Establece el valor e en la lista en la posición pos
	 * @param pos posición
	 * @param e elemento
	 */
	public void set(int pos, E e) {
		if (pos == 0) {
			// Si nos encontramos ya en el nodo cambiamos el valor
			this.node = e;
		} else {
			// Si no seguimos avanzando recursivamente
			this.next.set(pos-1, e);
		}
	}

	/*
	 *  METODOS PROPIOS DE LA CLASE (NO HEREDADOS)
	 */
	
	/**
	 * @return la lista de los elementos siguientes
	 */
	public ListRec<E> rest() {
		return next;
	}
	
	/**
	 * @return el nodo en el que nos encontramos
	 */
	public E first() {
		return node;
	}
}
