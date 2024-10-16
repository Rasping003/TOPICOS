
package COMPONENTES;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;



public class serieMaclaurin extends JFrame implements  ActionListener  {
    
    private JLabel lbIter, lbEquis, lbValVerdadero;
    private JTextField txtIter, txtEquis, txtValVerdadero;
    private JButton btCalcu, clean;
    String tex="";
    private DefaultTableModel tab;

    
        public serieMaclaurin(){
            setTitle("METODOS NUMERICOS");
            setLayout(null);
            
            lbIter= new JLabel (" # Iteraciones: ");
            lbIter.setBounds(10,30,130,30);
            lbIter.setForeground(Color.WHITE);
            lbIter.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
            add(lbIter); 
            
            txtIter = new JTextField();
            txtIter.setBounds(140, 30, 80, 30);
            txtIter.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
            add(txtIter);
            
            lbEquis= new JLabel (" Valor para X: ");
            lbEquis.setBounds(10,70,120,30);
            lbEquis.setForeground(Color.WHITE);
            lbEquis.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
            add(lbEquis); 
            
            txtEquis = new JTextField();
            txtEquis.setBounds(140, 70, 80, 30);
            txtEquis.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
            add(txtEquis);
            
            lbValVerdadero= new JLabel (" Valor Verdadero: ");
            lbValVerdadero.setBounds(10,110,160,30);
            lbValVerdadero.setForeground(Color.WHITE);
            lbValVerdadero.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
            add(lbValVerdadero);
            
            txtValVerdadero = new JTextField();
            txtValVerdadero.setBounds(170, 110, 80, 30);
            txtValVerdadero.setFont(new Font("Eras Demi ITC", Font.CENTER_BASELINE, 15) );
            add(txtValVerdadero);
            
            btCalcu = new JButton("Calcular");
            btCalcu.setBounds(370, 60, 120, 30);
            btCalcu.setFont(new Font("Eras Demi ITC", Font.ITALIC, 18));
            btCalcu.setBackground(new Color(34,56,13));
            btCalcu.setForeground(Color.WHITE);
            add(btCalcu);
            btCalcu.addActionListener(this);
            
            clean = new JButton("Limpiar");
            clean.setBounds(370, 100, 120, 30);
            clean.setFont(new Font("Eras Demi ITC", Font.ITALIC, 18));
            clean.setBackground(new Color(34,56,13));
            clean.setForeground(Color.WHITE);
            add(clean);
            clean.addActionListener(this);
            
            
            tab = new DefaultTableModel(new Object[]{"# It", "Valor aprox", "Error Absoluto", "Error Relativo", "Error Porcentual"}, 0);

            JTable tabla = new JTable(tab);
            JScrollPane sc = new JScrollPane(tabla);
            sc.setBounds(10, 200, 600, 200);
            sc.setBackground(Color.LIGHT_GRAY);
            add(sc);

        }
        
    public double metodo (double x, int it) {
        double suma = 0;
        for (int i = 0; i < it; i++) {
            suma += Math.pow(x, i) / factorial(i);
        }
        return Math.round(suma * 1e6) / 1e6; // la e6 es para redondear a 6 decimales
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btCalcu) {
            int iteracion = Integer.parseInt(txtIter.getText());
            double valReal = Double.parseDouble(txtValVerdadero.getText());
            double equis = Double.parseDouble(txtEquis.getText());
            String por= "%";

            for (int i = 1; i <= iteracion; i++) {
                double valorAprox = metodo(equis, i);
                double errorAbs = Math.abs(valReal - valorAprox);
                double errorRel = errorAbs / valReal;
                double errorPor = errorRel * 100 ;
                tab.addRow(new Object[]{i, valorAprox, Math.round(errorAbs * 1e6) / 1e6, Math.round(errorRel * 1e6) / 1e6, Math.round(errorPor * 1e2) / 1e2 + por});
            }
        }
        if(ae.getSource()== clean){
            tab.setRowCount(0); // Limpiar por completo la tabla
            txtIter.setText(tex);//limpia la caja de texto del num Iteraciones
            txtEquis.setText(tex);//limpia la caja de texto de equis
            txtValVerdadero.setText(tex);//limpia la caja de texto del Valor Verdadero
        }
    }

    
    
    public static void main(String[] args) {
       serieMaclaurin v1= new serieMaclaurin();
        v1.setLayout(null);
        v1.setBounds(0, 0, 650, 500);
        v1.getContentPane().setBackground(new Color(30,50,68));
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setResizable(false);
        v1.setVisible(true);
    }
    
}
