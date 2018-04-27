package sort;

public class QuickSort {

	// int l �������߽�
	// int r ������ұ߽�
	public static void quickSort(int[] a,int l,int r) {
		if(l<r){
			int i,j,x;
			i = l;
			j = r;
			x = a[i];
			while(i<j){
				while(i<j && a[j]>x)
					j--;	//���������ҵ�һ��С��x����
				if(i<j)
					a[i++] = a[j];   //��ֵ����һ
				while(i<j && a[i]<x)
					i++;    //���������ҵ�һ������x����
				if(i<j)
					a[j--] = a[i];    //��ֵ����һ
			}
			a[i] = x;
			quickSort(a,1,i-1);   //�ݹ���ã���С��x��������
			quickSort(a,i+1,r);    //�ݹ���ã��Դ���x��������
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
