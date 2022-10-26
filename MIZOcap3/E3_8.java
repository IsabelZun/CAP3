/*Describa un método para encontrar el nodo medio de una lista doblemente enlazada con encabezado y 
 centinelas de tráiler mediante "saltos de enlaces" y sin depender de conocimientos explícitosdel tamaño 
 de la lista. En el caso de un número par de nodos, informe el nodoligeramente a la izquierda del centro como el "medio". 
 ¿Cuál es el tiempo de ejecución de este método?*/


 /*Una lista doblemente enlazada es una estructura de datos enlazados en informática que consta de un grupo de elementos 
 conectados secuencialmente llamados nodos. Hay tres campos en cada nodo: dos campos de enlace (referencias al nodo anterior 
 y siguiente en la secuencia de nodos) y un campo de datos. Se utiliza un nodo de encabezado en la implementación de la lista
 doblemente enlazada, tal como se hace en nuestra implementación de la lista enlazada de forma sencilla. También se agrega un
 nodo de cola al final de la lista. El tailer es similar al header en que es un nodo sin valor que existe en todo momento. 
 Deseamos encontrarnos en medio de la lista doblemente enlazada acercándonos tanto desde el encabezado como desde el tráiler.
 Si el número de entradas en la lista doblemente enlazada es par, se cruzarán entre sí. En esta situación, debemos verificar 
 si el encabezado y el remolque están cerca uno del otro cuando se mueven. La solución es si el número de elementos en la lista 
 de doble enlace es impar. El nodo ligeramente a la izquierda del centro tiene un tiempo de ejecución O(n/2), que es igual a 0. (n).  */