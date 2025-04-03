package ArrayPackage;

public class peakElement {
	
	public static void peakElement(int[] arr) {
		
		int peak=arr[0];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>peak && arr[i]>arr[i+1]) {
				peak=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1, 3, 20, 4, 1, 0};
		int[] arr2= {10, 20, 15, 2, 23, 90, 67};
		peakElement(arr);
		peakElement(arr2);

	}

}
