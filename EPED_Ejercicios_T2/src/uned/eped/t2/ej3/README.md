## Ej3

Tenemos la función recursiva:
```Haskell
power Natural -> Natural -> Natural

power a b
	| b == 0 	= 1
	| b > 0		= power (a , b/2) * power (a, b/2)
```
*El lenguaje usado es Haskell y no hay que conocerlo para aprobar EPED*

No es correcto ya que la función recursiva llega hasta b=0 donde devolvería 1 y la fase recursiva los multiplicaría dando como resultado 1 a cualquier exponenciación.