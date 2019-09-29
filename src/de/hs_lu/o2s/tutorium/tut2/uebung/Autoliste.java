package de.hs_lu.o2s.tutorium.tut2.uebung;


public class Autoliste {

	Auto[] autoA;

	public Autoliste() {
		autoA = new Auto[0];
	}

	/**
	 * Fügt ein beliebiges Auto in das Array ein.
	 * 
	 */
	
	public boolean addAuto(Auto a) {
		Auto[] copyAutoA = new Auto[this.getAutoA().length + 1];

		
		
		/**
		 * Etwas unelegant ;-), aber wäre dennoch ok.
		 * 
		for (int i = 0; i < this.getAutoA().length; i++) {
			copyAutoA[i] = this.getAutoA()[i];
		}
		
		*/
		System.arraycopy(this.getAutoA(), 0, copyAutoA, 0, this.getAutoA().length);
		
		copyAutoA[copyAutoA.length - 1] = a;
		this.setAutoA(copyAutoA);
		return true;
	}

	/**
	 * Gibt die Anzahl von allen Elementen des Arrays zurück.
	 * 
	 */
	public int anzahlElemente() {
		return this.getAutoA().length;
	}
	
	
	
	
	
	/**
	 * Löscht das letzte Auto im Auto Array und die Methode printDeletedAuto wird
	 * aufgerufen.
	 * 
	 */
	public Auto deleteLastAuto() {
		Auto[] copyAutoA = new Auto[this.getAutoA().length - 1];
		Auto merkerAuto = this.getAutoA()[this.getAutoA().length - 1];
		
		/**
		 * Wie im oberen Beispiel bei add, etwas unelegant.
		 * 
		for (int i = 0; i < copyAutoA.length; i++) {
			copyAutoA[i] = this.getAutoA()[i];
		}
		*/
		
		System.arraycopy(this.getAutoA(), 0, copyAutoA, 0, copyAutoA.length);
		
		this.setAutoA(copyAutoA);
		return merkerAuto;
	}

	public void PrintDeletedAuto(Auto deleteAuto) {
		System.out.println("Folgendes Auto wurde aus dem Array entfernt: \n" + deleteAuto);
	}

	/**
	 * Es wird eine Autoliste an eine andere angefügt (am Ende).
	 * 
	 */
	public void addAutoliste(Autoliste uebergabeAL) {

	}

	public Auto[] getAutoA() {
		return autoA;
	}

	public void setAutoA(Auto[] autoA) {
		this.autoA = autoA;
	}

	/**
	 * Jedes Element der Autoliste wird auf der Konsole ausgegeben. Nutzen Sie
	 * vorhandene Methoden.
	 * 
	 */

	public String toString() {
		String retString ="Autoliste:+\n";
		for (int i = 0; i < autoA.length; i++) {
			retString += this.getAutoA()[i].toString();
		}
		return retString;
	}
}
