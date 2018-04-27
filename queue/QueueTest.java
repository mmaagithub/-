package queue;

import java.util.Stack;

//用“栈”实现队列
public class QueueTest<T> {
	// 向队列添加数据时：(01) 将“已有的全部数据”都移到mIn中。 (02) 将“新添加的数据”添加到mIn中。
	private Stack<T> mIn = null;
	// 从队列获取元素时：(01) 将“已有的全部数据”都移到mOut中。(02) 返回并删除mOut栈顶元素。
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
		// 将“已有的全部数据”都移到mOut中
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
