package de.hs_lu.o2s.tutorium.tut6.loesung;

class KeinFuehrerscheinException extends Exception {

	public KeinFuehrerscheinException() {
		super();
	}
	
	public KeinFuehrerscheinException(String msg) {
		super(msg);
	}

}
