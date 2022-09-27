package javaProject;

public class reCapDemo1 {

	public static void main(String[] args) {
		int  number1=10,number2=22,number3=88;
		int largest=number1;
		
		if(largest<number2) {
			largest=number2;
		}
		if(largest<number3) {
			largest=number3;
		}
		
		System.out.println("largest:"+largest);

	}

}
