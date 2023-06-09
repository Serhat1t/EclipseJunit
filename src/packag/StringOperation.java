package packag;

public class StringOperation {
	public String firstTwoCharacters(String inputString) {
		if(inputString.length()<=2) {
			return inputString;
		}
		else {
			String twoChar=inputString.substring(0,2);
			return twoChar;
		}
	}

}
