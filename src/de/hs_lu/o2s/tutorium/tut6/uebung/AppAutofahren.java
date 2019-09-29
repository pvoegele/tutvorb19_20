package de.hs_lu.o2s.tutorium.tut6.uebung;

public class AppAutofahren {

	public static void main(String args[]) {

		Auto a1 = new Auto("Mercedes", "C-Klase", 70, new Autofahrer("Thilo Kehrer", true), 50000);
		Auto a2 = new Auto("BMW", "e30", 420, new Autofahrer("Tim Wiese", false), 220000);

		try {
			a1.autoFahren(500);
			System.out.println("Der neue Kilometerstand beträgt: "+a1.getKilometerstand());
		} catch (KeinFuehrerscheinException kfex) {
			// TODO: handle exception
			System.out.println(kfex.getMessage());
		}
		
		try {
			a2.autoFahren(1200);
			System.out.println("Der neue Kilometerstand beträgt: "+a2.getKilometerstand());
		} catch (KeinFuehrerscheinException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		Autofahrer Af0 = new Autofahrer("Oliver Kahn", false);
		a1.setFahrer(Af0);
		
		
	}
}
