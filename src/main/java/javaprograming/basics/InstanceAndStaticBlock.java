package javaprograming.basics;

public class InstanceAndStaticBlock {
	static int a = 1;

	{

		System.out.println("This is instance block");
	}

	static {

		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		System.out.println("This is main method block");

		InstanceAndStaticBlock obj = new InstanceAndStaticBlock();

	}

}
