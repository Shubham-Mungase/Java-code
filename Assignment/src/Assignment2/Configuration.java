package Assignment2;

public class Configuration {

	private static int configVal;
	static {
		configVal=50;	
	}
	public static void main(String[] args) {
		System.out.println("Config Value="+Configuration.configVal);
	}
}
