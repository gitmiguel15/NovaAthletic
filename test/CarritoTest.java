public class CarritoTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Prueba", 50);
        Producto p2 = new Producto("Prueba", 50);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        double total = carrito.calcularTotal();

        assert total == 100 : "Error: el total debería ser 100";

        System.out.println("Prueba de primera versión OK.");
    }
}
