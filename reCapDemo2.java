package javaProject;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] list= {1.2,2.3,4.5,8.9,7.7,1.96};
		double total=0;
		double largest=list[0];
		
		for(double number:list) {
			if(largest<number) {
				largest=number;
			}
			System.out.println(number);
			total+=number;
		}
		
		System.out.println("total:"+total+" largest:"+largest);
		
		
		
		

	}

}
