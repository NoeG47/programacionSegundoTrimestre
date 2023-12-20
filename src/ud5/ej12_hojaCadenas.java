package ud5;

import java.util.Scanner;

/*
 * Ejercicio 12. Realizar un programa en java que gestione 
 * los datos de stock de una
tienda de comestibles,la información a recoger será: 
nombre del producto(no se
puede repetir), 
precio, 
cantidad en stock.
La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
1. Dar de alta un producto nuevo.
2. Buscar un producto por su nombre.
3. Modificar el stock y precio de un producto dado.
 * 
 * */
public class ej12_hojaCadenas {
	// Vamos a almacenar cada producto en el formato
	// "nombre;stock;precio"
	static Scanner in;
	static String[] productos;
	static String[] nombresRegistrados;
	static int pos;

	public static void main(String[] args) {
		// Construimos un array de productos, inicialmente
		// cada posicion es null
		productos = new String[10];
		nombresRegistrados = new String[10];
		in = new Scanner(System.in);
		int opcion = 1;
		pos = 0;
		do {

			System.out.println("1. Dar de alta un producto nuevo.");
			System.out.println("2. Buscar un producto por su nombre.");
			System.out.println("3. Modificar el stock y precio de un producto dado.");
			System.out.println("4. Salir");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				altaProducto();
				break;
			case 2:
				buscarProducto();
				break;
			case 3:
				modificarProducto();
				break;
			case 4:
				System.out.println("Hasta otra");
				break;
			default:
				System.out.println("Opción no válida.");

			}
		} while (opcion != 4);

	}

	public static void altaProducto() {
		String producto = "", nombre, stock, precio;

		// Consumir el carácter de nueva línea pendiente
		in.nextLine();

		System.out.println("Introduce nombre:");
		nombre = in.nextLine();

		// verificar si el nombre ya está registrado

		if (nombreYaRegistrado(nombre)) {
			System.out.println("El producto ya está registrado.");
			return; // Salir del método si el nombre ya está registrado
		}

		System.out.println("Introduce stock:");
		stock = in.nextLine();

		System.out.println("Introduce precio:");
		precio = in.nextLine();

		// construyo los datos del producto en el formato: "nombre;stock;precio"
		producto = nombre + ";" + stock + ";" + precio;

		// almaceno el producto si hay espacio
		if (pos < 10) {
			productos[pos] = producto;
			nombresRegistrados[pos] = nombre;
			pos++;
			System.out.println("Producto agregado correctamente.");
		} else {
			System.out.println("No hay espacio. Tienes 10 productos");
		}
	}

	public static boolean nombreYaRegistrado(String nombre) {
		// Verificar si el nombre ya está en el array temporal de nombresRegistrados
		for (int i = 0; i < pos; i++) {
			if (nombre.equals(nombresRegistrados[i])) {
				return true;
			}
		}
		return false;
	}

	public static void buscarProducto() {
		in.nextLine();

		System.out.println("Introduce el nombre del producto a buscar:");
		String nombreProductoBuscar = in.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < pos && !encontrado; i++) {
			String[] partesProducto = productos[i].split(";");
			if (nombreProductoBuscar.equals(partesProducto[0])) {
				System.out.println("Producto encontrado:");
				System.out.println("Nombre: " + partesProducto[0]);
				System.out.println("Stock: " + partesProducto[1]);
				System.out.println("Precio: " + partesProducto[2]);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Producto no encontrado.");
		}
	}
	public static void modificarProducto() {
	    in.nextLine(); // Consumir el carácter de nueva línea pendiente

	    System.out.println("Introduce el nombre del producto a modificar:");
	    String nombreModificar = in.nextLine();

	    boolean encontrado = false;

	    // Buscar el producto por nombre en el array productos
	    for (int i = 0; i < pos && !encontrado; i++) {
	        String[] partesProducto = productos[i].split(";");
	        if (nombreModificar.equals(partesProducto[0])) {
	            System.out.println("Producto encontrado:");
	            System.out.println("Nombre: " + partesProducto[0]);
	            System.out.println("Stock actual: " + partesProducto[1]);
	            System.out.println("Precio actual: " + partesProducto[2]);

	            System.out.println("Introduce nuevo stock:");
	            String nuevoStock = in.nextLine();

	            System.out.println("Introduce nuevo precio:");
	            String nuevoPrecio = in.nextLine();

	            // Modificar el stock y precio del producto usando replace
	            productos[i] = productos[i].replace(partesProducto[1], nuevoStock);
	            productos[i] = productos[i].replace(partesProducto[2], nuevoPrecio);

	            System.out.println("Stock y precio modificados correctamente.");
	            encontrado = true;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Producto no encontrado.");
	    }
	}
}