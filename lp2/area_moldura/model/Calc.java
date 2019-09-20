package model;

public class Calc {

	public String calculaMoldura(String bS, String hS, String sS) {
		float b = Float.parseFloat(bS);
		float h = Float.parseFloat(hS);
		float s = Float.parseFloat(sS);
		String area;
		
		float bi = b - s * 2, hi = h - s * 2;
		
		if( s >= b || s >= h ) {
			area = "O espaço não deve ser igual ou maior que a base ou altura.";
		} else {			
			area = String.format("%.0f", (b * h) - (bi * hi));
		}
		
		
		return area;
		
	}

}
