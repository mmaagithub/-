package queue;

//Java : ����ʵ�֡����С���ֻ�ܴ洢int���ݡ�
public class ArrayQueue {
	private int[] mArray;
	private int mCount;

	public ArrayQueue(int sz) {
		mArray = new int[sz];
		mCount = 0;
	}

	// ��val��ӵ����е�ĩβ
	public void add(int val) {
		mArray[mCount++] = val;
	}

	// ���ء����п�ͷԪ�ء�
	public int front() {
		return mArray[0];
	}

	// ���ء�ջ��Ԫ��ֵ������ɾ����ջ��Ԫ�ء�
	public int pop() {
		int ret = mArray[0];
		mCount--;
		for (int i = 1; i <= mCount; i++)
			mArray[i - 1] = mArray[i];
		return ret;
	}

	// ���ء�ջ���Ĵ�С
	public int size() {
		return mCount;
	}

	// ���ء�ջ���Ƿ�Ϊ��
	public boolean isEmpty() {
		return size() == 0;
	}

	public static void main(String[] args) {
		int tmp = 0;
		ArrayQueue astack = new ArrayQueue(12);
		astack.add(10);
		astack.add(20);
		astack.add(30);

		// ����ջ��Ԫ�ء���ֵ��tmp����ɾ����ջ��Ԫ�ء�
		tmp = astack.pop();
		System.out.printf("tmp=%d\n", tmp);

		// ֻ����ջ������ֵ��tmp����ɾ����Ԫ��.
		tmp = astack.front();
		System.out.printf("tmp=%d\n", tmp);

		astack.add(40);

		System.out.printf("isEmpty()=%b\n", astack.isEmpty());
		System.out.printf("size()=%d\n", astack.size());
		while (!astack.isEmpty()) {
			System.out.printf("size()=%d\n", astack.pop());
		}
	}
}
