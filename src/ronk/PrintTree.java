package ronk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//public class TreeNode {
//
//int val = 0;
//TreeNode left = null;
//TreeNode right = null;
//
//public TreeNode(int val) {
//	this.val = val;
//}
//}
//有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
//
//给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。

public class PrintTree {
	public static  int[][] printTree(TreeNode root) {
		if (root == null)
			return null;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> level = new ArrayList<>();
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);//添加到最后
		TreeNode TreeNode = null, last = root, nLast = null;
		while (!queue.isEmpty()) {
			TreeNode = queue.poll();//移除并返回第一个
			level.add(TreeNode.val);
			if (TreeNode.left != null) {
				queue.offer(TreeNode.left);
				nLast = TreeNode.left;
			}
			if (TreeNode.right != null) {
				queue.offer(TreeNode.right);
				nLast = TreeNode.right;
			}
			if (TreeNode == last) { // 节点等于last,说明到达了当前行的最后一个节点,
				arr.add(level);
				last = nLast;
				level = new ArrayList<Integer>();
			}
		}

		int[][] result = new int[arr.size()][];
		for (int i = 0; i < arr.size(); i++) {
			level = arr.get(i);
			result[i] = new int[level.size()];
			int j = 0;
			for (Integer num : level) {
				result[i][j++] = num;
			}
		}
		return result;

	}
	public static void main(String[] args) {
		TreeNode TreeNode1 = new TreeNode(1);
		TreeNode TreeNode2 = new TreeNode(2);
		TreeNode TreeNode3 = new TreeNode(3);
		TreeNode TreeNode4 = new TreeNode(4);
		TreeNode TreeNode5 = new TreeNode(5);
		TreeNode TreeNode6 = new TreeNode(6);
		TreeNode TreeNode7 = new TreeNode(7);
		TreeNode TreeNode8 = new TreeNode(8);
		TreeNode1.left = TreeNode2;
		TreeNode1.right = TreeNode3;
		TreeNode2.left = TreeNode4;
		TreeNode3.left = TreeNode5;
		TreeNode3.right = TreeNode6;
		TreeNode5.left = TreeNode7;
		TreeNode5.right = TreeNode8;
		int[][] node = printTree(TreeNode1);
		for(int[] arr:node){
			for(int i: arr){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		} 
}
