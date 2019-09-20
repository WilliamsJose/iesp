package view;

import javax.swing.JOptionPane;

import model.Calc;

public class Moldura {

	public static void main(String[] args) {
		float base, altura, spacing;
		String baseS, alturaS, spacingS;
		
		Calc calc = new Calc();
		
		baseS = JOptionPane.showInputDialog("Digite a base da moldura: ");
		alturaS = JOptionPane.showInputDialog("Digite a altura da moldura: ");
		spacingS = JOptionPane.showInputDialog("Digite o espa�amento entre o ret�ngulo interno e externo da moldura: ");
		
		base = Float.parseFloat(baseS);
		altura = Float.parseFloat(alturaS);
		spacing = Float.parseFloat(spacingS);

		JOptionPane.showMessageDialog(null, "A �rea da moldura �: " + calc.calculaMoldura(base, altura, spacing));
		
	}

}
