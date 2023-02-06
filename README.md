# Programación orientada a objetos

## Programación genérica

Consiste en un código de programación que se pueda reutilizar para objetos de diversos tipos. Se adapta al tipo de dato que le este pasando el usuario.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216878887-b7907c24-0542-48e4-958f-5b198ab6cece.png"> </p>


¿Por qué se usa?
* * Mayor sencillez del código.
* * Reutilizacón del código en numerosos escenarios.
* * Comprobación de errores en tiempo de compilación.

Problemas si se usa la herencia para crear una clase que controle todo tipo de objetos
- - Uso continuo de casting (cambiar el tipo de dato).
- - Complicación del código.
- - No posibilidad de comprobación de errores.
- - Errores en tiempo de ejecución, no en tiempo de compilación.

## Convertir clase normal en genérica

Lo definimos colocando simbolos de mayor y menor  con una letra dentro en el nombre de la clase.

Por convenio se suele colocar las letras T, U o K, pero también funciona con cualquier otra.

### Ejemplo

Creamos un método que solicita un dato de tipo genérico.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216883646-2085d50f-4228-4db9-92d9-bbba3d82a0ed.png"> </p>

Creamos una nueva instancia en la que especificamos que el tipo de dato que se almacenará será de tipo String.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216884000-ad23cfdc-d9d7-4166-90b1-c8244425e05b.png"> </p>

Al hacer uso de la instancia vemos que el tipo genérico se adapta al parámetro que se especificó al crear la instancia.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216884275-d97fbcac-2477-4767-b5bd-cb770a9d78ea.png"> </p>

Programa ejecutandose.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216885444-c782ea88-70c2-4df1-8679-5e2b0bcefb19.png"> </p>






















