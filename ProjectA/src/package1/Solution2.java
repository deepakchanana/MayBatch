package package1;

public class Solution2 {
	int a,b,c,d,e;
	public void method1(int x1,int x2,int x3,int x4,int x5)
	{
	  a=x1;
	  b=x2;
	  c=x3;
	  d=x4;
	  e=x5;
	}
	public static void main(String[] args) 
	{
	 Solution2 ob1=new Solution2();
	 ob1.method1(122, 222, 113, 14, 25); // 1st call
	 System.out.println(ob1.a);  // 2nd call
	 System.out.println(ob1.b);  // 3rd call
	 System.out.println(ob1.c);  // 4th call
	 System.out.println(ob1.d);  // 5th call
	 System.out.println(ob1.e);  // 6th call
	}

}
