package de.hs_lu.o2s.tutorium.tut8.loesung;

public class AppEinkaufswagen {

	public static void main(String[] args) {
		Einkaufswagen e1 = new Einkaufswagen();
		Packung<Gummibär> p1 = new Packung<Gummibär>(3);
		Packung<Birne> p2 = new Packung<Birne>(4);
		Packung<Birne> p3 = new Packung<Birne>(2);
		Birne b1 = new Birne();
		Birne b2 = new Birne();

//		System.out.println("-------------------------------------------------------------------------------");
//		System.out.println("Neue Packung für Gummibären");
//		System.out.println("-------------------------------------------------------------------------------");
//
//		int i = 16;
//		while (i > 0) {
//			try {
//				if (p1.CheckPackung()) {
//					p1.addInPackung(new Gummibär());
//				}
//			} catch (ArtikelVorhandenException ave) {
//				// TODO: handle exception
//			System.out.println(ave.getMessage());
//			}
//			i--;
//
//		}
//		System.out.println("-------------------------------------------------------------------------------");
//		System.out.println("Neue Packung für Birnen");
//		System.out.println("-------------------------------------------------------------------------------");
//
//		while (p2.packungsgroesse > 0) {
//			try {
//				p2.addInPackung(b1);
//			} catch (ArtikelVorhandenException e) {
//				// TODO: handle exception
//				System.out.println(e.getMessage());
//				break;
//			}
//			
//		}
		
		
		e1.add(p1);
		e1.add(p2);
		e1.add(b1);
		e1.add(2, b2);
		e1.add(3, p3);
		
		e1.remove(0);
		e1.remove(p2);


	}
}
