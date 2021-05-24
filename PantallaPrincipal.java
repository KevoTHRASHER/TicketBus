import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemNuevo, menuItemSalir, menuItemVacaciones, menuItemAutor;
	private ImageIcon imagenCocaColaBlanco,imagenAutor;
	private JLabel etiquetaImagenCocaColaBlanco, etiquetaBienvenido, etiquetaDatosTrabajador, etiquetaNombres, etiquetaApellidoPaterno, etiquetaApellidoMaterno, etiquetaDepartamento, etiquetaAntiguedad, etiquetaCalculo, etiquetaMarcaAutor;
	private JTextField campoTextoNombres, campoTextoApellidoPaterno, campoTextoApellidoMaterno;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JTextArea areaTextoCalculo;
	//String nombreCapturadoJFrameBienvenido = "";

	public PantallaPrincipal() {

		setLayout(null);
		setTitle("COCA-COLA Vacaciones APP");
		getContentPane().setBackground(Color.RED);
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Login loginJFrame = new Login();
		// nombreCapturadoJFrameBienvenido = loginJFrame.nombreCapturado;

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

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setFont(new Font("Andale Mono",1,14));
		menuCalcular.setForeground(Color.WHITE);
		barraMenu.add(menuCalcular);

		menuItemVacaciones = new JMenuItem("Vacaciones");
		menuItemVacaciones.setForeground(Color.RED);
		menuItemVacaciones.addActionListener(this);
		menuCalcular.add(menuItemVacaciones);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font("Andale Mono",1,14));
		menuAcerca.setForeground(Color.WHITE);
		barraMenu.add(menuAcerca);

		menuItemAutor = new JMenuItem("Autor");
		menuItemAutor.setForeground(Color.RED);
		menuItemAutor.addActionListener(this);
		menuAcerca.add(menuItemAutor);
		imagenAutor = new ImageIcon("images/autor.png");

		imagenCocaColaBlanco = new ImageIcon("images/logo-coca.png");
		etiquetaImagenCocaColaBlanco = new JLabel(imagenCocaColaBlanco);
		etiquetaImagenCocaColaBlanco.setBounds(15,10,250,125);
		etiquetaImagenCocaColaBlanco.setBackground(Color.RED);
		add(etiquetaImagenCocaColaBlanco);

