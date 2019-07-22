package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Diego y Bryan
 */
public class EventoIngresarExcel implements ActionListener {
     private JTable tabla;
    private JFrame ventana;
    public EventoIngresarExcel (JTable tabla , JFrame ventana) {
       this.tabla = tabla;
       this.ventana = ventana;
    }   
      public boolean leer_Excel ()  {
        boolean exito = false ;
        JFileChooser jfc = new JFileChooser();
        int seleccion =jfc.showOpenDialog(ventana); 
        if (seleccion == JFileChooser.APPROVE_OPTION) {
           
           try {
                File fichero = jfc.getSelectedFile();
                Workbook libro = Workbook.getWorkbook(fichero);
                Sheet planilla = libro.getSheet(0);
                int filas = planilla.getRows();
                int columnas  = planilla.getColumns();
                String[][] matrizExcel = new String[filas][columnas];
                for (int i = 1 ; i < filas ; i++) {
                 for (int j = 0 ; j < columnas ; j++)  {
                     Cell celda = planilla.getCell(j,i);
                     matrizExcel[i-1][j] = celda.getContents();
                 }
         
             }
            
                     String[] nombreColumnas = new String[6];
                     nombreColumnas[0] = "Tipo";
                     nombreColumnas[1] = "Pastor";
                     nombreColumnas[2] = "Hora Inicio";
                     nombreColumnas[3] = "Hora Termino";
                     nombreColumnas[4] = "Costo";
                     nombreColumnas[5] = "Capacidad";  
                     DefaultTableModel modelo = new DefaultTableModel( matrizExcel , nombreColumnas);
                     tabla.setModel(modelo);
                     TableColumnModel modeloColumna = tabla.getColumnModel();
                     modeloColumna.getColumn(0).setPreferredWidth(500);
                     modeloColumna.getColumn(1).setPreferredWidth(200);
                     modeloColumna.getColumn(2).setPreferredWidth(200);
                     modeloColumna.getColumn(3).setPreferredWidth(200);
                     modeloColumna.getColumn(4).setPreferredWidth(200);
                     modeloColumna.getColumn(5).setPreferredWidth(200);
             tabla.setVisible(true);
             libro.close();
             JOptionPane.showMessageDialog(null , "Se ha ingresado el excel exitosamente.");
             exito = true;
           }
           catch (IOException ex) {
                //Logger.getLogger(BotonIngresar.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Ha fallado");
           } catch (BiffException ex) {
               // Logger.getLogger(BotonIngresar.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Ha fallado"); 
           }
    
        }
        
          return exito;

}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (leer_Excel()) {
          JOptionPane.showMessageDialog(null , "Se completado la carga del excel." , "Ingresar Excel" , JOptionPane.INFORMATION_MESSAGE);
       }
       else  {
           JOptionPane.showMessageDialog(null , "No se ha completado exitosamente." , "Ingresar Excel" , JOptionPane.WARNING_MESSAGE);
       }
    }
}
