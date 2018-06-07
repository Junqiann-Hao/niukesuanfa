package basic_class_01;
//��������
public class Code_02_InsertionSort {
	
	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		
		for(int i = 1 ; i < arr.length; i ++) {
			for(int j = i - 1 ; j >= 0 && arr[j] > arr[j+1] ; j --) {
				swap(arr , j , j + 1);
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 4545, 3432, 667, 231, 4543, 21321, 76, 23 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
