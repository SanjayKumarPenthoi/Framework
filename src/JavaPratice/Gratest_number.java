package JavaPratice;

public class Gratest_number {
	public static void main(String args[]) {
		int A = 500,B= 700,C=300;
//		int B = 200;
//		int C = 300;
		if (A >= B && A >= C ) {
			System.out.println(A + " Is gratest");
		} else if (B >= C) {
			System.out.println(B + " is Gratest");
		} else {
			System.out.println(C + " is gratest");
		}
	}
}
