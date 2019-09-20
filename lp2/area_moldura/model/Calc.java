package model;

public class Calc {

	public float calculaMoldura(float b, float h, float s) {
		float be = b, he = h, bi = b - s * 2, hi = h - s * 2, area;
		
		area = (be * he) - (bi * hi);
		
		return area;
		
	}

}
