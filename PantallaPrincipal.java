import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import com.toedter.calendar.*;

public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuEmpleado, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemSalir, menuItemAgregarEmpleado, menuItemEliminarEmpleado, menuItemMostrarEmpleados, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaClaseBoleto, etiquetaNoAsiento, etiquetaLugarSalida, etiquetaLugarLlegada, etiquetaCalendar, etiquetaMarcaAutor;
	private JTextField campoTextoNombres, campoTextoApellidoPaterno, campoTextoApellidoMaterno;
	private JComboBox comboClaseBoleto, comboNoAsiento, comboLugarSalida, comboLugarLlegada;
	private JCalendar calendarioSalida;

	public PantallaPrincipal() {

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

		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuEmpleado = new JMenu("Empleados");
		menuEmpleado.setFont(new Font("Andale Mono",1,14));
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

		etiquetaClaseBoleto = new JLabel("Clase de Boleto");
		etiquetaClaseBoleto.setBounds(30,260,150,25);
		etiquetaClaseBoleto.setFont(new Font("Andale Mono",1,13));
		etiquetaClaseBoleto.setForeground(Color.WHITE);
		etiquetaClaseBoleto.setBackground(Color.RED);
		etiquetaClaseBoleto.setOpaque(true);
		add(etiquetaClaseBoleto);

		comboClaseBoleto = new JComboBox();
		comboClaseBoleto.setBounds(30,290,150,25);
		comboClaseBoleto.setFont(new Font("Andale Mono",1,14));
		comboClaseBoleto.setForeground(Color.RED);
		comboClaseBoleto.addActionListener(this);
		add(comboClaseBoleto);

		comboClaseBoleto.addItem("");
		comboClaseBoleto.addItem("Economico");
		comboClaseBoleto.addItem("Ejecutivo");
		comboClaseBoleto.addItem("VIP");


		etiquetaNoAsiento = new JLabel("Numero Asiento:");
		etiquetaNoAsiento.setBounds(30,320,150,25);
		etiquetaNoAsiento.setFont(new Font("Andale Mono",1,13));
		etiquetaNoAsiento.setForeground(Color.WHITE);
		etiquetaNoAsiento.setBackground(Color.RED);
		etiquetaNoAsiento.setOpaque(true);
		add(etiquetaNoAsiento);

		comboNoAsiento = new JComboBox();
		comboNoAsiento.setBounds(30,350,150,25);
		comboNoAsiento.setFont(new Font("Andale Mono",1,14));
		comboNoAsiento.setForeground(Color.RED);
		comboNoAsiento.addActionListener(this);
		add(comboNoAsiento);

		comboNoAsiento.addItem("");
		comboNoAsiento.addItem("1");
		comboNoAsiento.addItem("2");
		comboNoAsiento.addItem("3");
		comboNoAsiento.addItem("4");
		comboNoAsiento.addItem("5");
		comboNoAsiento.addItem("6");
		comboNoAsiento.addItem("7");
		comboNoAsiento.addItem("8");
		comboNoAsiento.addItem("9");
		comboNoAsiento.addItem("10");
		comboNoAsiento.addItem("11");
		comboNoAsiento.addItem("12");

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

		etiquetaMarcaAutor = new JLabel("©2021 The TicketBus Company | Derechos Reservados by Gabriela & Hugo");
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
			etiquetaClaseBoleto.setBackground(Color.RED);
			etiquetaNoAsiento.setBackground(Color.RED);
			etiquetaMarcaAutor.setBackground(Color.RED);
			etiquetaLugarSalida.setBackground(Color.RED);
			etiquetaLugarLlegada.setBackground(Color.RED);
			etiquetaCalendar.setBackground(Color.RED);

		}
		if(ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
			etiquetaNombres.setBackground(new Color(102,0,153));
			etiquetaClaseBoleto.setBackground(new Color(102,0,153));
			etiquetaNoAsiento.setBackground(new Color(102,0,153));
			etiquetaMarcaAutor.setBackground(new Color(102,0,153));
			etiquetaLugarSalida.setBackground(new Color(102,0,153));
			etiquetaLugarLlegada.setBackground(new Color(102,0,153));
			etiquetaCalendar.setBackground(new Color(102,0,153));
		}
		if(ae.getSource() == menuItemNegro) {
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
			etiquetaNombres.setBackground(Color.BLACK);
			etiquetaClaseBoleto.setBackground(Color.BLACK);
			etiquetaNoAsiento.setBackground(Color.BLACK);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
			etiquetaLugarSalida.setBackground(Color.BLACK);
			etiquetaLugarLlegada.setBackground(Color.BLACK);
			etiquetaCalendar.setBackground(Color.BLACK);
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
			objPantallaAgregarEmpleado.pack();
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
		if(ae.getSource() == menuItemMostrarEmpleados) {
			this.dispose();
			PantallaMostrarEmpleados objPantallaMostrarEmpleados = new PantallaMostrarEmpleados();
			objPantallaMostrarEmpleados.pack();
			objPantallaMostrarEmpleados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			objPantallaMostrarEmpleados.setBounds(0,0,620,620);
			objPantallaMostrarEmpleados.setResizable(true);
			objPantallaMostrarEmpleados.setLocationRelativeTo(null);
			objPantallaMostrarEmpleados.setVisible(true);
		}
	}

	public static void main(String[] args) {

		PantallaPrincipal objPantallaPrincipal = new PantallaPrincipal();
		objPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objPantallaPrincipal.setBounds(0,0,620,620);
//		objPantallaPrincipal.setBounds(0,0,620,560);
		objPantallaPrincipal.setResizable(true);
		objPantallaPrincipal.setLocationRelativeTo(null);
		objPantallaPrincipal.setVisible(true);

	}
}

