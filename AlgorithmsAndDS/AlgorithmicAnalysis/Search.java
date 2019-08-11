package AlgorithmicAnalysis;

public class Search {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 6, 8, 9};
		
		if(Search.binarySearch(7, array, array[0], array[array.length-1]) == true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
	}
	
	public static boolean binarySearch(int v, int[] list, int low, int high) {
		
		if(low > high) {
			return false;
		}
		
		int middle = (low+high)/2;
		
		if(v == list[middle]) {
			return true;
		}
		
		if(v > list[middle]) {
			return binarySearch(v, list, middle+1, high);
		} else {
			return binarySearch(v, list, low, middle-1);
		}
		
	}

}
