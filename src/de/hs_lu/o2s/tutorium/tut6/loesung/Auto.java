package de.hs_lu.o2s.tutorium.tut6.loesung;

public class Auto {

	private String marke, modell;
	private int ps, kilometerstand;
	private Autofahrer fahrer;

	public String getMarke() {
		return marke;
	}

	public Autofahrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Autofahrer fahrer) {
		try {
			if (this.fahrer.hasFuehrerschein()) {
				this.fahrer = fahrer;
			} else
				throw new KeinFuehrerscheinException(
						fahrer.getName() + " kann nicht gesetzt werden, weil er keinen F�hrerschein hat.");

		} catch (KeinFuehrerscheinException kfex) {
			// TODO: handle exception
			System.out.println(kfex.getMessage());
		}

	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(String marke, String modell, int ps, Autofahrer fahrer, int kilometerstand) {
		this.marke = marke;
		this.modell = modell;
		this.ps = ps;
		this.fahrer = fahrer;
		this.kilometerstand = kilometerstand;
	}

	public int getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public void autoFahren(int zurueckgelegteKilometer) throws KeinFuehrerscheinException {
		if (this.getFahrer().hasFuehrerschein()) {
			this.setKilometerstand(this.getKilometerstand() + zurueckgelegteKilometer);
		} else
			throw new KeinFuehrerscheinException(this.getFahrer().getName() + " hat momentan keinen F�hrerschein!");

	}

}
