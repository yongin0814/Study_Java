// 양의 정수 두개 입력받고, 그 두 사이의 모든 소수 출력하기


/* 필요한 기능
 * 
 * 1. 값 입력받기
 * 2. 소수 구하기
 * (3. 구한 소수 출력하기)
 * */

/* 알아야 하는 것
 * 
 * 소수란 = 1과 자기자신을 제외하고는 어떤 수로도 나누어 떨어지지 않는 2이상의 양의 정수
 * 나누어 떨어진다는 것 = 나누었을 때 나머지가 0이다
 * 즉, 소수란 = 1과 자기 자신을 제외한 어떤 수로 나누든 나머지가 반드시 존재한다. 모든 나머지가 0이아님
 * */
import java.util.*;

public class Midterm_HW02 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int start, end, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Finding Prime Number ***");
		System.out.println("We will print all the prime numbers between X and Y");
		
		// 0, 1, 음수일때 다시 입력하게하는거
		do
		{
			System.out.print("Enter X value(Positive Integer):");
			start = sc.nextInt();
		}
		while(start <= 1 );
		do
		{
			System.out.print("Enter Y value(Positive Integer):");
			end = sc.nextInt();

		}
		while(end <= 1 || end <= start );



	
		total = CheckFromStartToEnd(start, end);
		if(total == 0) System.out.print("No Prime Number");

		

		
	}
	
	
	// B. start ~ end 까지 소수 체크해주기
	public static int CheckFromStartToEnd(int s, int e)
	{
		int start = s;
		int end = e;
		int total=0;
		boolean isPrime;
		
		for( int i = start ;i<=end;i++)
		{
			isPrime = LeftOver(i);
			if(isPrime == true)
			{
				System.out.print(i+" ");
				total++;
			
			}

		}
		return total;


	}
	
	// C. 2 ~ 자기자신의 직전까지 나눠만주는 메소드. 
	// 여기서 하나라도 나머지가 0이면 바로 false 해주고 이 메소드 나가기
	public static boolean LeftOver(int a)
	{
		int up = a;
		int leftOver;
		boolean isPrime = true;
		
		for(int down =2;down<up-1;down++)
		{
			leftOver = up%down;
			
			if(leftOver == 0)
			{
				isPrime = false;
				return false;
			}
		}
		isPrime = true;
		return true;
	}
	
}
