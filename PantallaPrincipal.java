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


public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuEmpleado, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemSalir, menuItemAgregarEmpleado, menuItemEliminarEmpleado, menuItemMostrarEmpleados, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaClaseBoleto, etiquetaNoAsiento, etiquetaPrecio, etiquetaLugarSalida, etiquetaLugarLlegada, etiquetaCalendar, etiquetaHoraBoleto, etiquetaMarcaAutor;
	private JTextField campoTextoNombres, campoTextoPrecio;
	private JComboBox comboClaseBoleto, comboNoAsiento, comboLugarOrigen, comboLugarDestino, comboHoraBoleto;
	private JDateChooser fechaViajeBoleto;
	private JButton botonComprar;

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

//		etiquetaDatosTrabajador = new JLabel("");
//		etiquetaDatosTrabajador.setFont(new Font(null,1,17));
//		etiquetaDatosTrabajador.setForeground(Color.WHITE);
//		etiquetaDatosTrabajador.setBackground(Color.RED);
//		etiquetaDatosTrabajador.setBounds(50,130,480,50);
//		add(etiquetaDatosTrabajador);

		etiquetaNombres = new JLabel("Nombre :");
		etiquetaNombres.setBounds(30,200,150,25);
		etiquetaNombres.setFont(new Font(null,1,13));
		etiquetaNombres.setForeground(Color.WHITE);
		etiquetaNombres.setBackground(Color.RED);
		etiquetaNombres.setOpaque(true);
		add(etiquetaNombres);

		campoTextoNombres = new JTextField();
		campoTextoNombres.setBounds(30,230,150,25);
		campoTextoNombres.setFont(new Font(null,1,14));
		campoTextoNombres.setForeground(Color.RED);
		add(campoTextoNombres);

		etiquetaClaseBoleto = new JLabel("Clase de Boleto");
		etiquetaClaseBoleto.setBounds(30,260,150,25);
		etiquetaClaseBoleto.setFont(new Font(null,1,13));
		etiquetaClaseBoleto.setForeground(Color.WHITE);
		etiquetaClaseBoleto.setBackground(Color.RED);
		etiquetaClaseBoleto.setOpaque(true);
		add(etiquetaClaseBoleto);

		comboClaseBoleto = new JComboBox();
		comboClaseBoleto.setBounds(30,290,150,25);
		comboClaseBoleto.setFont(new Font(null,1,14));
		comboClaseBoleto.setForeground(Color.RED);
		comboClaseBoleto.addActionListener(this);
		add(comboClaseBoleto);

//		comboClaseBoleto.addItem("");
		comboClaseBoleto.addItem("Economico");
		comboClaseBoleto.addItem("Ejecutivo");
		comboClaseBoleto.addItem("VIP");
		comboClaseBoleto.setSelectedIndex(-1);

		etiquetaNoAsiento = new JLabel("Numero Asiento:");
		etiquetaNoAsiento.setBounds(30,320,150,25);
		etiquetaNoAsiento.setFont(new Font(null,1,13));
		etiquetaNoAsiento.setForeground(Color.WHITE);
		etiquetaNoAsiento.setBackground(Color.RED);
		etiquetaNoAsiento.setOpaque(true);
		add(etiquetaNoAsiento);

		comboNoAsiento = new JComboBox();
		comboNoAsiento.setBounds(30,350,150,25);
		comboNoAsiento.setFont(new Font(null,1,14));
		comboNoAsiento.setForeground(Color.RED);
		comboNoAsiento.addActionListener(this);
		add(comboNoAsiento);

