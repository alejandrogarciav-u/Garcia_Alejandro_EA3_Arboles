public class Producto {

    // Datos del producto
    int id;
    String nombre;

    // Punteros hacia los hijos del árbol
    Producto izquierdo;
    Producto derecho;

    // Constructor
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }
}