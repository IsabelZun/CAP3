/*R-3.13 ¿Cuál es la diferencia entre una prueba de igualdad superficial y una prueba de igualdad profunda 
entre dos arreglos Java, A y B, si son arreglos unidimensionales de tipo int?

R//Así que, en general, == en primitivas compara valores como se espera. Pero en los objetos (y creo que 
los arrays son objetos en Java), compara referencias. Esto significa que cuando se comparan dos variables 
de objeto, se comprueba si estas variables apuntan exactamente al mismo objeto, es decir, si la dirección 
que contienen (que es la dirección del objeto) es la misma.

Pero a veces se quiere comprobar si los objetos son iguales de alguna otra manera, como por ejemplo por su 
contenido. Ahí es donde entra .equals(). Generalmente se anula cuando se crea una clase, pero para los arrays 
se comprueba si los contenidos son iguales.*/