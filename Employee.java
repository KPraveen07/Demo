package Assignment2;

//Write a program that would print the information (name,
//year of joining, salary, address) of three employees by creating a class named 'Employee'.

import java.util.Scanner;
public class Employee {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //System.out.println("name" + "\t"+"Year of joining " + "\t" + "Address");
    System.out.println("Enter Name of Employee :");
    String A1=sc.next();
    System.out.println("year of joining :");
    int A2=sc.nextInt();
    System.out.println("Enter Address of Employee :");
    String A3=sc.next();



   
    System.out.println("Enter Name of Employee :");
    String B1=sc.next();
    System.out.println("year of joining :");
    int B2=sc.nextInt();
    System.out.println("Enter Address of Employee :");
    String B3=sc.next();



   
    System.out.println("Enter Name of Employee :");
    String C1=sc.next();
    System.out.println("year of joining :");
    int C2=sc.nextInt();
    System.out.println("Enter Address of Employee :");
    String C3=sc.next();
    
    System.out.println("name" + "\t"+"Year of joining "+"\t" +"Address");
    System.out.println(A1 + "\t" + A2 + "\t" + A3);
    System.out.println(B1 +"\t" + B2+ "\t" + B3);
    System.out.println(C1 +"\t" + C2+ "\t" + C3);
    }
}
