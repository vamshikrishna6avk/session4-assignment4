package assignment4;

import java.util.Scanner;

public class GradeOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.parseInt (args[0]));
		/*
		 * here we are passing argument of 0 1 2 3 
		 * after running the program the argument of zero is o and the ASCII VALUE of ZERO is o
		 * 
		 */

	     int n1 =Integer.parseInt (args[0]);
	                if (n1 == 0) {
	                        System.out.println("You have entered ZERO ");  // be
	                        String char1 = null;
	                        System.out.println("ASCII value of n1 is" + (char1));
	                } else if (n1 < 0) {
	                        System.out.println("You have entered Negetive value ");
	                } else {
	                        System.out.println("You have entered positive value ");
	                }
	                Scanner sc = new Scanner(System.in);

	                System.out.print("Enter the marks of P ");
	                int num1 = sc.nextInt(); // here we are taking scanner to assign the value of p

	                System.out.print("Enter the marks of C ");
	                int num2 = sc.nextInt();// here we are taking scanner to assign the value of c

	                System.out.print("Enter the marks of M");
	                int num3 = sc.nextInt();// here we are taking scanner to assign the value of M
	                int p = num1, c = num2, m = num3,average;
	                average = ((p + c + m) / 3)*100; // this the the average formula for taking the average of the given subjects
	                if (average >= 70) {
	                        System.out.println("Grade A"); //by taking nested if loop we are dividing the grades of the average
	                }

	                        if ((average >= 61) && (average < 70)) {
	                                System.out.println("Grade B");
	                        }
	                                if (average < 61) {
	                                        System.out.println("Grade C");
	                                }
	}

}
