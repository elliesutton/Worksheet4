import java.util.function.*;

/**
 * Statistics is a class that computes the mean 
 * and standard deviation of the application of a 
 * function to a non-empty array.
 * @author Ellen Sutton
 *
 */

public class Statistics {
	
	/**
	 * mean is a method that calculates the mean of the application of a function to 
	 * a non-empty array
	 * @param f The function
	 * @param argumentValues The non-empty array
	 * @return The mean
	 */
	public static double mean(Function<Double,Double> f, double[] argumentValues){
		double total = 0;
		for (int i=0; i < argumentValues.length; i++){
			total += f.apply(argumentValues[i]);
		}
		return total/argumentValues.length;	
	}
	
	
	/**
	 * standardDeviation is a method that calculates the standard deviation of the
	 * application of a function to a non-empty array
	 * @param f The function
	 * @param argumentValues The non-empty array
	 * @return The standard deviation
	 */
	public static double standardDeviation(Function<Double,Double> f, double[] argumentValues){
		double total = 0;
		double sum = 0;
		double mean = mean(f, argumentValues);

		for (int i=0; i < argumentValues.length; i++){
			sum = Math.pow(f.apply(argumentValues[i]) - mean, 2);
			total += sum;
		}
		
		double variance = (1/(double) argumentValues.length)*total;
		return Math.sqrt(variance);
	}

}
