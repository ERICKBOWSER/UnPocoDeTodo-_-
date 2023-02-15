# Programación

## Set

La interfaz Set es una colección que NO permite elementos duplicados. Si se añade un elemento que ya existe no se modifica la colección y devuelve false.

Es imprescindible implementar equals y hashcode.

Clases más usadas:

* HashSet
* * Tiene mejor rendimiento.
* * No garantiza ningún orden de los elementos.
* TreeSet 
* * Necesita que los elementos implementen la interfaz Comparable.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218928588-cb0165e7-5ba4-486f-b5b5-3a2c4ee61169.png"> </p>


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

## Herencia

### IMPORTANTE
Los métodos de las clases hijas no son visibles desde la clase padre. Por lo que no puede usarlos.
***
La llamadas de los métodos hijos no pueden afetar
***
Super es para la clase padre, y this para la propia clase.
***
La superclase de todas las clases es Object
***
Es posible acceder a los atributos de la superclase si no fuesen private. Pero si lo son se puede acceder mediante sus métodos getters y setters.
***
Los únicos métodos que no se heredan en una jerarquía de herencia son los constructores.
***
Al implementar constructores es obligatorio llamar al constructor de la superclase en el constructor de la clase hija, haciendo uso de la instrucción "super()"

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218369175-0ee220b4-1047-49bc-a1ee-29704a881554.png"> </p>
***


En Java sólo existe la herencia simple, esto es, una clase sólo puede heredar de otra, aunque a su vez esta otra herede de otra, y así sucesivamente.

La herencia permite la reutilización del código.

Las clases hijas pueden acceder a atributosy métodos de la clase padre(siempre y cuando sean visibles) pero no ocurre lo mismo al contrario.

La propagación de herencia es que todos los métodos del padre son heredados por los hijos, el último se conoce como clase FINAL.

Los constructores no herendan
La primera línea de código de un constructor en la subclase(hija) debe llamar al constructor de la superclase(padre).

Para indicar que una clase hereda de otra se coloca:

`public class nombreSubClase extends nombreSuperClase{}`

Definir una subclase implica:
* Una subclase hereda todos los miembros de su superclase, excepto los constructores, y:
* * No tiene acceso a los miembros private de su superclase.
* * Puede acceder a los miembros public y protected de la superclase.
* Un subclase puede añadir sus propios atributos y métodos. Si el nombre de algún miembro coincide con el de un miembro heredado, éste último queda oculto para la subclase.
* Propagación de herencia: los miembros heredados por una subclase pueden ser heredados por más subclases de ella.

## Utilizar métodos de la superclase

Si hay dos métodos que tienen el mismo nombre, pero uno esta en la clase padre y otro en el hijo, se puede usar la palabra 'super' para hacer referencia al método del padre.

Método padre dentro de una clase hija:

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218368470-21d58412-1f8b-4968-b0c2-960b291c17ca.png"> </p>













