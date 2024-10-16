
package COMPONENTES;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class textArea extends JFrame implements ActionListener{

    private JLabel lb1;
    private JTextField txt1;
    private JTextArea txtA;
    private JScrollPane sc;
    private JButton bt1;
    String texto =" ";
    
    
    public textArea (){
        setLayout(null);
        
        lb1 = new JLabel("DATO ");
        lb1.setBounds(10, 10, 150, 30);
        lb1.setFont(new Font("Arial Rounded MT Bold", Font.CENTER_BASELINE, 15) );
        lb1.setForeground(Color.WHITE);
        add(lb1);
        
        txt1 = new JTextField();
        txt1.setBounds(120, 10, 150, 30);
        add(txt1);
        
        txtA = new JTextArea();
        sc = new JScrollPane(txtA);
        sc.setBounds(30, 150, 200, 200);
        add(sc);
        
        bt1= new JButton (" Agregar ");
        bt1.setBounds(60,70,150,30);
        bt1.setFont(new Font("Arial Rounded MT Bold", Font.CENTER_BASELINE, 15) );
        add(bt1);
        bt1.addActionListener(this);
        
    }
    
    
    public void actionPerformed (ActionEvent ae){
        
        if(ae.getSource() == bt1){
            
            texto += txt1.getText() + "\n";
            txtA.setText(texto);
            txt1.setText(" ");
        }
        
    }
    
    public static void main(String[] args) {
    //personalizo mi color donde r=red, g= green y b= blue  
    int r=85,g=30,b=100;
    Color colorven= new Color(r,g,b);   //colorven es el nombre de mi nuevo color
    
    textArea v1= new textArea();
    v1.setBounds(0, 0, 600, 400);
    v1.getContentPane().setBackground(colorven); //le pongo mi color personalizado
    v1.setVisible(true);
    v1.setLocationRelativeTo(null);
    v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    v1.setResizable(false);
    
        
    }
    
}
