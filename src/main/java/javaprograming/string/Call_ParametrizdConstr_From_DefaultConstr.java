package javaprograming.string;

public class Call_ParametrizdConstr_From_DefaultConstr {

	public static void main(String[] args) {
		
		Call_ParametrizdConstr_From_DefaultConstr a = new Call_ParametrizdConstr_From_DefaultConstr();

	}
	
	Call_ParametrizdConstr_From_DefaultConstr(){
		this("Calling Parametrzied constructor from Default");
		System.out.println("Default constructor ");
	}
	
	Call_ParametrizdConstr_From_DefaultConstr(String str){
		System.out.println("Parameterzied constructor :" + str);
	}
	

}
