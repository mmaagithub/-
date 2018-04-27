package sort;

public class ShellSort {

	public static void shellSort(int[] a, int n) {
		int i, j, k, gap;
		// gapΪ������ÿ�μ�Ϊԭ����һ�롣
		for (gap = n / 2; gap > 0; gap /= 2) {
			// ��gap���飬��ÿһ�鶼ִ��ֱ�Ӳ�������
			for (i = 0; i < gap; i++) {
				for (j = gap + i; j < n; j += gap) {
					// ���a[j] < a[j-gap]����Ѱ��a[j]λ�ã������������ݵ�λ�ö����ơ�
					if (a[j] < a[j - gap]) {
						int tmp = a[j];
						for (k = j - gap; k >= 0 && a[k] > tmp; k -= gap) {
							a[k + gap] = a[k];
						}
						a[k + gap] = tmp;
					}
				}
			}
		}
	}

	public static void shellSort2(int[] a) {
		for (int j = 1; j < a.length; j++) {
			if (a[j] < a[j - 1]) {  
				int tmp = a[j];   
				int k;     
				for (k = j - 1; k >= 0 && a[k] > tmp; k--) { 	
					a[k + 1] = a[k];
				}   
				a[k + 1] = tmp;   
			}
		}
	}

	public static void main(String[] args) {
		int i;
		int[] a = { 7, 6, 5, 4, 3, 2, 1 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		//shellSort(a, a.length);
		shellSort2(a);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
