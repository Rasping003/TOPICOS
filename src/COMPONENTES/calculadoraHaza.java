package COMPONENTES;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class calculadoraHaza extends JFrame implements ActionListener {

    private JLabel etiqueta;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0 ;//botones para numeros
    private JButton M,MasM,P, Igu, Me, X, Div, Por, Delete; //botones para operaciones
    String operaciones;
    double num1=0, num2, resultado;// variables para realizar las operaciones 
        //yo
        public calculadoraHaza(){
            setLayout(null);
            setTitle("Calculadora");
           //damos color personalizado 
           int r=230;
           int g=220;
           int b=210;
           // creamos nuestro color 
           Color Colorboton = new Color(r,g,b);
            
            b1= new JButton ( "1");
            b1.setBounds(10, 200, 100, 50);
            b1.setBackground(Colorboton); //aplicamos el color personalizado 
            add(b1);
            b1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b1.addActionListener(this);
            
            b2 = new JButton ("2");
            b2.setBounds(120, 200, 100, 50); // tomar en cuenta lo largo del boton
            b2.setBackground(Colorboton);
            add(b2);
            b2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b2.addActionListener(this);
            
            b3 = new  JButton ("3");
            b3.setBounds(230, 200, 100, 50);
            b3.setBackground(Colorboton);
            add(b3);
            b3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b3.addActionListener(this);
            
            b4 = new  JButton ("4");
            b4.setBounds(10, 255, 100, 50);
            b4.setBackground(Colorboton);
            add(b4);
            b4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b4.addActionListener(this);
            
            b5 = new  JButton ("5");
            b5.setBounds(120, 255, 100, 50);
            b5.setBackground(Colorboton);
            add(b5);
            b5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b5.addActionListener(this);
            
            b6 = new  JButton ("6");
            b6.setBounds(230, 255, 100, 50);
            b6.setBackground(Colorboton);
            add(b6);
            b6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b6.addActionListener(this);
            
            b7= new JButton ( "7");
            b7.setBounds(10, 310, 100, 50);
            b7.setBackground(Colorboton);
            add(b7);
            b7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b7.addActionListener(this);
            
            b8 = new JButton ("8");
            b8.setBounds(120, 310, 100, 50); 
            b8.setBackground(Colorboton);
            add(b8);
            b8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b8.addActionListener(this);
            
            b9 = new JButton ("9");
            b9.setBounds(230, 310, 100, 50); 
            b9.setBackground(Colorboton);
            add(b9);
            b9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b9.addActionListener(this);
            
            b0 = new JButton ("0");
            b0.setBounds(120, 365, 100, 50); 
            b0.setBackground(Colorboton);
            add(b0);
            b0.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
            b0.addActionListener(this);
            
            MasM = new JButton ("+/-");//boton Mas Menos
            MasM.setBounds(10, 365, 100, 50); 
            MasM.setBackground(Colorboton);
            add(MasM);
            MasM.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            MasM.addActionListener(this);
            
            P = new JButton ("."); //Boton Punto
            P.setBounds(230, 365, 100, 50); 
            P.setBackground(Colorboton);
            add(P);
            P.setFont(new Font("Arial", Font.BOLD, 30));
            P.addActionListener(this);
          
        // se crea los colores RGB    
        int red = 70;    // Valor rojo (0-255)
        int green = 53;   // Valor verde (0-255)
        int blue = 40;    // Valor azul (0-255)
        Color miColor = new Color(red, green, blue);// instanciamos nuestro color con los colores RGB
        
            Igu = new JButton ("=");//boton del Igual
            Igu.setBounds(340, 365, 210, 50); 
            Igu.setForeground(Color.WHITE);
            Igu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            Igu.setBackground(miColor); // colocamos nuestro color RGB
            add(Igu);
            Igu.addActionListener(this);
            
            M = new JButton ("+");//boton del màs
            M.setBounds(340, 310, 100, 50); 
            M.setBackground(Colorboton);
            add(M);
            M.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            M.addActionListener(this);
            
            Me = new JButton ("-");//boton de menos
            Me.setBounds(450, 310, 100, 50); 
            Me.setBackground(Colorboton);
            add(Me);
            Me.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            Me.addActionListener(this);
            
            X = new JButton ("×");//boton de multiplicar
            X.setBounds(340, 255, 100, 50); 
            X.setBackground(Colorboton);
            add(X);
            X.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            X.addActionListener(this);
            
            Div = new JButton ("÷");//boton divisor
            Div.setBounds(450, 255, 100, 50); 
            Div.setBackground(Colorboton);
            add(Div);
            Div.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            Div.addActionListener(this);
            
            Por = new JButton ("%");//boton del porcentaje
            Por.setBounds(340, 200, 100, 50); 
            Por.setBackground(Colorboton);
            add(Por);
            Por.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            Por.addActionListener(this);
            
            Delete = new JButton ("C");//boton de borrar/limpiar
            Delete.setBounds(450, 200, 100, 50); 
            Delete.setBackground(Color.LIGHT_GRAY);
            add(Delete);
            Delete.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
            Delete.addActionListener(this);
            
            etiqueta = new JLabel ("");
            etiqueta.setBounds(20, 20, 400, 50);
            etiqueta.setForeground(Color.WHITE);
            add(etiqueta);
            etiqueta.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
            
        }
   
        //APARTIR DE AQUI ES LA LOGICA Y LO QUE SE LE AGREGO AL CODIGO ANTERIOR 
        
    public void actionPerformed(ActionEvent ae) {
       
     
     if (ae.getSource() == b1) {
        etiqueta.setText(etiqueta.getText() + "1"); // se pone un getText dentro de un setText para al hacer click al boton el numero se vaya iterando o juntando
    } 
     else if (ae.getSource() == b2) {
        etiqueta.setText(etiqueta.getText() + "2");//Lo mismo anteriormente dicho se hace todos los botones numericos 
    } 
     else if (ae.getSource() == b3) {
        etiqueta.setText(etiqueta.getText() + "3");
    } 
     else if (ae.getSource() == b4) {
        etiqueta.setText(etiqueta.getText() + "4");
    } 
     else if (ae.getSource() == b5) {
        etiqueta.setText(etiqueta.getText() + "5");
    } 
     else if (ae.getSource() == b6) {
        etiqueta.setText(etiqueta.getText() + "6");
    } 
     else if (ae.getSource() == b7) {
        etiqueta.setText(etiqueta.getText() + "7");
    } 
     else if (ae.getSource() == b8) {
        etiqueta.setText(etiqueta.getText() + "8");
    }
     else if (ae.getSource() == b9) {
        etiqueta.setText(etiqueta.getText() + "9");
    } 
     else if(ae.getSource()== b0){
        etiqueta.setText(etiqueta.getText() + "0");
     }
     else if(ae.getSource()== Delete){
        etiqueta.setText("");
     }
     else if (ae.getSource() == P) {
        if (!(etiqueta.getText().contains("."))) {  //para verificar que haya solo un solo punto 
            etiqueta.setText(etiqueta.getText() + ".");
        }
    }
     else if (ae.getSource() == MasM){ //boton del +/-
         num1= Double.parseDouble(etiqueta.getText());
         etiqueta.setText("");
         operaciones = "m";     //operador que puse para ocuparlo en las operaciones   
     }
     else if (ae.getSource() == M){ // BOTON DE SUMA
         num1= Double.parseDouble(etiqueta.getText());// hace que recoga el texto que aparezca en la etiqueta y lo tranforme a double para agregarlo a nnum1
         etiqueta.setText("");// hace que despues de tocar el boton la etiqueta quede en blanco para no comfundirse
         operaciones = "+";  //operador que puse para ocuparlo en las operaciones    
     }
     else if (ae.getSource() == Me) { //RESTA
       // operaciones = "-";
        num1= Double.parseDouble(etiqueta.getText());
        etiqueta.setText("");
        operaciones = "-";
    } 
     else if (ae.getSource() == X) { //PRODUCTO
        num1= Double.parseDouble(etiqueta.getText());
        etiqueta.setText("");
        operaciones = "×";
    } 
     else if (ae.getSource() == Div) { //DIVISION
        num1= Double.parseDouble(etiqueta.getText());
         etiqueta.setText("");
         operaciones = "÷";
    } 
    else if (ae.getSource() == Por) { //PORCENTAJE
        num1= Double.parseDouble(etiqueta.getText());
         etiqueta.setText("");
         operaciones = "%";
    } 

    else if (ae.getSource() == Igu) { //BOTON DE IGUAL 
        String select; //variable que guarde mi resultado para mostrarlo en la etiqueta
        num2 = Double.parseDouble(etiqueta.getText()); //variable para hacer posible las operaciones 

            if(operaciones == "+"){ //indica que cuando se presione el boton de mas, realice lo siguiente
                resultado = num1 + num2; //suma el resultado que se agrego la primera vez (num1), con el valor despues de presionar el boton de mas (num2)
                select = String.format("%.2f", resultado); // almacena y transforma el resultado a dos digitos despues del cero para los decimales
                etiqueta.setText(select); //muestra el resultado en la etiqueta
            }
            //TODO LO EXPLICADO ANTERIORMENTE SE HACE EN CADA BOTON PERO CON SUS RESPECTIVAS OPERACIONES DE SUMAS, RESTAS, PRODUCTOS, ETC.
            else if(operaciones == "-"){  
                resultado = num1 - num2; //resta
                select = String.format("%.2f", resultado);
                etiqueta.setText(select);
            }
            else if(operaciones == "×"){
                resultado = num1 * num2; //multiplicacion
                select = String.format("%.2f", resultado);
                etiqueta.setText(select);
            }
            else if(operaciones == "÷"){
                resultado = num1 / num2; //division
                select = String.format("%.2f", resultado);
                etiqueta.setText(select);
            }
            else if(operaciones == "%"){
                resultado = (num1/100)*  num2; // saca el porcentaje de un numero
                select = String.format("%.2f", resultado);
                etiqueta.setText(select);
            }
            else if(operaciones == "m"){ //este boton hace que un resultado tenga signo contrario
                resultado*=-1;
                select = String.format("%.2f", resultado);
                etiqueta.setText(select);
            }
     
}
    }
     public static void main(String []args){
         
        calculadoraHaza v1 = new calculadoraHaza();
        int red = 136;
        int green = 147;
        int blue = 152;
        Color ColorVentana = new Color(red, green, blue);
         v1.getContentPane().setBackground(ColorVentana);
         v1.setBounds(0, 0, 570, 550);
         v1.setVisible(true);
         v1.setLocationRelativeTo(null);
         v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
         v1.setResizable(false); // Para mantener fija la ventana // 
        // v1.getContentPane().setBackground(Color.darkGray); // Cambiar el color de fondo// 
     }

}

      
      