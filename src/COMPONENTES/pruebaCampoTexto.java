
package COMPONENTES;

import javax.swing.JFrame;
  
  public class pruebaCampoTexto
  {
  public static void main( String args[] )
  {
    campoTextoHazael campoTextoMarco = new campoTextoHazael(); 
    campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    campoTextoMarco.setSize( 700, 200 ); // establece el tamaño del marco
    campoTextoMarco.setVisible( true ); // muestra el marco
    campoTextoMarco.setLocationRelativeTo(null);   } // fin de main
  } // fin de la clase PruebaCampoTexto