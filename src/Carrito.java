import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private double descuentoPorcentaje;  

    public Carrito() {
        productos = new ArrayList<>();
        descuentoPorcentaje = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void aplicarDescuento(double porcentaje) {
        descuentoPorcentaje = porcentaje;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public double calcularIGV() {
        return calcularTotal() * 0.18;
    }

    public double calcularDescuento() {
        return calcularTotal() * descuentoPorcentaje;
    }

    public double calcularTotalFinal() {
        return calcularTotal() + calcularIGV() - calcularDescuento();
    }
}


