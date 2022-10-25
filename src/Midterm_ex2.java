// 두개의 정수를 입력하고 두 수의 사칙연산 구하기. 나눗셈은 몫만

import java.util.*;

public class Midterm_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int first, second, plus, minus, multi, divide, answer;
		int score = 0;
		
		System.out.print("first num ");
		first = sc.nextInt();

		System.out.print("second num ");
		second = sc.nextInt();
		
		plus = first + second;
		minus = first - second;
		multi = first * second;
		divide = first / second;

		System.out.print(first+ "+"+second+"=");
		answer = sc.nextInt();
		if(answer == plus)score++;
		
		System.out.println(first+ "-"+second+"=");
		answer = sc.nextInt();
		if(answer == minus)score++;
		
		System.out.println(first+ "*"+second+"=");
		answer = sc.nextInt();
		if(answer == multi)score++;
		
		System.out.println(first+ "/"+second+"=");
		answer = sc.nextInt();
		if(answer == divide)score++;
		
	System.out.println("you got " + score + "answer");
	System.out.println("average score is" + (100*(float)score/4));
	
	}

}
