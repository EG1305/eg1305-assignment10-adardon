

	import java.util.Arrays;
	import java.util.Scanner;


	public class Distinct {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] choice = new int[10];
			
			for (int i = 0; i< choice.length; i++){
				System.out.print("Enter integer " + (i + 1) + ":");
				choice[i] = input.nextInt();
			}
			
			System.out.println("Distinct numbers are: ");
			distinctNumbers(choice,choice.length);
		}

		private static void distinctNumbers(int[] choice, int length) {
			Arrays.sort(choice);
			
			for(int i = 0; i < length; i++){
				while (i < length - 1 && choice[i] == choice[i + 1]) 
	                i++;
				
				System.out.print(choice[i] + " ");
			}
		}

	}
