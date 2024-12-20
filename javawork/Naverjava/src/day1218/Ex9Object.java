package day1218;

class Car
{
	static String carCompany="현대";
	
	private String carName;
	private int carPrice;
	
	public static void setCarCompany(String carCmpany)
	{
		//static 메서드에서는 static 변수만이 접근 가능하다
		Car.carCompany = carCompany; //기본은 현대지만 변경이 가능하다
	}
	
	//setter , getter는 기본으로 만들어두는게 좋음 호출시 필요
	public void setCarName(String carName)
	{
		this.carName = carName;
		
	}
	
	public void setCarPrice(int carPrice)
	{
		this.carPrice = carPrice;
	}
	
	// getter method 규칙 (private일때 사용하낭?
	public String getCarName()
	{
		return carName; //this는 생략 가능 -> 중복되는게 없어서 가능한건가??
	}
	
	public int getCarPrice()
	{
		return carPrice; 
	}
	
	//두가지 한꺼번에 변경할 경우 호출
	public void setData(String carName, int carPrice)
	{
		this.setCarName(carName);
		this.setCarPrice(carPrice);
	}
}

public class Ex9Object {
	
	public static void writeCarInfo(Car myCar)
	{
		System.out.println("=".repeat(30));
		System.out.println("자동차명 : "+myCar.getCarName());
		System.out.println("가    격 : "+myCar.getCarPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("현재 자동차회사명: "+ Car.carCompany);
		
		Car.setCarCompany("삼성");
		System.out.println("변경된 자동차 회사명: "+Car.carCompany);
		
		Car car1 = new Car();
		car1.setCarName("그랜져");
		car1.setCarPrice(3900);
		
		Car car2 = new Car();
		car2.setData("소나타", 3200);
		
		Car car3 = new Car();
		car3.setCarName("Mini");
		car3.setCarPrice(5000);
		
//		System.out.println("car1 자동차명 : "+ car1.getCarName());
//		System.out.println("car1 가격 : "+car1.getCarPrice());//?오류남
//		System.out.println("=".repeat(30));
//		System.out.println("car2 자동차명 : "+ car2.getCarName());
//		System.out.println("car1 가격 : "+car2.getCarPrice());//?오류남
		
		writeCarInfo(car1);
		writeCarInfo(car2);
		writeCarInfo(car3);
		
		

	}

}
