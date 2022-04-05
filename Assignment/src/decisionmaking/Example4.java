package decisionmaking;



import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Rahul");
			break;
		case 'b':
			System.out.println("Aman");
			break;	
		case 'c':
			System.out.println("Kavan");
			break;
		default:
			System.out.println("Invalid input");
			
		}
		sc.close();
	}

}
