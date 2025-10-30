class Student
{
	private String name;
	private int rollno;
	
public void setData(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
}
public void getData()
{
	System.out.println("Student name:"+name);
	System.out.println("Student rollno:"+rollno);
}
}
public class c_object
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setData("Sahil",90);
		s.getData();
    }
}
	
