package inheritance;

public class Parent
{
	int age; 
	String name;
	int s=90;
	public Parent(int age, String name)//local variable
	{
		this.age=age;
		this.name=name;
	}
	void display()
	{
		System.out.println(age);//instance variable
		System.out.println(name);
	}
}
