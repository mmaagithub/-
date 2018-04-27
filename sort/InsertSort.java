package sort;

public class InsertSort {

	public static void insertSort(int[] a) {
		int i, j, k;
		// �Ե�һ��Ԫ��Ϊ��������бȽ�
		for (i = 1; i < a.length; i++) {
			// Ϊa[i]��ǰ���a[0...i-1]������������һ�����ʵ�λ��
			// �����a[i]֮ǰ��Ԫ�ؽ��бȽ�
			for (j = i - 1; j >= 0; j--) {
				if (a[j] <= a[i]) {
					break;
				}
			}
			// �ҵ�λ���˿�ʼ���
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
			// ��Ϊǰi-1�������Ǵ�С������������У�����ֻҪ��ǰ�Ƚϵ���(list[j])��temp�󣬾Ͱ����������һλ
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
