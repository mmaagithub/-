package sort;

public class InsertSort {

	public static void insertSort(int[] a) {
		int i, j, k;
		// 以第一个元素为参照物进行比较
		for (i = 1; i < a.length; i++) {
			// 为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
			// 倒序和a[i]之前的元素进行比较
			for (j = i - 1; j >= 0; j--) {
				if (a[j] <= a[i]) {
					break;
				}
			}
			// 找到位置了开始存放
			if (j != i - 1) {
				int temp = a[i];
				for (k = i - 1; k > j; k--)
					a[k + 1] = a[k];
				a[k + 1] = temp;
			}
		}
	}

	public static void insertSort2(int[] a) {
		int i, j, temp;
		for (i = 1; i < a.length; i++) {
			temp = a[i];
			// 因为前i-1个数都是从小到大的有序序列，所以只要当前比较的数(list[j])比temp大，就把这个数后移一位
			for (j = i - 1; j >= 0 && a[j] > temp; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int i;
		int[] a = { 70, 40, 30, 10, 60, 50 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		// bubbleSort1(a);
		insertSort2(a);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
