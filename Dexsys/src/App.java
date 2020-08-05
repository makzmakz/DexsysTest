import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException; 

public class App {
	public static void main(String [] args) {	
		task1();
		//task2();
		
	}
	
	public static void task1() {		
		random_array();
		restart();
		
	}
	public static void task2() {
		initMmethod();
		printAllArrays();
		printType();
		anyMore();
		clearType();
		merge();
		help();
	}
	
	
	public static void random_array() {
		String exceptions = "";
		ArrayList<Double> myNumbers = new ArrayList<Double>();
		ArrayList<Double> divisionWithoutRemainderBy3 = new ArrayList<Double>();
		ArrayList<Double> divisionWithoutRemainderBy7 = new ArrayList<Double>();
		ArrayList<Double> divisionWithoutRemainderBy21 = new ArrayList<Double>();
		
		do {
			exceptions = "";
			
			Scanner myInput = new Scanner(System.in);
			System.out.println("Enter how many random numbers from 0 to 100 you want to include in the array");

			try {
				int numbersNeeded = myInput.nextInt();	
				
				for (int i = 0; i < numbersNeeded; i++) {
					  myNumbers.add((double) Math.round((Math.random()*100)));			  
					}		
				
				}		
				catch(InputMismatchException e) {
					System.out.println("Invalid input. Try again");
					exceptions = e.toString();
				}	
			
			if (exceptions != "java.util.InputMismatchException") {
				
				for (int i = 0; i < myNumbers.size(); i++) {
					if (myNumbers.set(i, myNumbers.get(i))%3==0) {				
						divisionWithoutRemainderBy3.add( myNumbers.set(i, myNumbers.get(i)));
						}
					
					if (myNumbers.set(i, myNumbers.get(i))%7==0) {
						divisionWithoutRemainderBy7.add(myNumbers.set(i, myNumbers.get(i)));
						}
					
					if (myNumbers.set(i, myNumbers.get(i))%21==0) {
						divisionWithoutRemainderBy21.add(myNumbers.set(i, myNumbers.get(i)));
						}
					
				    }
				
				System.out.println("Your random array");
				System.out.println(myNumbers);
				System.out.println("divisionWithoutRemainderBy3");
				System.out.println(divisionWithoutRemainderBy3);
				System.out.println("divisionWithoutRemainderBy7");
				System.out.println(divisionWithoutRemainderBy7);
				System.out.println("divisionWithoutRemainderBy21");
				System.out.println(divisionWithoutRemainderBy21);
				
			}		
			
		}while (exceptions == "java.util.InputMismatchException");
		
	}
	public static void restart() {
		String answer = "";
		
		answer = "";
		Scanner myInput2 = new Scanner(System.in);
		System.out.println("Want to recalculate the array? Yes/No. Press Y(y)/N(n).");
		answer = myInput2.nextLine();
		System.out.println(answer);

		if (answer.equals("Y") || answer.equals("y")) {
			random_array();
			restart();
		}else if (answer.equals("N") || answer.equals("n")) {
			System.out.println("You are quit the programm");
		}else {
			System.out.println("Invalid input. Try again");				
			restart();
				
		}
	
	}

	public static void initMmethod() {
		//List<Integer> array1 =  Arrays.asList(1,2,3,4,5);
		 
		Array[] arrays = {new Array( )};
		System.out.println(array1);
	}
	public static void printAllArrays() {}
	public static void printType() {}
	public static void anyMore() {}
	public static void clearType() {}
	public static void merge() {}
	public static void help() {}
	
}
	
	

