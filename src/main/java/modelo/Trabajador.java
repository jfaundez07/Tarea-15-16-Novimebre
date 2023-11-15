package modelo;

public class Trabajador extends Persona{
    private String isapre;
    private String afp;

    public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    @Override
    public void mostraDatos() {
        super.mostraDatos();
        System.out.println("Isapre: " + this.isapre);
        System.out.println("AFP: " + this.afp);
    }
}
