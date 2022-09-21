package day2;

//Program to Swap Two Numbers

public class Swapping 
{

	public static void main(String[] args)
	{
		int x=25;
		int y=50;
		System.out.println("values before swapping="+x + " " +y);
		
		int temp= x;
		x=y;
		y=temp;
		System.out.println("values after swapping="+x + " " +y);
		
		}

}
