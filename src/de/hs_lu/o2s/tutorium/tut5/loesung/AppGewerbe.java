package de.hs_lu.o2s.tutorium.tut5.loesung;

public class AppGewerbe {
	
	//

	public static void main(String[] args) {

		Disco d1 = new Disco();

		d1.setAnzGaeste(25);

		for (int i = 0; i < 45; i++) {
			d1.AddVerkauftesGetraenk("Havanna Cola");
		}
		

		Restaurant r1 = new Restaurant();
		r1.setAnzGaeste(20);
		for (int i = 0; i < 15; i++) {
			r1.AddVerkaufteEssen("Schnitzel mit Pommes");
			
		}
		for (int i = 0; i < 24; i++) {
			r1.AddVerkauftesGetraenk("Bier!");
		}

		if (d1.compareTo(r1) > 0) {
			System.out.println("Ich habe in der Disko d1 viel mehr Spaß als im Restaurant!");
		} else
			System.out.println("Die Disko d1 ist viel langweiliger als das Restaurant r1!");
		
		Disco d2 = new Disco();
		d2.AddVerkauftesGetraenk("Bier!");
		d2.getSpassfaktor();

		Café c1 = new Café();
		d2.compareTo(c1);

		Bar[] spassfaktorDerStadt = new Bar[2];
		spassfaktorDerStadt[0] = d1;
		spassfaktorDerStadt[1] = r1;

		int spass = 0;
		for (Bar b : spassfaktorDerStadt) {
			spass += b.getSpassfaktor();
		}
		System.out.println(spass);

	}

}
