package day2;

//To print average of  given five subjects marks of student and check if average >=40 print Pass else print fail

import java.util.Scanner;

public class Q9average
{

	public static void main(String[] args)
	{
		Scanner A= new Scanner(System.in);
		System.out.println("Enter marks of the subjects= ");
		int sub1= A.nextInt();
		int sub2= A.nextInt();
		int sub3= A.nextInt();
		int sub4= A.nextInt();
		int sub5= A.nextInt();
		float avg= (sub1+sub2+sub3+sub4+sub5)/5f;
		System.out.println("Average marks= " +avg);
		
		if(avg>40)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
