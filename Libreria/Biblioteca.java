package Libreria;

public class Biblioteca {
    
    private Catalogo catalogo;

    // Constructor 
    public Biblioteca() {
        this.catalogo = new Catalogo();
    }

    // Getter y setter
    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    // Método público para agregar libros
    public void agregarLibro(Libro libro) {
        catalogo.agregarLibro(libro);
    }

    // Método público para mostrar los libros
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : catalogo.listarLibros()) {
            String estado = libro.isPrestado() ? " (Prestado)" : " (Disponible)";
            System.out.println(libro.getTitulo() + " de " + libro.getAutor() + estado);
        }
    }
}
