package de.hs_lu.o2s.tutvorb;

public class app{

	public static void main(String[] args) {
		

		Mitarbeiter m1 = new Mitarbeiter("87010292V431");
		Mitarbeiter m2 = new Mitarbeiter("87010292V431");
		Schüler s1 = new Schüler("89060312V871");
		Rentner r1 = new Rentner("89124312V879");
		Auto a1 = new Auto();
		Hund h1 = new Hund("HUND123456");

		Object[] oArray = new Object[6];
		oArray[0] = m1;
		oArray[1] = m2;
		oArray[2] = s1;
		oArray[3] = r1;
		oArray[4] = a1;
		oArray[5] = h1;

		/**
		 * 
		 * for (int i = 0; i < pArray.length; i++) { }
		 * 
		 */

		for (Object o : oArray) {
			if (o instanceof Rentenversicherung) {
				String msg = o.getClass().getSimpleName() + " - Ich habe eine Rentenversicherungsnummer - ";
				
				if (o instanceof Person) {
					System.out.println(msg + ((Person) o).getRentenversicherung());
				}
				
				if (o instanceof Hund) {
					System.out.println(msg + ((Hund) o).getRentenversicherung());
				}
			} else {
				System.out.println(o.getClass().getSimpleName() +" - Ich habe keine Rentenversicherung ;-(");

			}

		}

	}
}
