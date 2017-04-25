# retoPSL-LCD

Objetivo: Crear un programa que imprime números en estilo de una pantalla LCD
Entrada: La entrada contiene varios comandos. Cada comando contiene 2 números separados por coma. El primer número representa el tamaño de la impresión (entre 1 y 10, esta variable se llama “size”). El segundo número es el número a mostrar en la pantalla. Para terminar, se debe digitar 0,0. Esto terminará la aplicación.
Salida: Imprimir los números especificados usando el caracter “-“ para los caracteres horizontales, y “|” para los verticales.

# Ejemplo: 

Entrada: 
monitorLCD>2,12345
monitorLCD>3,67890
monitorLCD>0,0

Salida:
  
   _ _  _ _        _ _
|     |    | |  | |
|  _ _| _ _| |__| |_ _
| |        |    |     |
| |_ _  _ _|    |  _ _|

 _ _ _  _ _ _   _ _ _   _ _ _   _ _ _ 
|            | |     | |     | |     |
|            | |     | |     | |     |
|_ _ _       | |_ _ _| |_ _ _| |     |
|     |      | |     |       | |     |
|     |      | |     |       | |     |
|_ _ _|      | |_ _ _|  _ _ _| |_ _ _|
