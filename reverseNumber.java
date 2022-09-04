package SowmiyaDay1;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.print("The reverse number is : ");
		reverse(num);

	}
	
	public static void reverse(int number) {
		if(number<10) {
			System.out.println(number);
			return;
		}else {
//			123%10 =3
			System.out.print(number%10);
//			123/10 = 12
			reverse(number/10);
		}
	}

}
