import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import com.toedter.calendar.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class PantallaMostrarBoletos extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuEmpleado, menuAcerca, menuBoletos;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemVentaBoletos, menuItemSalir, menuItemAgregarEmpleado, menuItemEliminarEmpleado, menuItemMostrarEmpleados, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaBienvenido, etiquetaMarcaAutor;
	private JTable tablaMostrarBoletos;
	private String[] nombreColumnas = {"Nombre", "Origen", "Destino", "Numero Asiento", "Hora Boleto", "Fecha Boleto", "Clase Boleto", "Precio Boleto"};

	private JButton botonComprar;

	public PantallaMostrarBoletos() {

		setLayout(null);
		setTitle("TicketBus APP");
		getContentPane().setBackground(Color.RED);
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Login loginJFrame = new Login();

		barraMenu = new JMenuBar();
		barraMenu.setBackground(Color.RED);
		setJMenuBar(barraMenu);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setFont(new Font(null,1,14));
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

		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuBoletos = new JMenu("Boletos");
		menuBoletos.setFont(new Font(null,1,14));
		menuBoletos.setForeground(Color.WHITE);
		barraMenu.add(menuBoletos);

		menuItemVentaBoletos = new JMenuItem("Venta Boletos");
		menuItemVentaBoletos.setForeground(Color.RED);
		menuItemVentaBoletos.addActionListener(this);
		menuBoletos.add(menuItemVentaBoletos);

		menuEmpleado = new JMenu("Empleados");
		menuEmpleado.setFont(new Font(null,1,14));
		menuEmpleado.setForeground(Color.WHITE);
		barraMenu.add(menuEmpleado);

		menuItemAgregarEmpleado = new JMenuItem("Agregar Empleado");
		menuItemAgregarEmpleado.setForeground(Color.RED);
		menuItemAgregarEmpleado.addActionListener(this);
		menuEmpleado.add(menuItemAgregarEmpleado);

		menuItemEliminarEmpleado = new JMenuItem("Eliminar Empleado");
		menuItemEliminarEmpleado.setForeground(Color.RED);
		menuItemEliminarEmpleado.addActionListener(this);
		menuEmpleado.add(menuItemEliminarEmpleado);

		menuItemMostrarEmpleados = new JMenuItem("Mostrar Empleado");
		menuItemMostrarEmpleados.setForeground(Color.RED);
		menuItemMostrarEmpleados.addActionListener(this);
		menuEmpleado.add(menuItemMostrarEmpleados);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font(null,1,14));
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
		etiquetaBienvenido.setFont(new Font(null,3,40));
		etiquetaBienvenido.setForeground(Color.BLACK);
		etiquetaBienvenido.setBounds(250,23,400,150);
		add(etiquetaBienvenido);



		etiquetaMarcaAutor = new JLabel("©2021 The TicketBus Company | Derechos Reservados by Gabriela & Hugo");
		etiquetaMarcaAutor.setBounds(23,520,550,25);
		etiquetaMarcaAutor.setFont(new Font(null,1,11));
		etiquetaMarcaAutor.setForeground(Color.WHITE);
		etiquetaMarcaAutor.setBackground(Color.RED);
		etiquetaMarcaAutor.setOpaque(true);
		add(etiquetaMarcaAutor);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == menuItemRojo) {
			getContentPane().setBackground(Color.RED);
			barraMenu.setBackground(Color.RED);
		}
		if (ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
		}
		if (ae.getSource() == menuItemNegro) {
			getContentPane().setBackground(Color.BLACK);
			ImageIcon imagenTicketBusBlanca;
			JLabel etiquetaImagenTicketBusBlanca;
			imagenTicketBusBlanca = new ImageIcon("images/logo1-blanco.png");
			etiquetaImagenTicketBusBlanca = new JLabel(imagenTicketBusBlanca);
			etiquetaImagenTicketBusBlanca.setBounds(15,10,250,160);
			etiquetaImagenTicketBusBlanca.setBackground(Color.BLACK);
			etiquetaImagenTicketBusBlanca.setForeground(Color.WHITE);
			add(etiquetaImagenTicketBusBlanca);
			barraMenu.setBackground(Color.BLACK);
			etiquetaBienvenido.setBackground(Color.BLACK);
			etiquetaBienvenido.setForeground(Color.WHITE);
		}
		if (ae.getSource() == menuItemSalir) {
			if (JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if (ae.getSource() == menuItemVentaBoletos) {
			this.dispose();
			PantallaPrincipal objPantallaPrincipal = new PantallaPrincipal();
			objPantallaPrincipal.pack();
			objPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaPrincipal.setBounds(0,0,340,450);
			objPantallaPrincipal.setResizable(true);
			objPantallaPrincipal.setLocationRelativeTo(null);
			objPantallaPrincipal.setVisible(true);
		}
		if (ae.getSource() == menuItemAgregarEmpleado) {
			this.dispose();
			PantallaAgregarEmpleado objPantallaAgregarEmpleado = new PantallaAgregarEmpleado();
			objPantallaAgregarEmpleado.pack();
			objPantallaAgregarEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaAgregarEmpleado.setBounds(0,0,340,450);
			objPantallaAgregarEmpleado.setResizable(true);
			objPantallaAgregarEmpleado.setLocationRelativeTo(null);
			objPantallaAgregarEmpleado.setVisible(true);
		}
		if (ae.getSource() == menuItemEliminarEmpleado) {
			this.dispose();
			PantallaEliminarEmpleado objPantallaEliminarEmpleado = new PantallaEliminarEmpleado();
			objPantallaEliminarEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaEliminarEmpleado.setBounds(0,0,340,450);
			objPantallaEliminarEmpleado.setResizable(true);
			objPantallaEliminarEmpleado.setLocationRelativeTo(null);
			objPantallaEliminarEmpleado.setVisible(true);
		}
		if (ae.getSource() == menuItemMostrarEmpleados) {
			this.dispose();
			PantallaMostrarEmpleados objPantallaMostrarEmpleados = new PantallaMostrarEmpleados();
			objPantallaMostrarEmpleados.pack();
			objPantallaMostrarEmpleados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaMostrarEmpleados.setBounds(0,0,620,620);
			objPantallaMostrarEmpleados.setResizable(true);
			objPantallaMostrarEmpleados.setLocationRelativeTo(null);
			objPantallaMostrarEmpleados.setVisible(true);
		}
		if (ae.getSource() == menuItemAutor) {
			JOptionPane.showMessageDialog(null,"Desarrollado por \nGabriela Ita-ii","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
	}


	public static void main(String[] args) {
		PantallaMostrarBoletos objPantallaMostrarBoletos = new PantallaMostrarBoletos();
		objPantallaMostrarBoletos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objPantallaMostrarBoletos.setBounds(0,0,520,580);
		objPantallaMostrarBoletos.setResizable(true);
		objPantallaMostrarBoletos.setLocationRelativeTo(null);
		objPantallaMostrarBoletos.setVisible(true);
	}
}

