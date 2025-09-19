package Assignment2;

public class Car {

	private void startEngine() {
		// TODO Auto-generated method stub
		
		
		class Engine
		{
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Engine is running");
			}
		}

		Engine e=new Engine();
		e.run();
	}
	
	
	public static void main(String[] args) {
		Car c=new Car();
		c.startEngine();
	}
}
