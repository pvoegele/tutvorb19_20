package de.hs_lu.o2s.tutorium.tut6.loesung;

public class Autofahrer extends Person {

	private boolean AltGenugUmZuFahren = false;

	public Autofahrer(String name, int geburtsjahr, boolean fuehrerschein, Auto auto) {
		super(name, geburtsjahr, fuehrerschein, auto);
		// TODO Auto-generated constructor stub
	}

	public Autofahrer(String name, boolean fuehrerschein, Auto auto) {
		super(name, fuehrerschein, auto);
		// TODO Auto-generated constructor stub
	}

	public Autofahrer(String name, boolean fuehrerschein) {
		super(name, fuehrerschein);
	}

	public Autofahrer(String name, int geburtsjahr) {
		super();
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}

	public boolean darfFuehrerscheinMachen() {
		try {
			if (this.getGeburtsjahr() > 2001) {
				System.out.println("Ich darf den Führerschein machen!");
				return true;
			} else
				throw new NichtAltGenugException("Ich bin einfach noch zu jung.");

		} catch (NichtAltGenugException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean isAltGenugUmZuFahren() {
		return AltGenugUmZuFahren;
	}

	public void setAltGenugUmZuFahren() {
		if (this.darfFuehrerscheinMachen()) {
			this.AltGenugUmZuFahren = true;
		}
	}
}
