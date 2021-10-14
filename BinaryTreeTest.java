import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
		
		BinaryTree testTree = new BinaryTree();
		testTree.root = new Node(56);
		testTree.root.left = new Node(37);
		testTree.root.right = new Node(2);
		testTree.root.left.left = new Node(9);
		testTree.root.left.right = new Node(12);
		testTree.root.right.left = new Node(94);
		testTree.root.right.right = new Node(78);
		
		assertEquals(56, testTree.findLCA(2,37));
		assertEquals(56, testTree.findLCA(2,9));
		assertEquals(56, testTree.findLCA(2,12));
		assertEquals(56, testTree.findLCA(37,78));
		assertEquals(56, testTree.findLCA(37,94));
		assertEquals(56, testTree.findLCA(9,94));
		assertEquals(56, testTree.findLCA(9,78));
		assertEquals(56, testTree.findLCA(12,94));
		assertEquals(56, testTree.findLCA(12,78));
		
		assertEquals(37, testTree.findLCA(9,12));
		
		assertEquals(2, testTree.findLCA(94,78));
		
	}
	
	@Test
	public void sameNumber() {
		
		BinaryTree testSameNumberTree = new BinaryTree();
		testSameNumberTree.root = new Node(24);
		testSameNumberTree.root.left = new Node(73);
		testSameNumberTree.root.right = new Node(7);
		
		assertEquals(24, testSameNumberTree.findLCA(24,24));
		assertEquals(73, testSameNumberTree.findLCA(73,73));
		assertEquals(7, testSameNumberTree.findLCA(7,7));
		
		//when a number is an ancestor of another number
		assertEquals(24, testSameNumberTree.findLCA(24,73));
		assertEquals(24, testSameNumberTree.findLCA(24,7));
		
	}
	
	@Test
	public void noneTest() {
		
		BinaryTree testNullTree = new BinaryTree();
		testNullTree.root = null;
		assertEquals(-1, testNullTree.findLCA(2,12));
		
	}
	
	
	@Test
	public void invalidTest() {
		
		BinaryTree testInvalidTree = new BinaryTree();
		testInvalidTree.root = new Node(24);
		testInvalidTree.root.left = new Node(73);
		testInvalidTree.root.right = new Node(7);
		assertEquals(-1, testInvalidTree.findLCA(24,65));
		assertEquals(-1, testInvalidTree.findLCA(73,92));
		assertEquals(-1, testInvalidTree.findLCA(1,1));
	}

}
