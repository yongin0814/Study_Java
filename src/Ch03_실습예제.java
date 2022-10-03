import java.util.Scanner;


public class Ch03_실습예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int width;
		int height;
		
		System.out.print("사각형의 가로를 입력하세요");
		width = scanner.nextInt();
		
		System.out.print("사각형의 세로를 입력하세요");
		height = scanner.nextInt();
		
		System.out.print("사각형의 넓이는 " + width*height); 

		System.out.print("사각형의 둘레는는 " + 2*(width+height));


	}

}
