package Libreria;

public class Prestamo {
    // Atributos privados, solo accesibles dentro de la clase
    private Libro libro;
    private Miembro miembro;

    // Constructor público
    public Prestamo(Libro libro, Miembro miembro) {
        this.libro = libro;
        this.miembro = miembro;
    }

    // Getters y setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    // Métodos para gestionar préstamos y devoluciones
    public void realizarPrestamo() {
        libro.prestar();
        System.out.println("Préstamo realizado a " + miembro.getNombre() + " del libro " + libro.getTitulo());
    }

    public void devolverLibro() {
        libro.devolver();
        System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto.");
    }
}