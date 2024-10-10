package descuentospoo;

public class CalcularPrecio {
    public double CalcularTotal(Producto producto, EstrategiaDescuento estrategiaDescuento) {
        return estrategiaDescuento.AplicacionDescuento(producto.getPrice());
    }
}



