package uned.eped.t1;

/**
 * Interfaz proporcionada por el ED de la asignatura EPED
 * para la estructura de datos de multiconjuntos
 * 
 * Representa un multconjunto, que es un contenedor que 
 * permite alamacenar elementos de los que puede haber
 * múltiples instancias dentro del multiconjunto.
 *
 * @param <E>
 */
public interface MultiSetIF<E> {

	/**
	 * Añade varias instancias de un elemento al multiconjunto
	 * @param e instancia
	 * @param n número de instancias
	 * @pre: n>0 && premult = multiplicity(e)
	 * @post: multiplicity(e) = premult + n
	 */
	public void addMultiple(E e, int n);
	
	/**
	 * Elimina varias instancias de un elemento del multiconjunto
	 * @param e instancia
	 * @param n número de instancias
	 * @pre: 0<n<=multiplicity(e) && premult=multiplicity(e)
	 * @post: multiplicity(e) = premult - n
	 */
	public void removeMultiple(E e, int n);
	
	/**
	 * Devuelve la multiplicidad de un elemento dentro del multiconjunto
	 * 
	 * @param e instancia
	 * @return mulitplicidad de e (0 si no está contenido)
	 */
	public int multiplicity(E e);
	
	/**
	 * Realiza la unión del multiconjunto llamante con el del parámetro
	 * @param s el otro multiconjunto
	 */
	public void union(MultiSetIF<E> s);
	
	/**
	 * Realiza la intersección del multiconjunto llamante con el del parametro
	 * @param s el otro multiconjunto
	 */
	public void intersection(MultiSetIF<E> s);

	/**
	 * Realiza la diferencia del multiconjunto llamante con el del parámetro
	 * (los elementos que están en el llamante pero no en el parámetro)
	 * @param s el otro multiconjunto
	 */
	public void difference(MultiSetIF<E> s);
	
	/**
	 * Devuelve true si el multiconjunto del parametro es submulticonjunto 
	 * del llamante
	 * @param s el posible submulticonjunto
	 * @return si s es submulticonjunto o no
	 */
	public boolean isSubset(MultiSetIF<E> s);
	
}
