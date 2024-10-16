
package COMPONENTES;
import javax.swing.JFrame;
        
public class pruebaBoton {

   
    public static void main(String[] args) {
        
        botonClase v1 = new botonClase(); // crea MarcoBoton
        v1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        v1.setSize( 300, 110 ); // establece el tamaño del marco
        v1.setVisible( true ); // muestra el marco
       
    }
    
}
