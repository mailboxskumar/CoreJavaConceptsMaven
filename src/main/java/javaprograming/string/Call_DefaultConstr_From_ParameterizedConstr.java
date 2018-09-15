package javaprograming.string;

public class Call_DefaultConstr_From_ParameterizedConstr {

	public static void main(String[] args) {
		
		Call_DefaultConstr_From_ParameterizedConstr b = new Call_DefaultConstr_From_ParameterizedConstr(1);
		
	}
	
	Call_DefaultConstr_From_ParameterizedConstr(){
		System.out.println("Default Constr");
	}
	
	Call_DefaultConstr_From_ParameterizedConstr(int a){
		this();
		System.out.println("parameterized Constr " + a);
	}
	

}
