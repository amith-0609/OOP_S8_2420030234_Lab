package Lab1;

import java.util.Scanner;

public class addition_Of_Numbers {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Morning Shift Earnings : ");
		int morningShiftEarnings = sc.nextInt();
		
		System.out.print("Enter the Evening Shift Earnings : ");
		int eveningShiftEarnings = sc.nextInt();
		
		System.out.println("The total amount earned in a day : "+(morningShiftEarnings+eveningShiftEarnings));
		
		
		
		
		
	}
}
