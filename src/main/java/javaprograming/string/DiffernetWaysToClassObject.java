package javaprograming.string;

public class DiffernetWaysToClassObject {

	
	public static void main(String[] args) throws Exception {
		
		// Different to create inner class object
		DiffernetWaysToClassObject cls = new DiffernetWaysToClassObject();
		InnerClass incl	= cls.new InnerClass();
		incl.innerMethod();
		
		DiffernetWaysToClassObject.InnerClass inCls = new DiffernetWaysToClassObject().new InnerClass();
		inCls.innerMethod();
		
		InnerClass inCls0 = new DiffernetWaysToClassObject().new InnerClass();
		inCls0.innerMethod();
		
		try {
			Class innerClass1 = Class.forName("javaprograming.DiffernetWaysToClassObject$InnerClass1");
			InnerClass1 obj = (InnerClass1) innerClass1.newInstance();
			obj.innerMethod1();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void test() {
		
	}
	public class InnerClass{
		public void innerMethod() {
			System.out.println("Class Object created through New keyword");
		}
	}
	
	public class InnerClass1{
		public void innerMethod1() {
			System.out.println("Class object created through forName Method");
		}
	}


}

