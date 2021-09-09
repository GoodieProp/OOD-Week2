/**
 * @author Xavier Gonzalez
 * Week 2 - Factory Patterns
 */
public class HandBagStore {
	SimpleHandBagFactory factory;
	
	//Constructor
	public HandBagStore(SimpleHandBagFactory factory) {
		this.factory = factory;
	}
	
	//handles the creation of a handbag
	public HandBag purchaseHandBag(String type) {
		HandBag hb;
		
		hb = factory.createHandBag(type);
		
		hb.bag();
		hb.sewing();
		hb.straps();
		hb.brandName();
		//functions in the handbag class to prepare bag
		
		return hb;
	}
	
}
