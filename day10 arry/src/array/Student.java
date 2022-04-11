package array;

public class Student
{
	
	int roll_no;
	String name;
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	public static void main(String[] args) 
	{
	        Student []arr;
			arr=new Student[4];
			arr[0]=new Student(1,"shankar");
			arr[1]=new Student(2,"irfan");
			arr[2]=new Student(3,"reshma");
			arr[3]=new Student(4,"preeti");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(" Element at "+i+ ":"+ arr[i].roll_no +" "+ arr[i].name);
			}
	}

}
