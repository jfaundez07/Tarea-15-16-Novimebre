package ventanas;

import modelo.Empresa;
import modelo.Trabajador;

public class GuiPrincipal {

    public void ejecutar() {

        GuiTrabajador guiTrabajador = new GuiTrabajador();

        Trabajador trabajador = guiTrabajador.crearTrabajador();
        Empresa empresa = new Empresa(trabajador);

        empresa.mostrarTrabajadores();

    }
}
