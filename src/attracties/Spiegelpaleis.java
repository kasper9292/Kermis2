package attracties;

import mainclasses.Attractie;

public class Spiegelpaleis extends Attractie {
	String naam = "Spiegelpaleis";
	int personenPerDraai = 4;
	int kaartjesVerkocht = 0;
	double prijs = 2.75;
	double omzet = 0.00;

	public void draaien() {
		System.out.println(this.naam + " draait");
		kaartjesVerkocht += personenPerDraai;
	}
	
	public double getOmzet() {
		omzet = prijs * kaartjesVerkocht;
		return omzet;
	}
	
	public int getKaartjesVerkocht() {
		return kaartjesVerkocht;
	}
}
