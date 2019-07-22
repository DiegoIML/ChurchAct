package Controlador;

import Vista.VentanaInsertarReunion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Diego y Bryan
 */
public class EventoInsertarReunion implements ActionListener{
    private JFrame ventana;
    private JTable jtReunion;
    public EventoInsertarReunion( JFrame ventana , JTable jtReunion) {
       this.ventana = ventana;
       this.jtReunion = jtReunion;
    }
    /**
     * Evento que crea un JDialog para rellenar el registro de una reunión.
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaInsertarReunion dialogo = new VentanaInsertarReunion(ventana , jtReunion);
    }
    
}
