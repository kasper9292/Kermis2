package attracties;

import mainclasses.Attractie;

public class Spin extends Attractie {
	String naam = "Spin";
	int personenPerDraai = 12;
	int kaartjesVerkocht = 0;
	double prijs = 2.25;
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
