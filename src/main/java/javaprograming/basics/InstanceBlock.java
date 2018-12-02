package javaprograming.basics;

public class InstanceBlock {

	/*
	 * >> Below Block is a instance block >> Instance block is executed just before
	 * Object creation >> which Means while creating object first instance block
	 * executed and then constructor executed >> Instance block logic common for all
	 * objects >> But Constructor logics are specific to constructor only >> If
	 * multiple instance blocks are available then execution order is from top to
	 * bottom.
	 * 
	 */

	int a, b;

	{
		System.out.println("This is instance block");
	}

	{
		a = 1; // Instance block can be used to initialize variable before object creation
	}

	InstanceBlock() {

		b = 2; // Constructor block can be used to initialize variable during object creation

	}

	public static void main(String[] args) {

		System.out.println("This is main method block");

		InstanceBlock newInstance = new InstanceBlock();

	}

}
