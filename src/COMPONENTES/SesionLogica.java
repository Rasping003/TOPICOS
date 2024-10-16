package COMPONENTES;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class SesionLogica extends JFrame implements ActionListener {

    private JLabel lbError, lbUsuario, lbContra;
    private JButton btIngresar; //boton de aceptar
    private JTextField txtUsuario; //caja de texto para el usuario
    private JPasswordField contra; //tipo de dato para que se vea como una contraseña
    private String usuario = "Hazael";
    private String contras = "Haza345";

    public SesionLogica() {
        setLayout(null);

        lbError = new JLabel();
        lbError.setForeground(new Color(230, 32, 23));
        lbError.setFont(new Font("Eras Demi ITC", Font.PLAIN, 20));
        lbError.setBounds(120, 420, 400, 50);
        add(lbError);

        lbUsuario = new JLabel("USUARIO");
        lbUsuario.setForeground(Color.WHITE);
        lbUsuario.setFont(new Font("Georgia", Font.PLAIN, 19));
        lbUsuario.setBounds(80, 275, 400, 50);
        add(lbUsuario);

        lbContra = new JLabel("CONTRASEÑA");
        lbContra.setForeground(Color.WHITE);
        lbContra.setFont(new Font("Georgia", Font.PLAIN, 19));
        lbContra.setBounds(60, 360, 400, 50);
        add(lbContra);

        btIngresar = new JButton("INGRESAR");
        btIngresar.setBounds(220, 520, 150, 30);
        btIngresar.setBackground(new Color(182, 182, 182));
        btIngresar.setForeground(Color.WHITE);
        btIngresar.setFont(new Font("Georgia", Font.PLAIN, 22));
        add(btIngresar);
        btIngresar.addActionListener(this);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(200, 275, 250, 45);
        txtUsuario.setBackground(new Color(190, 190, 190));
        txtUsuario.setForeground(Color.WHITE);
        txtUsuario.setFont(new Font("Georgia", Font.PLAIN, 19));
        add(txtUsuario);

        contra = new JPasswordField();
        contra.setBounds(200, 360, 250, 45);
        contra.setFont(new Font("Georgia", Font.PLAIN, 19));
        contra.setBackground(new Color(190, 190, 190));
        contra.setForeground(Color.WHITE);
        add(contra);

        ImageIcon usua = new ImageIcon("USUA.PNG"); // icono de usuario
        JLabel usu = new JLabel();
        usu.setBounds(455, 275, 48, 48);
        usu.setIcon(new ImageIcon(usua.getImage().getScaledInstance(usu.getWidth(), usu.getHeight(), Image.SCALE_SMOOTH)));
        add(usu);

        ImageIcon contra = new ImageIcon("CONTRA.PNG"); //icono de contraseña
        JLabel pasw = new JLabel();
        pasw.setBounds(445, 360, 65, 45);
        pasw.setIcon(new ImageIcon(contra.getImage().getScaledInstance(pasw.getWidth(), pasw.getHeight(), Image.SCALE_SMOOTH)));
        add(pasw);

        ImageIcon img1 = new ImageIcon("Lion.png");
        JLabel lb3 = new JLabel();
        lb3.setBounds(220, 100, 160, 160);
        lb3.setIcon(new ImageIcon(img1.getImage().getScaledInstance(lb3.getWidth(), lb3.getHeight(), Image.SCALE_SMOOTH)));
        add(lb3);

        ImageIcon img2 = new ImageIcon("hexaborra.JPG"); //imagen de fondo borroso
        JLabel lb2 = new JLabel();
        lb2.setBounds(55, 70, 485, 560);
        lb2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(lb2.getWidth(), lb2.getHeight(), Image.SCALE_SMOOTH)));
        add(lb2);

        ImageIcon img3 = new ImageIcon("hexa.JPEG");// imagen de fondo
        JLabel lb1 = new JLabel();
        lb1.setBounds(0, 0, 600, 750);
        lb1.setIcon(new ImageIcon(img3.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH)));
        add(lb1);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btIngresar) { 
            contras = contra.getText(); // se le almacena la info de la contraseña dentron de "contras"
            usuario = txtUsuario.getText(); // se guarda la info de la caja de texto en el string usuario

            if (usuario.equals("Hazael") && contras.equals("Haza345")) { //si el String "usuario" es Hazael y su contras es EDE003 entonces entra en el if
                Sesion v1 = new Sesion(); //se hace visible otra ventana donde se diga que si accedio correctamente (el otro codigo)
                v1.setVisible(true);
                this.dispose();
            } else { // si no escorrecta la informacion entonces:
                lbError.setText("INGRESA LOS DATOS NUEVAMENTE");// muestra un mensaje que diga lo anterior 
                contra.setText(""); //se borra los JText para que vuelva a intraducir los datos
                txtUsuario.setText("");
            }
        }

    }

    public static void main(String[] args) {
        SesionLogica v1 = new SesionLogica();
        v1.setTitle("Inicio de sesión");
        v1.setBounds(0, 0, 600, 750);
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setResizable(false);
    }
}
