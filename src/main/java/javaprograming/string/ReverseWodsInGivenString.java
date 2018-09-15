package javaprograming.string;

public class ReverseWodsInGivenString {

	public static void main(String[] args) {

		String str = reverseWords("I love programing very much");
		System.out.println(str);
	}

	public static String reverseWords(String str) {
		
	
		String reverseStr = "";
		
		String[] temp = str.split(" ");
		int size = temp.length;

		for (int i = size-1; i <= size-1; i--) {
			reverseStr = reverseStr + " "+ temp[i];
		}
		return reverseStr;
	}
}
