
import java.util.*;


public class Ex3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// 변수 생성
		Scanner sc = new Scanner(System.in);
		int answer,x,y,type,question=0,i=1;
		int correct=0;
		float correctRate;
		
		// 시작
		System.out.println("*** Plus Calculation Test ***");
		System.out.println("You have to enter 0 or minus value to exit");
		
		
		do
		{
			// 난수 두개 및 답생성
			x =	(int)(Math.random()*(99-10+1))+10;
			y =	(int)(Math.random()*(99-10+1))+10;
			answer = x+y;
			question ++; // 문제 낸 수 			
		
			
			// 문제내고 답 받기
			System.out.print(i+":"+x+"+"+y+"=" );
			type = sc.nextInt();
			
			//맞으면 하나 올려주기 
			if(type == answer) correct++;
			i++;
			
		} 
		while(type>0);
		
		question = question -1;
		System.out.println("Your score : " + correct + "/" + question);
		
		correctRate = answer/question;		
		System.out.println("Correct Answer Rate :" +correctRate+"%");

		
		

	}
	

	

}
