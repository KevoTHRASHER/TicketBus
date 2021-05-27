import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import com.toedter.calendar.*;
public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuUsuarios, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemNuevo, menuItemSalir, menuItemCreaUsuario, menuItemEliminaUsuario, menuItemAutor;
	private ImageIcon imagenTicketBusNegra,imagenAutor;
	private JLabel etiquetaImagenTicketBus, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaApellidoPaterno, etiquetaApellidoMaterno, etiquetaLugarSalida, etiquetaLugarLlegada, etiquetaCalculo, etiquetaMarcaAutor;
	private JTextField campoTextoNombres, campoTextoApellidoPaterno, campoTextoApellidoMaterno;
	private JComboBox comboLugarSalida, comboLugarLlegada;
	private JTextArea areaTextoCalculo;
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

		menuItemCreaUsuario = new JMenuItem("Crear Usuario");
		menuItemCreaUsuario.setForeground(Color.RED);
		menuItemCreaUsuario.addActionListener(this);
		menuUsuarios.add(menuItemCreaUsuario);

		menuItemEliminaUsuario = new JMenuItem("Eliminar Usuario");
		menuItemEliminaUsuario.setForeground(Color.RED);
		menuItemEliminaUsuario.addActionListener(this);
		menuUsuarios.add(menuItemEliminaUsuario);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font("Andale Mono",1,14));
		menuAcerca.setForeground(Color.WHITE);
		barraMenu.add(menuAcerca);

		menuItemAutor = new JMenuItem("Autor");
		menuItemAutor.setForeground(Color.RED);
		menuItemAutor.addActionListener(this);
		menuAcerca.add(menuItemAutor);
		imagenAutor = new ImageIcon("images/autor.png");

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

		etiquetaCalculo = new JLabel("JCalendar :");
		etiquetaCalculo.setBounds(220,320,250,25);
		etiquetaCalculo.setFont(new Font("Andale Mono",1,13));
		etiquetaCalculo.setForeground(Color.WHITE);
		etiquetaCalculo.setBackground(Color.RED);
		etiquetaCalculo.setOpaque(true);
		add(etiquetaCalculo);

/*		areaTextoCalculo = new JTextArea();
		areaTextoCalculo.setText("\n Aquí aparece el resultado del cálculo \n de las vacaciones.");
		areaTextoCalculo.setBounds(220,350,290,100);
		areaTextoCalculo.setFont(new Font("Andale Mono",1,13));
		areaTextoCalculo.setForeground(Color.RED);
		add(areaTextoCalculo);
*/
		calendarioSalida = new JCalendar();
		calendarioSalida.setBounds(220,350,250,200);
		calendarioSalida.setWeekOfYearVisible(false);
		calendarioSalida.setMaxDayCharacters(1);
		calendarioSalida.setTodayButtonVisible(true);
		add(calendarioSalida);

		etiquetaMarcaAutor = new JLabel("©2021 The TicketBus Company | Todos los derechos reservados by ITSAL");
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
			etiquetaCalculo.setBackground(Color.RED);

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
			etiquetaCalculo.setBackground(new Color(102,0,153));
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
			etiquetaCalculo.setBackground(Color.BLACK);
		}
		if(ae.getSource() == menuItemNuevo) {
			campoTextoNombres.setText("");
			campoTextoApellidoPaterno.setText("");
			campoTextoApellidoMaterno.setText("");
			areaTextoCalculo.setText("");
			comboLugarSalida.setSelectedIndex(0);
			comboLugarLlegada.setSelectedIndex(0);
		}
		if(ae.getSource() == menuItemSalir) {
			if(JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if(ae.getSource() == menuItemAutor) {
		JOptionPane.showMessageDialog(null,"Desarrollado por Kevo.THRASHER\nhttps://github.com/KevoTHRASHER","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
		if(ae.getSource() == menuItemCreaUsuario) {
			JOptionPane.showMessageDialog(null,"Seleccionaste el item Crea Usuario en el Menu USUARIO");
		}
		if(ae.getSource() == menuItemEliminaUsuario) {
			JOptionPane.showMessageDialog(null,"Seleccionaste el item Elimina Usuario en el Menu USUARIO");
		}
	}

	public static void main(String[] args) {

		PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallaPrincipal.setBounds(0,0,620,620);
//		pantallaPrincipal.setBounds(0,0,620,560);
		pantallaPrincipal.setResizable(true);
		pantallaPrincipal.setLocationRelativeTo(null);
		pantallaPrincipal.setVisible(true);

	}
}
