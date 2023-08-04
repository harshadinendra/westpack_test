package test.westpack.com.imp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import test.westpack.com.PinGenerator;

/**
 * Class PinGenerator to create PINs based on given batch size the and the length. if the total
 * combinations are not enough for the batch size, the maximum number of combinations will be
 * generated.
 * 
 * @author Harsha Dinendra
 */
public class PinGeneratorA implements PinGenerator {

	@Override
    public Set<String> getPINs(int digits, int batchSize) {
        if (batchSize <= 0 || digits <= 0) {
            throw new IllegalArgumentException("Input data should be greater than zero.");
        }

        // Calculate the range for generating random numbers
        int maxRange = (int) Math.pow(10, digits);
        
        // Ensure the batch size is within a reasonable range
        batchSize = Math.min(batchSize, maxRange - 1);

        Set<String> pinNumbers = new HashSet<>();
        Random random = new Random();
        
        String formatString = "%0" + digits + "d"; 
        
        while (pinNumbers.size() < batchSize) {
            // Generate a random number in the desired range
            int pin = random.nextInt(maxRange - 1);

            // Format the PIN to ensure it has the desired number of digits
            String formattedPin = String.format(formatString, pin);

            pinNumbers.add(formattedPin);
        }

        return pinNumbers;
    }

}
