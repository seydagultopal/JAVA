package javaProject;

public class primeNumber {

	public static void main(String[] args) {
int number=100,check;
		
		for(int i=2;i<101;i++) {
			check=0;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					check=1;
				}
			}
			if(check==0) {
				System.out.println(i+"is prime number");
			}else {
				System.out.println(i+"is not prime number");
			}
		}


	}

}
