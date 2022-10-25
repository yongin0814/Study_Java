// 학생 이름과 성적을 입력받아서 등급을 표시하기 


/* 필요한 기능은
 * 1. 성적 입력받기
 * 2. 성적이 이상하게 나왔을 시 정정 요청하기
 * 3. 성적이 잘 나오면 등급 매기기 */


import java.util.*;

class GetScore // 클래스는 ()도 없고, 반환형도 없다
{
	Scanner sc = new Scanner(System.in);
	String name, grade; // 스트링에서 S는 대문자
	int score;
	
	// 이름 입력받기
	public String Name() // 반환형 반드시 써주기. 없으면 void로
	{
		System.out.println(" your name "); // 이상하게 이거는 class 만들면 바로 안되고 이렇게 하나 들어가야 되네 
		name = sc.nextLine();
		
		return name;
	}
	
	// 점수 입력받기
	public int Score()
	{
		
		do 
		{
			System.out.print(" your score "); // 이상하게 이거는 class 만들면 바로 안되고 이렇게 하나 들어가야 되네 
			score = sc.nextInt();
		}
		while(score<0 || score >100);
		
		
		
		return score;
	}
	
	// 등급 나누기
	public String Grade() // 같은 class 내부면 private이라도 호출 가능 
	{
		Score();
		
		if(score <= 30) grade = "C";
		else if(score <= 60) grade = "B";
		else if(score <= 100) grade = "A";
		
		return grade;
	}
	
	// 출력하기
	public void Result() // 이거 하나만으로 위의 class들을 쓸 수 있다. 
	{
		Name();
		// Score(); 이게 들어가 있으면 Grade 내부에도 이미 Score이 들어가있기 때문에 점수가 정상적으로 입력 안됨
		Grade();
		System.out.print(name+"'s grade is"+grade);
		
	}
	
}

public class Midterm_ex3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		GetScore student = new GetScore(); // 이렇게 클래스 하려면 메모리에 찍어줘야한다 
		student.Result();


	}

}

