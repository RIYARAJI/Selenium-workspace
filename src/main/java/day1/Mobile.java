package day1;

public class Mobile {
	//makeCall method
	public long makeCall(long number) {
		System.out.println("The number is");
		return number;
	}
	
	//sendSMS method
	public String sendSMS(String text) {
		System.out.println("Get Text");
		return text;
	}
	
	//shutDown method
	public boolean shutDown() {
		System.out.println("Mobile ShutDown");
		return true;
	}
	
	public static void main (String[] args) {
		Mobile android = new Mobile();
		
		//Call method 1
		long no = android.makeCall(9876543210L);
		System.out.println(no);
		
		//Call method 2
		String txt = android.sendSMS("Hello! How are you?");
		System.out.println(txt);
		
		//Call method 3
		boolean result = android.shutDown();
		System.out.println(result);
		
	}
	
}
