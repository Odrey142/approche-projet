package fr.diginamic.banque.entities;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public  double perimetre() {
		return 3.14 * rayon * 2;
		
	};
	
	public  double surface() {
		return 3.14*Math.pow(rayon, 2);
		
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre =" + perimetre() + ", surface=" + surface() + "]";
	}
	
}
