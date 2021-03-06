
import java.util.Comparator;

public class SoftwareVersionComparator implements Comparator<String> {

    /**
     * Compares two software version strings. Software versions are made of
     * a maximum of 5 integers separated by dots. For example these are all
     * allowed version numbers:
     *
     * <ul>
     *     <li>3</li>
     *     <li>1.9.2</li>
     *     <li>3.0.678.34.9</li>
     * </ul>
     *
     * @param version1 first version String
     * @param version2 second version String
     * @return a negative integer if version1 is smaller than version2,
     *         zero if version1 equals version2, a positive integer
     *         if version1 is greater than version 2
     */
    @Override
	public int compare(String version1, String version2) {
		int result = 0;
		String[] string1 = version1.split("\\.");
		String[] string2 = version2.split("\\.");
		for (int i = 0; i < string1.length; i++) {
			if (i+1 > string2.length){
				break;
			}
			int primaVersione = Integer.valueOf(string1[i]);
			int secondaVersione = Integer.valueOf(string2[i]);
			result = primaVersione - secondaVersione;
			if (result != 0) {
				return result;
			}
		}
		
		// if we are here result == 0
		// check extra digit
		result = string1.length - string2.length;
		if(result != 0){
			// local string
			String localString;
			// check if extra digits are zeros
			if (result > 0){
				//string1 > string2
				localString = version1.substring(string2.length+1);			
				
			}else{
				localString = version2.substring(string1.length+1);		
			}				
			localString = localString.replaceAll("\\.", "");
			if (localString.matches("[0-0]*"))
				return 0;
		}
	

		return result;
	}

}
