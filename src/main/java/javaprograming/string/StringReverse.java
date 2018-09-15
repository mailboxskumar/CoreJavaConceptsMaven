package javaprograming.string;

public class StringReverse {

	static String s = "This is a String";
	static String temp = "";

	public static void main(String[] args) {

		// 1st Method

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);

		// 2nd Method

		StringBuffer buff = new StringBuffer(s);
		System.out.println(buff.reverse());

		// 3rd Method

		String ret = recursiveMethod(s);
		System.out.println(ret);
	}
	
	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
