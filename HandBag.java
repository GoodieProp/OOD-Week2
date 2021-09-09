import java.util.*;

/**
 * @author Xavier Gonzalez
 * Week 2 - Factory Patterns
 */

public class HandBag {
	// Initialized Variables
	String material;
	String strapSize;
	String type;
	String brand;
	List<String> decorations = new ArrayList<String>();
	
	public String getType() {
		return type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	//Display what kind of handbag
	public void bag() {
		System.out.println("Creating " + type + ".");
	}
	
	//Display the commentary of stitching the handbag
	public void sewing() {
		System.out.println("Sewing the perfect handbag.");
	}
	
	//Display the commentary of making the right length of the straps 
	public void straps() {
		System.out.println("Making sure the straps are the right length.");
	}
	
	//Display the brand of the handbag
	public void brandName() {
		System.out.println("Your brand will be: " + brand + ".");
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("*------* " + type + " *------*\n");
		display.append("Brand: " + brand + "\n");
		display.append("Material: " + material + "\n");
		display.append("Strap Length: " + strapSize + "\n");
		display.append("Decorations: \n");
		for (String decor : decorations) {
			display.append(decor + "\n");
		}
		return display.toString();
	}
}
