package javaprograming.string;

public class IntegerReverse {

	static int in = 123456789;
	static int num = 123456789;
	static int rev = 0;

	public static void main(String[] args) {

		// 1st Method
		while (in != 0) {
			rev = rev * 10 + in % 10;
			in = in / 10;
		}
		System.out.println(rev);
		
		//2nd Method		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
}
