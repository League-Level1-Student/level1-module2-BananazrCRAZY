package _01_sea_creature;

public class seaCreatureRunner {
	public static void main(String[] args) {
		String n;
		
		SeaCreature sc1  = new SeaCreature("Spongebob");
		n = sc1.getName();
		System.out.println(n);
		sc1.eat();
		sc1.laugh();
		
		SeaCreature sc2 = new SeaCreature("Patrick");
		n = sc2.getName();
		System.out.println(n);
		sc2.eat();
		sc2.laugh();
		
		SeaCreature sc3 = new SeaCreature("Squidward");
		n = sc3.getName();
		System.out.println(n);
		sc3.eat();
		sc3.laugh();
		
	}
}
