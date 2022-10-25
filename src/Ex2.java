
import java.util.*;
import java.util.ArrayList;

public class Ex2 {
	
	static int howMany=0;

	public static void main(String[] args) 
	{
		// 시작
		System.out.println("*** Finding Prime Number ***");
		System.out.println("We will print all the prime numbers between X and Y");
		
		// 각종 변수 정의
		int x,y,randomNum,primeNum;
		boolean isPrime;
		Scanner sc = new Scanner(System.in);

		
		
		// 값 받기
		System.out.print("Enter X value(Positive Integer):");
		x = sc.nextInt();
		
		while(x<=1) 
		{	System.out.print("Enter X value(Positive Integer):");
			x = sc.nextInt();
		}
		
		System.out.print("Enter Y value(Positive Integer):");
		y = sc.nextInt();
		
		while(y<=1 || y<=x) 
		{	System.out.print("Enter Y value(Positive Integer):");
			y = sc.nextInt();
		}
		
		//int[] primeList = new int[y-x+1];

		
		for ( int i = x ; i <= y ; i++)
		{
			
			is_prime(i);
			
			
		}
		if( howMany == 0 )
		{
			System.out.print("No Prime Number");
		}
			
	}
	
	

	public static void is_prime(int number) 
	{
		 		
		// 위 반복문에서 
		for(int i = 2; i < number; i++) 
		{        

			// 약수를 갖고 있으면 소수가 아니다
			if(number % i == 0) 
			{
				return ;
			}
		}
		// 약수를 갖고 있지 않으면 소수다
		System.out.print(number + " ");
		howMany++;
		return;
	}
	

}
	


