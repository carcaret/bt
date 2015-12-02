package com.bt;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bt.base.Node;

public class PrintNodesDistanceKTest {

	private Node root;
	
	@Before
	public void init(){
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
	}
	
	@Test
	public void print(){
		List<Integer> nodes = PrintNodesDistanceK.print(root, 2);
		Assert.assertArrayEquals(new Integer[]{4, 5, 6}, nodes.toArray());
	}
	
	@Test
	public void printEmpty(){
		List<Integer> nodes = PrintNodesDistanceK.print(root, 4);
		Assert.assertTrue(nodes.isEmpty());
	}
	
}
