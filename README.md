# Resumen.

Se trata de un compilador donde dado un archivo de texto siguiendo la sintaxis del lenguaje Ces, lo tokeniza, lo analiza léxica, sintáctica y semánticamente, 
determina la tabla de tipos y de símbolos, realiza el ćódigo intermedio mediante cuartetos de pseudocódigo máquina y finalmente los traduce a instrucciones de código máquina 
y las introduce en la memoria de un simulador de un pocesador para que éste las pueda computar y lanzar por pantalla el resultado. 

## Requisitos.

Probado sólo en Eclipse. 
Es necesario tener instalado Java y configurado JFlex y JCup. 

## Descripción.

- Tokenización y análisis léxico utilizando expresiones regulares y estados mediante automata finito proporcionado por JFlex (scanner.flex):

<p align="center">
  <img src="https://i.postimg.cc/gcN9jb9Q/JFlex.png" alt="JFlex parte de código" style="padding: 40px;">
</p>

- Análisis sintáctica, semántico, determinación de tabla de tipos y símbolos y creación de código intermedio utilizando JCup para crear el árbol sintáctico-semántico (parser.cup):

<p align="center">
  <img src="https://i.postimg.cc/VsgVWxRw/CUP.png" alt="JCup parte de código" style="padding: 40px;">
</p>

- Traducción de código intermedio a código máquina e introducción en simulador de procesador (Java): 

#### <p align="center">Programa ejemplo</p>
<p align="center">
  <img src="https://i.postimg.cc/Y9rY8srG/Ejemplo-codigo.png" alt="JCup parte de código" style="padding: 40px;">
</p>

#### <p align="center">Traducción a código intermedio y máquina</p>
<p align="center">
  <img src="https://i.postimg.cc/R0MWzJj2/Ejemplo-traducci-n-c-digo.png" alt="JCup parte de código" style="padding: 40px;">
</p>

## Utilidad.

Me ha servido para comprender a fondo el funcionamiento fundamental de los lenguajes de programación. 
Comprendiendo en profundidad el cómo funciona el compilador, descubriendo el truco de magía detrás de la computación del lenguaje de programación por el procesador.
También ha sido mi mayor reto intelectual, lo que me ha permitido crecer en cuanto a mis habilidades lógicas y mi capacidad de resilencia ante la frustaciíón. 
