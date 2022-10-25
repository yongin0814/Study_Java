// 피보나치 수열 출력하는 메소드 만들고 호출하기 

/* 필요한 기능
 * 1. 값 입력받기
 * 2. 입력받은 값 만큼의 피보나치 수열 계산
 * 3. 피보나치 수열 출력*/

import java.util.*;

public class Midterm_ex6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.print("How many print fbnc Sequence?");
		int h;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			h = sc.nextInt();

		}
		while(h<=0);
		
		Fibonacci(h);

	}
	
	// 피보나치 수열 출력하기
	public static void Fibonacci(int h)
	{
		int howMany = h;
		
		// 배열 만들어주기. howMany 만큼
		int[] fibonacci = new int[howMany];
		
		// 배열 채워넣어주기
		for (int i=0;i<howMany;i++)
		{
			if(i==0 || i==1) // 첫번째, 두번째는
			{
				fibonacci[i] = 1;				
			}
			else // 그 이후는 
			{
				fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
			}
			
			// 계속 출력
			System.out.print(fibonacci[i]);
		}
		
		

		
		
		
	
	}

}
