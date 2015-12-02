package com.bt;

public class SearchInsertPosition {

	/**
	 * Given a sorted array and a target value, return the index if the target
	 * is found. If not, return the index where it would be if it were inserted
	 * in order.
	 * 
	 * You may assume no duplicates in the array.
	 * 
	 * Here are few examples. [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4
	 * [1,3,5,6], 0 → 0
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int searchInsert(int[] nums, int target) {
		return 0;
	}

	static int find(int[] nums, int target, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int middle = (low + high) / 2;
			if (nums[middle] > target) {
				return find(nums, target, low, middle - 1);
			} else {
				if (nums[middle] < target) {
					return find(nums, target, middle + 1, high);
				} else {
					return middle;
				}
			}
		}
	}

}
