import java.util.ArrayList;

class Main {
	
	public static void main (String [] args){
		
		Team t = new Team("Bulldogs");
		Team t1 = new Team("Goldies");
		Team t2 = new Team("Katties");
		Team t3 = new Team("Ladies");
		Team t4 = new Team("Lalas");

		t.setRank(3);
		t1.setRank(4);
		t2.setRank(2);
		t3.setRank(1);
		t4.setRank(5);

		System.out.println(t);

		
		t.addPlayer("Josh");
		t1.addPlayer("Jane");
		t2.addPlayer("Maria");


	}


}