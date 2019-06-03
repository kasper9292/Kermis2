package mainclasses;

public class Kassa {
	int totaalkaartjesVerkocht = 0;
	double totaalOmzet = 0.00;
	
	public int getTotaalkaartjesVerkocht(int a, int b, int c, int d, int e, int f) {
		totaalkaartjesVerkocht = a + b + c + e + f;
		return totaalkaartjesVerkocht;
	}
	
	public double getTotaalOmzet(double a, double b, double c, double d, double e, double f) {
		totaalOmzet = a + b + c + e + f;
		return totaalOmzet;
	}
	
}
