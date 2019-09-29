package de.hs_lu.o2s.tutorium.tut4.loesung;

public class AppAutragsliste {

	public static void main(String[] args) {
		Fahrzeug f1 = new PKW("Audi", "A4", "WAUZZZ8D", new Person("Peter", "Stöger"));
		Fahrzeug f2 = new PKW("Audi", "A3", "MANSU2KS", new Person("Peter", "Stöger"));
		Fahrzeug f3 = new PKW("BMW", "E90", "KALS92SA", new Person("Peter", "Stöger"));
		Fahrzeug f4 = new PKW("Mercedes", "A-Klasse", "XNBAJ28S", new Person("Jürgen", "Klopp"));
		Fahrzeug f5 = new PKW("Fiat", "Punto", "OLAMSN211", new Person("Jürgen", "Klopp"));
		Fahrzeug f6 = new PKW("Honda", "Civic", "KJAMSN81A", new Person("Pep", "Guardiola"));

		Auftrag a1 = new Auftrag(f1, f1.getBesitzer(), "001", 800.00);
		Auftrag a2 = new Auftrag(f2, f2.getBesitzer(), "002", 1200.00);
		Auftrag a3 = new Auftrag(f3, f3.getBesitzer(), "003", 2200.00);
		Auftrag a4 = new Auftrag(f4, f4.getBesitzer(), "004", 1800.00);
		Auftrag a5 = new Auftrag(f5, f5.getBesitzer(), "005", 220.00);

		System.out.println("----Alle Aufträge angelegt----");

		System.out.println();
		Auftragsliste AL1 = new Auftragsliste();
		System.out.println("----Alle Aufträge der Auftragsliste hinzufügen.----");
		AL1.addAuftrag(a1);
		AL1.addAuftrag(a2);
		AL1.addAuftrag(a3);
		AL1.addAuftrag(a4);
		AL1.addAuftrag(a5);
		
		System.out.println();
		System.out.println("----Setze Auftrag 001 & 002 auf Status 3----");
		a1.setStatus(3);
		a2.setStatus(3);
		System.out.println();
		System.out.println("----Ausgabe aller Aufträge vor Entfernen der Inaktiven----");
		System.out.println(AL1);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----Prüfen, ob inaktive Aufträge in der AL----");
		System.out.println();
		AL1.checkAktiv();
		System.out.println();
		System.out.println("----Ausgabe aller Aufträge nach Entfernen der Inaktiven----");
		System.out.println(AL1);

	}

}
