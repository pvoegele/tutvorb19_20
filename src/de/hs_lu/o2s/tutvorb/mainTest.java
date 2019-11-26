package de.hs_lu.o2s.tutvorb;

public class mainTest {

	public static void main(String[] args) {

		test t1 = new test();
		t1.luck = true;
		t1.workhard = true;
		
		System.out.println(t1.getSuccess());
		
	}

}
