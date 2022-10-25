// 1부터 20 사이 임의의 난수 만들고 그 수 맞히기 

/* 필요한 기능 
 * 1. 컴퓨터가 난수 생성하기
 * 2. 난수 입력받기
 * 3. 컴이 생성한 난수랑 입력받은 난수랑 비교해주기 */

import java.util.*;

public class Midterm_ex4 {

	public static void main(String[] args) 
	{
		int answer, random;
		boolean correct = false;
		
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

			if(answer > 20 || answer < 0)  System.out.println("Out of range");
			
			else if ( random > answer ) System.out.println("My number is bigger than yours");
			else if ( random < answer ) System.out.println("My number is smaller than yours"); 
			else if ( random == answer ) 
				{
					System.out.println("Congratulations, you got it right"); 
					correct =true;
				}

		}
		while(correct == false);




	}
	
	// 난수 만들기
	/* Random random = new Random(); // 난수 만들어주고 
	 * int randnumber = random.nextInt(10); // 변수에다가 난수 넣어주기
	 * 
	 * Scanner이랑 사용하는 방법이 동일하다. 
	 * 		  
	 * 만약 seed를 설정해주고 싶으면
	 * 
	 * long seed = System.currentTimeMills();
	 * Random rand = new Random(seed); 
	 * 
	 * 만약 seed 생성 후 변경시켜주고 싶으면
	 * rand.setSeed(System.currentTimeMills());
	 * 
	 * */
	
	/* 균일한 분포의 난수를 만들고 싶으면
	 * 
	 *  - boolean nextBoolean() : 균일한 분포의 boolean 형 난수 발생
	   	- int nextInt() : 균일한 분포의 int 형 난수 발생(int 전 범위에서 난수가 발생합니다.)
		- long nextLong() : 균일한 분포의 long형 난수 발생(long 점 범위에서 난수가 발생합니다.)
		- int nextInt(int n) : 균일한 분포의 0이상 n 미만의 int형 난수 발생
		- float nextFloat() : 균일한 분포의 0.0이상 1.0 미만의 float형 난수 발생
		- double nextDouble() : 균일한 분포의 0.0이상 1.0 미만의 double형 난수 발생
		- double nextGaussian() : 정규 분포의 난수를 발생합니다.(평균이 0이고, 표준편차가 1인 분포 입니다.)
	 	
	 	*int random = rand.nextInt(10); 하면, 0부터 9사이의 난수를 발생시킬 수 있게된다. 
	 	*/


}
