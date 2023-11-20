package modelo;

import javax.swing.*;

public enum Controlador {

    INSTANCE;

    public void crearTrabajador(String nombre, String apellidos, String rut, String isapre, String afp) {
        Trabajador trabajador = new Trabajador(nombre, apellidos, rut, isapre, afp);
        JOptionPane.showMessageDialog(null, "Trabajador creado");
        trabajador.mostraDatos();
    }

}
