import java.util.*;

class Car
{
	
	// 필요한 인스턴스 변수들
	String number, model, color;	
	int gear, speed;
	
	// 값 입력받을 스캐너 선언
	Scanner sc = new Scanner(System.in);
	
	// 생성자 만들어서 변수 초기화부터 해주기 
	public Car(String n, String m, String c)
	{
		number = n;
		model = m;
		color = c;
		
		gear = 1;
		speed = 0;
	}
	
	// 기어 바꾸기. 기어가 바뀌면 속도영역이 바뀐다
	public int changeGear(int g)
	{
		if ( g==1 || g==2 || g ==3)
		{
			gear = g;
		}
		else 
		{
			gear = gear;
		}
		
		// 기어가 1단인데 속도가 50 넘으면 50으로 강제조정
		if (gear==1 && speed > 50)
		{
			speed = 50;
		}
		
		// 기어가 2단인데 속도가 80넘으면 80으로 강제조정	
		if (gear == 2 && speed > 80)
		{
			speed = 80;
		}
		
		// 기어가 3단인데 속도가 120넘으면 120으로 강제조정	
		if (gear == 3 && speed > 120)
		{
			speed = 120;
		}
		// 기어가 1단인데 속도가 0보다 작으면 0으로 강제조정
		if (gear == 1 && speed < 0)
		{
			speed = 0;
		}
			
		// 기어가 2단인데 속도가 30보다 작으면 30으로 강제조정
		if (gear == 2 && speed < 30)
		{
			speed = 30;
		}
		
		// 기어가 3단인데 속도가 50보다 작으면 50으로 강제조정
		if (gear==3 && speed < 50)
		{
			speed = 50;
		}
				
		return gear;

	}
	
	
	public int speedUp(int s)
	{
		// 현재 속도에 더해주기
		speed += s;
		
		// 기어가 1단인데 속도가 50 넘으면 50으로 강제조정
		if (gear==1 && speed > 50)
		{
			speed = 50;
		}
		
		// 기어가 2단인데 속도가 80넘으면 80으로 강제조정	
		if (gear == 2 && speed > 80)
		{
			speed = 80;
		}
		
		// 기어가 3단인데 속도가 120넘으면 120으로 강제조정	
		if (gear == 3 && speed > 120)
		{
			speed = 120;
		}
		
		return speed;
		
	}
	public int speedDown(int s)
	{
		// 현재 속도에 감해주기
		speed -= s;
		
		// 기어가 1단인데 속도가 0보다 작으면 0으로 강제조정
		if (gear == 1 && speed < 0)
		{
			speed = 0;
		}
			
		// 기어가 2단인데 속도가 30보다 작으면 30으로 강제조정
		if (gear == 2 && speed < 30)
		{
			speed = 30;
		}
		
		// 기어가 3단인데 속도가 50보다 작으면 50으로 강제조정
		if (gear==3 && speed < 50)
		{
			speed = 50;
		}
		
		
		return speed;
	}
	
	public void display()
	{
		System.out.println("License Number : "+number+" Model : "+ model +"Color : " + color );
		System.out.print("Gear Level : " + gear+"\t"+"\t");
		System.out.print("Current Speed : " + speed+"km/s"+"\n"+"\n");
	}
	
	
}


public class Project04 
{

	public static void main(String[] args) 
	{
		
		Car c1 = new Car("A123","Hyundai Cona","White");
		Car c2=new Car("C987","Kia Sportage","Red");
		
		c1.display();
		c1.speedUp(80);
		c1.display();
		c2.display();
		c2.speedUp(40);
		c2.changeGear(3);
		c2.display();
		c2.changeGear(1);
		c2.speedDown(10);
		c2.display();
		



	}

}
