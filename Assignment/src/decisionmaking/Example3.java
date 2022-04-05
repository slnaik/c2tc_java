package decisionmaking;
//Nested_if


public class Example3 {

	public static void main(String[] args) {
		int age=18,weight=100;
		
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not Eligible for bunjee jumping");

		}

	}

}
