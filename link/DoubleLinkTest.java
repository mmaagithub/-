package link;

public class DoubleLinkTest {
	// ˫����������int����
	public static void int_test() {
		int[] iarr = { 10, 20, 30, 40 };
		System.out.println("--------int_test-------");
		DoubleLink<Integer> dlink = new DoubleLink<Integer>();
		dlink.insert(0, 20);
		dlink.insertLast(10);
		dlink.insertFirst(30);
		// ˫�������Ƿ�Ϊ��
		System.out.println(dlink.isEmpty());
		// ˫�������Ĵ�С
		System.out.printf("size()=%d\n", dlink.size());
		for (int i = 0; i < dlink.size(); i++) {
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		}
	}

	private static void string_test() {
		String[] sarr = { "ten", "twenty", "thirty", "forty" };

		System.out.println("\n----string_test----");
		// ����˫������
		DoubleLink<String> dlink = new DoubleLink<String>();

		dlink.insert(0, sarr[1]); // �� sarr�е�2��Ԫ�� ���뵽��һ��λ��
		dlink.insertLast(sarr[0]); // �� sarr�е�1��Ԫ�� ׷�ӵ�����ĩβ
		dlink.insertFirst(sarr[2]); // �� sarr�е�3��Ԫ�� ���뵽��һ��λ��

		// ˫�������Ƿ�Ϊ��
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// ˫�������Ĵ�С
		System.out.printf("size()=%d\n", dlink.size());

		// ��ӡ��ȫ���Ľڵ�
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	// �ڲ���
	private static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[" + id + ", " + name + "]";
		}
	}

	private static Student[] students = new Student[] { new Student(10, "sky"),
			new Student(20, "jody"), new Student(30, "vic"),
			new Student(40, "dan"), };

	private static void object_test() {
		System.out.println("\n----object_test----");
		// ����˫������
		DoubleLink<Student> dlink = new DoubleLink<Student>();

		dlink.insert(0, students[1]); // �� students�е�2��Ԫ�� ���뵽��һ��λ��
		dlink.insertLast(students[0]); // �� students�е�1��Ԫ�� ׷�ӵ�����ĩβ
		dlink.insertFirst(students[2]); // �� students�е�3��Ԫ�� ���뵽��һ��λ��

		// ˫�������Ƿ�Ϊ��
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// ˫�������Ĵ�С
		System.out.printf("size()=%d\n", dlink.size());

		// ��ӡ��ȫ���Ľڵ�
		for (int i = 0; i < dlink.size(); i++) {
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		}
	}

	public static void main(String[] args) {
		int_test();
		string_test();
		object_test();
	}
}