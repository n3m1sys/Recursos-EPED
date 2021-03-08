## Ej2

Tenemos la función de fibonacci definida de la siguiente manera:

```haskell
fibonacci Natural -> Natural

fibonacci n
	| n == 0 	= 1
	| n == 1	= 1
	| n > 1 	= fibonacci (n-1) + fibonacci (n-2)
```
*Como ya he dicho en el anterior ejercicio la sintaxis utilizada es la del lenguaje de programación Haskell, el cual no es necesario conocer para esta asignatura*

Traducido a Java:
```java
/**
 * @param n el número de iteraciones a la secuencia de fibonacci
 * @pre n es un número entero positivo o 0
 * @return El resultado de la secuencia de fibonacci para n iteraciones
 */
public static int fibonacciRecursive(int n) {
	if (n > 0) return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	else if (n == 1 || n == 0) return 1;
	else return -1;
}
`` 

- La parte no recursiva del algoritmo ocurre en los casos n=0 y n=1 donde el algoritmo simplemente devuelve 1.

- La parte recursiva ocurre cuando n>1 donde el algoritmo realizará la suma de las llamadas recursivas de la función para los valores n-2 y n-1, hasta que estas lleguen a 0 y 1.

El problema que tiene esta forma del cáculo de la secuencia de Fibonacci es que es muy lento, teniendo un coste temporal de O(2^n) (exponencial). Se puede optimizar el tiempo de ejecución haciendo que el algoritmo no recalcule elementos que ya ha calculado:

```ada
function FibonacciDynamic (n : Natural) return Natural
	i : Natural;
	type Tabla is array (Natural range 0 .. n) of Natural;
	t : Tabla;
begin
	if n <= 1 then
		return 1;
	else 
		t(0) := 1;
		t(1) := 1;
		i := 2
		for i in 2 .. n loop
			t(i) := t(i-1) ++ t(i-2);
		end loop;
		return t(n);
	end if;
end FibonacciDynamic;
```
*La sintaxis es del lenguaje de programación Ada, que es muy similar a la del pseudocódigo, no hay que conocer la sintaxis para la asignatura*

Traducido a Java:
```java
/**
 * @param n el número de iteraciones a la secuencia de fibonacci
 * @pre n es un número entero positivo o 0
 * @return El resultado de la secuencia de fibonacci para n iteraciones
 */
public static int fibonacciDynamic(int n) {
	// Declaración de variables
	int i;
	int[] t = new int[n+1];
	// Algoritmo
	if (n <= 1) return 1;
	else {
		t[0] = 1;
		t[1] = 1;
		for(i = 0; i<=n; n++){
			t[i] = t[i-1] + t[i-2];
		}
		return t[i];
	}
}
```
Este algoritmo tendría un coste temporal de O(n) (lineal) y un coste espacial de O(n) (lineal) el cual ha incrementado del previo (1) (constante) aunque podemos mejorarlo todavía más:
```ada
function FibonacciDynamicOpt(n : Natural) return Natural
	i, suma, f, g : Natural;
begin
	if n <= 1 then
		return 1;
	else 
		f := 1;
		g := 1;
		i := 2;
		for i in 2 .. n loop
			suma := f + g;
			g := f;
			f := suma;
		end loop;
		return suma;
	end if
end FibonacciDynamicOpt;
```
Que traducido a Java queda de la siguiente manera:
```java
/**
 * @param n el número de iteraciones a la secuencia de fibonacci
 * @pre n es un número entero positivo o 0
 * @return El resultado de la secuencia de fibonacci para n iteraciones
 */
public static int fibonacciDynamicOpt(int n) {
	// Declaración de variables
	int i;
	int suma;
	int f;
	int g;
	// Algoritmo
	if (n <= 1) return 1;
	else {
		f = 1;
		g = 1;
		for (i = 2; i <= n; i++){
			suma = f + g;
			g = f;
			f = suma;
		}
		return suma;
	}
}
```

A esta técnica se la llama *Programación Dinámica*. Se estudia a fondo en la asignatura Programación y Estructuras de Datos Avanzadas.