package set1_2;

import java.util.*;

public class Biblioteca {

//	ATRIBUTOS

	ArrayList<Publicacion> listaPublicacion = new ArrayList<Publicacion>();

//	CONSTRUCTOR

	public Biblioteca() {

	}

//	MÉTODOS DE FUNCIÓN

	// AGREGAR PERIÓDICO

	public void agregarPeriodico() {

		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		// DECLARACIÓN DE VARIABLES

		float precio;
		int numeroDePaginas;
		String nombre;
		String fecha;

		// PETICIÓN DE VARIABLES

		System.out.print("Número de páginas: ");
		numeroDePaginas = entrada.nextInt();
		System.out.print("Precio: ");
		precio = entrada.nextFloat();
		System.out.print("Nombre: ");
		nombre = entrada2.nextLine();
		System.out.print("Fecha: ");
		fecha = entrada2.nextLine();

		// GUARDAR VARIABLES

		listaPublicacion.add(new Periodico(numeroDePaginas, precio, nombre, fecha));

	}

	// AGREGAR LIBRO

	public void agregarLibro() {

		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		// DECLARACIÓN DE VARIABLES

		float precio;
		int numeroDePaginas;
		String tipoPortada;
		String isbn;
		String nombreAutor;
		String editorial;

		// PETICIÓN DE VARIABLES

		System.out.print("Número de páginas: ");
		numeroDePaginas = entrada.nextInt();
		System.out.print("Precio: ");
		precio = entrada.nextFloat();
		System.out.print("Tipo de portada: ");
		tipoPortada = entrada2.nextLine();
		System.out.print("ISBN: ");
		isbn = entrada2.nextLine();
		System.out.print("Nombre del autor: ");
		nombreAutor = entrada2.nextLine();
		System.out.print("Editorial: ");
		editorial = entrada2.nextLine();

		// GUARDAR VARIABLES

		listaPublicacion.add(new Libro(numeroDePaginas, precio, tipoPortada, isbn, nombreAutor, editorial));
	}

	// AGREGAR LIBRO A PARTIR DE UBICACION

