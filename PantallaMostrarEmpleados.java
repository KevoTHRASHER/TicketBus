import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import com.toedter.calendar.*;

public class PantallaMostrarEmpleados extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuUsuarios, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemPantallaPrincipal, menuItemSalir, menuItemAgregarEmpleado, menuItemEliminarEmpleado, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaMarcaAutor, etiquetaBienvenido;
	private JButton botonAgregarUsuario,botonEliminarUsuario, botonEditarUsuario, botonConsultarUsuario, botonInicio, botonSalir;

	public PantallaMostrarEmpleados() {

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

		menuItemPantallaPrincipal = new JMenuItem("Pantalla Principal");
		menuItemPantallaPrincipal.setForeground(Color.RED);
		menuItemPantallaPrincipal.addActionListener(this);
		menuOpciones.add(menuItemPantallaPrincipal);

		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuUsuarios = new JMenu("Mostrar Empleados");
		menuUsuarios.setFont(new Font("Andale Mono",1,14));
		menuUsuarios.setForeground(Color.WHITE);
		barraMenu.add(menuUsuarios);

		menuItemAgregarEmpleado = new JMenuItem("Agregar Empleado");
		menuItemAgregarEmpleado.setForeground(Color.RED);
		menuItemAgregarEmpleado.addActionListener(this);
		menuUsuarios.add(menuItemAgregarEmpleado);

		menuItemEliminarEmpleado = new JMenuItem("Eliminar Empleado");
		menuItemEliminarEmpleado.setForeground(Color.RED);
		menuItemEliminarEmpleado.addActionListener(this);
		menuUsuarios.add(menuItemEliminarEmpleado);

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
		etiquetaBienvenido.setFont(new Font("Andale Mono",3,36));
		etiquetaBienvenido.setForeground(Color.BLACK);
		etiquetaBienvenido.setBounds(250,23,400,150);
		add(etiquetaBienvenido);

		botonAgregarUsuario = new JButton("AGREGAR");
		botonAgregarUsuario.setFont(new Font("Andale Mono",1,14));
		botonAgregarUsuario.setForeground(Color.WHITE);
		botonAgregarUsuario.setBackground(Color.BLUE);
		botonAgregarUsuario.setBounds(30,200,150,25);
		add(botonAgregarUsuario);

		botonEliminarUsuario = new JButton("ELIMINAR");
		botonEliminarUsuario.setFont(new Font("Andale Mono",1,14));
		botonEliminarUsuario.setForeground(Color.WHITE);
		botonEliminarUsuario.setBackground(Color.BLUE);
		botonEliminarUsuario.setBounds(30,260,150,25);
		add(botonEliminarUsuario);

		botonEditarUsuario = new JButton("EDITAR");
		botonEditarUsuario.setFont(new Font("Andale Mono",1,14));
		botonEditarUsuario.setForeground(Color.WHITE);
		botonEditarUsuario.setBackground(Color.BLUE);
		botonEditarUsuario.setBounds(30,320,150,25);
		add(botonEditarUsuario);

		botonConsultarUsuario = new JButton("CONSULTAR");
		botonConsultarUsuario.setFont(new Font("Andale Mono",1,14));
		botonConsultarUsuario.setForeground(Color.WHITE);
		botonConsultarUsuario.setBackground(Color.BLUE);
		botonConsultarUsuario.setBounds(220,200,150,25);
		add(botonConsultarUsuario);

		botonInicio = new JButton("INICIO");
		botonInicio.setFont(new Font("Andale Mono",1,14));
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setBackground(Color.BLUE);
		botonInicio.setBounds(220,260,150,25);
		add(botonInicio);

		botonSalir = new JButton("SALIR");
		botonSalir.setFont(new Font("Andale Mono",1,14));
		botonSalir.setForeground(Color.WHITE);
		botonSalir.setBackground(Color.BLUE);
		botonSalir.setBounds(220,320,150,25);
		add(botonSalir);

/*		etiquetaCalendar = new JLabel("JCalendar :");
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
*/
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
			botonAgregarUsuario.setBackground(Color.BLUE);
			botonEliminarUsuario.setBackground(Color.BLUE);
			botonEditarUsuario.setBackground(Color.BLUE);
			botonConsultarUsuario.setBackground(Color.BLUE);
			botonSalir.setBackground(Color.BLUE);
			etiquetaMarcaAutor.setBackground(Color.RED);
		}
		if(ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(Color.MAGENTA);
			barraMenu.setBackground(Color.MAGENTA);
			botonAgregarUsuario.setBackground(Color.GREEN);
			botonEliminarUsuario.setBackground(Color.GREEN);
			botonEditarUsuario.setBackground(Color.GREEN);
			botonConsultarUsuario.setBackground(Color.GREEN);
			botonSalir.setBackground(Color.GREEN);
			etiquetaMarcaAutor.setBackground(Color.MAGENTA);
		}
		if(ae.getSource() == menuItemNegro) {
			getContentPane().setBackground(Color.BLACK);
			barraMenu.setBackground(Color.BLACK);
			botonAgregarUsuario.setBackground(Color.RED);
			botonEliminarUsuario.setBackground(Color.RED);
			botonEditarUsuario.setBackground(Color.RED);
			botonConsultarUsuario.setBackground(Color.RED);
			botonSalir.setBackground(Color.RED);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
		}
		if(ae.getSource() == menuItemPantallaPrincipal) {
			this.dispose();
			PantallaPrincipal objPantallaPrincipal = new PantallaPrincipal();
			objPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaPrincipal.setBounds(0,0,620,620);
//			objPantallaPrincipal.setBounds(0,0,620,560);
			objPantallaPrincipal.setResizable(true);
			objPantallaPrincipal.setLocationRelativeTo(null);
			objPantallaPrincipal.setVisible(true);
		}
		if(ae.getSource() == menuItemSalir) {
			if(JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if(ae.getSource() == menuItemAutor) {
		JOptionPane.showMessageDialog(null,"Desarrollado por \nGabriela Ita-ii","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
		if(ae.getSource() == menuItemAgregarEmpleado) {
			this.dispose();
			PantallaAgregarEmpleado objPantallaAgregarEmpleado = new PantallaAgregarEmpleado();
			objPantallaAgregarEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaAgregarEmpleado.setBounds(0,0,340,450);
			objPantallaAgregarEmpleado.setResizable(true);
			objPantallaAgregarEmpleado.setLocationRelativeTo(null);
			objPantallaAgregarEmpleado.setVisible(true);
		}
		if(ae.getSource() == menuItemEliminarEmpleado) {
			this.dispose();
			PantallaEliminarEmpleado objPantallaEliminarEmpleado = new PantallaEliminarEmpleado();
			objPantallaEliminarEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaEliminarEmpleado.setBounds(0,0,340,450);
			objPantallaEliminarEmpleado.setResizable(true);
			objPantallaEliminarEmpleado.setLocationRelativeTo(null);
			objPantallaEliminarEmpleado.setVisible(true);
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

		PantallaMostrarEmpleados objPantallaMostarUsuarios = new PantallaMostrarEmpleados();
		objPantallaMostarUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		objPantallaMostarUsuarios.setBounds(0,0,620,620);
		objPantallaMostarUsuarios.setBounds(0,0,500,460);
		objPantallaMostarUsuarios.setResizable(true);
		objPantallaMostarUsuarios.setLocationRelativeTo(null);
		objPantallaMostarUsuarios.setVisible(true);

	}
}
