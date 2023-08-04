/**
 * 
 */
package test.westpack.com;

import java.util.Set;

/**
 * This is for generating pins for the given configurations.
 * @author Harsha Dinendra
 */
public interface PinGenerator {
	
	/**
	* This method is to generate random numbers of a given size of batch. The numbers in the batch will be unique.
	* Numbers can have 0 as the first number. 
	*/
	public Set<String> getPINs(int digits, int batchSize);

}
