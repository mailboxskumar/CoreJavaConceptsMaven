package protected2;

import protected1.ProtectedClass1;

public class ProtectedClass3 {

	public static void main(String[] args) {
		ProtectedClass1 class1 = new ProtectedClass1();
		//System.out.println(class1.name); 
		//name string having access modifier protected , so protected member cannot be visible out side package
	}

}
