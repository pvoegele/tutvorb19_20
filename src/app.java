
public class app {

	public static void main(String[] args) {

		String[] arrA = new String[10];
		String[] arrB = new String[5];
		String[] arrC = new String[15];

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = "TEST A - " + i;
		}
		for (int i = 0; i < arrB.length; i++) {
			arrB[i] = "TEST B - " + i;
		}

		System.arraycopy(arrA, 0, arrC, 0, arrA.length);
		
	}
}
