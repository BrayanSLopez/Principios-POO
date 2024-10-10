package descuentospoo;

public class DescuentosPOO {

    public static void main(String[] args) {
        Producto Computador = new Producto("Computador", 5000000.0);

        CalcularPrecio Calcular = new CalcularPrecio();

        // Sin descuento
        EstrategiaDescuento sinDescuento = new SinDescuento();
        System.out.println("Precio sin descuento: " + Calcular.CalcularTotal(Computador, sinDescuento));

        // Descuento estacional
        EstrategiaDescuento descuentoTemporada = new DescuentoTemporada();
        System.out.println("Precio con descuento estacional: " + Calcular.CalcularTotal(Computador, descuentoTemporada));

        // Descuento de liquidación
        EstrategiaDescuento descuentoLiquidacion = new DescuentoLiquidacion();
        System.out.println("Precio con descuento de liquidacion: " + Calcular.CalcularTotal(Computador, descuentoLiquidacion));
    }
    
}
