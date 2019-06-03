package mainclasses;

import java.util.Scanner;

import attracties.Botsauto;
import attracties.Hawaii;
import attracties.Ladderklimmen;
import attracties.Spiegelpaleis;
import attracties.Spin;
import attracties.Spookhuis;

public class Kermis {

	// maak kassa en alle attracties
	Kassa kassa = new Kassa();
	Botsauto botsauto = new Botsauto();
	Spin spin = new Spin();
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	Spookhuis spookhuis = new Spookhuis();
	Hawaii hawaii = new Hawaii();
	Ladderklimmen ladderklimmen = new Ladderklimmen();

	// maak scanner
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new Kermis().startKermis();
	}

	public void startKermis() {
		// instructies
		System.out.println("Kies een getal om een attractie te draaien of een letter voor andere informatie");
		System.out.println(
				"(1)botsauto, (2)spin, (3)spiegelpaleis, (4)spookhuis, (5)hawaii, (6)ladderklimmen, (o)omzet, (k)kaartjes, (i)info");

		// kermisloop
		Boolean kermisOpen = true;
		while (kermisOpen) {
			System.out.print("Typ uw keuze hier: ");
			String spelerInput = scanner.nextLine();
			System.out.println();

			// input switch
			switch (spelerInput) {
			case "1": {
				botsauto.draaien();
				break;
			}
			case "2": {
				spin.draaien();
				break;
			}
			case "3": {
				spiegelpaleis.draaien();
				break;
			}
			case "4": {
				spookhuis.draaien();
				break;
			}
			case "5": {
				hawaii.draaien();
				break;
			}
			case "6": {
				ladderklimmen.draaien();
				break;
			}
			case "o": {
				System.out.println("Totale omzet: " + kassa.getTotaalOmzet(botsauto.getOmzet(), spin.getOmzet(),
						spiegelpaleis.getOmzet(), spookhuis.getOmzet(), hawaii.getOmzet(), ladderklimmen.getOmzet()));
				break;
			}
			case "k": {
				System.out.println("Totale aantal kaartjes verkocht: "
						+ kassa.getTotaalkaartjesVerkocht(botsauto.getKaartjesVerkocht(), spin.getKaartjesVerkocht(),
								spiegelpaleis.getKaartjesVerkocht(), spookhuis.getKaartjesVerkocht(),
								hawaii.getKaartjesVerkocht(), ladderklimmen.getKaartjesVerkocht()));
				break;
			}
			case "i": {
				System.out.println("Van welke attractie wilt u info?");
				System.out.println("(1)botsauto, (2)spin, (3)spiegelpaleis, (4)spookhuis, (5)hawaii, (6)ladderklimmen");
				break;
			}
			case "s": {
				kermisOpen = false;
				scanner.close();
				break;
			}
			default: {
				System.out.println("Ongeldige input");
				break;
			}
			}
		}
	}

}
