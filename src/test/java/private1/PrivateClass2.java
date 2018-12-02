package private1;

public class PrivateClass2 {

	public static void main(String[] args) {
		PrivateClass1 classOb = new PrivateClass1();
		//System.out.println(classOb.surName);
		//private members can be accessed within the same class , not outside the class
		//surName String of PrivateClass1 cannot be accessed in PrivateClass2

	}

}
