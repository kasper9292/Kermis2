package attracties;

import mainclasses.Attractie;

public class Hawaii extends Attractie {
	String naam = "Hawaii";
	int personenPerDraai = 8;
	int kaartjesVerkocht = 0;
	double prijs = 2.90;
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
