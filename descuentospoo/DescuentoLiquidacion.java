package descuentospoo;

class DescuentoLiquidacion implements EstrategiaDescuento{
    @Override
    public double AplicacionDescuento(double precio) {
        return precio * 0.7; // 30% de descuento
    }
}
//Aplica el 30% de descuento por liquidacion



