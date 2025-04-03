package ArrayPackage;

public class peakElementBinarySearch {

	public static int peakElement(int[] arr) {

		int low = 0, high = arr.length - 1;

		while (low < high) {
			int mid = (low + high) / 2;

			if (arr[mid] > arr[mid + 1]) {
				high = mid; 
			} else {
				low = mid + 1; 
			}
		}
		
		return arr[low]; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 3, 20, 4, 1, 0};
		int[] arr2= {10, 20, 15, 2, 23, 90, 67};
		System.out.println(peakElement(arr));
		System.out.println(peakElement(arr2));
	}

}
