package de.hs_lu.o2s.tutorium.tut1.loesung;

public class AutoApp {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1.toString());

		Auto a2 = new Auto("HD-AB-2019",74.2,7.8,192000.27, new Person("Patrick","V�gele","08.01.1994"));
		System.out.println(a2.toString());
		
	
		
		
	}
	
}
