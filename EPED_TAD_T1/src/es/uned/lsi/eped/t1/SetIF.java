package es.uned.lsi.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de conjuntos
 * 
 * Representa un conjunto, que es un contenedor que permite
 * alamacenar elementos que serán únicos dentro del conjunto
 * 
 * @param <E> Tipo de objetos que coniene el conjunto
 */
public interface SetIF<E> extends ContainerIF<E> {
	
	/**
	 * Realiza la unión del conjunto llamante con el del parámetro
	 * @param s el otro conjunto
	 */
	public void union(SetIF<E> s);
	
	/**
	 * Realiza la intersección del conjunto llamante con el del parametro
	 * @param s el otro conjunto
	 */
	public void intersection(SetIF<E> s);

	/**
	 * Realiza la diferencia del conjunto llamante con el del parámetro
	 * (los elementos que están en el llamante pero no en el parámetro)
	 * @param s el otro conjunto
	 */
	public void difference(SetIF<E> s);
	
	/**
	 * Devuelve true si el conjunto del parametro es subconjunto del
	 * llamante
	 * @param s el posible subconjunto
	 * @return si s es subconjunto o no
	 */
	public boolean isSubset(SetIF<E> s);
	
}
