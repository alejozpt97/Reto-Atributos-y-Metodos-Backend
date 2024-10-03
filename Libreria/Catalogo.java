package Libreria;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Libro> libros;

    // Constructor que inicializa la lista de libros
    public Catalogo() {
        this.libros = new ArrayList<>();
    }

    // Método para obtener la lista de libros (getter)
    public List<Libro> getLibros() {
        return libros;
    }

    // Método para agregar un libro al catálogo
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
    }

    // Método para listar los libros del catálogo
    public List<Libro> listarLibros() {
        return libros;
    }
}
