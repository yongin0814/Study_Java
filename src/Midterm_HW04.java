// class 를 이용한 자동차 만들기 

/* 필요한 기능
 * 
 * 1. 기어 변경
 * 2. 속도 증가
 * 3. 속도 감소
 * 4. 자동차의 전체 상태 표시
 * 
 * */

/* 해결해야 하는 것
 * 
 * 저번 과제때도 그랬지만, 같은 class 내의 메소드를 참조하고 싶은데, 어떻게 하는 것인지 감이 안온다. 
 * 매개변수 때문이다. 매개변수가 없는 메소드는 잘 참조할 수 있다. 
 * 물론 매개변수를 없애도 되지만 교수님이 하라고 하셨기 때문에 해야한다
 * 
 * changeGear 에서 speedUp,Down만 한번씩 해주면 코드가 더 깔끔해질 수 있는데.
 * 
 * 근데 changeGear에서 speedUp, Down 해주기 위해서는 매개변수가 뭐가 되어야 하냐. 사실 매개변수 없어야하지. 왜냐하면 
 * 단순히 speed change 해주는 것이 아니라 더해주는 것이기 때문이다. 체크 스피드라는 메소드를 하나 넣어주어야 하나?
 *
 * 이렇게 하니까 되었다. 필요한 기능이 겹치면 그 기능은 빼서 함수를 하나 만든 다음에 > 그 기능이 필요한 곳에 박아주는 것이 편하다.
 *  * */

public class Midterm_HW04 
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

class Car
{
	String num, name, color;
	int gear,speed;
	
	
	// 생성자 = 초기화를 위한 메소드. 여기에 반환형 절대 void 도 넣으면 안된다.
	// 만약 반환형 넣으면 main 함수에서 new로 메모리에 콱 찍을때 적절하지 않은 class라고 해서 오류가 난다 
	
	public Car(String nu, String na, String c)
	{
		num = nu; name = na; color = c;
		gear = 1;
		speed = 0;
	}
	
	// A. 기어 조절. 진짜 기어 조절 그 잡채만 다루었음
	public int changeGear(int g)
	{
		
		// 1~3까지만 해주기
		if ( g==1 ||g==2||g==3)
		{
			gear = g;
		}
		CheckSpeed();

		
		return gear;
	}
	
	// B. 속도 올리기
	public int speedUp(int s)
	{
		speed += s;
		CheckSpeed();
		
		return speed;
	}
	
	public int speedDown(int s)
	{
		speed -= s;
		CheckSpeed();

		return speed;
	}
	
	public void CheckSpeed()
	{
		if(gear ==1) // 1단이면
		{
			if(speed > 50)
			{
				speed = 50;
				
			}
		}
		if(gear ==2) // 2단이면
		{
			if(speed > 80)
			{
				speed = 80;
			}
		}
		if(gear ==3) // 3단이면
		{
			if(speed > 120)
			{
				speed = 120;
			}
		}
		if(gear ==1) // 1단이면
		{
			if(speed < 0)
			{
				speed = 0;
			}
		}
		if(gear ==2) // 1단이면
		{
			if(speed < 30)
			{
				speed = 30;
			}
		}
		if(gear ==3) // 1단이면
		{
			if(speed < 50)
			{
				speed = 50;
			}
		}


	}
	
	public void display()
	{
		
		// 기본 정보
		System.out.print("License Number : "+ num+" ");
		System.out.print("Model : "+ name+" ");
		System.out.println("Color : "+ color+" ");
		
		System.out.println("Gear Level : "+ gear+"\t");
		System.out.println("Current Speed : "+ speed+"km/s");



	}
}


