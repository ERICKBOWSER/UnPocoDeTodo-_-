# Programación

## API de Java

Los paquetes que estan en cursiva son interfaces, no clases.

Si un método es **static void**, dado que es estatico y no devuelve nada, estamos obligados a usar el nombre de la clase primero seguido del nombre del método.

Ejemplo: `Arrays.sort();`
* Arrays es la clase.
* sort() el método de la clase.


## Teoría

**Sobrecarga de métodos**: dependiendo del número de parametros y el tipo del parametro se usa uno u otro. Estos tienen que estar definidos.

### Composición

La composición consiste en crear una clase nueva agrupando objetos de clases que ya existen. 
Ejemplo: de clase Vehiculo y Cliente se crea la clase VehiculoAlquilado la cuál relaciona una instancia de la clase Vehiculo con otra de Cliente y crea objetos que almacenan relaciones entre las dos.


La **composición débil** también conocida como **agregación**, consiste en que una clase A(VehiculoAlquilado) agrupa a uno o varios elementos de la clase B(Vehiculo/Cliente). Se dice que esta composición es débil porque un objeto Vehiculo o Cliente puede seguir existiendo en el programa independientemente de que exista un objeto VehiculoAlguilado.

UML: se representa mediante diagramas UML usando un rombo sin relleno y la cardinalidad siempre es 1:

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/227802669-a883a2de-849f-4c5c-9840-d4e85c33b6d5.png"> </p>


La **composición fuerte** hace referencia a que la relación de vida que hay entre los objetos que la componene está ligada.

Si no existe la clase contenedora A no podría existir la clase contenida B.

Ejemplo: si un objeto Factura se compone de varios objetos LineaFactura, no tiene sentido que exista el objeto LineaFactura no puede ser compartido por varios objetos de tipo Factura.

UML: se representa mediante un rombo con relleno y la cardinalidad siempre es 1:

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/227804075-21129edf-7473-4a61-af7d-53c459f13722.png"> </p>


## Cosas a tener en cuenta

Si se pide un dato por pantalla dentro de un **try catch** se tiene que limpiar el Scanner después de pillar el error. Sobretodo si esta dentro de un bucle ya que solo se ejecutara el error.

Forma correcta.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224524332-519e14a7-c3fc-4cc7-8c79-45025ba94703.png"> </p>

Atributos de instancia: son aquellos a los que se acceden con **this** mo

## Array

¿Qué es?

Estructura de datos que contiene una colección de valores del mismo tipo.

¿Para que se usa?

Para almacenar valroes que normalmente tienen alguna relación entre sí.

Código: `tipo[] nombreArray = new tipo[tamanio]`

* **tipo[]** es el tipo de dato que va a almacenar(String, int, double, object, etc.)
* **nombreArray** es el nombre que va a tener.
* **new tipo[]** para crear el array y especificar el tipo de dato que va a almacenar.
* **tamanio** es el tamaño que va a tener, es decir, el número de indices.

### Declaración de un array

Ejemplo de declaración de array de tipo entero(int) que tiene un tamaño de 5.

Código: `int[] array = new int[5];`

Representación gráfica

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224519473-3b8b602d-c56f-49f3-bc47-d938b567f941.png"> </p>

### Inicializar

Introducir datos en el array.

Código: `nombreArray[posicion] = dato;`

Ejemplo: `array[2] = 50`;


### Declarar e inicializar un array

Consiste en introducir datos en el array al crearlo.

Código: `tipo[] nombreArray = {dato1, dato2, etc...};`

Ejemplo: `int[] array = {15, 25, -8, 7, 88};`

IMPORTANTE: para actualizar un dato hay que sobreescribirlo poniendo la posición en la que se encuentre.

## Arrays multidimensionales(Matrices)

Representación gráfica

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224581880-7b09ca77-e3ee-438a-8457-42e67330b4ee.png"> </p>

### Declaración de matriz

Código: `tipo[][] nombreMatriz = new tipo[tamanioColumna][tamanioFila]`;

Ejemplo: `int[][] matriz = new int[4][5];`

### Inicialización

Código: `nombreMatriz[indiceColumna][indiceFila] = dato;`

Ejemplo: `matriz[5][2] = 10;`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224582216-4623828f-fd4d-45db-9f1c-7951a89244f5.png"> </p>

### Declaración e inicialización

Código: `tipo[][] nombreMatriz = {{dato1, dato2}, {dato1, dato2}}`

Ejemplo de matriz de 3 filas y 2 columnas: `int[][] matriz = {{5, 6}, {8, 4}, {6, 2}};`

### Foreach 

Foreach para recorrer todas las filas y columnas de la matriz.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224583022-5dcdfb94-e329-434f-9692-a2d5416f3d9d.png"> </p>

## ArrayList

Métodos

ensureCapacity(tamaño)
- Crea un array con el tamaño que se especifique, pero si hace falta más espacio el array se seguirá rellenando.

trimToSize()
- Recorta el espacio sobrante, se suele colocar al final del array.

## Iterador

Nos permite acceder secuencialmente a los elementos de una colección.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224596861-5a7c1d56-d83e-4b6a-9d53-b5ae5576e016.png"> </p>


# Colecciónes

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224616976-c7838bd8-0e89-433f-9359-51e8c05d3485.png"> </p>


### Importante
La interfaz Set es una colección que NO permite elementos duplicados. Si se añade un elemento que ya existe no se modifica la colección y devuelve false.

***

Una colección no es capaz de almacenar datos primitivos.

*** 

Se puede insertar y eliminar datos de forma dinámica.

***

Es imprescindible implementar equals y hashcode.

## Set

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224618611-a034fd1f-8ed6-44a3-82b0-4dc09358bfd5.png"> </p>


Clases más usadas:

* HashSet
* * Tiene mejor rendimiento.
* * No garantiza ningún orden de los elementos.
* * Se permite el uso de elementos nulos.
* TreeSet 
* * Necesita que los elementos implementen la interfaz Comparable.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/218928588-cb0165e7-5ba4-486f-b5b5-3a2c4ee61169.png"> </p>

### Declaración

Código: `Set<tipoGenerico> nombreSet = new tipoClase();`

Ejemplo: `Set<Cliente> clientes = new HashSet();`

### Inicialización

Código: nombreSet.add(dato);

Ejemplo: `clientes.add(cliente1);`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224625283-f9ab62d8-a7bf-452e-9b77-c41af109b2fd.png"> </p> 

Es imprescindible que lleven equals y hashcode para que no se incluyan los datos repetidos.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224636973-6a86be93-e90d-4c62-8997-0f07389e20ea.png"> </p> 



## List

Para poder crear colecciones de tipo List hay que hacer usando las clases ArrayList, LinkedList, Vector o CopyOnWriteArrayList.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224618287-70d1b843-6ebd-46a9-84c9-7f3065df873d.png"> </p>


Cuando usar una clase u otra

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224618465-6f6ccaa9-acaf-4186-a659-d92342ed03b2.png"> </p>



## Map

### Métodos

replace()
*  si no existe no hace nada.

put()
* si no existe lo añade.

### Declaración

Código: `tipoClase<k, v> nombreMap = new tipoClase();`

Ejemplo: `HashMap<String, Empleado> personal = new HashMap();`


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

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224604110-87588509-1c67-4167-87c0-5b55d87f8d1a.png"> </p>

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

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224605485-a29f8bcb-a6a9-4539-94be-acefd7d77197.png"> </p>




### Ejemplo

Creamos un método que solicita un dato de tipo genérico.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216883646-2085d50f-4228-4db9-92d9-bbba3d82a0ed.png"> </p>

Creamos una nueva instancia en la que especificamos el tipo de dato que va a almacenar la clase.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216884000-ad23cfdc-d9d7-4166-90b1-c8244425e05b.png"> </p>

Al hacer uso de la instancia vemos que el tipo genérico se adapta al parámetro que se especificó al crear la instancia.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216884275-d97fbcac-2477-4767-b5bd-cb770a9d78ea.png"> </p>

Programa ejecutandose.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/216885444-c782ea88-70c2-4df1-8679-5e2b0bcefb19.png"> </p>

### Crear métodos genéricos

Código: `public static <T> tipoDevolver nombreMetodo(T a){}`

Ejemplos de métodos 

En el segundo método se especifica que el tipo genérico es una interfaz Comparable ya que el método compareTo() necesita la interfaz. 

IMPORTANTE: solo se le podrá pasar datos de tipo Comparable.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/224610853-68664704-85f6-4a1b-b889-ad51da3e67df.png"> </p>




## Herencia

Capacidad que tienen los lenguajes orientados a objetos para extender clases. La clase en la que se extiende hereda el comportamiento, los atributos y métodos de la superclase. 

La clase original se denomina clase base, padre o superclase.

La clase que hereda se denomina clase derivada, clase hija o subclase. Es una especialización de la superclase.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/222995680-3a18aefb-c048-4460-b0ab-1112ce966266.png"> </p>


### IMPORTANTE

La clase hija puede acceder a atributos y métodos de la clase padre (si son visibles) pero los métodos de las clases hijas no son visibles desde la clase padre.
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

Un objeto de una superclase no puede acceder a los métodos de una subclase aunque sean públicos.

***
La propagación de herencia es que todos los métodos del padre son heredados por los hijos, **el último se conoce como clase FINAL**.

***
Todas las clases Java extienden de la clase java.lang.Object
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

Polimorfismo significa "la facultad de asumir muchas formas", refiriéndose a la facultad de llamar a métodos sintácticamente iguales a objetos de tipos distintos.

Con la herencia y el polimorfismo se puede sobreescribir cualquier método heredado.

La selección dinámica de métodos implementa el polimorfismo en tiempo de ejecución.

Ejemplo: la sentencia objeto.getAtributos() llama al método getAtributos() de la clase a la que apunta la variable objeto. Si objeto apunta a la clase Deportivo, ejecutará el método de esa clase.

Principio de sustitución: se puede utilizar un objeto de la subclase siempre que el programa espere un objeto de la superclase.

O lo que es lo mismo: un objeto su puede comportar de diferentes formas dependiendo del contexto. Las variables objeto son polimórficas.

En este ejemplo, el array misEmpleados esta esperando un nueva instancia de tipo Empleado, pero en cambio se le pasa un objeto de tipo Jefatura, a esto se le denomina principio de sustitución.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223005465-36adf9ef-6883-4ba5-9d47-3848f07a3be7.png"> </p>

### Enlazado dinámico

La máquina virtual de Java es capaz en tiempo de ejecución de saber a que método perteneciente a la clase padre o a la subclase tiene que llamar.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223007839-1985ea8d-d02d-48c1-b2e0-8ac248c0c719.png"> </p>

### Compatibilidad de tipos

Las operaciones de casting o conversión de tipos es posible entre objetos que tienen relación de herencia.

Una referencia de la superclase puede apuntar un objeto de cualquiera de sus subclases.

#### Casting implicito

Es una conversión ascendente de tipos, denominada "upcasting".

Cualquier referencia de la superclase puede apuntar a una instancia de la superclase o las subclases.

Ejemplo: Vehiculo es el padre y Turismo, Deportivo, Furgoneta los hijos.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/227994161-36cc938f-e8ef-4eeb-9470-1f725a1d26d1.png"> </p>

IMPORTANTE: aunque miCoche haga referencia a una subclase, solo puede acceder a atributos y métodos de la superclase.



#### Casting explícito

Es una conversión descendente de tipo en la cuál se hace una referencia de una superclase en una subclase denominada "downcasting".

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

### Casting de datos

Se usa para cambiar el tipo de una variable.

`tipo variableNuevo = (tipoACambiar) variableCambiar`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223009915-527de311-704c-4d7d-b9a5-1e55ab461efb.png"> </p>

## Clases y métodos final

### IMPORTANTE

Al definir una clase como final, sus métodos también cambian sin tocarlos.

***

### Clases final

Se usa para que por ejemplo no se puedan crear más hijos de una clase.

Código: `final class nombreClase extends claseExtiende{}`

Esto hace que ya no se puedan crear más herencias de ella.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223016971-a2a1407a-c000-457f-bf04-236595c22c95.png"> </p>

### Métodos final

Se usa para que no se puedan crear métodos con el mismo nombre en las clases que hereden la clase en la que ha sido definida.

Código: `public final tipo nombreMetodo()`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223017676-ea343bb9-a12d-4573-aafe-c3839ac76a9c.png"> </p>

Si un hijo tiene un método con el mismo nombre nos saldrá un error informandonos que no se puede sobreescribir ya que es un método final. Pasa solucionarlo bastaría con cambiar el nombre en el hijo o el padre.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223017726-e1083890-c38b-41ab-82fc-084ac4db53ab.png"> </p>

## Clases abstractas

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223020761-1bb33056-51a5-4fa6-8c1b-45ae3fc07d41.png"> </p>

### IMPORTANTE

Si se implementa el método abstracto y tiene un hijo, que a su vez tiene otro hijo y este implementa el método abstracto, no hace falta que su padre también lo haga.

***

Cuando se define un método como abstracto también se tiene que definir a la clase. Se usa cuando los datos tienen que ser diferentes.

***

Si no se especifica el tipo de privacidad en la clase puede dar fallos.

***


Ejemplo de definir un método abstracto sin hacerlo antes en el padre.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223021841-fbff0c9b-fa90-4435-b6b8-15e46b681520.png"> </p>

***

Cuando se define un método como abstracto, el resto de clases estan **obligadas** a sobreescribir ese método. Es decir, que en cada uno hay que crear un método con el mismo nombre y construirlo para esa clase en especifico.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223022532-ffe8c58e-6186-441b-b1cc-aec9f22ca318.png"> </p>

Una vez creado y definido el método desaparece el error.

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223022962-040c5b16-dd11-4438-8d6b-8b702b7d06fc.png"> </p>

***

Definir un método abstracto: `public abstract tipo nombreMetodo();`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223021752-1403d23a-5a67-4292-b7d9-8395a41a001b.png"> </p>

Definir una clase abstracta: `abstract class nombreClase{}`

<p align="center"> <img src="https://user-images.githubusercontent.com/92431188/223022047-ab371d8e-0cb3-4d1f-abe7-1e39946690d8.png"> </p>

Contaminación de la interfaz -- BUSCAR EN CASA

## Expresiones lambda

Función anónima, funciones de cierre, Closures(método anónimo).

Implementan un método definido en una Interface funcional.


## Pattern

Los patrones son iguales en todos los lenguajes.

***

Hay que tener cuidado con la \ al implementarlo en java ya que pide \\, cosa que solo hace falta colocar uno en programas de ayuda.































