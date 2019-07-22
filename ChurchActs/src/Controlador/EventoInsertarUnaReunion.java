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
public class EventoInsertarUnaReunion implements ActionListener{
    private JTable jtReuniones;
    private JTextField jtfHoraInicio , jtfHoraTermino , jtfTipo , jtfCosto , jtfPastor , jtfCapacidad;
    
    public EventoInsertarUnaReunion(JTable jtReuniones , JTextField jtfHoraInicio , JTextField jtfHoraTermino , JTextField jtfTipo , JTextField jtfCosto , JTextField jtfPastor , JTextField jtfCapacidad) {
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
        if (jtReuniones.isVisible()==false) {
                     aux = (DefaultTableModel) jtReuniones.getModel();
                     aux.addColumn("Tipo");
                     aux.addColumn("Pastor");
                     aux.addColumn("Hora Inicio");
                     aux.addColumn("Hora Termino");
                     aux.addColumn("Costo");
                     aux.addColumn("Capacidad");
                     jtReuniones.setModel(aux);
            }
                aux = (DefaultTableModel) jtReuniones.getModel();
                String[] nuevafila = new String[6];
                nuevafila[0] = jtfTipo.getText();
                nuevafila[1] = jtfPastor.getText();
                nuevafila[2] = jtfHoraInicio.getText();
                nuevafila[3] = jtfHoraTermino.getText();
                nuevafila[4] = jtfCosto.getText();
                nuevafila[5] = jtfCapacidad.getText();
                aux.addRow(nuevafila);
                jtReuniones.setVisible(true);
                JOptionPane.showMessageDialog(null, "Se han insertado la nueva reunión" , " Insertar Reunion" , JOptionPane.INFORMATION_MESSAGE);
            }
    }
        
        
 
    
    
  
