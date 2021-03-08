package uned.eped.t2.ej6;

/**
 * Implementa la solución al ejercicio 6:
 * 
 * Diseñar un programa cuya entrada es un árbol binario de enteros, y cuya salida es
 * cierto si la suima de todos los eneteros del árbol es cero, y falso en caso contrario.
 * 
 * Para diseñar el programa, utilícese la siguiente definición recursiva de un árbol
 * binrario de enteros:
 * 
 * Un árbol binario es, o bien un árbol vacío, o bien un nodo raíz (un valor entero) y
 * dos árboles (que llamaremos árbol izquierdo y árbol derecho.
 * 
 * @author n3m1dotsys
 *
 */
public class ArbolSumaNula {

	public static boolean sumaNula(BTreeRec<Integer> tree) {
		return sumaArbol(tree) == 0;
	}
	
	private static Integer sumaArbol(BTreeRec<Integer> tree) {
		int cont = tree.getRoot(); // Decimos que getRoot() es equivalente al método root del enunciado
		if (!tree.getLeftChild().isEmpty()) { 
			cont += sumaArbol((BTreeRec<Integer>) tree.getLeftChild());
		}
		if (!tree.getRightChild().isEmpty()) { 
			cont += sumaArbol((BTreeRec<Integer>) tree.getRightChild());
		}
		return cont;
	}
}