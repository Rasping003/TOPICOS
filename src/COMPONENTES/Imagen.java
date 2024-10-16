
package COMPONENTES;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class Imagen extends JFrame{
    
    public Imagen(){
        setTitle("Ventana");
        setBounds(0,0,750,850);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel ();
        panel.setLayout(null);
        panel.setBackground(new Color(43,56,78));
        getContentPane().add(panel);
        
        
        
        ImageIcon imagen = new ImageIcon ("hexa.JPEG");
        JLabel a3 = new JLabel();
        a3.setBounds(0, 0, 750, 750);
        a3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(a3.getWidth(),a3.getHeight() , Image.SCALE_SMOOTH)));
        panel.add(a3);
        
        ImageIcon yo = new ImageIcon ("hexaborra.JPEG");
        JLabel a4 = new JLabel();
        a4.setBounds(30, 30, 300, 350);
        a4.setIcon(new ImageIcon(yo.getImage().getScaledInstance(a4.getWidth(),a4.getHeight() , Image.SCALE_SMOOTH)));
        panel.add(a4);
    }
    
    
    
}
