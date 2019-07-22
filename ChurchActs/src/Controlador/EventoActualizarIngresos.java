package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diego y  Bryan
 */
public class EventoActualizarIngresos implements ActionListener {
    private JTextField jtfDinero;
    private JLabel jlDinero;

    public EventoActualizarIngresos(JTextField jtfDinero , JLabel jlDinero) {
       this.jtfDinero = jtfDinero;
       this.jlDinero  = jlDinero;
    }
    /**
     * Metodo para comrpobar el valor del jtfDinero
     * @return 
     */
    public boolean comprobarJTFDinero() {
       boolean valido = true;
       String texto = jtfDinero.getText();
       if ( Integer.parseInt(texto)<0 ) {
          valido = false;
       }
       return valido;
    }
    
    /**
     * 
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (comprobarJTFDinero()) {
             JOptionPane.showMessageDialog(null, "Se han actualizado los ingresos." , "Actualizar Ingresos" , JOptionPane.INFORMATION_MESSAGE);
           jlDinero.setText(jtfDinero.getText());
        }
        else {
          JOptionPane.showMessageDialog(null, "No se ha podido actualizar los ingresos." , "Actualizar Ingresos" , JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
