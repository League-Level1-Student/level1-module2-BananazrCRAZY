package _03_tea_maker;

import javax.swing.JOptionPane;

public class TeaMakerRunner {
	
	static String flavor;
	
	public static void main(String[] args) {
		int f = JOptionPane.showOptionDialog(null, "Which tea flavor?", "Pop-up Title", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Green", "Mint", "Chamomile", "Passion Fruit"}, null);
		
		if (f == 0)
			flavor = "Green";
		else if (f == 1)
			flavor = "Mint";
		else if (f == 2)
			flavor = "Chamomile";
		else if (f == 3)
			flavor = "Passion Fruit";
		
		TeaBag tb = new TeaBag(flavor);
		
		flavor = tb.getFlavor();
		System.out.println("Flavor is " + flavor);
		
		Kettle k = new Kettle();
		k.getWater();
		k.boil();
		
		Cup c = new Cup();
		c.makeTea(tb, k.getWater());
	}
}
