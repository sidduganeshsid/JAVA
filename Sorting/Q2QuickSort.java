//2. WAP to sort an array using Quick Sort Algorithm.

//Quick Sort
//Pivot & Partition
public class Q2QuickSort {
	
	public static int partition(int a[], int low, int high) {
		int pivot =a[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(a[j] < pivot) {
				i++;
				//swap
				int tempvar = a[i];
				a[i] = a[j];
				a[j] = tempvar;
			}
		}
		//swap
		i++;
		int temp = a[i];
		a[i] = pivot;
		a[high] = temp;
		//pivot index
		return i;
		
	}
	
	public static void quickSort(int a[],int low,int high)
	{
		if(low<high) {
			int pivot_x = partition(a, low, high);
			
			quickSort(a, low, pivot_x-1);
			quickSort(a, pivot_x+1, high);
		}
		
	}

	public static void main(String[] args) {
		int[] a = {2,5,1,56,4,6};
		
		quickSort(a, 0,a.length - 1);
		
		System.out.println("Sorted array using Quick Sort");
		for(int elem : a)
			System.out.print(elem + " ");
		System.out.println();
		
	}

}
