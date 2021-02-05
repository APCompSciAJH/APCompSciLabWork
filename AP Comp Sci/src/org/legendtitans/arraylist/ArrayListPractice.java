package org.legendtitans.arraylist;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] coolPeople = new String[3];
coolPeople[0] = "blarg";
coolPeople[1] = "blorg";
coolPeople[2] = "caboose";

System.out.println(coolPeople[0]);
System.out.println(coolPeople[1]);
System.out.println(coolPeople[2]);

ArrayList<String> notCoolPeople = new ArrayList<String>();

notCoolPeople.add("blip");
notCoolPeople.add("blop");
notCoolPeople.add("egg");

System.out.println(notCoolPeople.get(0));
System.out.println(notCoolPeople.get(1));
System.out.println(notCoolPeople.get(2));

notCoolPeople.remove(1);

notCoolPeople.add(1,"spanky");

System.out.println(notCoolPeople.get(0));
System.out.println(notCoolPeople.get(1));
System.out.println(notCoolPeople.get(2));
	}

}
