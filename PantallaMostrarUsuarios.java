import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import com.toedter.calendar.*;

public class PantallaMostrarUsuarios extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuUsuarios, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemNuevo, menuItemSalir, menuItemAgregarUsuario, menuItemEliminarUsuario, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaMarcaAutor;
	private JButton botonAgregarUsuario,botonEliminarUsuario, botonEditarUsuario, botonConsultarUsuario, botonSalir;
	private JTextField campoTextoNombres, campoTextoApellidoPaterno, campoTextoApellidoMaterno;

	public PantallaMostrarUsuarios() {

		setLayout(null);
		setTitle("TicketBus APP");
		getContentPane().setBackground(Color.RED);
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Login loginJFrame = new Login();

		barraMenu = new JMenuBar();
		barraMenu.setBackground(Color.RED);
		setJMenuBar(barraMenu);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setFont(new Font("Andale Mono",1,14));
		menuOpciones.setForeground(Color.WHITE);
		barraMenu.add(menuOpciones);

		menuColorFondo = new JMenu("Color Fondo");
		menuColorFondo.setForeground(Color.RED);
		menuOpciones.add(menuColorFondo);

		menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.setForeground(Color.RED);
		menuItemRojo.addActionListener(this);
		menuColorFondo.add(menuItemRojo);

		menuItemMorado = new JMenuItem("Morado");
		menuItemMorado.setForeground(Color.RED);
		menuItemMorado.addActionListener(this);
		menuColorFondo.add(menuItemMorado);

		menuItemNegro = new JMenuItem("Negro");
		menuItemNegro.setForeground(Color.RED);
		menuItemNegro.addActionListener(this);
		menuColorFondo.add(menuItemNegro);

		menuItemNuevo = new JMenuItem("Nuevo");
		menuItemNuevo.setForeground(Color.RED);
		menuItemNuevo.addActionListener(this);
		menuOpciones.add(menuItemNuevo);

		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuUsuarios = new JMenu("Usuarios");
		menuUsuarios.setFont(new Font("Andale Mono",1,14));
		menuUsuarios.setForeground(Color.WHITE);
		barraMenu.add(menuUsuarios);

		menuItemAgregarUsuario = new JMenuItem("Agrega Usuario");
		menuItemAgregarUsuario.setForeground(Color.RED);
		menuItemAgregarUsuario.addActionListener(this);
		menuUsuarios.add(menuItemAgregarUsuario);

		menuItemEliminarUsuario = new JMenuItem("Eliminar Usuario");
		menuItemEliminarUsuario.setForeground(Color.RED);
		menuItemEliminarUsuario.addActionListener(this);
		menuUsuarios.add(menuItemEliminarUsuario);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font("Andale Mono",1,14));
		menuAcerca.setForeground(Color.WHITE);
		barraMenu.add(menuAcerca);

		menuItemAutor = new JMenuItem("Autor");
		menuItemAutor.setForeground(Color.RED);
		menuItemAutor.addActionListener(this);
		menuAcerca.add(menuItemAutor);
		imagenAutor = new ImageIcon("images/Gaby.png");

		imagenTicketBusNegra = new ImageIcon("images/logo1.png");
		etiquetaImagenTicketBus = new JLabel(imagenTicketBusNegra);
		etiquetaImagenTicketBus.setBounds(15,10,250,160);
		etiquetaImagenTicketBus.setBackground(Color.RED);
		add(etiquetaImagenTicketBus);

		etiquetaBienvenido = new JLabel("TicketBus©");
		etiquetaBienvenido.setFont(new Font("Andale Mono",3,40));
		etiquetaBienvenido.setForeground(Color.BLACK);
		etiquetaBienvenido.setBounds(250,23,400,150);
		add(etiquetaBienvenido);

		etiquetaDatosTrabajador = new JLabel("");
		etiquetaDatosTrabajador.setFont(new Font("Andale Mono",1,17));
		etiquetaDatosTrabajador.setForeground(Color.WHITE);
		etiquetaDatosTrabajador.setBackground(Color.RED);
		etiquetaDatosTrabajador.setBounds(50,130,480,50);
		add(etiquetaDatosTrabajador);

		etiquetaNombres = new JLabel("Nombre :");
		etiquetaNombres.setBounds(30,200,150,25);
		etiquetaNombres.setFont(new Font("Andale Mono",1,13));
		etiquetaNombres.setForeground(Color.WHITE);
		etiquetaNombres.setBackground(Color.RED);
		etiquetaNombres.setOpaque(true);
		add(etiquetaNombres);

		campoTextoNombres = new JTextField();
		campoTextoNombres.setBounds(30,230,150,25);
		campoTextoNombres.setFont(new Font("Andale Mono",1,14));
		campoTextoNombres.setForeground(Color.RED);
		add(campoTextoNombres);

		etiquetaApellidoPaterno = new JLabel("Apellido Paterno :");
		etiquetaApellidoPaterno.setBounds(30,260,150,25);
		etiquetaApellidoPaterno.setFont(new Font("Andale Mono",1,13));
		etiquetaApellidoPaterno.setForeground(Color.WHITE);
		etiquetaApellidoPaterno.setBackground(Color.RED);
		etiquetaApellidoPaterno.setOpaque(true);
		add(etiquetaApellidoPaterno);

		campoTextoApellidoPaterno = new JTextField();
		campoTextoApellidoPaterno.setBounds(30,290,150,25);
		campoTextoApellidoPaterno.setFont(new Font("Andale Mono",1,14));
		campoTextoApellidoPaterno.setForeground(Color.RED);
		add(campoTextoApellidoPaterno);

		etiquetaApellidoMaterno = new JLabel("Apellido Materno :");
		etiquetaApellidoMaterno.setBounds(30,320,150,25);
		etiquetaApellidoMaterno.setFont(new Font("Andale Mono",1,13));
		etiquetaApellidoMaterno.setForeground(Color.WHITE);
		etiquetaApellidoMaterno.setBackground(Color.RED);
		etiquetaApellidoMaterno.setOpaque(true);
		add(etiquetaApellidoMaterno);

		campoTextoApellidoMaterno = new JTextField();
		campoTextoApellidoMaterno.setBounds(30,350,150,25);
		campoTextoApellidoMaterno.setFont(new Font("Andale Mono",1,14));
		campoTextoApellidoMaterno.setForeground(Color.RED);
		add(campoTextoApellidoMaterno);

		etiquetaLugarSalida = new JLabel("Selecciona el lugar de SALIDA");
		etiquetaLugarSalida.setBounds(220,200,250,25);
		etiquetaLugarSalida.setFont(new Font("Andale Mono",1,13));
		etiquetaLugarSalida.setForeground(Color.WHITE);
		etiquetaLugarSalida.setBackground(Color.RED);
		etiquetaLugarSalida.setOpaque(true);
		add(etiquetaLugarSalida);

		comboLugarSalida = new JComboBox();
		comboLugarSalida.setBounds(220,230,250,25);
		comboLugarSalida.setFont(new Font("Andale Mono",1,14));
		comboLugarSalida.setForeground(Color.RED);
		comboLugarSalida.addActionListener(this);
		add(comboLugarSalida);

		comboLugarSalida.addItem("");
		comboLugarSalida.addItem("Salina Cruz");
		comboLugarSalida.addItem("Tehuantepec");
		comboLugarSalida.addItem("Juchitan");
		comboLugarSalida.addItem("Huatulco");
		comboLugarSalida.addItem("Matías Romero");
		comboLugarSalida.addItem("Oaxaca de Juárez");

		etiquetaLugarLlegada = new JLabel("Selecciona el lugar de LLEGADA");
		etiquetaLugarLlegada.setBounds(220,260,250,25);
		etiquetaLugarLlegada.setFont(new Font("Andale Mono",1,13));
		etiquetaLugarLlegada.setForeground(Color.WHITE);
		etiquetaLugarLlegada.setBackground(Color.RED);
		etiquetaLugarLlegada.setOpaque(true);
		add(etiquetaLugarLlegada);

		comboLugarLlegada = new JComboBox();
		comboLugarLlegada.setBounds(220,290,250,25);
		comboLugarLlegada.setFont(new Font("Andale Mono",1,14));
		comboLugarLlegada.setForeground(Color.RED);
		comboLugarLlegada.addActionListener(this);
		add(comboLugarLlegada);

		comboLugarLlegada.addItem("");
		comboLugarLlegada.addItem("Salina Cruz");
		comboLugarLlegada.addItem("Tehuantepec");
		comboLugarLlegada.addItem("Juchitan");
		comboLugarLlegada.addItem("Huatulco");
		comboLugarLlegada.addItem("Matías Romero");
		comboLugarLlegada.addItem("Oaxaca de Juárez");

		etiquetaCalendar = new JLabel("JCalendar :");
		etiquetaCalendar.setBounds(220,320,250,25);
		etiquetaCalendar.setFont(new Font("Andale Mono",1,13));
		etiquetaCalendar.setForeground(Color.WHITE);
		etiquetaCalendar.setBackground(Color.RED);
		etiquetaCalendar.setOpaque(true);
		add(etiquetaCalendar);

		calendarioSalida = new JCalendar();
		calendarioSalida.setBounds(220,350,250,200);
		calendarioSalida.setWeekOfYearVisible(false);
		calendarioSalida.setMaxDayCharacters(1);
		calendarioSalida.setTodayButtonVisible(true);
		add(calendarioSalida);

		etiquetaMarcaAutor = new JLabel("©2021 The TicketBus Company | Derechos Reservados by Gabriela Ita-ii");
		etiquetaMarcaAutor.setBounds(25,580,580,25);
		etiquetaMarcaAutor.setFont(new Font("Hack",1,11));
		etiquetaMarcaAutor.setForeground(Color.WHITE);
		etiquetaMarcaAutor.setBackground(Color.RED);
		etiquetaMarcaAutor.setOpaque(true);
		add(etiquetaMarcaAutor);

	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == menuItemRojo) {
			getContentPane().setBackground(Color.RED);
			barraMenu.setBackground(Color.RED);
			etiquetaNombres.setBackground(Color.RED);
			etiquetaApellidoPaterno.setBackground(Color.RED);
			etiquetaApellidoMaterno.setBackground(Color.RED);
			etiquetaMarcaAutor.setBackground(Color.RED);
			etiquetaLugarSalida.setBackground(Color.RED);
			etiquetaLugarLlegada.setBackground(Color.RED);
			etiquetaCalendar.setBackground(Color.RED);

		}
		if(ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
			etiquetaNombres.setBackground(new Color(102,0,153));
			etiquetaApellidoPaterno.setBackground(new Color(102,0,153));
			etiquetaApellidoMaterno.setBackground(new Color(102,0,153));
			etiquetaMarcaAutor.setBackground(new Color(102,0,153));
			etiquetaLugarSalida.setBackground(new Color(102,0,153));
			etiquetaLugarLlegada.setBackground(new Color(102,0,153));
			etiquetaCalendar.setBackground(new Color(102,0,153));
		}
		if(ae.getSource() == menuItemNegro) {
			getContentPane().setBackground(Color.BLACK);
			barraMenu.setBackground(Color.BLACK);
			etiquetaNombres.setBackground(Color.BLACK);
			etiquetaApellidoPaterno.setBackground(Color.BLACK);
			etiquetaApellidoMaterno.setBackground(Color.BLACK);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
			etiquetaLugarSalida.setBackground(Color.BLACK);
			etiquetaLugarLlegada.setBackground(Color.BLACK);
			etiquetaCalendar.setBackground(Color.BLACK);
		}
		if(ae.getSource() == menuItemNuevo) {
			campoTextoNombres.setText("");
			campoTextoApellidoPaterno.setText("");
			campoTextoApellidoMaterno.setText("");
			comboLugarSalida.setSelectedIndex(0);
			comboLugarLlegada.setSelectedIndex(0);
		}
		if(ae.getSource() == menuItemSalir) {
			if(JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if(ae.getSource() == menuItemAutor) {
		JOptionPane.showMessageDialog(null,"Desarrollado por \nGabriela Ita-ii","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
		if(ae.getSource() == menuItemAgregarUsuario) {
			this.dispose();
			PantallaAgregarUsuario objPantallaAgregarUsuario = new PantallaAgregarUsuario();
			objPantallaAgregarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaAgregarUsuario.setBounds(0,0,340,450);
			objPantallaAgregarUsuario.setResizable(true);
			objPantallaAgregarUsuario.setLocationRelativeTo(null);
			objPantallaAgregarUsuario.setVisible(true);
		}
		if(ae.getSource() == menuItemEliminarUsuario) {
			this.dispose();
			PantallaEliminarUsuario objPantallaEliminarUsuario = new PantallaEliminarUsuario();
			objPantallaEliminarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaEliminarUsuario.setBounds(0,0,340,450);
			objPantallaEliminarUsuario.setResizable(true);
			objPantallaEliminarUsuario.setLocationRelativeTo(null);
			objPantallaEliminarUsuario.setVisible(true);
		}
		if(ae.getSource() == botonAgregarUsuario) {
			
		}
		if(ae.getSource() == botonEliminarUsuario) {

		}
		if(ae.getSource() == botonEditarUsuario) {

		}
		if(ae.getSource() == botonConsultarUsuario) {

		}
	}

	public static void main(String[] args) {

		PantallaMostrarUsuarios pantallaPrincipal = new PantallaMostrarUsuarios();
		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallaPrincipal.setBounds(0,0,620,620);
//		pantallaPrincipal.setBounds(0,0,620,560);
		pantallaPrincipal.setResizable(true);
		pantallaPrincipal.setLocationRelativeTo(null);
		pantallaPrincipal.setVisible(true);

	}
}
