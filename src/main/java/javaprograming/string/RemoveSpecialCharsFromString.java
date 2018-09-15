package javaprograming.string;

public class RemoveSpecialCharsFromString {

	static String spStr = "@#123Sanjay is a Test Automation Engineer";

	public static void main(String[] args) {
		removeSepcialChars(spStr);
		removesAllSpacesFromString(spStr);
		removeOnlyNumbersFromString(spStr);
	}
	
	//Remove only special chars from a string
	public static void removeSepcialChars(String strName) {
		System.out.println(strName.replaceAll("[^a-zA-Z0-9\\s+]", ""));
	}
	
	//Remove all spaces from a String
	public static void removesAllSpacesFromString(String strName) {
		System.out.println(strName.replaceAll("[\\s+]", ""));
	}
	
	//Remove all digits from a String
	public static void removeOnlyNumbersFromString(String strName) {
		System.out.println(strName.replaceAll("[\\d]", ""));
	}

}
