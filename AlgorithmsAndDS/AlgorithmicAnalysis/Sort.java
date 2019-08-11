package AlgorithmicAnalysis;


public class Sort {

	public static void main(String[] args) {

		int[] array = {4, 9, 7, 6, 5, 3, 1};
		int[] sortedArray = mergeSort(array);
		
		int i = 0;
		for(i = 0; i<sortedArray.length; i++) {
			System.out.print(sortedArray[i] + ", ");
		}
		
	}
	
	public static int[] mergeSort(int[] list) {
		
		int n = list.length;
		int[] left;
		int[] right;
		
		if(n%2 == 0) {
			left = new int[n/2];
			right = new int[n/2];
		} else {
			left = new int[n/2];
			right = new int[n/2 + 1];
		}
		
		int i =0;
		for(i=0; i<n; i++) {
			if(i<n/2) {
				left[i] = list[i];
			} else {
				right[i - n/2] = list[i];
			}
		}
		
		System.out.println(left.length + " "  + right.length);
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
	}
	
	public static int[] merge(int[] left, int[] right) {
		
		int[] result = new int[left.length+right.length];
		
		int i = 0;
		int j = 0;
		int index = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				result[index++] = left[i++];
			} else {
				result[index++] = right[j++];
			}
		}
		
		while(i<left.length) {
			result[index++] = left[i++];
		}
		
		while(j<right.length) {
			result[index++] = right[j++];
		}
		
		return result;
	}
}
