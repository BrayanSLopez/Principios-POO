package descuentospoo;

class DescuentoTemporada implements EstrategiaDescuento{
    @Override
    public double AplicacionDescuento(double precio) {
        return precio * 0.9;
    }
}
//Aplica el 10% de descuento por esta temporada





