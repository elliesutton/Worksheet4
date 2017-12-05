/**
 * Aircraft is a class that that creates an aircraft, specifying 
 * its max speed, max weight and max number of persons.
 * @author Ellen Sutton
 *
 */
public class Aircraft {
	
	private double maxSpeed;
	private double maxWeight;
	private int maxPersons;
	
	
	/**
	 * Aircraft is a constructor for creating an aircraft.
	 * @param maxSpeed The maximum speed
	 * @param maxWeight The maximum weight
	 * @param maxPersons The maximum number of persons 
	 */
	public Aircraft(double maxSpeed, double maxWeight, int maxPersons){
		this.maxSpeed = maxSpeed;
		this.maxWeight = maxWeight;
		this.maxPersons = maxPersons;
	}
	
	/**
	 * getter for the maximum speed
	 * @return The maximum speed
	 */
	public double getMaxSpeed(){
		return maxSpeed;
	}
	
	/**
	 * getter for the maximum weight
	 * @return The maximum weight
	 */
	public double getMaxWeight(){
		return maxWeight;
	}
	
	/**
	 * getter for the maximum number of persons
	 * @return The maximum number of persons
	 */
	public int getMaxPersons(){
		return maxPersons;
	}
	
	/**
	 * setter for the maximum speed
	 * @param maxSpeed The maximum speed
	 */
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * setter for the maximum weight
	 * @param maxWeight The maximum weight
	 */
	public void setMaxWeight(double maxWeight){
		this.maxWeight = maxWeight;
	}
	
	/**
	 * setter for the maximum number of persons
	 * @param maxPersons The maximum number of persons
	 */
	public void setMaxPersons(int maxPersons){
		this.maxPersons = maxPersons;
	}
	
	/**
	 * toString method
	 * @return the aircaft's maximum speed, maximal weight and maximum number of persons
	 */
	@Override
	public String toString(){
		if (maxPersons == 1){
			return "The aircraft has a maximal speed of " + maxSpeed + 
					" km/h and a maximal weight of " + maxWeight + 
					" kg. It can carry " + maxPersons + " person.";
		} else {
			return "The aircraft has a maximal speed of " + maxSpeed + 
					" km/h and a maximal weight of " + maxWeight + 
					" kg. It can carry " + maxPersons + " persons.";
		}
		
	}

}
