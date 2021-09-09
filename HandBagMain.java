
/**
 * @author Xavier Gonzalez
 * Week 2 - Factory Patterns
 * 
 */
public class HandBagMain {

	public static void main(String[] args) {
		SimpleHandBagFactory fac = new SimpleHandBagFactory();
		HandBagStore st = new HandBagStore(fac);
		
		//Crossbody
		HandBag hb = st.purchaseHandBag("crossbody");
		System.out.println("\nHere is your " + hb.getBrand() + " " + hb.getType() + ".\n");
		System.out.println(hb);
		
		//Satchel
		hb = st.purchaseHandBag("satchel");
		System.out.println("\nHere is your " + hb.getBrand() + " " + hb.getType() + ".\n");
		System.out.println(hb);
		
		//Backpack purse
		hb = st.purchaseHandBag("backpack purse");
		System.out.println("\nHere is your " + hb.getBrand() + " " + hb.getType() + ".\n");
		System.out.println(hb);
		
		//Shoulder bag
		hb = st.purchaseHandBag("shoulder bag");
		System.out.println("\nHere is your " + hb.getBrand() + " " + hb.getType() + ".\n");
		System.out.println(hb);
	}
}
