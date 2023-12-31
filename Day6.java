/*  You are given an integer 'n'.
	Return true if 'n' is an Armstrong Number, and 'false' otherwise.
*/

import java.util.Scanner;

public class Main {
	private static boolean check_Armstrong(int n){
		int digit=0;
		int n1=n;
		int sum=0;
		int temp=n;
		while(n1>0){
			int last_digit=n1%10;
			digit++;
			n1=n1/10;
		}
		while(temp>0){
			int rem=temp%10;
			sum+=Math.pow(rem,digit);
			temp=temp/10;
		}
		if (n==sum){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check_Armstrong(n));

	}
}