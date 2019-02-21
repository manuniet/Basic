package logic.misc;

import java.util.ArrayList;
import java.util.List;


public class GenericTest {

	
	static void dis(List< ? super Shark> s){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input="java$#$made$#$so$#$easy";
		 String output = input.replaceAll("[$#$]", " ");
		 System.out.println(output);
List<? super Creature> ls = new ArrayList<>();;
ls.add(new Creature());
ls.add(new Animal());



List<? super Shark> sharks = new ArrayList<>();
sharks.add(new Shark());
sharks.add(new DeadHammerShark());
sharks.add(new HammerSkark());

Fish f = new Shark();
//sharks.add(f);

System.out.println(sharks);
System.out.println(sharks.size());

dis(sharks);
	}

}



class Creature{}// X
class Animal extends Creature{}// Y
class Fish extends Animal{}// Z
class Shark extends Fish{}// A
class HammerSkark extends Shark{}// B
class DeadHammerShark extends HammerSkark{}// C


