import java.util.Arrays;
import java.util.Scanner;


public class Distinct {

	public static void main(String[] args) {
		
		int[]user = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i< userInput.length; i++){
			System.out.print("Enter integer " + (i + 1) + ":");
			user[i] = input.nextInt();
		}
		
		
		System.out.println("Distinct numbers are: ");
		
		distinctNumbers(user,user.length);

		
	}

	private static void distinctNumbers(int[] user, int length) {
		Arrays.sort(user);
		
		for(int i = 0; i < length; i++){
			while (i < length - 1 && user[i] == user[i + 1]) 
                i++;
			
			System.out.print(user[i] + " ");
		}
	}

}
