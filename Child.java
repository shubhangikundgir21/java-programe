package inheritance;

public class Child extends Parent
{
	String address;
	int s=100;
	public Child(int age,String name,String address)
	{
		super(age,name);//call parent constructor
		this.address=address;
	}
	void display()//method overriding
	{
		System.out.println("s="+s);
		System.out.println("s="+super.s);//parent
		System.out.println(name);//instance variable
		System.out.println(age);
		System.out.println(address);
		super.display();//parent
		
	}

}
