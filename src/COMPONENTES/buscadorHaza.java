package COMPONENTES;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class buscadorHaza extends JFrame implements ActionListener {
    // primera ventana
    private JLabel lbName, lbError;
    private JButton btBuscar; //boton de aceptar
    private JTextField txtName; //caja de texto para el nombre
    private String name1 = "Hazael", name2 = "Kevin";
    
    //segunda ventana
    private JTextField txtNomCom, txtDirec;
    private JLabel nomCompleto, direc, lb1 ;
    private ImageIcon imgFondo, logoLeon, foto;
    
    public buscadorHaza() {
        setLayout(null);

        lbName = new JLabel("NOMBRE");
        lbName.setForeground(Color.WHITE);
        lbName.setFont(new Font("Georgia", Font.PLAIN, 19));
        lbName.setBounds(120, 230, 400, 50);
        add(lbName);

        lbError = new JLabel();
        lbError.setForeground(Color.WHITE);
        lbError.setFont(new Font("Britannic Bold", Font.PLAIN, 19));
        lbError.setBounds(220, 320, 400, 50);
        add(lbError);

        btBuscar = new JButton("BUSCAR");
        btBuscar.setBounds(500, 230, 130, 45);
        btBuscar.setBackground(new Color(182, 182, 182));
        btBuscar.setForeground(Color.WHITE);
        btBuscar.setFont(new Font("Georgia", Font.PLAIN, 20));
        add(btBuscar);
        btBuscar.addActionListener(this);

        txtName = new JTextField();
        txtName.setBounds(230, 230, 250, 45);
        txtName.setBackground(new Color(190, 190, 190));
        txtName.setForeground(Color.BLACK);
        txtName.setFont(new Font("Georgia", Font.PLAIN, 19));
        add(txtName);

        ImageIcon img1 = new ImageIcon("Lion.png");
        JLabel lb3 = new JLabel();
        lb3.setBounds(260, 40, 160, 160);
        lb3.setIcon(new ImageIcon(img1.getImage().getScaledInstance(lb3.getWidth(), lb3.getHeight(), Image.SCALE_SMOOTH)));
        add(lb3);

        ImageIcon img3 = new ImageIcon("Horizonte.JPG");// imagen de fondo
        JLabel lb1 = new JLabel();
        lb1.setBounds(0, 0, 700, 550);
        lb1.setIcon(new ImageIcon(img3.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH)));
        add(lb1);
    }

    public class muestraDatos extends JFrame {

        

       public muestraDatos() {
            setLayout(null);
            setTitle("Buscando...");
            setBounds(0, 0, 700, 550);
            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            nomCompleto = new JLabel("NOMBRE: ");
            nomCompleto.setBounds(60, 100, 300, 40);
            nomCompleto.setForeground(Color.WHITE);
            nomCompleto.setFont(new Font("Georgia", Font.BOLD, 25));
            add(nomCompleto);

            txtNomCom = new JTextField(" Hazael Ramos Rivera");
            txtNomCom.setBounds(230, 100, 250, 45);
            txtNomCom.setBackground(new Color(80, 127, 128));
            txtNomCom.setForeground(Color.WHITE);
            txtNomCom.setFont(new Font("Georgia", Font.PLAIN, 19));
            txtNomCom.setEditable(false);
            add(txtNomCom);

            direc = new JLabel("DIRECCIÓN: ");
            direc.setBounds(40, 160, 300, 40);
            direc.setForeground(Color.WHITE);
            direc.setFont(new Font("Georgia", Font.BOLD, 25));
            add(direc);

            txtDirec = new JTextField(" Cazones de Herrera Ver. ");
            txtDirec.setBounds(230, 160, 250, 45);
            txtDirec.setBackground(new Color(80, 127, 128));
            txtDirec.setForeground(Color.WHITE);
            txtDirec.setFont(new Font("Georgia", Font.PLAIN, 19));
            txtDirec.setEditable(false);
            add(txtDirec);

            lb1 = new JLabel("PERSONA ENCONTRADA");
            lb1.setBounds(235, 15, 300, 100);
            lb1.setForeground(Color.WHITE);
            lb1.setFont(new Font("Georgia", Font.PLAIN, 18));
            add(lb1);

            logoLeon = new ImageIcon("CaraLeon.PNG"); // imagen de cara de leon 
            JLabel lb3 = new JLabel();
            lb3.setBounds(560, 30, 100, 100);
            lb3.setIcon(new ImageIcon(logoLeon.getImage().getScaledInstance(lb3.getWidth(), lb3.getHeight(), Image.SCALE_SMOOTH)));
            add(lb3);

            foto = new ImageIcon("Haza.PNG"); //fotografia de usuario
            JLabel lb4 = new JLabel();
            lb4.setBounds(250, 250, 170, 170);
            lb4.setIcon(new ImageIcon(foto.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH)));
            add(lb4);
            

            imgFondo = new ImageIcon("fondo2.PNG"); //imagen de fondo2
            JLabel lb1 = new JLabel();
            lb1.setBounds(0, 0, 700, 550);
            lb1.setIcon(new ImageIcon(imgFondo.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH)));
            add(lb1);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btBuscar) {
            
            name1 = txtName.getText(); // se guarda la info de la caja de texto en el string name1
            name2 =txtName.getText();
            if (name1.equals("Hazael")) { //si el String "name1" es Hazael entonces entra en el if
                
                muestraDatos v2 = new muestraDatos(); //se hace visible otra ventana donde muestra toda la informacion de la persona
                v2.setVisible(true);
                
            } else { // si no escorrecta la informacion entonces:
                lbError.setText("¡¡¡ERROR DE DATOS!!! ");
                txtName.setText("");
            }
            if (name2.equals("Kevin")){ //segunda persona que puede ser buscada
               
                muestraDatos v2 = new muestraDatos(); //se hace visible otra ventana donde muestra toda la informacion de la persona
                
                v2.setVisible(true); 
                txtNomCom.setText(" Kevin Perez Ramirez");
                txtDirec.setText("Ciudad de México");
                 
            
            }
        }

    }

    public static void main(String[] args) {
        buscadorHaza v1 = new buscadorHaza();
        v1.setTitle("Buscador");
        v1.setBounds(0, 0, 700, 550);
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setResizable(false);

    }
}
