import java.util.Arrays;
import java.util.Scanner;
public class GPAcalc {

	public GPAcalc(String c, int g) {
	}
	public static void main(String [] args ) {
		//TODO Auto-generated method stub
			
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of courses: ");
		n = input.nextInt();
		while (!(n <=6 && n >=1)) {
			System.out.println("Amount entered is invalid, please re-renter number of courses: ");
			n = input.nextInt();
		}
	//making an array and scanner to store values	
	//	GPAcalc[] GPA = new GPAcalc [n];
		String course [] = new String [n];
		Scanner course1 = new Scanner(System.in);
		int grade [] = new int [n];
		Scanner grade1 = new Scanner(System.in);
		
		String C;
		int G;
		double GPAsum=0;
	//Input of courses and grades
		for(int i = 0; i <= n-1 ; i++) {
			System.out.println("Enter course name: ");
			C = course1.nextLine();
			System.out.println("Enter grade out of 100 for " + C + ": ");
			G = grade1.nextInt();
			while (!(G <=100 && G >=1)) {
				System.out.println("Amount entered is invalid, please re-renter grade: ");
				G = input.nextInt();
			
			}	
		
		// Adding all the grades together to then calculate the avg
		GPAsum = GPAsum+G;	
		course[i]=C;
		grade[i]=G;
		
	
			}
	System.out.println("Course Name : Grade");	
	for(int i = 0; i<=n-1;i++) {
		System.out.println(course[i] + " :" + grade[i]);  
				
	}
	//Finding Avg	
		GPAsum = GPAsum/n;
		
	//Printing out the outcome
		if (GPAsum >= 80) {
	    	System.out.println("Semester average: " + GPAsum + " Passed with honors!");
	    }
	  
	    if (GPAsum >= 50 && GPAsum < 80) {
	    	System.out.println("Semester average: " + GPAsum + " Passed!");		
			}
	  
	    if (GPAsum < 50) {
	    	System.out.println("Semester average: " + GPAsum + " Failed, sorry :(");	
	    }	
		
			
		}
	}