//		comboNoAsiento.addItem("");
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
		comboNoAsiento.setSelectedIndex(-1);

		etiquetaPrecio = new JLabel("Precio :");
		etiquetaPrecio.setBounds(30,380,150,25);
		etiquetaPrecio.setFont(new Font(null,1,13));
		etiquetaPrecio.setForeground(Color.WHITE);
		etiquetaPrecio.setBackground(Color.RED);
		etiquetaPrecio.setOpaque(true);
		add(etiquetaPrecio);

		campoTextoPrecio = new JTextField();
		campoTextoPrecio.setBounds(30,410,150,25);
		campoTextoPrecio.setFont(new Font(null,1,14));
		campoTextoPrecio.setForeground(Color.RED);
		add(campoTextoPrecio);

		etiquetaLugarSalida = new JLabel("Lugar Origen");
		etiquetaLugarSalida.setBounds(220,200,175,25);
		etiquetaLugarSalida.setFont(new Font(null,1,13));
		etiquetaLugarSalida.setForeground(Color.WHITE);
		etiquetaLugarSalida.setBackground(Color.RED);
		etiquetaLugarSalida.setOpaque(true);
		add(etiquetaLugarSalida);

		comboLugarOrigen = new JComboBox();
		comboLugarOrigen.setBounds(220,230,175,25);
		comboLugarOrigen.setFont(new Font(null,1,14));
		comboLugarOrigen.setForeground(Color.RED);
		comboLugarOrigen.addActionListener(this);
		add(comboLugarOrigen);

//		comboLugarOrigen.addItem("");
		comboLugarOrigen.addItem("Salina Cruz");
		comboLugarOrigen.addItem("Tehuantepec");
		comboLugarOrigen.addItem("Juchitan");
		comboLugarOrigen.addItem("Huatulco");
		comboLugarOrigen.addItem("Matías Romero");
		comboLugarOrigen.addItem("Oaxaca de Juárez");
		comboLugarOrigen.setSelectedIndex(-1);

		etiquetaLugarLlegada = new JLabel("Lugar Destino");
		etiquetaLugarLlegada.setBounds(220,260,175,25);
		etiquetaLugarLlegada.setFont(new Font(null,1,13));
		etiquetaLugarLlegada.setForeground(Color.WHITE);
		etiquetaLugarLlegada.setBackground(Color.RED);
		etiquetaLugarLlegada.setOpaque(true);
		add(etiquetaLugarLlegada);

		comboLugarDestino = new JComboBox();
		comboLugarDestino.setBounds(220,290,175,25);
		comboLugarDestino.setFont(new Font(null,1,14));
		comboLugarDestino.setForeground(Color.RED);
		comboLugarDestino.addActionListener(this);
		add(comboLugarDestino);

//		comboLugarDestino.addItem("");
		comboLugarDestino.addItem("Salina Cruz");
		comboLugarDestino.addItem("Tehuantepec");
		comboLugarDestino.addItem("Juchitan");
		comboLugarDestino.addItem("Huatulco");
		comboLugarDestino.addItem("Matías Romero");
		comboLugarDestino.addItem("Oaxaca de Juárez");
		comboLugarDestino.setSelectedIndex(-1);

		etiquetaCalendar = new JLabel("Fecha Salida:");
		etiquetaCalendar.setBounds(220,320,175,25);
		etiquetaCalendar.setFont(new Font(null,Font.BOLD,12));
		etiquetaCalendar.setForeground(Color.WHITE);
		etiquetaCalendar.setBackground(Color.RED);
		etiquetaCalendar.setOpaque(true);
		add(etiquetaCalendar);

		Date objFechaViajeBoleto = new Date();

		fechaViajeBoleto = new JDateChooser("yyyy/MM/dd", "####/##/##", '_');
		fechaViajeBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		fechaViajeBoleto.setBounds(220,350,175,25);
		//	fechaViajeBoleto.setDateFormatString("dd/MM/yyyy");
		//	fechaViajeBoleto.setDate(objFechaViajeBoleto)
		fechaViajeBoleto.getJCalendar().setTodayButtonVisible(true);
		fechaViajeBoleto.getJCalendar().setTodayButtonText("Hoy");
		fechaViajeBoleto.getJCalendar().setWeekOfYearVisible(false);
		fechaViajeBoleto.getJCalendar().setMaxDayCharacters(1);
		fechaViajeBoleto.getJCalendar().setSundayForeground(Color.RED);
		fechaViajeBoleto.getJCalendar().setWeekdayForeground(Color.BLUE);
		//fechaViajeBoleto.getJCalendar().setForeground(Color.RED);
		fechaViajeBoleto.setMinSelectableDate(objFechaViajeBoleto);
		add(fechaViajeBoleto);


		etiquetaHoraBoleto = new JLabel("Hora Salida");
		etiquetaHoraBoleto.setBounds(220,380,175,25);
		etiquetaHoraBoleto.setFont(new Font(null,1,13));
		etiquetaHoraBoleto.setForeground(Color.WHITE);
		etiquetaHoraBoleto.setBackground(Color.RED);
		etiquetaHoraBoleto.setOpaque(true);
		add(etiquetaHoraBoleto);

		comboHoraBoleto = new JComboBox();
		comboHoraBoleto.setBounds(220,410,175,25);
		comboHoraBoleto.setFont(new Font(null,1,14));
		comboHoraBoleto.setForeground(Color.RED);
		comboHoraBoleto.addActionListener(this);
		add(comboHoraBoleto);

