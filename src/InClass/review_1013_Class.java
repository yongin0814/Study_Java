package InClass;
import java.util.*;


class Student
{
	// 필요한 데이터
	String name, location; //이름, 현재위치
	int grade, room, score; // 학년, 반, 성적
	
	//정보 받아야해 스캐너 선언
	Scanner sc;
	
	// 생성자
	public Student() 
	{
		// 여기에는 매개변수가 없으니까 sc만 초기화 해줘야지 
		sc = new Scanner(System.in); // 스캐너 메모리에 찍기
	}
	
	
	// 각각의 변수에 값 넣어주기 
	public void Input()
	{
		System.out.println("*** 학생의 정보를 입력하세요 ***");
		System.out.print("학생의 이름은 : ");
		name = sc.nextLine(); // 스캐너 사용해서 이름 받아오기 

		System.out.print("학생의 현재 위치는 : ");
		location = sc.nextLine();
		
		System.out.print("학생의 학년은 : ");
		grade = sc.nextInt();
		
		System.out.print("학생의 반은 : ");
		room = sc.nextInt();
		
		System.out.print("학생의 성적은 : ");
		score = sc.nextInt();
		
	}
	
	public void Print()
	{
		System.out.println(name+" 학생은 "+grade+"학년 "+room+"반 입니다.");
		System.out.println("이 학생의 성적은 "+score+"점 입니다.");
		System.out.println("이 학생은 현재 " + location+"에 있습니다.");
	}
	
	public void GO()
	{
		
		Input();
		Print();
	}
}

public class review_1013_Class 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student student = new Student();
		student.GO();

	}

}