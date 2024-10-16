//HAZAEL RAMOS RIVERA
//ISIC054
//TOPICOS AVANZADOS DE PROGRAMACIÓN

package COMPONENTES;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class convertidorSeg extends JFrame implements ActionListener  {

   private JLabel lb1, lbSem, lbDia, lbHora, lbMin, lbSeg;   //etiquetas
   private JTextField tx1, txSem, txDia,txHora,txMin, txSeg; //cajas de texto donde estaran las conversiones
   private JButton btConver; //boton para convertir
    
   //constructor
   public convertidorSeg (){
       setTitle("CONVERTIDOR");
       setLayout (null);
       
      lb1= new JLabel (" DIGITE LOS SEGUNDOS: ");
      lb1.setBounds(10,30,250,30);
      lb1.setForeground(Color.WHITE);
      lb1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
      add(lb1); 
      
      tx1= new JTextField ();
      tx1.setBounds(230, 30, 110, 30);
      tx1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
      add(tx1);
      
      btConver = new JButton ("CONVERTIR ");
      btConver.setBounds(370, 30, 150, 30);
      btConver.setBackground(Color.DARK_GRAY);
      btConver.setForeground(Color.WHITE);
      btConver.addActionListener(this);//se añade el evento
      btConver.setFont(new Font("Arial Rounded MT Bold", Font.CENTER_BASELINE, 15) );
      add(btConver);
      
      lbSem = new JLabel (" SEMANA/S: ") ;
      lbSem.setBounds(90, 100, 170, 30);//Eras Demi ITC
      lbSem.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbSem.setForeground(Color.WHITE);
      add (lbSem);

      txSem = new JTextField ();
      txSem.setBounds(200, 100, 80, 30);
      txSem.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      txSem.setEditable(false);
      add(txSem); 
      
      lbDia= new JLabel (" DÍA/S: ");
      lbDia.setBounds(130, 150, 70, 30);
      lbDia.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbDia.setForeground(Color.WHITE);
      add(lbDia); 
      
      txDia = new JTextField();
      txDia.setBounds(200, 150, 80, 30);
      txDia.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      txDia.setEditable(false);
      add(txDia);
      
      lbHora= new JLabel (" HORA/S: ");
      lbHora.setBounds(110, 200, 90, 30);
      lbHora.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbHora.setForeground(Color.WHITE);
      add(lbHora); 
      
      txHora = new JTextField();
      txHora.setBounds(200, 200, 80, 30);
      txHora.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      txHora.setEditable(false);
      add(txHora);
      
      lbMin= new JLabel (" MINUTO/S: ");
      lbMin.setBounds(90, 250, 120, 30);
      lbMin.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbMin.setForeground(Color.WHITE);
      add(lbMin); 
      
      txMin = new JTextField();
      txMin.setBounds(200, 250, 80, 30);
      txMin.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      txMin.setEditable(false);
      add(txMin);
      
      lbSeg= new JLabel (" SEGUNDO/S: ");
      lbSeg.setBounds(80, 300, 130, 30);
      lbSeg.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      lbSeg.setForeground(Color.WHITE);
      add(lbSeg); 
      
      txSeg = new JTextField();
      txSeg.setBounds(200, 300, 80, 30);
      txSeg.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
      txSeg.setEditable(false);
      add(txSeg);
       
   }
    

    public void actionPerformed(ActionEvent ae) {
       
        int seg=0,min=0, hora=0, dia=0, sem=0; //variables para cada conversion
        int num=0; //variable que recibira los segundos introducidos
        
        num = Integer.parseInt(tx1.getText()); //se convierte de texto a entero
        
        sem = num/604800; //la cantidad recibida se divide entre la cantidad de segundos que hay una semana
        dia = (num%604800)/86400; //el reciduo de lo anterior se divide entre los segundos de un dia
        hora = ((num%604800)%86400)/3600; //el reciduo de lo anterior se divide ahora entre los segundos de un hora
        min = (((num%604800)%86400)%3600)/60;//de nuevo el reciduo de lo anterior se divide entre los seg de un min
        seg =((((num%604800)%86400)%3600)%60)/1;//por ultimo el reciduo se divide entre 1 para los segundos sobrantes      
     
        if (ae.getSource()==btConver){
            //se almacenan los valores en sus respectivas cajas de texto
            txSem.setText(" " + sem);
            txDia.setText(" " + dia);
            txHora.setText(" "+ hora);
            txMin.setText(" "+ min);
            txSeg.setText(" "+ seg);
            
        }
       
        
    }
    
    
    public static void main(String[] args) {
    
    //personalizo mi color donde r=red, g= green y b= blue  
    int r=85,g=30,b=100;
    Color colorventana= new Color(r,g,b);   //colorventana es el nombre de mi nuevo color    
        
    convertidorSeg v1= new convertidorSeg();
    v1.setBounds(0, 0, 550, 400);
    v1.getContentPane().setBackground(colorventana); //le pongo mi color personalizado
    v1.setVisible(true);
    v1.setLocationRelativeTo(null);
    v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    v1.setResizable(false);
        
    }

    
    
}
