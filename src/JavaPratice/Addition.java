package JavaPratice;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		obj.nextInt();
		System.out.println("Enter First number");
		int A = obj.nextInt();
		System.out.println("Enter Second Number");
		int B = obj.nextInt();
		int C = A+B;
		System.out.println("Your Addition value is "+ C);
	}

}
