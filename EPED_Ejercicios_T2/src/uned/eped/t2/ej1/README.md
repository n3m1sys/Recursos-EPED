## Ej1

Tenemos el factorial de un núemro natural n definido como:

```Haskell
factorial Natural -> Natural

factorial n
	| n == 0 		= 1
	| otherwise	= n * factorial (n-1)

```
*La sintaxis utilizada es la de Haskell, no es necesario conocerla en esta asignatura, solo la uso ya que es muy visual para el caso expuesto*

Traducido a Java:
```Java
/**
 * Método recursico para el calculo de facotorial
 * @param n número a hacer factorial
 * @return el facotiral de n
 */
public static int factorial(int n) {
	if (n == 0) return 1;
	else return n * factorial(n-1);
}
	
```

- El caso no recursivo es cuando n=0 en cuyo caso el programa devuelve 1.

- El caso recursivo ocurre para el resto de casos (n /= 0) en cuyo caso se multiplicaría n al resultado de llamar recursivamente a *factorial* con argumento *n-1* el cual recurre hasta llegar a n=0 donde la función devolvería 1 multiplicandose con los anteriores n.