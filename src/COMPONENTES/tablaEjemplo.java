
package COMPONENTES;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class tablaEjemplo extends JFrame {
 
    
    public static void main(String[] args) {
      
        String [] cabezera = {"# iteraciones", "Valor Aprox", "Error Absoluto", "Error Relativo", "Error Porcentual"};
        String [][] datos = {
            {"María", "México", "1234567"},
            {"Jose", "Monterrey", "67865"},
            {"Luis", "Poza Rica", "21645"},
            {"Violeta","Veracruz", "89765"},
            {"Pepe", "Queretaro", "543221"},
            {"Laura", "Tampico", "9076654"},
            {"Miguel", "Cancun", "23456"},
            {"Manuel", "Acapulco", "709865"},
        
        };
        DefaultTableModel mod = new DefaultTableModel(datos, cabezera); // datos y cabezera respectivame nte se almacena en mod
        JTable tabla = new JTable (mod); //tabla contenga a mod
        JScrollPane sc = new JScrollPane (tabla); //crea el Scroll y agrega a tabla
        sc.setBounds(40, 40, 400, 200);
        
        JFrame v1 = new JFrame ();
        v1.setLayout(null);
        v1.setBounds(10, 10, 500, 500);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setResizable(false);
        v1.add(sc);
        v1.setVisible(true);
        
        
        
    }
    
}
