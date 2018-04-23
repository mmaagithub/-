package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackTest {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    public void push(Integer node) {
        //�������ж�Ϊ��ʱ�����ȿ���queue1
    		   queue1.add(node);
    }

    public int pop() {
        //����ջ��Ϊ��ʱ��û��Ԫ�ؿ��Ե���
        if (queue1.isEmpty()&&queue2.isEmpty()) {
            try {
                throw new Exception("stack is empty");
            } catch (Exception e) {
            }
        }
        //���queue1Ϊ�գ�queue2��Ԫ�أ� ��queue2��Ԫ�����η���queue1�У�ֱ�����һ��Ԫ�أ����ǵ�����
        if (queue1.isEmpty()) {
            while (queue2.size()>1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
 
        if (queue2.isEmpty()) {
            while (queue1.size()>1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return (Integer) null;
    }
	
    public static void main(String[] args) {
        StackTest s = new StackTest();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}