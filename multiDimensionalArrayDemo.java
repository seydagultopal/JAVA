package javaProject;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
String[][]cities= new String[3][3];
		
		cities[0][0]="new york";
		cities[0][1]="amsterdam";
		cities[0][2]="istanbul";
		cities[1][0]="los angeles";
		cities[1][1]="london";
		cities[1][2]="berlin";
		cities[2][0]="rome";
		cities[2][1]="washington";
		cities[2][2]="new jersey";
		
		for(int i=0;i<3;i++) {
			System.out.println("-----------------");
			for(int j=0;j<3;j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
