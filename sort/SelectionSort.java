package sort;

public class SelectionSort {

	public static void selectionSort(int[] a){
		int i,j,temp;
		for(i = 0;i<a.length;i++){
			for(j = a.length-1;j>=i;j--){
				if(a[j]<a[i]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int i;
		int[] a = { 7, 6,5, 5,90,8,45, 4, 3, 2, 1 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		//shellSort(a, a.length);
		selectionSort(a);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
