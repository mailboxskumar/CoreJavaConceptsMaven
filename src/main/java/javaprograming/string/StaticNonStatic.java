package javaprograming.string;

public class StaticNonStatic
{             
    public static void main(String args[])
    {
    	StaticNonStatic obj= null;
        obj.staticMethod();
        obj.nonStaticMethod();                             
    }
     
    private static void staticMethod()
    {
        //Can be called by null reference
        System.out.println("static method, can be called by null reference");
         
    }
         
    private void nonStaticMethod()
    {
        //Can not be called by null reference
        System.out.print(" Non-static method- ");
        System.out.println("cannot be called by null reference");
         
    }
 
}