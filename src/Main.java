public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        carrito.agregarProducto(new Producto("Camiseta deportiva", 59.90));
        carrito.agregarProducto(new Producto("Short de entrenamiento", 79.90));
        carrito.agregarProducto(new Producto("Zapatillas running", 199.90));

        // Aplicar descuento del 10% (0.10)
        carrito.aplicarDescuento(0.10);

        double total = carrito.calcularTotal();
        double igv = carrito.calcularIGV();
        double descuento = carrito.calcularDescuento();
        double totalFinal = carrito.calcularTotalFinal();

        System.out.println("Total sin IGV: S/ " + total);
        System.out.println("IGV (18%): S/ " + igv);
        System.out.println("Descuento (10%): S/ " + descuento);
        System.out.println("Total Final: S/ " + totalFinal);
    }
}
