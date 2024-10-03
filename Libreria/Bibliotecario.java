package Libreria;

public class Bibliotecario extends Persona {
    // Atributo privado 
    private int idEmpleado;

    // Constructor público
    public Bibliotecario(String nombre, int idEmpleado) {
        super(nombre); // Llama al constructor de la superclase
        this.idEmpleado = idEmpleado;
    }

    // Getter y setter 
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // Implementación del método abstracto
    @Override
    protected void mostrarIdentificacion() {
        System.out.println("ID Empleado: " + idEmpleado + ", Nombre: " + nombre);
    }

    // Método para gestionar el préstamo de libros
    public void gestionarPrestamo(Libro libro, Miembro miembro) {
        if (!libro.isPrestado()) {
            libro.prestar();
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + miembro.getNombre() + ".");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
        }
    }
}
