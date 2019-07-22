
package Controlador;

import Vista.VentanaActualizarReunion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Diego y Bryan
 */

public class EventoActualizarReunion implements ActionListener {
    private JFrame ventana;
    public EventoActualizarReunion(JFrame ventana) {
      this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
              VentanaActualizarReunion dialogo = new VentanaActualizarReunion(ventana);
    }
    
}