//		comboHoraBoleto.addItem("");
		comboHoraBoleto.addItem("20:00:00");
		comboHoraBoleto.addItem("20:30:00");
		comboHoraBoleto.addItem("21:00:00");
		comboHoraBoleto.addItem("21:30:00");
		comboHoraBoleto.addItem("22:00:00");
		comboHoraBoleto.setSelectedIndex(-1);

		botonComprar = new JButton("Comprar");
		botonComprar.setForeground(Color.RED);
		botonComprar.setBackground(Color.WHITE);
		botonComprar.setBounds(170,470,100,25);
		botonComprar.addActionListener(this);
		add(botonComprar);

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
			etiquetaNombres.setBackground(Color.RED);
			etiquetaClaseBoleto.setBackground(Color.RED);
			etiquetaNoAsiento.setBackground(Color.RED);
			etiquetaMarcaAutor.setBackground(Color.RED);
			etiquetaLugarSalida.setBackground(Color.RED);
			etiquetaLugarLlegada.setBackground(Color.RED);
			etiquetaCalendar.setBackground(Color.RED);
			etiquetaHoraBoleto.setBackground(Color.RED);
			etiquetaPrecio.setBackground(Color.RED);
		}
		if (ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
			etiquetaNombres.setBackground(new Color(102,0,153));
			etiquetaClaseBoleto.setBackground(new Color(102,0,153));
			etiquetaNoAsiento.setBackground(new Color(102,0,153));
			etiquetaMarcaAutor.setBackground(new Color(102,0,153));
			etiquetaLugarSalida.setBackground(new Color(102,0,153));
			etiquetaLugarLlegada.setBackground(new Color(102,0,153));
			etiquetaCalendar.setBackground(new Color(102,0,153));
			etiquetaHoraBoleto.setBackground(new Color(102,0,153));
			etiquetaPrecio.setBackground(new Color(102,0,153));
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
			etiquetaNombres.setBackground(Color.BLACK);
			etiquetaClaseBoleto.setBackground(Color.BLACK);
			etiquetaNoAsiento.setBackground(Color.BLACK);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
			etiquetaLugarSalida.setBackground(Color.BLACK);
			etiquetaLugarLlegada.setBackground(Color.BLACK);
			etiquetaCalendar.setBackground(Color.BLACK);
			etiquetaHoraBoleto.setBackground(Color.BLACK);
			etiquetaPrecio.setBackground(Color.BLACK);
		}
		if (ae.getSource() == menuItemSalir) {
			if (JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if (ae.getSource() == menuItemAutor) {
			JOptionPane.showMessageDialog(null,"Desarrollado por \nGabriela Ita-ii","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
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
		if (ae.getSource() == botonComprar) {
			String nombre = campoTextoNombres.getText();
			String lugarOrigen = comboLugarOrigen.getSelectedItem().toString();
			String lugarDestino = comboLugarDestino.getSelectedItem().toString();
			int numeroAsiento = Integer.parseInt((String)comboNoAsiento.getSelectedItem());
			String horaBoleto = comboHoraBoleto.getSelectedItem().toString();
			DateFormat df = new SimpleDateFormat("yyyyMMdd");
			String fechaFormateadaViajeBoleto = df.format(fechaViajeBoleto.getDate());
			String claseBoleto = comboClaseBoleto.getSelectedItem().toString();
			int precioCampoTexto = Integer.parseInt(campoTextoPrecio.getText());
			//DateFormat formatoFechaViajeBoleto = new SimpleDateFormat("yyyy/MM/dd");
			//String fechaViajeBoletoFormateada = new formatoFechaViajeBoleto(fechaViajeBoleto.getDate());
			System.out.println(fechaFormateadaViajeBoleto);
			//System.out.println(df.format(fechaViajeBoleto.getDate()));
			//Date fechaObtenidaViajeBoleto = fechaViajeBoleto.getDate();
//			String cadenaFechaViajeBoleto = DateFormat.getDateInstance().format(fechaObtenidaViajeBoleto);
			//System.out.println(fechaObtenidaViajeBoleto);

			if (nombre.isEmpty() == true) {
				JOptionPane.showMessageDialog(null,"Introduce tu nombre","ERROR Campo Nombre VACIO",JOptionPane.ERROR_MESSAGE);
			}
			else if (comboClaseBoleto.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null,"Selecciona una Opcion de Clase Boleto","ERROR Combo Clase Boleto Vacio", JOptionPane.ERROR_MESSAGE);
			}
			else if (comboNoAsiento.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null,"Selecciona una Opcion Numero de Asiento","ERROR Combo Numero Asiento Vacio", JOptionPane.ERROR_MESSAGE);
			}
			else if (campoTextoPrecio.getText().isEmpty() == true ) {
				JOptionPane.showMessageDialog(null,"Introduce un precio","ERROR Precio Vacio", JOptionPane.ERROR_MESSAGE);
			}
			else if (comboLugarOrigen.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null,"Selecciona un Lugar de Origen","ERROR Combo Lugar Origen", JOptionPane.ERROR_MESSAGE);
			}
			else if (comboLugarDestino.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null,"Selecciona un Lugar de Destino","ERROR Combo Lugar Destino", JOptionPane.ERROR_MESSAGE);
			}
			else if (comboHoraBoleto.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null,"Selecciona una Hora de Salida","ERROR Combo Hora Salida", JOptionPane.ERROR_MESSAGE);
			}
			else if (fechaViajeBoleto.getDate() == null) {
				JOptionPane.showMessageDialog(null,"Selecciona un Lugar de Origen","ERROR Combo Lugar Origen", JOptionPane.ERROR_MESSAGE);
			}
			else { 
				try {

					Class.forName("org.mariadb.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginTicket", "root", "123");
					Statement stm = con.createStatement();
					String sql = "INSERT INTO Boleto (NombreBoleto, OrigenBoleto, DestinoBoleto, AsientoBoleto, HoraBoleto, FechaBoleto, ClaseBoleto, ValorBoleto) VALUES ('"+nombre+"','"+lugarOrigen+"','"+lugarDestino+"','"+numeroAsiento+"','"+horaBoleto+"','"+fechaFormateadaViajeBoleto+"','"+claseBoleto+"','"+precioCampoTexto+"')";

					stm.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Inserccion Creada con EXITO");

					campoTextoNombres.setText("");
					comboLugarOrigen.setSelectedIndex(-1);
					comboLugarDestino.setSelectedIndex(-1);
					comboNoAsiento.setSelectedIndex(-1);
					comboHoraBoleto.setSelectedIndex(-1);
					fechaViajeBoleto.setCalendar(null);
					comboClaseBoleto.setSelectedIndex(-1);
					campoTextoPrecio.setText("");


					System.out.println(nombre+" " +lugarOrigen+" "+lugarDestino+" "+numeroAsiento+" "+horaBoleto+" "+precioCampoTexto);

				} catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}

	public static void main(String[] args) {

		PantallaPrincipal objPantallaPrincipal = new PantallaPrincipal();
		objPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objPantallaPrincipal.setBounds(0,0,520,580);
		objPantallaPrincipal.setResizable(true);
		objPantallaPrincipal.setLocationRelativeTo(null);
		objPantallaPrincipal.setVisible(true);
	}
}

