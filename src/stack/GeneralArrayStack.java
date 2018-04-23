package stack;

import java.lang.reflect.Array;

//Java : ����ʵ�ֵ�ջ���ܴ洢�������͵�����
public class GeneralArrayStack<T> {
	private static final int DEFAULT_SIZE = 12;
	private T[] mArray;
	private int count;

	public GeneralArrayStack(Class<String> class1) {
		this(class1, DEFAULT_SIZE);
	}

	public GeneralArrayStack(Class<String> class1, int size) {
		mArray = (T[]) Array.newInstance(class1, size);
		count = 0;
	}

	// ��t��ӵ�ջ��
	public void push(T t) {
		mArray[count++] = t;
	}

	// ���ء�ջ��Ԫ��ֵ��
	public T peek() {
		return mArray[count - 1];
	}

	// ���ء�ջ��Ԫ��ֵ������ɾ����ջ��Ԫ�ء�
	public T pop() {
		T ret = mArray[count - 1];
		count--;
		return ret;
	}

	// ���ء�ջ���Ĵ�С
	public int size() {
		return count;
	}

	// ���ء�ջ���Ƿ�Ϊ��
	public boolean isEmpty() {
		return size() == 0;
	}

	// ��ӡ��ջ��
	public void PrintArrayStack() {
		if (isEmpty()) {
			System.out.println("stack is Empty");
		}
		int i = size() - 1;
		while (i >= 0) {
			System.out.println(mArray[i]);
			i--;
		}
	}

	public static void main(String[] args) {
		String tmp;
		GeneralArrayStack<String> astack = new GeneralArrayStack<String>(String.class);

		// ��10, 20, 30 ��������ջ��
		astack.push("10");
		astack.push("20");
		astack.push("30");

		// ����ջ��Ԫ�ء���ֵ��tmp����ɾ����ջ��Ԫ�ء�
		tmp = astack.pop();
		System.out.println("tmp=" + tmp);

		// ֻ����ջ������ֵ��tmp����ɾ����Ԫ��.
		tmp = astack.peek();
		System.out.println("tmp=" + tmp);

		astack.push("40");
		astack.PrintArrayStack(); // ��ӡջ
	}

}
