package sort;

public class BubbleSort {

	// Ã°ÅÝÅÅÐò
	public static void bubbleSort1(int[] a) {
		for (int i = a.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	//¸Ä½ø°æ
	public static void bubbleSort2(int[] a){
		int flag=0;
		for(int i = a.length-1;i>0;i--){
			for(int j = 0;j<i;j++){
				if(a[j]>a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					flag = 1;
				}
			}
			if(flag==0){
				break;
			}
		}
	} 

	public static void main(String[] args) {
		int i;
		int[] a = { 20, 40, 30, 10, 60, 50 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		 //bubbleSort1(a);
		bubbleSort2(a);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}

}
