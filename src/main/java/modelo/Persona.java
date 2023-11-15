package modelo;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String rut;

    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public void mostraDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Rut: " + this.rut);
    }
}
