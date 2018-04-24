package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTreeTest {

	private static final int arr[] = { 1, 5, 4, 3, 2, 6 };

	public static void main(String[] args) {
		int i, ilen;
		BSTree<Integer> tree = new BSTree<Integer>();

		System.out.print("== �������: ");
		ilen = arr.length;
		for (i = 0; i < ilen; i++) {
			System.out.print(arr[i] + " ");
			tree.insert(arr[i]);
		}

		System.out.print("\n== ǰ�����: ");
		tree.preOrder();

		System.out.print("\n== �������: ");
		tree.inOrder();

		System.out.print("\n== �������: ");
		tree.postOrder();
		System.out.println();

		System.out.println("== ��Сֵ: " + tree.minimum());
		System.out.println("== ���ֵ: " + tree.maximum());
		System.out.println("== ������ϸ��Ϣ: ");
		tree.print();

		System.out.print("\n== ɾ�����ڵ�: " + arr[3]);
		tree.remove(arr[3]);

		System.out.print("\n== �������: ");
		tree.inOrder();
		System.out.println();

		// ���ٶ�����
		tree.clear();

		System.out.print("\n== �������: ");
		tree.inOrder();
	}
}
