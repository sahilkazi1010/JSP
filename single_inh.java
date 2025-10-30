class Student
{
	String s_name;
	int roll_no;
	void get_info(String s,int i)
	{
		s_name=s;
		roll_no=i;
	}
}
class Test extends Student
{
	int m1,m2;
	double avg;
	void get_test(int a,int b)
	{
		m1=a;
		m2=b;
	}
	void show_result()
	{
		avg=(m1+m2)/2;
		System.out.println("Name is"+s_name+"Roll no is"+roll_no+"Average is"+avg);
	}
}
public class single_inh
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.get_info("Sahil",2201);
		t1.get_test(70,80);
		t1.show_result();
		Test t2=new Test();
		t2.get_info("Affan",2213);
		t2.get_test(75,60);
		t2.show_result();
	}
}
	
	