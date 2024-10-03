package Libreria;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("1984", "George Orwell");

        // Agregar los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar los libros disponibles en la biblioteca
        biblioteca.mostrarLibros();

        // Crear un miembro de la biblioteca
        Miembro miembro = new Miembro("Juan Pérez", 101);

        // Crear un bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Ana López", 5001);

        // Gestionar el préstamo de un libro
        System.out.println("\n--- Gestionando préstamo ---");
        bibliotecario.gestionarPrestamo(libro1, miembro);

        // Intentar prestar el mismo libro nuevamente (debe fallar porque ya está prestado)
        System.out.println("\n--- Intentando prestar el mismo libro nuevamente ---");
        bibliotecario.gestionarPrestamo(libro1, miembro);

        // Devolver el libro
        System.out.println("\n--- Devolviendo libro ---");
        libro1.devolver();

        // Intentar prestar el libro nuevamente (ahora debería ser posible)
        System.out.println("\n--- Prestando libro nuevamente ---");
        bibliotecario.gestionarPrestamo(libro1, miembro);

        // Mostrar los libros después del préstamo
        System.out.println("\n--- Estado de los libros ---");
        biblioteca.mostrarLibros();
    }
}
