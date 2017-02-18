package sortingalgorithms;

import java.util.Arrays;

public class SelectionSorter {
	
	public static void main(String[] args) {
		int[] data = {7,3,6,1,8,2};
		new SelectionSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data) {
		for (int i = 0; i < data.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
					System.out.println(minIndex);
				}
			}			
			
			int tmp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = tmp;
			
			System.out.println(i + ", " + minIndex +". " + Arrays.toString(data));
		}
	}

}
