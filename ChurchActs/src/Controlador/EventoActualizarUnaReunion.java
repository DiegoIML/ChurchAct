package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego y Bryan
 */
public class EventoActualizarUnaReunion implements ActionListener {
    private JTable jtReuniones;
    private JTextField jtfHoraInicio , jtfHoraTermino , jtfTipo , jtfCosto , jtfPastor , jtfCapacidad;
    
    public EventoActualizarUnaReunion(JTable jtReuniones , JTextField jtfHoraInicio , JTextField jtfHoraTermino , JTextField jtfTipo , JTextField jtfCosto , JTextField jtfPastor , JTextField jtfCapacidad) {
       this.jtReuniones = jtReuniones;
       this.jtfHoraInicio = jtfHoraInicio;
       this.jtfHoraTermino = jtfHoraTermino;
       this.jtfTipo = jtfTipo;
       this.jtfCosto = jtfCosto;
       this.jtfCapacidad = jtfCapacidad;
       this.jtfPastor = jtfPastor;
    }

    public boolean comprobarCosto() {
    boolean correcto = true;
    String texto = jtfCosto.getText();
    if (Integer.parseInt(texto) < 0) {
      correcto = false;
    }
    return correcto;
    }
    
    public boolean comprobarCapacidad() {
    boolean correcto = true;
    String texto = jtfCapacidad.getText();
    if (Integer.parseInt(texto) < 0) {
      correcto = false;
    }
    return correcto;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        DefaultTableModel aux;    
        if (jtReuniones.isVisible()) {
                aux = (DefaultTableModel) jtReuniones.getModel();
                aux.setValueAt( jtfTipo.getText() ,jtReuniones.getSelectedRow() , 0 );
                aux.setValueAt( jtfPastor.getText() ,jtReuniones.getSelectedRow() , 1 );
                aux.setValueAt( jtfHoraInicio.getText() ,jtReuniones.getSelectedRow() , 2 );
                aux.setValueAt( jtfHoraTermino.getText() ,jtReuniones.getSelectedRow() , 3 );
                aux.setValueAt( jtfCosto.getText() ,jtReuniones.getSelectedRow() , 4 );
                aux.setValueAt( jtfCapacidad.getText() ,jtReuniones.getSelectedRow() , 5 );
                jtReuniones.setVisible(true);
                JOptionPane.showMessageDialog(null, "Se ha actualizado la reunión" , " Actualizar Reunion" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
}