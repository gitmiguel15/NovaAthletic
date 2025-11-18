public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camiseta deportiva", 59.90);
        Producto p2 = new Producto("Short de entrenamiento", 79.90);
        Producto p3 = new Producto("Zapatillas running", 199.90);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        double total = carrito.calcularTotal();

        System.out.println("Total de la compra: S/ " + total);
    }
}
