package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import model.Calc;
import java.awt.Color;
import java.awt.Font;

public class Principal {

	private JFrame frmTed;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtSpacing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTed.setBounds(450, 150, 560, 370);
					window.frmTed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calc calc = new Calc();
		frmTed = new JFrame();
		frmTed.getContentPane().setBackground(new Color(0, 255, 255));
		frmTed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTed.setType(Type.UTILITY);
		frmTed.setTitle("TED\r\n");
		frmTed.getContentPane().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 245, -13, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{36, 18, 0, 32, 0, 30, 0, 37, 0, 22, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmTed.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblTitulo = new JLabel("Calcular \u00E1rea da Moldura");
		lblTitulo.setFont(new Font("Monospaced", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 6;
		gbc_lblTitulo.gridy = 0;
		frmTed.getContentPane().add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblInsiraABase = new JLabel("Insira a Base externa");
		lblInsiraABase.setFont(new Font("Monospaced", Font.PLAIN, 13));
		GridBagConstraints gbc_lblInsiraABase = new GridBagConstraints();
		gbc_lblInsiraABase.gridwidth = 13;
		gbc_lblInsiraABase.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsiraABase.gridx = 0;
		gbc_lblInsiraABase.gridy = 2;
		frmTed.getContentPane().add(lblInsiraABase, gbc_lblInsiraABase);
		
		txtBase = new JTextField();
		lblInsiraABase.setLabelFor(txtBase);
		txtBase.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtBase = new GridBagConstraints();
		gbc_txtBase.insets = new Insets(0, 0, 5, 5);
		gbc_txtBase.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBase.gridx = 6;
		gbc_txtBase.gridy = 3;
		frmTed.getContentPane().add(txtBase, gbc_txtBase);
		txtBase.setColumns(10);
		
		JLabel lblInsiraAAltura = new JLabel("Insira a Altura externa");
		lblInsiraAAltura.setFont(new Font("Monospaced", Font.PLAIN, 13));
		GridBagConstraints gbc_lblInsiraAAltura = new GridBagConstraints();
		gbc_lblInsiraAAltura.gridwidth = 13;
		gbc_lblInsiraAAltura.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsiraAAltura.gridx = 0;
		gbc_lblInsiraAAltura.gridy = 4;
		frmTed.getContentPane().add(lblInsiraAAltura, gbc_lblInsiraAAltura);
		
		txtAltura = new JTextField();
		lblInsiraAAltura.setLabelFor(txtAltura);
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtAltura = new GridBagConstraints();
		gbc_txtAltura.insets = new Insets(0, 0, 5, 5);
		gbc_txtAltura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAltura.gridx = 6;
		gbc_txtAltura.gridy = 5;
		frmTed.getContentPane().add(txtAltura, gbc_txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblSpacing = new JLabel("Insira o espa\u00E7o entre ret\u00E2ngulos");
		lblSpacing.setFont(new Font("Monospaced", Font.PLAIN, 13));
		GridBagConstraints gbc_lblSpacing = new GridBagConstraints();
		gbc_lblSpacing.gridwidth = 13;
		gbc_lblSpacing.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpacing.gridx = 0;
		gbc_lblSpacing.gridy = 6;
		frmTed.getContentPane().add(lblSpacing, gbc_lblSpacing);
		
		JLabel lblRes = new JLabel("Resultado: ");
		lblRes.setForeground(new Color(0, 0, 51));
		lblRes.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRes = new GridBagConstraints();
		gbc_lblRes.gridwidth = 13;
		gbc_lblRes.anchor = GridBagConstraints.SOUTH;
		gbc_lblRes.insets = new Insets(0, 0, 0, 5);
		gbc_lblRes.gridx = 0;
		gbc_lblRes.gridy = 10;
		frmTed.getContentPane().add(lblRes, gbc_lblRes);
		
		txtSpacing = new JTextField();
		lblSpacing.setLabelFor(txtSpacing);
		txtSpacing.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtSpacing = new GridBagConstraints();
		gbc_txtSpacing.insets = new Insets(0, 0, 5, 5);
		gbc_txtSpacing.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSpacing.gridx = 6;
		gbc_txtSpacing.gridy = 7;
		frmTed.getContentPane().add(txtSpacing, gbc_txtSpacing);
		txtSpacing.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setToolTipText("Clique para calcular os valores");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textBase = txtBase.getText();
				String textAltura = txtAltura.getText();
				String textSpacing = txtSpacing.getText();
				
				if(textBase.isEmpty() || textAltura.isEmpty() || textSpacing.isEmpty()) {
					lblRes.setText("Você deve digitar todos os valores! ");
				} else {
					calcula(textBase, textAltura, textSpacing);
				}
				
			}
			
			private void calcula(String base, String altura, String spacing) {
				
				String res = calc.calculaMoldura(base, altura, spacing);
				
				lblRes.setText("Resultado: " + res);
			}
			
		});
		
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcular.gridx = 6;
		gbc_btnCalcular.gridy = 8;
		frmTed.getContentPane().add(btnCalcular, gbc_btnCalcular);
		
		frmTed.getRootPane().setDefaultButton(btnCalcular);
		
	}
}
