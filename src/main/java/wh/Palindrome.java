package wh;

public class Palindrome {

	public boolean test(String testString) {
		if(testString == null || "".equals(testString)) {
			return false;
		} else if (testString.length() == 1 ||
				(testString.length() == 2 && testString.charAt(0) == testString.charAt(1))) {
			return true;
		} else if (testString.charAt(0) == testString.charAt(testString.length() - 1)) {
			return test(testString.substring(1, testString.length() - 1));
		} else {
			return false;
		}
	}

}
