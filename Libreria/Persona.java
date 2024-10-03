package Libreria;

// Clase abstracta con método abstracto protegido
public abstract class Persona {
    // Atributo protegido, accesible por subclases
    protected String nombre;

    // Constructor 
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto protegido, que debe ser implementado por las subclases
    protected abstract void mostrarIdentificacion();
}