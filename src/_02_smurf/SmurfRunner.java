package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		String n, h, g;
		
		Smurf handy = new Smurf("Handy");
		handy.eat();
		n = handy.getName();
		System.out.println(n);
		
		Smurf ps = new Smurf("Papa");
		n = ps.getName();
		h = ps.getHatColor();
		g = ps.isGirlOrBoy();
		
		System.out.println(n);
		System.out.println(h);
		System.out.println(g);
		
		Smurf smurfF = new Smurf("Smurfette");
		n = smurfF.getName();
		h = smurfF.getHatColor();
		g = smurfF.isGirlOrBoy();
		
		System.out.println(n);
		System.out.println(h);
		System.out.println(g);
	}
}
