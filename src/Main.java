public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Camiseta", 50.0));
        carrito.agregarProducto(new Producto("Pantalón", 80.0));

        double total = carrito.calcularTotal();
        double totalConIGV = carrito.calcularTotalConIGV();

        System.out.println("Total sin IGV: " + total);
        System.out.println("Total con IGV: " + totalConIGV);
    }
}
