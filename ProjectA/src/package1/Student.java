package package1;

public class Student 
{           //  {} indicate boundary(body) of the class

	int deepak;  // deepak is a variable, it will store integer value
	public void display()  // display is a method,() indicate method
	{
	 System.out.println("Welcome to all of you");	
	}
	
	public static void main(String[] args) 
	{
		Student abc=new Student();
		abc.display();
		abc.display();
		abc.deepak=334;
		System.out.println("value of deepak "+abc.deepak);
	}
}
