import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		System.out.println("Enter a series of 5 numbers from 0 to 9.");

		int[] series = new int[5];
		series = getValues();

		int[] lotteryArray = new int[5];
		lotteryArray = getLottery();
		System.out.print("\nThe lottery numbers are: ");

		for (int i : lotteryArray) {
			System.out.print(i + " ");
		}

		int matched = compareNumbers(series, lotteryArray);
		System.out.println("\nYou matched " + matched + " numbers");
		
		if (matched > 0) {
			System.out.println("The matching numbers are: ");
			printMatchedNumers(series, lotteryArray);
		}
}

	private static void printMatchedNumers(int[] series, int[] lotteryArray) {
		for (int i = 0; i < series.length; i++) {
			if (series[i] == lotteryArray[i]) {
				System.out.print(series[i] + " ");
			}
		}

	}

	private static int compareNumbers(int[] series, int[] lotteryArray) {
		int matching = 0;
		for (int i = 0; i < series.length; i++) {
			if (series[i] == lotteryArray[i]) {
				matching++;
			}
		}
		return matching;
	}

	private static int[] getLottery() {
		int[] randomNumbers = new int[5];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
		}

		return randomNumbers;
	}

	private static int[] getValues() {

		int[] getArray = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < getArray.length; i++) {
			System.out.print("Enter number " + (i + 1) + ":");
			getArray[i] = input.nextInt();
		}
		return getArray;

	}

}
