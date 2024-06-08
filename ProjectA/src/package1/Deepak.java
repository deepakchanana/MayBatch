package package1;

public class Deepak
{
	int abc;  // abc is a variable
	public void me1()
	{
		System.out.println("Welcome guys ");
		System.out.println("changes done");
	}
	public static void main(String[] args) 
	{
	  Deepak ob=new Deepak();
	  ob.me1();  // calling the method
	  ob.abc=344;
	  System.out.println("value -- "+ob.abc);
	}

}
