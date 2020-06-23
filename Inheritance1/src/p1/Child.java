package p1;

public class Child extends Parent
{

	public void sub()
	{
		int m=a-b;
		
		System.out.println("SUb"+m);
		
	}
	
	
	public static void main(String[] args)
	{
		Child ob=new Child();
		ob.sub();
		ob.add();
		// TODO Auto-generated method stub

	}

}
