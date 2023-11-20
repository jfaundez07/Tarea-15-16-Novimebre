package modelo;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> trabajadores;

    public Empresa() {
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }


    public void mostrarTrabajadores() {
        for(Trabajador trabajador : this.trabajadores) {
            trabajador.mostraDatos();
        }
    }

}
