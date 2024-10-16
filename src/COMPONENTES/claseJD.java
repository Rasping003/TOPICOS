
package COMPONENTES;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class claseJD extends JFrame implements ActionListener{

   private JLabel lb1,lb2,lb3;
   private JComboBox c1,c2,c3;
   private JButton b1;
   
   public claseJD(){
       
       setLayout (null);
       
       lb1 = new JLabel ("Rojo");
       lb1.setBounds(10, 10, 100, 10);
       add(lb1);
       
       c1 = new JComboBox();
       c1.setBounds(120, 10, 50, 30);
       for (int i=0; i<= 225; i++){
           c1.addItem(String.valueOf(i)); //convierte a string los valores del ciclo y se lo pone en el comboBox
       }
       add(c1);
       
       lb2 = new JLabel ("Verde");
       lb2.setBounds(10, 50, 100, 10);
       add(lb2);
       
       c2 = new JComboBox();
       c2.setBounds(120, 50, 50, 30);
       for (int i=0; i<= 225; i++){
           c2.addItem(String.valueOf(i));
       }
       add(c2);
       
       lb3 = new JLabel ("Azul");
       lb3.setBounds(10, 90, 100, 20);
       add(lb3);
       
       c3 = new JComboBox();
       c3.setBounds(120, 90, 70, 30);
       for (int i=0; i<= 225; i++){
           c3.addItem(String.valueOf(i));
       }
       add(c3);
       
       b1 = new JButton ("Fijar color");
       b1.setBounds(10, 130, 100, 30);
       add(b1);
       b1.addActionListener(this);
       
   }
   
   @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            
            String cad1 = c1.getSelectedItem().toString(); // vuelve a conver ahora a cadena (string) el valor que seleccionaste y se lo da a cad1
            String cad2 = c2.getSelectedItem().toString();
            String cad3 = c3.getSelectedItem().toString();
            
            int rojo = Integer.parseInt(cad1);  
            int verde = Integer.parseInt(cad2); 
            int azul = Integer.parseInt(cad3);
            
            Color color1 = new Color (rojo,verde,azul);
            b1.setBackground(color1);
        }
    }
    
    
    public static void main(String[] args) {
        
      claseJD v1 = new claseJD();
      v1.setVisible(true);
      v1.setBounds(0,0,400,600);
      v1.setLocationRelativeTo(null);
      v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
      v1.setResizable(false);
       
    }

    
    
}
