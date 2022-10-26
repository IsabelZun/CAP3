/* 
R-3.14 Proporcione tres ejemplos diferentes de una sola declaración de Java que asigne una variable, respaldo, 
a una nueva matriz con copias de todas las entradas int de una matriz existente, original.
*/

backup = original.clone();
backup = java.util.Arrays.copyOf(original, backup.length);
backup = java.util.Arrays.copyOfRange(original, 0, backup.length);
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs