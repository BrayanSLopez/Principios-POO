Para poder aplicar el principo "O" de SOLID que significa OPEN/CLOSE:

Vamos a proponer un caso donde queremos calcular el precio total de un producto con la opcion de aplicar descuentos.

En cualquier caso donde no se aplique el Open/Close se podria crear una clase producto y una clase CalcularPrecio que contega diferentes descuentos atravez de validaciones. Si queremos que a este poroducto se le aplique un nuevo decuento estariamos violando el principio ya que tendriamos que modificar el codigo principal.

Como queremos aplicar correctamente el princio Open/Close, debemos crear diferentes clases, estre ellas una clase base para el descuento y luego extenderla para poider crear nuevos descuentos sin modificar el codigo original.

Ahora crearemos las clases bases que son: 

Clase Producto - Nombre y asignacion de precio

![image](https://github.com/user-attachments/assets/a269443f-2220-4a1c-9d8a-331a53a18de6)

Interfaz EstrategiaDescuento - Representa diferentes estrategias de descuentos

![image](https://github.com/user-attachments/assets/294943ab-c7a7-429d-9ff5-5bea533eeeba)

Tambien vamos a crear varias implementaciones de la interfaz EstrategiaDescuento para representar diferentes descuuentos:

Clase SinDescuento

![image](https://github.com/user-attachments/assets/77a00522-b9c6-4321-8993-5ad030a9033d)

Clase DescuentoTemporada

![image](https://github.com/user-attachments/assets/368f90a3-1403-41f1-882f-02ff30a8a69a)

Clase DescuentoLiquidacion

![image](https://github.com/user-attachments/assets/06d28db2-8239-4ee8-940e-4afab7d59c8c)

Crearemos una clase CalcularPrecio para que nos de el precio total dependiendo de la EstrategiaDescuento

![image](https://github.com/user-attachments/assets/f2d07852-6050-4a55-9e6a-6e13ea1ed1dc)

Y por ultimo crearemos la clase principal main para probar los diferentes tipos de descuentos sin modificar el codigo original:

![image](https://github.com/user-attachments/assets/937888b9-219c-4e52-8b46-3d6c9c888e06)


Y validamos que la salida sea la esperada: 

![image](https://github.com/user-attachments/assets/b2c55d2a-15d6-4d67-a668-06f37eabd703)


como se puede comprobar el ejemplo cumple con el princion "O" de SOLID.

Para crear el diagrama de clases se tuvo que instalar el plugin PlanUML en Netbeans y se configuro.

Para generar el diagrama se debio definir un archivo .puml llamado DiagramaDescuento.puml:

![image](https://github.com/user-attachments/assets/8f2d9242-4a7a-4fb8-99f3-ec401eee5e0d)

Y nos genera el siguiente diagrama: 

![image](https://github.com/user-attachments/assets/18932768-084b-4b55-a06e-ce4ce5da703f)















