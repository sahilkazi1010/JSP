class Student
{
	String name;
	int age;
	Student()
	{
		name = "unknown";
		age = 0;
	}
	Student(String n)
	{
		name = n;
		age = 18;
	}
    Student(String n,int a)
	{
		name = n;
		age = a;
	}
    void display()
	{
		System.out.println("Name"+ name + "Age" + age);
	}
	void display(String course)
	{
		System.out.println("Name"+name+"Age"+age+"Course"+course);
	}
}
public class method_constructor
{
	public static void main(String args[]S)
	{
		Student s1 = new Student();
		Student s2 = new Student("Sahil");
		Student s3 = new Student("Zainab",19);
		
		s1.display();
		s2.display();
		s3.display();
	}
}
		