	public void agregarLibro(int i) {

		if (i < 0 | i > listaPublicacion.size()) {
			System.out.println();
			System.out.println("ERROR: PARÁMETRO FUERA DE RANGO");
			
			} 
			
		else {

			Scanner entrada = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);

			// DECLARACIÓN DE VARIABLES

			float precio;
			int numeroDePaginas;
			String tipoPortada;
			String isbn;
			String nombreAutor;
			String editorial;

			// PETICIÓN DE VARIABLES

			System.out.print("Número de páginas: ");
			numeroDePaginas = entrada.nextInt();
			System.out.print("Precio: ");
			precio = entrada.nextFloat();
			System.out.print("Tipo de portada: ");
			tipoPortada = entrada2.nextLine();
			System.out.print("ISBN: ");
			isbn = entrada2.nextLine();
			System.out.print("Nombre del autor: ");
			nombreAutor = entrada2.nextLine();
			System.out.print("Editorial: ");
			editorial = entrada2.nextLine();

			// GUARDAR VARIABLES

			listaPublicacion.add(i, new Libro(numeroDePaginas, precio, tipoPortada, isbn, nombreAutor, editorial));
		}
	}

	// AGREGAR PERIÓDICO A PARTIR DE UBICACIÓN

	public void agregarPeriodico(int i) {

		if (i < 0 | i > listaPublicacion.size()) {
			System.out.println("ERROR: PARÁMETRO FUERA DE RANGO");
		} else {

			Scanner entrada = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);

			// DECLARACIÓN DE VARIABLES

			float precio;
			int numeroDePaginas;
			String nombre;
			String fecha;

			// PETICIÓN DE VARIABLES

			System.out.print("Número de páginas: ");
			numeroDePaginas = entrada.nextInt();
			System.out.print("Precio: ");
			precio = entrada.nextFloat();
			System.out.print("Nombre: ");
			nombre = entrada2.nextLine();
			System.out.print("Fecha: ");
			fecha = entrada2.nextLine();

			// GUARDAR VARIABLES

			listaPublicacion.add(i, new Periodico(numeroDePaginas, precio, nombre, fecha));

		}
	}
	// CONTAR LIBROS Y PERIODICOS.

	public int cantidadLibros() {
		int cantidad = 0;

		for (int i = 0; i < listaPublicacion.size(); i++) {

			if (listaPublicacion.get(i) instanceof Libro == true) {
				cantidad++;
			}
		}

		return cantidad;

	}

	public int cantidadPeriodicos() {
		int cantidad = 0;

		for (int i = 0; i < listaPublicacion.size(); i++) {

			if (listaPublicacion.get(i) instanceof Periodico == true) {
				cantidad++;
			}
		}

		return cantidad;

	}

	// LISTAR LIBROS

	public void listarLibros() {

		for (int i = 0; i < listaPublicacion.size(); i++) {

			if (listaPublicacion.get(i) instanceof Libro == true) {

				System.out.println("ISBN/Título: " + ((Libro) listaPublicacion.get(i)).getIsbn());
				System.out.println("Posición del estante: " + i + ".");

			}

		}

	}

	// LISTAR PERIÓDICOS

	public void listarPeriodicos() {

		for (int i = 0; i < listaPublicacion.size(); i++) {

			if (listaPublicacion.get(i) instanceof Periodico == true) {

				System.out.println("Nombre " + ((Periodico) listaPublicacion.get(i)).getNombre());
				System.out.println("Posición del estante: " + i + ".");

			}

		}

	}

	// LISTAR PUBLICACIÓN

	public void listarPublicacion(int i) {

		if (i < 0 | i > listaPublicacion.size()) {
			System.out.println();
			System.out.println("ERROR: PARÁMETRO FUERA DE RANGO");
		} else {

			if (listaPublicacion.get(i) instanceof Libro == true) {

				System.out.println("Número de páginas: " + ((Libro) listaPublicacion.get(i)).numeroDePaginas);
				System.out.println("Precio: " + ((Libro) listaPublicacion.get(i)).precio);
				System.out.println("Tipo de portada: " + ((Libro) listaPublicacion.get(i)).tipoPortada);
				System.out.println("ISBN: " + ((Libro) listaPublicacion.get(i)).isbn);
				System.out.println("Nombre del autor: " + ((Libro) listaPublicacion.get(i)).nombreAutor);
				System.out.println("Editorial: " + ((Libro) listaPublicacion.get(i)).editorial);
				System.out.println("Posición del estante: " + i + ".");

			} else {

				System.out.println("Número de páginas: " + ((Periodico) listaPublicacion.get(i)).numeroDePaginas);
				System.out.println("Precio: " + ((Periodico) listaPublicacion.get(i)).precio);
				System.out.println("Nombre: " + ((Periodico) listaPublicacion.get(i)).getNombre());
				System.out.println("Fecha: " + ((Periodico) listaPublicacion.get(i)).getFecha());

			}

		}
	}

	// ELIMINAR PUBLICACIÓN

	// ELIMINAR PUBLICACIÓN

	public void eliminarPublicacion(int i) {

		if (i < 0 | i > listaPublicacion.size()) {
			System.out.println();
			System.out.println("ERROR: PARÁMETRO FUERA DE RANGO");
		} else {

			listaPublicacion.remove(i);

		}

	}

	// MODIFICAR PUBLICACION

	public void modificarPublicacion(int i) {

		if (i < 0 | i > listaPublicacion.size()) {
			System.out.println();
			System.out.println("ERROR: PARÁMETRO FUERA DE RANGO");
		} else {

			Scanner entrada = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);

			// DECLARACIÓN DE VARIABLES PARA PUBLICACION

			float precio;
			int numeroDePaginas;

			// DECLARACIÓN DE VARIABLES PARA LIBRO

			String tipoPortada;
			String isbn;
			String nombreAutor;
			String editorial;

			// DECLARACIÓN DE VARIABLES PARA PERIÓDICO

			String nombre;
			String fecha;

			// PETICIÓN DE VARIABLES PARA LIBRO O PERIÓDICO

			if (listaPublicacion.get(i) instanceof Libro == true) {

				System.out.print("Número de páginas: ");
				numeroDePaginas = entrada.nextInt();
				System.out.print("Precio: ");
				precio = entrada.nextFloat();
				System.out.print("Tipo de portada: ");
				tipoPortada = entrada2.nextLine();
				System.out.print("ISBN: ");
				isbn = entrada2.nextLine();
				System.out.print("Nombre del autor: ");
				nombreAutor = entrada2.nextLine();
				System.out.print("Editorial: ");
				editorial = entrada2.nextLine();

				listaPublicacion.set(i, new Libro(numeroDePaginas, precio, tipoPortada, isbn, nombreAutor, editorial));
			} else {

				System.out.print("Número de páginas: ");
				numeroDePaginas = entrada.nextInt();
				System.out.print("Precio: ");
				precio = entrada.nextFloat();
				System.out.print("Nombre: ");
				nombre = entrada2.nextLine();
				System.out.print("Fecha: ");
				fecha = entrada2.nextLine();

				listaPublicacion.set(i, new Periodico(numeroDePaginas, precio, nombre, fecha));

			}
		}
	}

}


