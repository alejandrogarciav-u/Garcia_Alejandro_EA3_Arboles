import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();

        int opcion;

        do {
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    inventario.insertar(id, nombre);

                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n===== INVENTARIO ORDENADO =====");
                    inventario.mostrarInorden();
                    break;

                case 3:
                    System.out.print("Ingrese el ID que desea buscar: ");
                    int idBuscar = scanner.nextInt();

                    if (inventario.buscar(idBuscar)) {
                        System.out.println("El producto con ID " + idBuscar + " existe.");
                    } else {
                        System.out.println("El producto con ID " + idBuscar + " no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de Tree-Stock...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
