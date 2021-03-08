package uned.eped.t2.ej6;

import uned.eped.t1.BTreeIF;
import uned.eped.t1.IteratorIF;

/**
 * Clase de Árbol binario recursivo necesaria para el ejercicio 6.
 * 
 * @author n3m1dotsys
 *
 * @param <E> Tipo de los nodos del árbol binario
 */
public class BTreeRec<E> implements BTreeIF<E> {
	
	/**
	 * Raiz del árbol
	 */
	private E root;	
	
	/**
	 * Hijo izquierdo del árbol
	 */
	private BTreeRec<E> left;
	
	/**
	 * Hijo derecho del árbol
	 */
	private BTreeRec<E> right;
	
	/**
	 * Constructor para un árbol con raíz y dos nodos
	 * @param pLeft árbol izquierdo hijo
	 * @param pRoot raiz del árbol
	 * @param pRight árbol derecho hijo
	 */
	public BTreeRec(BTreeRec<E> pLeft, E pRoot, BTreeRec<E> pRight) {
		this.left = pLeft;
		this.root = pRoot;
		this.right = pRight;
	}
	
	/**
	 * Constructor de un árbol con raíz y un nodo hijo en la derecha
	 * @param pRoot raiz del árbol
	 * @param pRight árbol derecho hijo
	 */
	public BTreeRec(E pRoot, BTreeRec<E> pRight) {
		/*
		 * Se aprovecha de la recursividad llamando al constructor general con uno de los parametros siendo 
		 * un árbol vacío
		 */
		this(new BTreeRec<E>(), pRoot, pRight);
	}
	
	/**
	 * Constructor de un árbol con raíz y nodo hijo en la izquierda
	 * @param pLeft árbol izquierdo hijo
	 * @param pRoot raiz del árbol
	 */
	public BTreeRec(BTreeRec<E> pLeft, E pRoot) {
		/*
		 * Se aprovecha de la recursividad llamando al constructor general con uno de los parametros siendo 
		 * un árbol vacío
		 */
		this(pLeft, pRoot, new BTreeRec<E>());
	}
	
	/**
	 * Constructor de un árbol con solamente raiz
	 * @param pRoot raiz del árbol
	 */
	public BTreeRec(E pRoot) {
		/*
		 * Se aprovecha de la recursividad llamando al constructor general con dos de los parametros siendo 
		 * dos árboles vacíos
		 */
		this(new BTreeRec<E>(), pRoot, new BTreeRec<E>());
	}
	
	/**
	 * Constructor de un árbol binario vacío
	 */
	public BTreeRec() {
		// Llama recursivamente al constructor BTreeRec(E pRoot) con pRoot = null, creando así un árbol sin raíz
		this(null, null, null);
	}
	
	@Override
	/**
	 * Número máximo de hijos por nodo
	 */
	public int getFanOut() {
		return 2;
	}

	@Override
	/**
	 * Altura máxima desde la raíz hasta una hoja del árbol
	 */
	public int getHeight() {
		if (this.isLeaf()) {
			// Si es una hoja la altura es 1
			return 1;
		} else {
			// Si no buscamos recursivamente en los nodos hijos
			int hleft = 1;
			int hright = 1;
			if(!right.isEmpty()) {
				hleft += left.getHeight();
			}
			if(!left.isEmpty()) {
				hright += right.getHeight();
			}
			// Devolvemos el valor máximo de los dos
			return (hleft > hright) ? hleft : hright;
		}
	}

	@Override
	public int getNumChildren() {
		int i = 0;
		if (!left.isEmpty()) i++;
		if (!right.isEmpty()) i++;
		return i;
	}

	@Override
	/**
	 * {@link BTreeRec#root}
	 */
	public E getRoot() {
		return root;
	}

	@Override
	/**
	 * @return true si el nodo es hoja
	 */
	public boolean isLeaf() {
		return getNumChildren() == 0;
	}

	@Override
	/**
	 * No se hace uso de este metodo y sería engorroso de implementar así que se prescinde de él.
	 * @deprecated
	 */
	public IteratorIF<E> iterator(Object o) {
		// Como no es útil para el ejercicio se prescinde e la implementación del iterador
		return null;
	}

	@Override
	/**
	 * Vacía el árbol
	 */
	public void clear() {
		this.left = null;
		this.root = null;
		this.right = null;
	}

	@Override
	/**
	 * @return true si el árbol contiene el elemento e
	 */
	public boolean contains(E e) {
		if (root == e) {
			// Si el nodo del árbol actual es e entonces devolvemos true
			return true;
		}
		else {
			// Si no buscamos recursivamente en los nodos hijos (si los hay)
			if (!left.isEmpty()) {
				if (left.contains(e)) return true;
			}
			if (!right.isEmpty()) {
				if (right.contains(e)) return true;
			}
			// Finalmente si no hemos encontrado nada en los nodos hijos devolvemos false
			return false;
		}
	}

	@Override
	/**
	 * @return true si el árbol está vacío
	 */
	public boolean isEmpty() {
		// Se asume que si no hay raiz no hay nodos hijos de forma que solo comprobamos la inexistencia de una raiz
		return root == null;
	}

	@Override
	/**
	 * @return el número de elementos total del árbol
	 */
	public int size() {
		// Contamos recursivamente sobre los hijos del árbol
		int cont = 1;
		if (!left.isEmpty()) {
			// Incrementamos el contador en 1 y el tamaño del árbol hijo izquierdo
			cont += 1 + left.size();
		}
		if (!right.isEmpty()) {
			cont = 1 + right.size();
		}
		return cont;
	}

	@Override
	/**
	 * {@link BTreeRec#left}
	 */
	public BTreeIF<E> getLeftChild() {
		return left;
	}

	@Override
	/**
	 * {@link BTreeRec#right}
	 */
	public BTreeIF<E> getRightChild() {
		return right;
	}

	@Override
	/**
	 * Elimina el hijo izquierdo
	 */
	public void removeLeftChild() {
		left = null;		
	}

	@Override
	/**
	 * Elimina el hijo derecho
	 */
	public void removeRightChild() {
		right = null;
	}

	@Override
	/**
	 * Establece el hijo izquierdo del árbol
	 * @param child el hijo izquierdo del árbol
	 */
	public void setLeftChild(BTreeIF<E> child) {
		left = (BTreeRec<E>) child;
	}

	@Override
	/**
	 * Establece el hijo derecho del árbol
	 * @param child el hijo derecho del árbol
	 */
	public void setRightChild(BTreeIF<E> child) {
		right = (BTreeRec<E>) child;
	}

	@Override
	/**
	 * Establece la raíz del árbol binario
	 * @param e la raiz del árbol
	 */
	public void setRoot(E e) {
		this.root = e;
	}

}