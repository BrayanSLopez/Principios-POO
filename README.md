Para poder aplicar el principo "O" de SOLID que significa OPEN/CLOSE:

Vamos a proponer un caso donde queremos calcular el precio total de un producto con la opcion de aplicar descuentos.

En cualquier caso donde no se aplique el Open/Close se podria crear una clase producto y una clase CalcularPrecio que contega diferentes descuentos atravez de validaciones. Si queremos que a este poroducto se le aplique un nuevo decuento estariamos violando el principio ya que tendriamos que modificar el codigo principal.

Como queremos aplicar correctamente el princio Open/Close, debemos crear diferentes clases, estre ellas una clase base para el descuento y luego extenderla para poider crear nuevos descuentos sin modificar el codigo original.

Ahora crearemos las clases bases que son: 

Clase Prodcuto
