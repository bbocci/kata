
public class FizzBuzz {

    /**
     * This method accepts the numbers from 1 to 100 and returns them as a String.
     * But for multiples of three it returns the String "Fizz" instead of the number and for the
     * multiples of five it returns the String "Buzz". For numbers which are multiples of both
     * three and five the method returns the String "FizzBuzz".
     *
     * @param number a number from 1 to 100
     * @return a String representing the number or the Strings "Fizz", "Buzz" and "FizzBuzz"
     *         as described above
     * @throws IllegalArgumentException if the number is not in the 1-100 range.
     */
public String toFizzBuzzString(int number) {
    	
    	String result = String.valueOf(number);
    	if (number%3 == 0 ){
    		result =  "Fizz";
    	}
    	if (number%5 == 0 ){
    		result =  "Buzz";
    	}
    	if (number%15 == 0 ){
    		result =  "FizzBuzz";
    	}
    	return result; 

    }

}
