package fr.uvsq.cprog;


public class Fraction {

	private int numerateur;
	private int denominateur;

	/** Constructeur **/
	public Fraction(int numerateur, int denominateur) {

		this.numerateur = numerateur;
		this.denominateur = denominateur;

	}

	/** toString **/
	@Override
	public String toString() {

		return Integer.toString(numerateur) + "/" + Integer.toString(this.denominateur);

	}

}
