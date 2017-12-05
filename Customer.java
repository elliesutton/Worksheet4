
/**
 * Customer is a class that stores a customers name, the total
 * money they spent and their address
 * @author exs404
 *
 */
public class Customer implements Sortable{
	
	private String name;
	private double totalMoneySpent;
	private String address;
	
	/**
	 * Customer is a constructor that creates a customer object
	 * @param name The customer's name
	 * @param totalMoneySpent The total money the customer spent
	 * @param address The customer's address
	 */
	public Customer(String name, double totalMoneySpent, String address){
		this.name = name;
		this.totalMoneySpent = totalMoneySpent;
		this.address = address;
	}
	
	/**
	 * compareValue
	 */
	public double compareValue(){
		return totalMoneySpent;
		
	}
	
	/**
	 * toString method
	 * @return The customers name, the total money they spent and their address.
	 */
	public String toString(){
		return name + totalMoneySpent + address;
	}

}
