
package COMPONENTES;


import java.awt.Color;
import java.awt.*;
import javax.swing.*;


public class Sesion extends JFrame{
    
       private ImageIcon  imgFondo, logoLeon;
       private JLabel lbBienvenido, lbHaz;
       

    public Sesion(){
      setLayout(null);
      setTitle("Inicio de sesión exitoso");
      setBounds(0,0,500,650);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      
        lbBienvenido = new JLabel("BIENVENIDO");
        lbBienvenido.setBounds(115,260,300,100);
        lbBienvenido.setForeground(Color.WHITE);
        lbBienvenido.setFont(new Font("Georgia",Font.BOLD,40));
        add(lbBienvenido);
        
        lbHaz = new JLabel("SEÑOR HAZAEL");
        lbHaz.setBounds(183,295,300,100);
        lbHaz.setForeground(Color.WHITE);
        lbHaz.setFont(new Font("Georgia",Font.PLAIN,18));
        add(lbHaz);
        
        logoLeon = new ImageIcon("CaraLeon.PNG"); // imagen de cara de leon 
        JLabel lb3 = new JLabel();
        lb3.setBounds(150,70,200,200);
        lb3.setIcon(new ImageIcon(logoLeon.getImage().getScaledInstance(lb3.getWidth(),lb3.getHeight(),Image.SCALE_SMOOTH)));
        add(lb3);
        
        imgFondo = new ImageIcon("hexaborra.JPG"); //imagen de fondo borroso
        JLabel lb1 = new JLabel();
        lb1.setBounds(0,0,500,650);
        lb1.setIcon(new ImageIcon(imgFondo.getImage().getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH)));
        add(lb1);
    }
    
    public static void main(String[] args) {
      Sesion v1 = new Sesion();
      v1.setVisible(true);
      v1.setTitle("Inicio de sesión exitoso");
      v1.setBounds(0,0,500,650);
      v1.setLocationRelativeTo(null);
      v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
      v1.setResizable(false);

       }
}
