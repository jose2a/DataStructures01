package main;

public class Search {

	public static int binarySearch(int[] array, int element) {
		int lowerPos = 0;
		int upperPos = array.length;

		if (lowerPos >= upperPos) {
			return -1;
		}

		while (lowerPos <= upperPos) {

			int midPos = lowerPos + (upperPos - lowerPos) / 2;

			if (array[midPos] == element) {
				return midPos;
			} else if (array[midPos] < element) {
				lowerPos = midPos + 1;
			} else {
				upperPos = midPos - 1;
			}
		}

		return -1;

	}

}
