package Libreria;

public class Libro {
    // Atributos privados para protegerlos y permitir el acceso solo a través de getters
    private String titulo;
    private String autor;
    private boolean prestado;

    // Constructor público
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false; // El libro comienza no prestado
    }

    // Getters para acceder a los atributos privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Métodos para prestar y devolver libros
    public void prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("El libro " + titulo + " ha sido devuelto.");
        } else {
            System.out.println("El libro " + titulo + " no estaba prestado.");
        }
    }
}


