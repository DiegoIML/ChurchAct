package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego y Bryan
 */
public class EventoEliminarReunion implements ActionListener{
    private JTable jtReuniones;
    
    public EventoEliminarReunion(JTable jtReuniones) {
      this.jtReuniones = jtReuniones;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        DefaultTableModel aux;    
        if (jtReuniones.isVisible()) {
                aux = (DefaultTableModel) jtReuniones.getModel();
                aux.removeRow(jtReuniones.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Se ha eliminado la reunión" , " Eliminar Reunion" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    

