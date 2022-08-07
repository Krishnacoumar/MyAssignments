package week1.data1;

public class TwoWheeler {

	
		int noOfWheels = 2;
		short noOfMirrors = 123;
		long chassisNumber = 123456789;  
		boolean isStart = true;
		String bikeName = "Royal enfield";
		double runningKM = 34567;
		void CreatePrint()
		{
		System.out.println("No.of wheels=" + noOfWheels);
		System.out.println("No. of mirrors="+ noOfMirrors);
		System.out.println("Is the bike starting=" + isStart);
		System.out.println("Bike name="+ bikeName);
		System.out.println("Km ran="+runningKM);
		System.out.println("chassisNumber="+ chassisNumber);
		}

	
public static void main(String[] args) {
	TwoWheeler obj = new TwoWheeler();
	obj.CreatePrint();
}
}

