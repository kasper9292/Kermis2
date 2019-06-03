package attracties;

import mainclasses.Attractie;

public class Spookhuis extends Attractie {
	String naam = "Spookhuis";
	int personenPerDraai = 2;
	int kaartjesVerkocht = 0;
	double prijs = 3.20;
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
