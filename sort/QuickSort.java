package sort;

public class QuickSort {

	// int l 数组的左边界
	// int r 数组的右边界
	public static void quickSort(int[] a,int l,int r) {
		if(l<r){
			int i,j,x;
			i = l;
			j = r;
			x = a[i];
			while(i<j){
				while(i<j && a[j]>x)
					j--;	//从右向左找第一个小于x的数
				if(i<j)
					a[i++] = a[j];   //赋值完后加一
				while(i<j && a[i]<x)
					i++;    //从左向右找第一个大于x的数
				if(i<j)
					a[j--] = a[i];    //赋值完后减一
			}
			a[i] = x;
			quickSort(a,1,i-1);   //递归调用，对小于x的数排序
			quickSort(a,i+1,r);    //递归调用，对大于x的数排序
		}
	}

	public static void main(String[] args) {
		int i;
		int[] a = { 20, 40, 30, 10, 60, 50 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		// bubbleSort1(a);
		quickSort(a,0,a.length-1);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
