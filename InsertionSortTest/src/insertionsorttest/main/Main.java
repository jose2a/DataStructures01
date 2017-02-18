package insertionsorttest.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 2, 8, 12, 7};
		
		System.out.println("Before sorting:");
		printArray(array);
		insertionSortDesc(array);
		System.out.println("After sorting:");
		printArray(array);

	}	
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	public static void insertionSort(int[] array) {
		int current;
		for (int i = 1; i < array.length; i++) {
			current = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				
				j = j - 1;
			}
			array [j + 1] = current;
		}
	}
	
	public static void insertionSortDesc(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] < current) {
				array[j + 1] = array[j];
				
				j = j - 1;
			}
			array [j + 1] = current;
		}
	}

}
