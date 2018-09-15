package javaprograming.string;

public class StringConceptPrograms {

	public static void main(String[] args) {
		
		String str = "@$$$snajay@3333";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str.replaceAll("[^a-zA-Z0-9\\s+]", ""));
		
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(2));

	}

}
