package sort;
import quickSort.quickSort;

public class recursionsort implements quickSort {
	//you need to delete this main test part when you finish the whole project
	/*public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 8;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 2;
		quicksort(arr,0,3);
		System.out.println(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]);
	}*/
	public void sort(Integer[] arr) {
		this.quicksort(arr, 0, arr.length - 1);
	}
	public void quicksort(Integer[] arr,int start,int end) {
	if (start < end) {
		int index = Partition(arr, start, end);
		//recursion:separate one array sorting task to 
		//two small scale sorting task
		quicksort(arr, start, index - 1);
		quicksort(arr, index + 1, end);
		}
	}
	private static int Partition(Integer[] arr, int start, int end) {
		//Start point
		int point = arr[start];
		while (start < end) {
			//end number works,end--
			while (arr[end] >= point && end > start)
				end--;
			arr[start] = arr[end];
			//start number works,start++
			while (arr[start] <= point && end > start)
				start++;
			arr[end] = arr[start];
		}
		arr[start] = point;
		return start;
	}

 




}
