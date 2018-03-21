import java.util.Scanner;


public class Problem_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first set of numbers");
		String input1 = scan.nextLine();
		System.out.println("Enter second set of numbers");
		String input2 = scan.nextLine();
		scan.close();
		
		// split numbers
		
		
		
		String[] first = input1.split(" ");
		String[] second = input2.split(" ");
		
		int[] first_int = new int[first.length - 1];
		int[] second_int = new int[second.length - 1];
		
		for(int i = 0; i<first.length-1; i++){
			first_int[i] = Integer.parseInt(first[i]);
		}
		for(int i = 0; i<second.length-1; i++){
			second_int[i] = Integer.parseInt(second[i]);
		}
		System.out.println(first_int[0]);
		System.out.println(second_int[0]);
		
	}

}
