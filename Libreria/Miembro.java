package Libreria;

public class Miembro extends Persona {
    // Atributo privado solo accesible dentro de la clase
    private int idMiembro;

    // Constructor público
    public Miembro(String nombre, int idMiembro) {
        super(nombre); // Llama al constructor de la superclase
        this.idMiembro = idMiembro;
    }

    // Getter y setter 
    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    // Implementación del método abstracto
    @Override
    protected void mostrarIdentificacion() {
        System.out.println("ID Miembro: " + idMiembro + ", Nombre: " + nombre);
    }
}
