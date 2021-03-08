fibonacci Natural -> Natural

fibonacci n
	| n == 0 	= 1
	| n == 1	= 1
	| n > 1 	= fibonacci (n-1) + fibonacci (n-2)