package findANumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers =new int[] { 1,2,3,4,5,6,7,8,9};
		int wanted=10;
        boolean isTrue= false;
        
        for (int number : numbers) {
        	if(number == wanted) {
        		isTrue=true;
        		break;
        	}
        }
        
        if(isTrue) {
        	System.out.println("number is avaible");
        }
        else {
        	System.out.println("number is not avaible");
        }
        
        
}
}
