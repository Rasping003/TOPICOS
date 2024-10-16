
package COMPONENTES;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Alumno extends JFrame implements ActionListener{

    private JLabel lb1, lbCalif1, lbCalif2, lbCalif3, lbCalif4;
    private JTextField txt1, txCalif1, txCalif2,txCalif3,txCalif4;
    private JTextArea txtA;
    private JScrollPane sc;
    private JButton bt1;
    String texto =" ";
    String puntA=" A \n", puntB=" B\n", puntC=" C\n", puntD=" D\n", puntE=" E\n";
    
    
    public Alumno (){
        setLayout(null);
        
        lb1 = new JLabel("ALUMNO ");
        lb1.setBounds(10, 10, 150, 30);
        lb1.setFont(new Font("Arial Rounded MT Bold", Font.CENTER_BASELINE, 15) );
        lb1.setForeground(Color.WHITE);
        add(lb1);
        
        txt1 = new JTextField();
        txt1.setBounds(120, 10, 150, 30);
        add(txt1);
        
        txtA = new JTextArea();
        sc = new JScrollPane(txtA);
        sc.setBounds(300, 120, 200, 200);
        add(sc);
        
        bt1= new JButton (" Agregar ");
        bt1.setBounds(300,10,150,30);
        bt1.setFont(new Font("Arial Rounded MT Bold", Font.CENTER_BASELINE, 15) );
        add(bt1);
        bt1.addActionListener(this);
        
      lbCalif1 = new JLabel (" CALIF 1: ") ;
      lbCalif1.setBounds(90, 100, 170, 30);//Eras Demi ITC
      lbCalif1.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbCalif1.setForeground(Color.WHITE);
      add (lbCalif1);

      txCalif1 = new JTextField ();
      txCalif1.setBounds(200, 100, 80, 30);
      txCalif1.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      //txSem.setEditable(false);
      add(txCalif1); 
      
      lbCalif2= new JLabel (" CALIF 2:  ");
      lbCalif2.setBounds(100, 150, 100, 30);
      lbCalif2.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbCalif2.setForeground(Color.WHITE);
      add(lbCalif2); 
      
      txCalif2 = new JTextField();
      txCalif2.setBounds(200, 150, 80, 30);
      txCalif2.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      //txDia.setEditable(false);
      add(txCalif2);
      
      lbCalif3= new JLabel (" CALIF 3: ");
      lbCalif3.setBounds(100, 200, 90, 30);
      lbCalif3.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbCalif3.setForeground(Color.WHITE);
      add(lbCalif3); 
      
      txCalif3 = new JTextField();
      txCalif3.setBounds(200, 200, 80, 30);
      txCalif3.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      //txHora.setEditable(false);
      add(txCalif3);
      
      lbCalif4= new JLabel (" CALIF 4: ");
      lbCalif4.setBounds(90, 250, 120, 30);
      lbCalif4.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbCalif4.setForeground(Color.WHITE);
      add(lbCalif4); 
      
      txCalif4 = new JTextField();
      txCalif4.setBounds(200, 250, 80, 30);
      txCalif4.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      //txMin.setEditable(false);
      add(txCalif4);
        
        
    }
    
    
    public void actionPerformed (ActionEvent ae){
        
        int a=0, b=0, c=0, d=0, e=0;
        int prom=0;
        
        
      a = Integer.parseInt(txCalif1.getText());
      b = Integer.parseInt(txCalif2.getText());
      c = Integer.parseInt(txCalif3.getText());
      d = Integer.parseInt(txCalif4.getText());
        
       prom = (a+b+c+d)/4;
       
       
       
        
        
        if(ae.getSource() == bt1){
            
            if((prom >89) || (prom <=100)){
              
            texto += txt1.getText();
            txtA.setText(texto + puntA );
            txt1.setText(" "); 
//            txCalif1.setText(" ");
//            txCalif2.setText(" ");
//            txCalif3.setText(" ");
//            txCalif4.setText(" ");    
            }
            else if((prom >79) || (prom <=89)){
                
            texto += txt1.getText() ;
            txtA.setText(texto + puntB );
            txt1.setText(" "); 
//            txCalif1.setText(" ");
//            txCalif2.setText(" ");
//            txCalif3.setText(" ");
//            txCalif4.setText(" "); 
            }
            else if ((prom >69) || (prom <=79)){
             
            texto += txt1.getText() + "  ";
            txtA.setText(texto +  puntC );
            txt1.setText(" "); 
//            txCalif1.setText(" ");
//            txCalif2.setText(" ");
//            txCalif3.setText(" ");
//            txCalif4.setText(" ");
            }
            else if ((prom >59) ||  (prom <=69)){
            //puntD="D";    
            texto += txt1.getText() + " ";
            txtA.setText(texto +puntD );
            txt1.setText(" ");
//            txCalif1.setText(" ");
//            txCalif2.setText(" ");
//            txCalif3.setText(" ");
//            txCalif4.setText(" ");
            
            } 
            else if(prom <=59){
            
            //puntE="E";
            texto += txt1.getText() + " ";
            txtA.setText(texto + puntE);
            txt1.setText(" ");
//            txCalif1.setText(" ");
//            txCalif2.setText(" ");
//            txCalif3.setText(" ");
//            txCalif4.setText(" ");
            }
            
     
        }
        
        
    }
    
    public static void main(String[] args) {
    //personalizo mi color donde r=red, g= green y b= blue  
    int r=85,g=30,b=100;
    Color colorven= new Color(r,g,b);   //colorven es el nombre de mi nuevo color
    
    Alumno v1= new Alumno();
    v1.setBounds(0, 0, 600, 400);
    v1.getContentPane().setBackground(colorven); //le pongo mi color personalizado
    v1.setVisible(true);
    v1.setLocationRelativeTo(null);
    v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    v1.setResizable(false);
    
        
    }
    
}