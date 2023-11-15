package modelo;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> trabajadores;

    public Empresa(Trabajador newTrabajador) {
        this.trabajadores = new ArrayList<Trabajador>();
        this.trabajadores.add(newTrabajador);
    }


    public void mostrarTrabajadores() {
        for (Trabajador trabajador : trabajadores) {
            trabajador.mostraDatos();
        }
    }
}
