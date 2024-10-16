
package COMPONENTES;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
         
         
public class botonClase extends JFrame {
    
    private JButton botonJButtonSimple; // botón con texto solamente
    private JButton botonJButtonElegante; // botón con iconos
    
    public botonClase (){
        
        super( "Prueba de botones" );
        setLayout( new FlowLayout() ); // establece el esquema del marco
         
        botonJButtonSimple = new JButton( "Boton simple" ); // botón con texto
        add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame
         
            Icon insecto1 = new ImageIcon( getClass().getResource( "Hexa.JPEG" ) );
        Icon insecto2 = new ImageIcon( getClass().getResource( "Haza.PNG" ) );
        
        botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); // establece la imagen
        botonJButtonElegante.setRolloverIcon( insecto2 ); // establece la imagen de sustitución
        add( botonJButtonElegante ); // agrega botonJButtonElegante a JFrame
        
        // crea nuevo ManejadorBoton para manejar los eventos de botón 
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener( manejador );
        botonJButtonSimple.addActionListener( manejador );
        } // fin del constructor de botonClase
    
        // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener {
            // maneja evento de botón
            public void actionPerformed( ActionEvent evento ){
        
                    JOptionPane.showMessageDialog( botonClase.this, String.format("Usted oprimio: %s", evento.getActionCommand() ) );
                    
            } // fin del método actionPerformed
            
    } // fin de la clase interna privada ManejadorBoto
    
}
