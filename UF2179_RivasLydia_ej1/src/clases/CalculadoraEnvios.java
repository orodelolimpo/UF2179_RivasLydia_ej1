package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculadoraEnvios extends JFrame {

	private JPanel contentPane;
	private JTextField textResOrigen;
	private JTextField textResDestino;
	private final ButtonGroup GrupoOrigen = new ButtonGroup();
	private final ButtonGroup GrupoDestino = new ButtonGroup();
	private JButton btnCalcular;
	private JComboBox comboTipoEnvio;
	private JSpinner spinner;
	private JRadioButton rdbtnExtranjero2;
	private JRadioButton rdbtnNacional2;
	private JRadioButton rdbNacional;
	private JRadioButton rdbExtranjero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEnvios frame = new CalculadoraEnvios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraEnvios() {
		setTitle("Calculadora envíos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][12.00][][grow][6.00][grow][grow]", "[][][][][][][][][]"));
		
		JLabel lblTituloCalculadora = new JLabel("Calculadora de Envíos");
		lblTituloCalculadora.setOpaque(true);
		lblTituloCalculadora.setBackground(new Color(255, 0, 102));
		lblTituloCalculadora.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblTituloCalculadora, "cell 0 0 7 1,alignx center");
		
		JLabel lblTituloCiudadOrig = new JLabel("Ciudad Origen:");
		contentPane.add(lblTituloCiudadOrig, "cell 2 2,alignx trailing");
		
		textResOrigen = new JTextField();
		contentPane.add(textResOrigen, "cell 3 2 4 1,growx");
		textResOrigen.setColumns(10);
		
		rdbNacional = new JRadioButton("Nacional");
		rdbNacional.setSelected(true);
		GrupoOrigen.add(rdbNacional);
		contentPane.add(rdbNacional, "cell 3 3 3 1");
		
		rdbExtranjero = new JRadioButton("Extranjero");
		GrupoOrigen.add(rdbExtranjero);
		contentPane.add(rdbExtranjero, "cell 6 3");
		
		JLabel lblTituloCiudadDestino = new JLabel("Ciudad Destino:");
		contentPane.add(lblTituloCiudadDestino, "cell 1 4 2 1,alignx trailing");
		
		textResDestino = new JTextField();
		contentPane.add(textResDestino, "cell 3 4 4 1,growx");
		textResDestino.setColumns(10);
		
		rdbtnNacional2 = new JRadioButton("Nacional");
		rdbtnNacional2.setSelected(true);
		GrupoDestino.add(rdbtnNacional2);
		contentPane.add(rdbtnNacional2, "cell 3 5 3 1");
		
		rdbtnExtranjero2 = new JRadioButton("Extranjero");
		GrupoDestino.add(rdbtnExtranjero2);
		contentPane.add(rdbtnExtranjero2, "cell 6 5");
		
		JLabel lblTituloTipodeEnvio = new JLabel("Tipo de envío:");
		contentPane.add(lblTituloTipodeEnvio, "cell 2 6,alignx left");
		
		comboTipoEnvio = new JComboBox();
		comboTipoEnvio.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10h", "Paq 14 - 		Antes de las 14h", "Paq 24 - Al día siguiente"}));
		contentPane.add(comboTipoEnvio, "cell 3 6 4 1,growx");
		
		JLabel lblTituloPeso = new JLabel("Peso:");
		contentPane.add(lblTituloPeso, "cell 2 7,alignx left");
		
		spinner = new JSpinner();
		spinner.setToolTipText("");
		spinner.setModel(new SpinnerNumberModel(1.0, 0.0, 40.0, 1.0));
		contentPane.add(spinner, "flowx,cell 3 7 3 1");
		
		JLabel lblTitulokg = new JLabel("Kg");
		contentPane.add(lblTitulokg, "cell 5 7");
		
		btnCalcular = new JButton("Calcular Precio");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularPrecio();
				
			}
		});
		contentPane.add(btnCalcular, "cell 5 8");
	}
////JOptionPane.showMessageDialog(ventana, 
//	"Error. Debe rellenar los dos campos", "Error", 
//	JOptionPane.ERROR_MESSAGE);

	protected void calcularPrecio() {
		String Origen= textResOrigen.getText();
		String Destino=textResDestino.getText();
		double importe=0;
		String mensaje =""; //JOptionPane.showMessageDialog(Cálculo, Destino);
		if (Origen== ""||Destino=="") {
			JOptionPane.showMessageDialog(this, 
			"Error. Debe rellenar los dos campos", "Error", 
			JOptionPane.ERROR_MESSAGE);
		}
			
		if (rdbNacional ==rdbtnNacional2 ) {
			importe= 4;
		}else {
			importe=7;
			
		}
		if (comboTipoEnvio) {//posición2
			importe=importe+2;
		}
			
		if (spinner)//es mayor a la posición 5
			
			return mensaje;
		
	
		
	}
}
