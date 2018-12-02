package javaprograming.basics;

public class StaticBlock {

	
	// >> Below Block is a static block
	// >> Static blocks are used to write logics that will be loaded during .class file loading time 
	// >> In Java .class file getting loaded only one time, So static blocks are executed only once per class
	// >> It is possible to write more then one static block, but execution order will be from top to bottom.
	// >> Instance block execution depends upon object creation
	// >> But Static block execution depends upon .class file loading
	// >> static variables can be initialize through static block during .class file loading
	 
	
	static int a;
	static {
		a = 1;
		System.out.println("This is static block-1");
	}

	static {

		System.out.println("This is static block-2");
	}

	public static void main(String[] args) {
		System.out.println("This is main method block");
	}

}
