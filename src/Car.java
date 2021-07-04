//Class designed for learning Object oriented programming concepts : Class and Object
//Car is a class that creates an object which has a color,speed and model number
public class Car {
	public String carColor;
	public int carSpeed;
	public int modelNumber;
	
	public void increaseSpeed(int value) {
		this.carSpeed+=value;
	}
	public void decreaseSpeed(int value) {
		this.carSpeed-=value;
	}
	public void stop() {
		this.carSpeed=0;
	}
	public Car(String carColor, int carSpeed,int modelNumber){
		// TODO Auto-generated constructor stub
		this.carColor=carColor;
		this.carSpeed=carSpeed;
		this.modelNumber=modelNumber;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("blue",50,1);
		System.out.println(car1.carSpeed);
	}

}
