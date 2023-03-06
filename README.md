# Programación

## Set

La interfaz Set es una colección que NO permite elementos duplicados. Si se añade un elemento que ya existe no se modifica la colección y devuelve false.

Es imprescindible implementar equals y hashcode.

Clases más usadas:

* HashSet
* * Tiene mejor rendimiento.
* * No garantiza ningún orden de los elementos.
* * Se permite el uso de elementos nulos.
* TreeSet 
* * Necesita que los elementos implementen la interfaz Comparable.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218928588-cb0165e7-5ba4-486f-b5b5-3a2c4ee61169.png"> </p>

## Collections
Es un almacén de objetos dinámicos. Es decir, que puede cambiar de tamaño, no esta limitado como el array.

* Ordenación(sort)
* * Implementan `<<Comparable>>`
* * * CompareTo

* Búsqueda(BynarySearch)
* * Implementan `<<Comparable>>`
* * `<<Comparator>>`

### Búsqueda binaria

Divide la lista por la mitad y luego realiza la búsqueda del criterio a buscar. Para ello el objeto tiene que estar ordenado(Siempre).

**IMPORTANTE: todos los métodos comparable tienen que implementar métodos abstractos.**

Clase Pojo (orden natural)
* `<<Comparable>>` // Tiene que implementar métodos abstractos.
* * CompareTo (objeto o Pojo)

***
### IMPORTANTE

* Todos los métodos comparable tienen que implementar métodos abstractos. La variable con la que se hace el compareTo tiene que ser de tipo String.
* No es recomendable usar la clase record.

***

### Métodos
`reversed()`
* Devuelve el orden inverso


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

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222995680-3a18aefb-c048-4460-b0ab-1112ce966266.png"> </p>


### IMPORTANTE
Los métodos de las clases hijas no son visibles desde la clase padre. Por lo que no puede usarlos.
***
La llamada de los métodos hijos no pueden afectar.
***
**Super** es para la clase padre, y **this** para la propia clase.
***
La superclase de todas las clases es **Object**.
***
Es posible acceder a los atributos de la superclase si no son **private**. Pero si lo son se puede acceder mediante sus métodos **getters** y **setters**.
***
Los únicos métodos que no se heredan en una jerarquía de herencia son los constructores. Por lo que hay que crear un constructor para inicializar en todas las clases que heredan.
***
Al implementar constructores es **obligatorio** llamar al constructor de la superclase en el constructor de la clase hija, haciendo uso de la instrucción **super()**.

super() es encarga de llamar al constructor de la clase padre para darle un estado inicial a la clase del contructor hijo.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218369175-0ee220b4-1047-49bc-a1ee-29704a881554.png"> </p>

***
En Java sólo existe la **herencia simple**, esto es, una clase sólo puede heredar de otra, aunque a su vez esta otra herede de otra, y así sucesivamente.
***
La herencia permite la reutilización del código.
***
Las clases hijas pueden acceder a atributos y métodos de la clase padre(siempre y cuando sean visibles) pero no ocurre lo mismo al contrario.
***
La propagación de herencia es que todos los métodos del padre son heredados por los hijos, **el último se conoce como clase FINAL**.

***

## Establecer que una clase hereda de otra

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

## Reutilización de código

Una clase que hereda al padre, puede usar sus métodos.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222995088-01215761-51dc-4171-bb4f-ad97e08c9e74.png"> </p>

## Ejemplo de diseño de una herencia

preguntas para identificar cuál será la superclase y la subclase.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222996483-78006a33-e207-483c-b9c2-39b831f480fc.png"> </p>

Clase padre

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222996705-1b2fcfdd-7b3a-4637-99c7-0ebd1212e4f5.png"> </p>

Da error ya que Java entiende que se esta llamando al constructor por defecto del padre.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222996790-afd890ad-f54d-4b89-be44-64415d88f167.png"> </p>

Para solucionarlo hay que crear un constructor y luego llamar al padre con super(). En este ejemplo el constructor del padre solicita datos, por lo que le pasamos los datos a traves del método **super()**

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222998002-7a23afef-dbac-4f5e-982d-48fec0683b79.png"> </p>

Sobreescribir un método que ya existe en el padre.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223003183-113cdc8f-de8a-43d7-9fbe-dad478f73e37.png"> </p>

### Polimorfismo

Principio de sustitución: se puede utilizar un objeto de la subclase siempre que el programa espere un objeto de la superclase.

O lo que es lo mismo: un objeto su puede comportar de diferentes formas dependiendo del contexto. Las variables objeto son polimórficas.

En este ejemplo, el array misEmpleados esta esperando un nueva instancia de tipo Empleado, pero en cambio se le pasa un objeto de tipo Jefatura, a esto se le denomina principio de sustitución.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223005465-36adf9ef-6883-4ba5-9d47-3848f07a3be7.png"> </p>

### Enlazado dinámico

La máquina virtual de Java es capaz en tiempo de ejecución de saber a que método perteneciente a la clase padre o a la subclase tiene que llamar.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223007839-1985ea8d-d02d-48c1-b2e0-8ac248c0c719.png"> </p>

### Casting de datos

Se usa para cambiar el tipo de una variable.

`tipo variableNuevo = (tipoACambiar) variableCambiar`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223009915-527de311-704c-4d7d-b9a5-1e55ab461efb.png"> </p>

### Casting de objetos

`tipoNuevaEntidad variablenuevo = (tipoEntidadACambiar) variableCambiar`

Ejemplo: `Jefatura jefe_Finanzas = (Jefatura) misEmpleados[5];`

Regla de "Es un..."

Siguiendo esta regla, al intentar añadirle un incentivo al empleado 5 que pertenece a la clase jefatura no nos sale el método, ya que misEmpleados[5] es de tipo Empleado y no de Jefatura a pesar de que se defina uno dentro.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223009404-7296a09a-1102-44c2-a153-d49381b593f6.png"> </p>

Para solucionar esto se hace un casting de objetos en el que convertimos a misEmpleados[5] de tipo empleado en un objeto de tipo Jefatura.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223010791-231f70ae-2549-4c57-b143-194586a75e47.png"> </p>

De esta forma ya nos salen los métodos del hijo, por lo que ya se le puede aplicar el incentivo.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223011005-ae1f2a81-6b74-4372-ad7e-76cdb203223d.png"> </p>

***
IMPORTANTE: esto solo se puede hacer ya que cuando se creo al empleado se hizo de tipo Jefatura, si se intenta con un empleado de tipo Empleado daría error.
***