//		etiquetaBienvenido = new JLabel("Bienvenido! " + nombreCapturadoJFrameBienvenido);
//		etiquetaBienvenido.setFont(new Font("Andale Mono",1,22));
//		etiquetaBienvenido.setForeground(Color.WHITE);
//		etiquetaBienvenido.setBounds(300,23,280,100);
//		add(etiquetaBienvenido);

		etiquetaDatosTrabajador = new JLabel("Datos del trabajador para el cálculo de vacaciones");
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

		etiquetaDepartamento = new JLabel("Selecciona el Departamento");
		etiquetaDepartamento.setBounds(220,200,225,25);
		etiquetaDepartamento.setFont(new Font("Andale Mono",1,13));
		etiquetaDepartamento.setForeground(Color.WHITE);
		etiquetaDepartamento.setBackground(Color.RED);
		etiquetaDepartamento.setOpaque(true);
		add(etiquetaDepartamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,230,225,25);
		comboDepartamento.setFont(new Font("Andale Mono",1,14));
		comboDepartamento.setForeground(Color.RED);
		comboDepartamento.addActionListener(this);
		add(comboDepartamento);

		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion a Clientes");
		comboDepartamento.addItem("Departamento Logística");
		comboDepartamento.addItem("Departamento Gerencia");

		etiquetaAntiguedad = new JLabel("Selecciona la Antiguedad");
		etiquetaAntiguedad.setBounds(220,260,225,25);
		etiquetaAntiguedad.setFont(new Font("Andale Mono",1,13));
		etiquetaAntiguedad.setForeground(Color.WHITE);
		etiquetaAntiguedad.setBackground(Color.RED);
		etiquetaAntiguedad.setOpaque(true);
		add(etiquetaAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,290,225,25);
		comboAntiguedad.setFont(new Font("Andale Mono",1,14));
		comboAntiguedad.setForeground(Color.RED);
		comboAntiguedad.addActionListener(this);
		add(comboAntiguedad);

		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");

		etiquetaCalculo = new JLabel("Resultado del Cálculo :");
		etiquetaCalculo.setBounds(220,320,225,25);
		etiquetaCalculo.setFont(new Font("Andale Mono",1,13));
		etiquetaCalculo.setForeground(Color.WHITE);
		etiquetaCalculo.setBackground(Color.RED);
		etiquetaCalculo.setOpaque(true);
		add(etiquetaCalculo);

		areaTextoCalculo = new JTextArea();
		areaTextoCalculo.setText("\n Aquí aparece el resultado del cálculo \n de las vacaciones.");
		areaTextoCalculo.setBounds(220,350,290,100);
		areaTextoCalculo.setFont(new Font("Andale Mono",1,13));
		areaTextoCalculo.setForeground(Color.RED);
		add(areaTextoCalculo);

		etiquetaMarcaAutor = new JLabel("©2021 The COCA-COLA Company | Todos los derechos reservados by Kevo.THRASHER");
		etiquetaMarcaAutor.setBounds(25,480,550,25);
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
			etiquetaDepartamento.setBackground(Color.RED);
			etiquetaAntiguedad.setBackground(Color.RED);
			etiquetaCalculo.setBackground(Color.RED);

		}
		if(ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
			etiquetaNombres.setBackground(new Color(102,0,153));
			etiquetaApellidoPaterno.setBackground(new Color(102,0,153));
			etiquetaApellidoMaterno.setBackground(new Color(102,0,153));
			etiquetaMarcaAutor.setBackground(new Color(102,0,153));
			etiquetaDepartamento.setBackground(new Color(102,0,153));
			etiquetaAntiguedad.setBackground(new Color(102,0,153));
			etiquetaCalculo.setBackground(new Color(102,0,153));
		}
		if(ae.getSource() == menuItemNegro) {
			getContentPane().setBackground(Color.BLACK);
			barraMenu.setBackground(Color.BLACK);
			etiquetaNombres.setBackground(Color.BLACK);
			etiquetaApellidoPaterno.setBackground(Color.BLACK);
			etiquetaApellidoMaterno.setBackground(Color.BLACK);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
			etiquetaDepartamento.setBackground(Color.BLACK);
			etiquetaAntiguedad.setBackground(Color.BLACK);
			etiquetaCalculo.setBackground(Color.BLACK);
		}
		if(ae.getSource() == menuItemNuevo) {
			campoTextoNombres.setText("");
			campoTextoApellidoPaterno.setText("");
			campoTextoApellidoMaterno.setText("");
			areaTextoCalculo.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
		}
		if(ae.getSource() == menuItemSalir) {
			if(JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if(ae.getSource() == menuItemAutor) {
		JOptionPane.showMessageDialog(null,"Desarrollado por Kevo.THRASHER\nhttps://github.com/KevoTHRASHER","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
		if(ae.getSource() == menuItemVacaciones) {
			if(campoTextoNombres.getText().length() == 0) {
				JOptionPane.showMessageDialog(null,"Favor de INGRESAR sus NOMBRES","INGRESA NOMBRE",JOptionPane.WARNING_MESSAGE);
			}
			else if(campoTextoApellidoPaterno.getText().length() == 0) {
				JOptionPane.showMessageDialog(null,"Favor de INGRESAR tu APELLIDO PATERNO","INGRESA APELLIDO PATERNO",JOptionPane.WARNING_MESSAGE);

			}
			else if(campoTextoApellidoMaterno.getText().length() == 0) {
				JOptionPane.showMessageDialog(null,"Favor de INGRESAR tu APELLIDO MATERNO","INGRESA APELLIDO MATERNO",JOptionPane.WARNING_MESSAGE);

			}
			else if(comboDepartamento.getSelectedIndex() == 1) {
				if(comboAntiguedad.getSelectedIndex() == 1) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 6 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 2) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 14 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 3) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 20 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else {
					JOptionPane.showMessageDialog(null,"Favor de SELECCIONAR el numero de años laborados ANTIGUEDAD","ESCOGE ANTIGUEDAD",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(comboDepartamento.getSelectedIndex() == 2) {
				if(comboAntiguedad.getSelectedIndex() == 1) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 7 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 2) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 15 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 3) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 22 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else {
					JOptionPane.showMessageDialog(null,"Favor de SELECCIONAR el numero de años laborados ANTIGUEDAD","ESCOGE ANTIGUEDAD",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(comboDepartamento.getSelectedIndex() == 3) {
				if(comboAntiguedad.getSelectedIndex() == 1) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 10 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 2) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 20 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else if(comboAntiguedad.getSelectedIndex() == 3) {
					areaTextoCalculo.setText("Hola " + campoTextoNombres.getText() + " " + campoTextoApellidoPaterno.getText() + " " + campoTextoApellidoPaterno.getText() + "\ndisfruta tus 30 días de vacaciones\nCOCA-COLA te agradece mucho tu trabajo");
				}
				else {
					JOptionPane.showMessageDialog(null,"Favor de SELECCIONAR el numero de años laborados ANTIGUEDAD","ESCOGE ANTIGUEDAD",JOptionPane.WARNING_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"Favor de SELECCIONAR el DEPARTAMENTO en el que LABORAS","ESCOGE DEPARTAMENTO",JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static void main(String[] args) {

		PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallaPrincipal.setBounds(0,0,580,560);
		pantallaPrincipal.setResizable(true);
		pantallaPrincipal.setLocationRelativeTo(null);
		pantallaPrincipal.setVisible(true);

	}
}
