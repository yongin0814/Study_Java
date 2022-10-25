package InClass;
/* 오늘 배운 것은 숫자와 문자를 입력받아서 이를 조합한 문장으로 출력하는 것 */

import java.util.Scanner; // 자바 불러오기

public class review_0919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); // 입력 받아올 변수 선언하기
		String name; // 이름
		int age; // 나이
		
		System.out.print("이름을 입력하세요 : "); // 출력 + 가이드
		name = scanner.nextLine(); // 입력 + 변수에 할당
		
		System.out.print("나이를 입력하세요 : "); // 출력 + 가이드
		age = scanner.nextInt(); // 입력 + 변수에 할당
		
		System.out.print(name+"님. 어서오세요, "+age+"살이시군요 !"); // 조합한 문장으로 출력
		
		
	}

}
