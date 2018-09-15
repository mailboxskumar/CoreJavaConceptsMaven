package javaprograming.string;

public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
    
    Object obj = new Object();
   
 
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        System.out.println();
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
        
        //Debug the below code
        int f=1, i=2;
        while(++i<5)
           f*=i;
        System.out.println(f);
    }
}
