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
					window.frmTed.setBounds(450, 150, 320, 360);
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
		frmTed.setResizable(false);
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
		
		JLabel lblTitulo = new JLabel("Calcular \u00E1rea de uma Moldura");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 6;
		gbc_lblTitulo.gridy = 0;
		frmTed.getContentPane().add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblInsiraABase = new JLabel("Insira a Base externa");
		GridBagConstraints gbc_lblInsiraABase = new GridBagConstraints();
		gbc_lblInsiraABase.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsiraABase.gridx = 6;
		gbc_lblInsiraABase.gridy = 2;
		frmTed.getContentPane().add(lblInsiraABase, gbc_lblInsiraABase);
		
		txtBase = new JTextField();
		txtBase.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtBase = new GridBagConstraints();
		gbc_txtBase.insets = new Insets(0, 0, 5, 5);
		gbc_txtBase.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBase.gridx = 6;
		gbc_txtBase.gridy = 3;
		frmTed.getContentPane().add(txtBase, gbc_txtBase);
		txtBase.setColumns(10);
		
		JLabel lblInsiraAAltura = new JLabel("Insira a Altura externa");
		GridBagConstraints gbc_lblInsiraAAltura = new GridBagConstraints();
		gbc_lblInsiraAAltura.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsiraAAltura.gridx = 6;
		gbc_lblInsiraAAltura.gridy = 4;
		frmTed.getContentPane().add(lblInsiraAAltura, gbc_lblInsiraAAltura);
		
		txtAltura = new JTextField();
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtAltura = new GridBagConstraints();
		gbc_txtAltura.insets = new Insets(0, 0, 5, 5);
		gbc_txtAltura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAltura.gridx = 6;
		gbc_txtAltura.gridy = 5;
		frmTed.getContentPane().add(txtAltura, gbc_txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblSpacing = new JLabel("Insira o espa\u00E7o entre ret\u00E2ngulos");
		GridBagConstraints gbc_lblSpacing = new GridBagConstraints();
		gbc_lblSpacing.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpacing.gridx = 6;
		gbc_lblSpacing.gridy = 6;
		frmTed.getContentPane().add(lblSpacing, gbc_lblSpacing);
		
		JLabel lblRes = new JLabel("Resultado: ");
		GridBagConstraints gbc_lblRes = new GridBagConstraints();
		gbc_lblRes.anchor = GridBagConstraints.SOUTH;
		gbc_lblRes.insets = new Insets(0, 0, 0, 5);
		gbc_lblRes.gridx = 6;
		gbc_lblRes.gridy = 10;
		frmTed.getContentPane().add(lblRes, gbc_lblRes);
		
		txtSpacing = new JTextField();
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
					float base = Float.parseFloat(textBase);
					float altura = Float.parseFloat(textAltura);
					float spacing = Float.parseFloat(textSpacing);
					
					String res = String.format("%.0f", calc.calculaMoldura(base, altura, spacing));
					
					lblRes.setText("Resultado: " + res);
					
				}
				
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
