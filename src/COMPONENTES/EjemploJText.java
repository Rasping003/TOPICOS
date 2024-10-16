
package COMPONENTES;

import javax.swing.*;
import java.awt.event.*;
public class EjemploJText extends JFrame implements ActionListener{
    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2;
    private JButton b1;
    
    
    public EjemploJText (){
        setLayout (null);
        
        lb1 = new JLabel ("Numero 1: ");
        lb1.setBounds(10, 10, 100, 30);
        add(lb1);
        
        lb2 = new JLabel ("Numero 2: ");
        lb2.setBounds(10, 60, 100, 30);
        add(lb2);
        
        lb3 = new JLabel ("RESULTADO: ");
        lb3.setBounds(100, 200, 200, 30);
        add(lb3);
        
        txt1= new JTextField();
        txt1.setBounds(150, 10, 150, 30);
        add(txt1);
        
        txt2= new JTextField();
        txt2.setBounds(150, 60, 150, 30);
        add(txt2);
        
        b1=new JButton("Sumar");
        b1.setBounds(10, 90, 100, 30);
        add(b1);
        b1.addActionListener(this);//se añade el evento
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        int num1=0, num2=0, num3=0;
        int resul=0;
        num1= Integer.parseInt(txt1.getText());
        num2= Integer.parseInt(txt2.getText());
        resul=num1+num2;
        
        if(ae.getSource()==b1){
       
        
        lb3.setText("resultado: "+resul);
        
        }
        
        
    }
    
    public static void main(String[]Args){
    EjemploJText v1= new EjemploJText();
    v1.setBounds(0, 0, 400, 400);
    v1.setVisible(true);
    v1.setLocationRelativeTo(null);
    v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    v1.setResizable(false);
    
    }
    
    
    
    
}
