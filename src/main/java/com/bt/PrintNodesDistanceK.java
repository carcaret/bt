package com.bt;

import java.util.ArrayList;
import java.util.List;

import com.bt.base.Node;

public class PrintNodesDistanceK {

	public static List<Integer> print(Node root, int distance) {
		List<Integer> nodes = new ArrayList<Integer>();
		print(root, distance, 0, nodes);
		return nodes;
	}

	private static void print(Node node, int distance, int counter, List<Integer> nodes) {
		if (node != null) {
			if (counter > distance) {
				return;
			} else {
				if (counter == distance) {
					nodes.add(node.data);
				} else {
					counter++;
					print(node.left, distance, counter, nodes);
					print(node.right, distance, counter, nodes);
				}
			}
		}
	}
}
