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
	static int pos;

	public static void main(String[] args) {
		// Construimos un array de productos, inicialmente
		// cada posicion es null
		productos = new String[10];
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
				// modificarProducto();
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

		System.out.println("Introduce nombre:");
		nombre = in.nextLine();
		in.nextLine(); 
		// Verificar si el producto ya existe
		boolean productoExiste = false;
		for (int i = 0; i < pos; i++) {
			String[] datosProducto = productos[i].split(";");
			if (datosProducto.length > 0 && datosProducto[0].equals(nombre)) {
				productoExiste = true;

			}
		}

		if (productoExiste) {
			System.out.println("Este producto ya ha sido introducido.");
			return;
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
			pos++;
			System.out.println("Producto agregado correctamente.");
		} else {
			System.out.println("No hay espacio. Tienes 10 productos");
		}
	}

	public static void buscarProducto() {
		String productoBuscado = "";
		System.out.println("Introduce el nombre del producto a buscar:");
		productoBuscado = in.nextLine();
		in.nextLine();
		for (int i = 0; i < productos.length; i++) {
			if (productoBuscado == productos[i]) {
				System.out.println(productos[i]);
				System.out.println("hola");
			}
		}
	}

}