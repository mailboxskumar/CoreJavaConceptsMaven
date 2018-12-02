package methods;

public class JavaMethods {

	int classVar = 10;

	public static void main(String[] args) {
		JavaMethods javaMethod  = new JavaMethods();
		System.out.println(javaMethod.classVar);
		
		javaMethod.addTwoNumbers();
		javaMethod.addTwoNumbersNew(2, 6);
		javaMethod.addTwoNumbersNew(5, 6);
		javaMethod.addTwoNumbersNew(8, 9);
			
	}

	// non parameterized method
	// x,y and z are local variables to the method addTwoNumbers
	public void addTwoNumbers() {
		int x = 1;
		int y = 2;
		int z = x + y;
		System.out.println(z);
		System.out.println(classVar); // classVar is a class variable which can be accessed anywhere in the class
		//System.out.println(c); //c cannot be accessed in this method  because it is local to addTwoNumbersNew method
	}

	// parameterized method
	// a and b both are local variable to the method addTwoNumbersNew
	public void addTwoNumbersNew(int a, int b) {
		int c = a + b;
		System.out.println(c);
		System.out.println(classVar);  // classVar is a class variable which can be accessed anywhere in the class
		//System.out.println(z); z cannot be accessed in this method  because it is local to addTwoNumbers method
	}

}
