// 1. 직사각혀으이 둘레와 면적 구하기 

import java.util.*; // 스캐너 가져오기

public class Midterm_ex1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 변수 선언
		Scanner sc = new Scanner(System.in); // 스캐너 변수 선언하면서 메모리에 찍어버리기
		float garo;
		float sero;
		
		System.out.print(" 사각형의 가로를 입력하세요 : ");
		garo = sc.nextFloat();
		
		System.out.print(" 사각형의 세로를 입력하세요 : ");
		sero = sc.nextFloat();
		
		System.out.println(" 사각형의 넓이는  "+garo*sero);
		System.out.println(" 사각형의 둘레는 : " + 2*(garo + sero));
	}

}
