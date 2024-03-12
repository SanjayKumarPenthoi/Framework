package JavaPratice;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number");
		int A = obj.nextInt();
		System.out.println("Enter second number");
		int B = obj.nextInt();
		System.out.println("If you want to addition press 1");
		System.out.println("If you want to substrakt press 2");
		System.out.println("If you want to multiply press 3");
		System.out.println("If you want to division press 4");
		int Sanjay = obj.nextInt();
		switch (Sanjay) {
		case 1:
			System.out.println(A + B);
			break;
		case 2:
			System.out.println(A - B);
			break;
		case 3:
			System.out.println(A * B);
			break;
		case 4:
			System.out.println(A / B);
			default :System.out.println("Unexpected value: " +Sanjay);
		}
	}
}
