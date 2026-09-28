public class ArbolInventario {

    // Raíz del árbol
    private Producto raiz;

    // Constructor
    public ArbolInventario() {
        raiz = null;
    }

    // Método público para insertar un producto
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    // Método recursivo para insertar un producto según su ID
    private Producto insertarRecursivo(Producto actual, int id, String nombre) {

        // Si el espacio está vacío, se crea un nuevo nodo
        if (actual == null) {
            return new Producto(id, nombre);
        }

        // Si el ID es menor, se inserta hacia la izquierda
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        }

        // Si el ID es mayor, se inserta hacia la derecha
        else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        }

        return actual;
    }

    // Muestra el inventario usando recorrido Inorden
    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
        } else {
            recorrerInorden(raiz);
        }
    }

    // Recorrido Inorden: izquierda, raíz, derecha
    private void recorrerInorden(Producto actual) {

        if (actual != null) {
            recorrerInorden(actual.izquierdo);

            System.out.println("ID: " + actual.id
                    + " | Nombre: " + actual.nombre);

            recorrerInorden(actual.derecho);
        }
    }

    // Busca un producto por su ID
    public boolean buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    // Método recursivo de búsqueda
    private boolean buscarRecursivo(Producto actual, int id) {

        if (actual == null) {
            return false;
        }

        if (id == actual.id) {
            return true;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }

        return buscarRecursivo(actual.derecho, id);
    }
}