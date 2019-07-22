package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diego y Bryan 
 */
public class VentanaActualizarReunion extends JDialog {
    private JPanel jpHorizontal1 , jpHorizontal2 , jpVertical3 , jpVertical4 , jpVertical5 , jpContenedor;
   private JLabel jlTitulo , jlHoraInicio , jlHoraTermino,jlTipo , jlPastor , jlCosto , jlCapacidad;
   private JButton jbActualizar;
   private JTextField jtfHoraInicio , jtfHoraTermino , jtfTipo , jtfPastor , jtfCosto , jtfCapacidad;    
    
   
    public VentanaActualizarReunion(JFrame ventana) {
      super(ventana);
      jpHorizontal1 = new JPanel();
      jpHorizontal1.setBackground(new Color(92,105,138));
      jpHorizontal2 = new JPanel();
      jpHorizontal2.setBackground(new Color(92,105,138));
      jpVertical3 = new JPanel();
      jpVertical3.setBackground(new Color(92,105,138));
      jpVertical4 = new JPanel();
      jpVertical4.setBackground(new Color(92,105,138));
      jpVertical5 = new JPanel();
      jpVertical5.setBackground(new Color(92,105,138));
      jpHorizontal1.setBackground(new Color(92,105,138));
      jlTitulo = new JLabel("Actualizar Reunión");
      jlTitulo.setFont( new Font("Arial Black" , Font.BOLD , 30));
      jlHoraInicio = new JLabel("Hora Inicio: ");
      jlHoraInicio.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jlHoraTermino = new JLabel("Hora Término: ");
      jlHoraTermino.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jlTipo = new JLabel("Tipo: ");
      jlTipo.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jlPastor = new JLabel("Pastor: ");
      jlPastor.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jlCosto = new JLabel("Costo: ");
      jlCosto.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jlCapacidad = new JLabel("Capacidad: ");
      jlCapacidad.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jbActualizar  = new JButton("Actualizar");
      jbActualizar.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfHoraInicio = new JTextField(10);
      jtfHoraInicio.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfHoraTermino = new JTextField(10);
      jtfHoraTermino.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfTipo = new JTextField(10);
      jtfTipo.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfPastor = new JTextField(10);
      jtfPastor.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfCosto = new JTextField(10);
      jtfCosto.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jtfCapacidad  = new JTextField(10);
      jtfCapacidad.setFont( new Font("Arial Black" , Font.BOLD , 15));
      jpContenedor = new JPanel();
      jpContenedor.setLayout(new GridBagLayout());
      jpContenedor.setBackground(new Color(92,105,138));
      jbActualizar.setBackground( new Color(230 , 214 , 144) );
      crearLayout();
      setSize(800,600);
      setVisible(true);
    }
    
    public void crearLayout() {
         agregarJPHorizontal1();
         agregarJPHorizontal2();
         agregarJPVertical3();
         agregarJPVertical4();
         agregarJPVertical5();
         agregarJLTitulo();
         agregarJLHoraInicio();
         agregarJLHoraTermino();
         agregarJLTipo();
         agregarJLPastor();
         agregarJLCosto();
         agregarJLCapacidad();
         agregarJBActualizar();
         agregarJTFHoraInicio();
         agregarJTFHoraTermino(); 
         agregarJTFTipo();
         agregarJTFPastor(); 
         agregarJTFCosto(); 
         agregarJTFCapacidad();      
         add(jpContenedor);
    }
    
    public void agregarJPHorizontal1() {
       GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth =  7;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpContenedor.add( jpHorizontal1 ,gbc);
    }
    
     public void agregarJPHorizontal2() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridheight = 1;
        gbc.gridwidth =  7;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpContenedor.add( jpHorizontal2 ,gbc);
    }
    
      public void agregarJPVertical3() {
       GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpContenedor.add( jpVertical3 ,gbc);
    }
    
   public void agregarJPVertical4() {
       GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpContenedor.add( jpVertical4 ,gbc);
    }    
 
   public void agregarJPVertical5() {
       GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpContenedor.add( jpVertical5 ,gbc);
    }

   
   public void agregarJBActualizar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.gridheight = 1;
        gbc.gridwidth =  2;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        jpContenedor.add( jbActualizar ,gbc);
   }
   
   public void agregarJLTitulo() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth =  5;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        jpContenedor.add( jlTitulo ,gbc);
   }
   
   public void agregarJLHoraInicio() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlHoraInicio ,gbc);
   }
   
   public void agregarJLHoraTermino() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth  = 1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlHoraTermino ,gbc);
   }

   public void agregarJLTipo() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlTipo ,gbc);
   }

   public void agregarJLPastor() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlPastor ,gbc);
   }

   public void agregarJLCosto() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlCosto ,gbc);
   }  
   
   public void agregarJLCapacidad() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.anchor = GridBagConstraints.EAST;
        jpContenedor.add( jlCapacidad ,gbc);
   }
   
   public void agregarJTFHoraInicio() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfHoraInicio ,gbc);
   }
   
   public void agregarJTFHoraTermino() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfHoraTermino ,gbc);
   }
   
   public void agregarJTFTipo() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfTipo ,gbc);
   }
   
   public void agregarJTFPastor() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfPastor ,gbc);
   }
   
   public void agregarJTFCosto() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfCosto ,gbc);
   }
   
   public void agregarJTFCapacidad() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add( jtfCapacidad ,gbc);
   }
   
}
