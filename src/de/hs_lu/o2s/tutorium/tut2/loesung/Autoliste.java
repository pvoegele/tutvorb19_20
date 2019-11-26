package de.hs_lu.o2s.tutorium.tut2.loesung;

import java.nio.channels.MembershipKey;

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
	public void deleteLastAuto() {
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
		this.PrintDeletedAuto(merkerAuto);
		this.setAutoA(copyAutoA);
		
	}

	/**
	 * Gibt ein gelöschtes Auto auf der Konsole aus. 
	 * 
	 * Format:
	 * Folgendes Auto wurde aus dem Array entfernt: 
	 * Auto: 
	 * Marke: <Marke> 
	 * Modell: <Modell> 
	 * Baujahr: <Baujahr>
	 * 
	 * 
	 */

	public void PrintDeletedAuto(Auto deleteAuto) {
		System.out.println("Folgendes Auto wurde aus dem Array entfernt: \n" + deleteAuto);
	}

	/**
	 * Es wird eine Autoliste an eine andere angefügt (am Ende).
	 * 
	 */
	public void addAutoliste(Autoliste uebergabeAL) {
		int lengthNeuesArray = this.anzahlElemente() + uebergabeAL.anzahlElemente();
		Auto[] copyArray = new Auto[lengthNeuesArray];
/**
		for (int i = 0; i < this.getAutoA().length; i++) {
			copyArray[i] = this.getAutoA()[i];
		}
		for (int i = 0; i < uebergabeAL.getAutoA().length; i++) {
			copyArray[this.anzahlElemente() + i] = uebergabeAL.getAutoA()[i];
		}

*/
		
		System.arraycopy(this.getAutoA(), 0, copyArray, 0, getAutoA().length);
		System.arraycopy(uebergabeAL.getAutoA(), 0, copyArray, getAutoA().length, uebergabeAL.getAutoA().length);
		
		this.setAutoA(copyArray);
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
		String retString = "Autoliste: \n";
		for (int i = 0; i < this.getAutoA().length; i++) {
			retString += this.getAutoA()[i].toString() + "\n";
		}
		return retString;
	}
}
