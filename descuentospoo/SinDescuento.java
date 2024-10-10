package descuentospoo;

class SinDescuento implements EstrategiaDescuento {
    @Override
    public double AplicacionDescuento(double precio) {
        return precio;
    }
}

