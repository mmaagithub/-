package queue;

import java.util.Stack;

//�á�ջ��ʵ�ֶ���
public class QueueTest<T> {
	// ������������ʱ��(01) �������е�ȫ�����ݡ����Ƶ�mIn�С� (02) ��������ӵ����ݡ���ӵ�mIn�С�
	private Stack<T> mIn = null;
	// �Ӷ��л�ȡԪ��ʱ��(01) �������е�ȫ�����ݡ����Ƶ�mOut�С�(02) ���ز�ɾ��mOutջ��Ԫ�ء�
	private Stack<T> mOut = null;

	private int mCount = 0;

	public QueueTest() {
		mIn = new Stack<T>();
		mOut = new Stack<T>();
		mCount = 0;
	}

	public void add(T t) {
		while(!mOut.empty())
			mIn.push(mOut.pop());
		mIn.push(t);
		mCount++;
	}

	public T get() {
		// �������е�ȫ�����ݡ����Ƶ�mOut��
		while (!mIn.empty())
			mOut.push(mIn.pop());
		mCount--;
		return mOut.pop();
	}

	public boolean isEmpty() {
		return mCount == 0;
	}
	
	public static void main(String[] args) {
		QueueTest list = new QueueTest();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		while(!list.isEmpty()){
			System.out.println(list.get());
		}
	}
}
