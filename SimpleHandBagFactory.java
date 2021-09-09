/**
 * @author Xavier Gonzalez
 * Week 2 - Factory Patterns
 */

public class SimpleHandBagFactory {
	
	public HandBag createHandBag(String type) {
		
		//Object is set to null until if-else statement states otherwise
		HandBag hb = null;
		
		if (type.equals("shoulder bag")) {
			hb = new Prada();
		} else if (type.equals("crossbody")) {
			hb = new Chanel();
		} else if (type.equals("satchel")) {
			hb = new LouisVuitton();
		} else if (type.equals("backpack purse")) {
			hb = new Gucci();
		}
		return hb;
	}	
}
