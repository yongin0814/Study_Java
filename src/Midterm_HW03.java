// 10 - 99 까지의 정수 2개의 난수를 생성하여 사용자가 맞히는 프로그램 작성 

/* 필요 기능
 * 
 * 1. 정수 난수 2개 생성하기
 * 2. score 및 answer rate 구하기
 * */

import java.util.*;

public class Midterm_HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Plus Calculation Test ***");
		System.out.println("You have to enter 0 or minus value to exit");

		MakeRandom();
		
		
	}
	
	// A. 정수 난수 2개 생성하기. 10 ~ 99
	public static void MakeRandom()
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int times=0; // 반복 횟수
		int comput, player,score=0;

		
		// 반복해주기 
		while(true) 
		{
			// 10 - 99 여서, 0 -89까지 하고 +10 해줌
			int rand1 = random.nextInt(89)+10;
			int rand2 = random.nextInt(89)+10;
			comput = rand1+rand2;
			
			// 문제 내기
			System.out.print(times+rand1+" + "+rand2+" = ");
			
			// 정답 입력받기
			player = sc.nextInt();
			
			// 나가는지 여부 따져주기
			if(player <=0) // 0 이하의 음수를입력하면
			{
				if (times == 0) // 바로 0 입력햇으면 
				{
					System.out.println("\nYour Score : 0/0" ); // score 출력해주고
					System.out.println("Correct Answer Rate : 0.0%"); // 정답 확률 출력해주기
					
				}
				
				else
				{
					System.out.println("\nYour Score : " +score+"/"+times ); // score 출력해주고
					System.out.println("Correct Answer Rate : " + (double)score/(float)times + "%"); // 정답 확률 출력해주기

				}



				return; // 함수 실행 중지
			}

			// 한번 해준 뒤에는 times 올려주기
			times++;

			
			// 정답 체크
			if(comput == player) score++;
			

		}
		

		
		// 이것을 맞출때까지 반복해주기. 
		
	}

}
