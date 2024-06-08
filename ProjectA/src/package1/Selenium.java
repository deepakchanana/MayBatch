package package1;

// constructor is like method
// constructor name and class name will be same
// no need to call, as we create the object it will call automat
// no return type


public class Selenium 
{
  public Selenium() 
  {
	System.out.println("Default constructor...");
  }
  
  public Selenium(int a) 
  {
	  this(44,555); // control will go to two param constructor
	System.out.println("one parameterized constructor...");
  }
  
  public Selenium(int a,int b) 
  {
	  this();  // control will go to default constructor
	System.out.println("two parameterized constructor...");
  }
  public static void main(String[] args) 
  {
	Selenium ob1=new Selenium(88); // control will go to one paramet
	
  }
  
}
