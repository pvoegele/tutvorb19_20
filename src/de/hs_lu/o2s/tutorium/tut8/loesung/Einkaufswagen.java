package de.hs_lu.o2s.tutorium.tut8.loesung;

import java.util.ArrayList;
import java.util.HashSet;

public class Einkaufswagen<E> extends ArrayList<E> {

		
	public String addText(int index, E element) {
		String addText = "Fuege " + element.toString() + " in die Liste an Position "+index+" ein.\n";
		addText += "Neue Listenlaenge: "+this.size()+"\n";
		addText += "Elemente der Liste:\n";
		for(E e : this) {
			addText += "- "+e.toString();
		} return addText;
	}

	public String delText(int index, E element) {
		return "Entferne " + element.toString() +"aus Liste an bisheriger Position" +index+ "."; 
				
	}
	
	@Override
	public boolean add(E e) {
		System.out.println(this.addText(this.indexOf(e), e));
		return super.add(e);
	}

	@Override
	public void add(int index, E element) {
		System.out.println(this.addText(index, element));
		super.add(index, element);
	}

	@Override
	public E remove(int index) {
		System.out.println(this.delText(index, this.get(index)));
		return super.remove(index);
	}

	@Override
	public boolean remove(Object o) {
		System.out.println(this.delText(this.indexOf(o), (E) o));	
		return super.remove(o);
	}
	
	

	public Einkaufswagen() {
		super();
	}

}