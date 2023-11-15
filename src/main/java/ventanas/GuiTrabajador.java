package ventanas;
import modelo.*;

import java.util.Scanner;

public class GuiTrabajador {

    public Trabajador crearTrabajador(){
        System.out.println("Ingrese nombre del trabajador: ");
        String nombre = leerSreing();
        System.out.println("Ingrese apellido del trabajador: ");
        String apellido = leerSreing();
        System.out.println("Ingrese rut del trabajador: ");
        String rut = leerSreing();
        System.out.println("Ingrese isapre del trabajador: ");
        String isapre = leerSreing();
        System.out.println("Ingrese afp del trabajador: ");
        String afp = leerSreing();
        return new Trabajador(nombre, apellido, rut, isapre, afp);
    }

    String leerSreing(){
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }

}