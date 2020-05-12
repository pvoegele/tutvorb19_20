package de.hs_lu.o2s.tutorium.WiederholungProg1;

public class test {

	public static void main(String[] args) {

		String [] stringA = new String [10];
		System.out.println(stringA.toString());
		
		for (int i = 0; i < stringA.length; i++) {
			stringA[i] = "Tutorium "+(i+1);
			System.out.println(stringA[i]);
		}
		
	}
}