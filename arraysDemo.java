package javaProject;

public class arraysDemo {

	public static void main(String[] args) {
		
				String student1="robin";
				String student2="ted";
				String student3="barney";
				String student4="lily";
				String student5="marshall";
				
				System.out.println(student1);
		        System.out.println(student2);
		        System.out.println(student3);
		        System.out.println(student4);
		        System.out.println(student5);
		        
		        
		        System.out.println("---------------------");
		        
		        String[] students=new String[5];
		        students[0]="robin";
		        students[1]="ted";
		        students[2]="barney";
		        students[3]="lily";
		        students[4]="marshall";
		        
		        for(int i=0;i< students.length;i++) {
		        	System.out.println(students[i]);
		        	
		        }
		        
		        System.out.println("---------------");
		        
		        for(String student :students) {
		        	System.out.println(student);
		        }
			}
		        

		

}
