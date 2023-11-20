package modelo;

import javax.swing.*;

public enum Controlador {
    INSTANCE;

    Empresa empresa;
    public void crearTrabajador(String nombre, String apellidos, String rut, String isapre, String afp) {
        Trabajador trabajador = new Trabajador(nombre, apellidos, rut, isapre, afp);
        JOptionPane.showMessageDialog(null, "Trabajador creado");
        empresa = new Empresa(trabajador);
        JOptionPane.showMessageDialog(null, "El trabajador se ha agregado a la empresa");

    }

    public void mostrarTrabajadores() {
        empresa.mostrarTrabajadores();
    }
}
