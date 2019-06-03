package attracties;

import mainclasses.Attractie;

public class Ladderklimmen extends Attractie {
	String naam = "Ladderklimmen";
	int personenPerDraai = 1;
	int kaartjesVerkocht = 0;
	double prijs = 5.00;
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
