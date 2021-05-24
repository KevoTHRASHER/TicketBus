import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

	private JLabel etiquetaTerminosCondiciones, etiquetaImagenCocaColaRojo, etiquetaMarcaAutor;
	private JTextArea areaTerminosCondiciones;
	private JScrollPane scrollPaneAreaTerminosCondiciones;
	private JCheckBox cajaBoxAcepto;
	private ImageIcon imagenCocaColaRojo;
	private JButton botonNoAcepto, botonContinuar;
	String nombreCapturadoJFrameBienvenido = "";

	public Licencia() {

		setLayout(null);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		Bienvenido bienvenidoJFrame = new Bienvenido();
		nombreCapturadoJFrameBienvenido = bienvenidoJFrame.nombreCapturado;

		etiquetaTerminosCondiciones = new JLabel("TÉRMINOS Y CONDICIONES");
		etiquetaTerminosCondiciones.setBounds(150,10,250,25);
		etiquetaTerminosCondiciones.setFont(new Font("FreeSans",1,16));
		add(etiquetaTerminosCondiciones);

		areaTerminosCondiciones = new JTextArea();
		areaTerminosCondiciones.setFont(new Font("Hack",0,10));
		areaTerminosCondiciones.setText("\n  TÉRMINOS Y CONDICIONES" + 
				"\n\n    A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN." + 
				"\n    B. PROHIBIDA LA ALTERACIÓN DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." + 
				"\n    C. Kevo.THRASHER NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." + 
				"\n\n    LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE " + 
				"\n    (Kevo.THRASHER AUTOR), NO SE RESPOSABILIZA DEL USO QUE USTED HAGA CON ESTE " + 
				"\n    SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTAR)" + 
				"\n    SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE" +
				"\n    SOFTWARE." + 
				"\n\n    PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
				"\n    https://github.com/KevoTHRASHER/Coca-Cola-App");
		areaTerminosCondiciones.setEditable(false);
		scrollPaneAreaTerminosCondiciones = new JScrollPane(areaTerminosCondiciones);
		scrollPaneAreaTerminosCondiciones.setBounds(10,40,460,240);
		scrollPaneAreaTerminosCondiciones.setFocusable(true);
		add(scrollPaneAreaTerminosCondiciones);

		cajaBoxAcepto = new JCheckBox("Yo " + nombreCapturadoJFrameBienvenido + " Acepto");
		cajaBoxAcepto.setBounds(15,300,100,20);
		cajaBoxAcepto.setFont(new Font("FreeSans",1,13));
		cajaBoxAcepto.addChangeListener(this);
		add(cajaBoxAcepto);

		botonContinuar = new JButton("Continuar");
		botonContinuar.setBounds(15,350,100,25);
		botonContinuar.setFont(new Font("FreeSans",1,13));
		botonContinuar.setEnabled(false);
		botonContinuar.addActionListener(this);
		add(botonContinuar);

		botonNoAcepto = new JButton("No Acepto");
		botonNoAcepto.setBounds(125,350,100,25);
		botonNoAcepto.setFont(new Font("FreeSans",1,13));
		botonNoAcepto.setEnabled(true);
		botonNoAcepto.addActionListener(this);
		add(botonNoAcepto);

		imagenCocaColaRojo = new ImageIcon("images/coca-cola-rojo.png");
		etiquetaImagenCocaColaRojo = new JLabel();
		etiquetaImagenCocaColaRojo.setBounds(210,290,300,100);
		etiquetaImagenCocaColaRojo.setIcon(imagenCocaColaRojo);
		etiquetaImagenCocaColaRojo.setOpaque(true);
		add(etiquetaImagenCocaColaRojo);

		etiquetaMarcaAutor = new JLabel("©2021 The Coca-Cola Company by Kevo.THRASHER");
		etiquetaMarcaAutor.setBounds(170,410,450,20);
		etiquetaMarcaAutor.setFont(new Font("Hack",1,12));
		add(etiquetaMarcaAutor);

	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == botonNoAcepto) {
			if(JOptionPane.showConfirmDialog(null,"NO ACEPTA LOS TERMINOS Y CONDICIONES el Programa se CERRARA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}
		if(ae.getSource() == botonContinuar) {
			this.setVisible(false);
			PantallaPrincipal pantallaPrincipalJFrame = new PantallaPrincipal();
			pantallaPrincipalJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pantallaPrincipalJFrame.setBounds(0,0,580,560);
			pantallaPrincipalJFrame.setResizable(true);
			pantallaPrincipalJFrame.setLocationRelativeTo(null);
			pantallaPrincipalJFrame.setVisible(true);
		}
	}

	public void stateChanged(ChangeEvent ce) {
		if(cajaBoxAcepto.isSelected() == true) {
			botonNoAcepto.setEnabled(false);
			botonContinuar.setEnabled(true);
		} else {
			botonNoAcepto.setEnabled(true);
			botonContinuar.setEnabled(false);
		}
	}

	public static void main(String[] args) {

		Licencia licencia = new Licencia();
		licencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		licencia.setBounds(0,0,500,470);
		licencia.setResizable(true);
		licencia.setLocationRelativeTo(null);
		licencia.setVisible(true);

	}
}
