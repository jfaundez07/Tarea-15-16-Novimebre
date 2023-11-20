import modelo.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VenataTrabajador extends JFrame implements ActionListener{
    private JPanel ventanaTrabajadorPanel;
    private JFormattedTextField nombre;
    private JFormattedTextField isapre;
    private JFormattedTextField apellido;
    private JFormattedTextField afp;
    private JFormattedTextField rut;
    private JButton buttonAgregar;
    private JLabel labelNombre;
    private JLabel labelApellido;
    private JLabel labelIsapre;
    private JLabel labelAfp;
    private JLabel labelRut;

    public VenataTrabajador(){
        setUpGui();
    }

    private void setUpGui(){

        setTitle("Ingresar Trabajador");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 400);
        setContentPane(ventanaTrabajadorPanel);

        nombre.addActionListener(this);
        apellido.addActionListener(this);
        isapre.addActionListener(this);
        afp.addActionListener(this);
        rut.addActionListener(this);
        buttonAgregar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(buttonAgregar)) {
            Controlador.INSTANCE.crearTrabajador(
                    nombre.getText(),
                    apellido.getText(),
                    rut.getText(),
                    isapre.getText(),
                    afp.getText()
            );
        }
    }

}
