package de.hs_lu.o2s.tutvorb;

public class test {

	boolean success, workhard, luck;

	public test() {
		this.workhard = true;
		this.luck = false;

		this.success = this.workhard && this.luck;
		if (this.success) {
			System.out.println("Ich habe Erfolg");
		} else
			System.out.println("Ich habe keinen Erfolg");
	}
	
	public boolean getSuccess() {
		this.success = this.workhard && this.luck;
		return this.success;
	}
}
