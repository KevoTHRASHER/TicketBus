import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

	private ImageIcon imagenLogoTicketBus;
	private JLabel etiquetaLogoTicketBus, etiquetaSistemaVentaBoletos, etiquetaCapturaNombre, etiquetaMarcaRegistrada, etiquetaContraseña;
	private JTextField campoTextoCapturaNombre;
	private	JPasswordField campoContraseña;
	private JButton botonIngresar;
	public static String nombreCapturado = "";

	ConexionSQL cc = new ConexionSQL();
	Connection con = cc.conexion();

	public Login() {

		setLayout(null);

		getContentPane().setBackground(Color.RED);
		setTitle("Bienvenido a TicketBus");
		setIconImage(new ImageIcon(getClass().getResource("images/ticket2.png")).getImage());

		imagenLogoTicketBus = new ImageIcon("images/logo1.png");
		etiquetaLogoTicketBus = new JLabel();
		etiquetaLogoTicketBus.setBounds(60,15,260,150);
		etiquetaLogoTicketBus.setIcon(imagenLogoTicketBus);
		etiquetaLogoTicketBus.setBackground(Color.RED);
		etiquetaLogoTicketBus.setOpaque(false);
		add(etiquetaLogoTicketBus);

		etiquetaSistemaVentaBoletos = new JLabel("TicketBus");
		etiquetaSistemaVentaBoletos.setFont(new Font("Andale Mono",1,24));
		etiquetaSistemaVentaBoletos.setBounds(100,170,250,30);
		etiquetaSistemaVentaBoletos.setForeground(Color.BLACK);
		etiquetaSistemaVentaBoletos.setBackground(Color.RED);
		etiquetaSistemaVentaBoletos.setOpaque(true);
		add(etiquetaSistemaVentaBoletos);

		etiquetaCapturaNombre = new JLabel("Ingrese su correo :");
		etiquetaCapturaNombre.setFont(new Font("Hack",1,14));
		etiquetaCapturaNombre.setBounds(50,210,200,25);
		etiquetaCapturaNombre.setOpaque(true);
		etiquetaCapturaNombre.setBackground(Color.RED);
		etiquetaCapturaNombre.setForeground(Color.WHITE);
		add(etiquetaCapturaNombre);

		campoTextoCapturaNombre = new JTextField();
		campoTextoCapturaNombre.setBounds(50,240,230,25);
		campoTextoCapturaNombre.setFont(new Font("Hack",1,14));
		campoTextoCapturaNombre.setForeground(Color.RED);
		add(campoTextoCapturaNombre);

		etiquetaContraseña = new JLabel("Ingresa tu contraseña :");
		etiquetaContraseña.setFont(new Font("Hack",1,14));
		etiquetaContraseña.setBounds(50,270,200,25);
		etiquetaContraseña.setBackground(Color.RED);
		etiquetaContraseña.setForeground(Color.WHITE);
		etiquetaContraseña.setOpaque(true);
		add(etiquetaContraseña);

		campoContraseña = new JPasswordField(10);
		campoContraseña.setBounds(50,300,230,25);
		campoContraseña.setFont(new Font("Hack",1,14));
		campoContraseña.setForeground(Color.RED);
		add(campoContraseña);

		botonIngresar = new JButton("Ingresar");
		botonIngresar.setForeground(Color.RED);
		botonIngresar.setBackground(Color.WHITE);
		botonIngresar.setBounds(100,345,120,30);
		botonIngresar.addActionListener(this);
		add(botonIngresar);

		etiquetaMarcaRegistrada = new JLabel("©2021 The TicketBus Company by ITSAL.");
		etiquetaMarcaRegistrada.setFont(new Font("Hack",1,12));
		etiquetaMarcaRegistrada.setBounds(10,405,320,25);
		etiquetaMarcaRegistrada.setForeground(Color.WHITE);
		etiquetaMarcaRegistrada.setBackground(Color.RED);
		add(etiquetaMarcaRegistrada);

	}
	
	/*public void validarUsuario() {
		int resultado = 0;
		String pass = String.valueOf(campoContraseña.getPassword());
		String usuario = campoTextoCapturaNombre.getText();
		String SQL = "select * from Usuarios where Usuario='"+usuario+"' and Contraseña='"+pass+"' ";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL);

			if (rs.next()) {
				resultado = 1;

				if (resultado == 1) {
					PantallaPrincipal pantallaPrincipalJFrame = new PantallaPrincipal();
					pantallaPrincipalJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					pantallaPrincipalJFrame.setBounds(0,0,580,560);
					pantallaPrincipalJFrame.setResizable(true);
					pantallaPrincipalJFrame.setLocationRelativeTo(null);
					pantallaPrincipalJFrame.setVisible(true);
					this.dispose();

				}
			} else {
				JOptionPane.showMessageDialog(null,"ERROR de ACCESO,Usuario NO REGISTRADO");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage());
		}
	}
*/

	public void actionPerformed(ActionEvent ae) {
		try {
			Conection cn = DriverManager.getConnection("jdbc:mysql//localhost:3306/LoginTicket","root","123");
			PreparedStatement pst = cn.prepareStatement(" select * from Usuarios where Usuario='"+usuario+"' and Contraseña='"+pass+"' ");

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {

		Login objLogin = new Login();
		objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objLogin.setBounds(0,0,340,450);
		objLogin.setResizable(true);
		objLogin.setLocationRelativeTo(null);
		objLogin.setVisible(true);

	}
}
