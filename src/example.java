import java.util.*;


// 생성될 원의 좌표, 반지름 길이를 받고 출력해주기
class Point
{
	// 좌표
	private int xPos, yPos;
	
	// 생성자
	public Point(int x, int y)
	{
		// 좌표 초기화 해주기 
		xPos = x;
		yPos = y;
	}
	
	// 출력
	public void showPointInfo()
	{
		System.out.println("x Position : " + xPos);
		System.out.println("y Position : " + yPos);
	}
	
}



class Circle
{
	// 변수 만들어주기 
	private double rad;
	final double PI = 3.141592; // final은 상수값이기 때문에 외부에서 값을 바꿀수는 없다. 그냥 놔둬도 된다. 
	// 좌표만 point class에서 가지고 오면 되네
	// 지금 매개변수가 정해진게 없기 때문에 그냥 참조변수만 만들어두면 된다. new 안해도 돼
	private Point center;
	
	// 생성자
	public Circle(int x, int y, double r)
	{
		center = new Point(x,y);
		rad = r;
	}
	
	// 간단한 면적 구하기 
	public double getArea()
	{
		return PI*rad*rad;
	}
	
	// 간단한 둘레 구하기
	public double getPerimeter()
	{
		return 2*PI*rad;
	}
	
	//circle의 정보 구하기
	public void showCircleInfo()
	{
		// 안에 그냥 있는 메소드 해주면 된다
		center.showPointInfo();
		
		System.out.println("Radius : "+rad);
		System.out.println("Area : "+getArea());
		System.out.println("Perimeter : "+getPerimeter());
	}
	
}

// 여기에서는 point라는 class가 어떻게 사용되는지 보이지가 않지
// 인스턴스가 만들때 할당하든 생성자에 넣어주든 어차피 시점은 new 될떄래
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(2,2,4.2);
		c.showCircleInfo();

	}

}
