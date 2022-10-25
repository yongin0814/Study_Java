/* ex4의  random, answer 비교하는 것을 메소드로 처리*/
import java.util.*;

public class Midterm_ex5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int answer, random;
		boolean correct;
		
		System.out.println("*** Find Rad num***");
		System.out.println("Computer : I select one int num (1~20)");
		System.out.println("Computer : Find this num");

		Random rd = new Random();
		random = rd.nextInt(20)+1; // 1부터 해주고 싶으면 이렇게 해야하는 것 같다 

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("you : "); 
			answer = sc.nextInt();
			
			correct = YouAreWrong(answer, random);

		}
		while (correct == false);
		System.out.println("Congratulations, you got it right"); 

	}
	
	
	// 비교 메소드
	public static boolean YouAreWrong(int p, int c)
	{
		// 매개 변수 받아서 
		int player = p;
		int computer = c;
		
		// if 문과 같은 경우는 빈틈 없이 return 값으로 막아줘야 함수가 유효해진다. 
		if(player == computer) return true;
		else 
		{
			// 출력 해주고
			if(player > 20 || player < 0)  System.out.println("Out of range");			
			else if ( computer > player ) System.out.println("My number is bigger than yours");
			else if ( computer < player ) System.out.println("My number is smaller than yours"); 

			return false;
		}
	}

}
