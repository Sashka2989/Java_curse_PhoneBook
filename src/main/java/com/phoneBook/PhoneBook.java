package com.phoneBook;
import java.util.*;

public class PhoneBook{
	public static void main(String[] args)
	{
		FizFace u1 = new FizFace("OnePers", "22383", "Pshkena", "88005553535");
		UrFace u2 = new UrFace("TwoPers", "44051", "Ktshno", "192671648187");
		System.out.println(u1.GetData());
		System.out.println(u2.GetData());
		
		ArrayList <FizFace> l1 = new ArrayList <> ();
		l1.add(new FizFace("SpisPersOne", "22989", "Pshkena", "89005553535"));
		l1.add(new FizFace("SpisPersTwo", "24987", "Pdads", "87005553535"));
		
		ArrayList <UrFace> l2 = new ArrayList <> ();
		l2.add(new UrFace("SpisUrPersOne", "2801", "Psdfa", "768723"));
		l2.add(new UrFace("SpisUrPersTwo", "280121", "Wesfna", "822345"));
		System.out.println("Fiz Face list:");
		System.out.println(l1.get(0).GetData());
		System.out.println(l1.get(1).GetData());
		
		System.out.println("Ur Face list:");
		System.out.println(l2.get(0).GetData());
		System.out.println(l2.get(1).GetData());
		
	}
	
	
	
}