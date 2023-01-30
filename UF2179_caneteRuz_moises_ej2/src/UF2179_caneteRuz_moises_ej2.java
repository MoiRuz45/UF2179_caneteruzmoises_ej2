import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class UF2179_caneteRuz_moises_ej2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtKilometros;
	private JTextField txtModelo;
	private JTextField txtPlazas;
	private JButton btnDatos;
	private ArrayList<Autobuses> listaAutobuses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UF2179_caneteRuz_moises_ej2 frame = new UF2179_caneteRuz_moises_ej2();
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
	public UF2179_caneteRuz_moises_ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][23.00,grow][36.00,grow][34.00,grow][64.00,grow]", "[][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Gestión Autocares");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Matrícula");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		txtMatricula = new JTextField();
		contentPane.add(txtMatricula, "cell 1 1 2 1,growx");
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		txtMarca = new JTextField();
		contentPane.add(txtMarca, "cell 1 2 2 1,growx");
		txtMarca.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo");
		contentPane.add(lblNewLabel_4, "cell 3 2,alignx center");
		
		txtModelo = new JTextField();
		contentPane.add(txtModelo, "cell 4 2,growx");
		txtModelo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Kilómetros");
		contentPane.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		txtKilometros = new JTextField();
		contentPane.add(txtKilometros, "cell 1 3 2 1,growx");
		txtKilometros.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Plazas");
		contentPane.add(lblNewLabel_5, "cell 3 3,alignx center");
		
		txtPlazas = new JTextField();
		contentPane.add(txtPlazas, "cell 4 3,alignx left");
		txtPlazas.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		contentPane.add(btnInsertar, "cell 1 5,alignx right");
		
		btnDatos = new JButton("Mostrar Datos");
		contentPane.add(btnDatos, "cell 2 5 2 1,growx");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 6 5 1,grow");
		
		protected void insertarAutobus() {
			String matricula=txtMatricula.getText();
			String marca=txtMarca.getText();
		}
	}

}
