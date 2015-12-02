package com.bt;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

	private int[] nums = { 5, 8, 1, 3, 2, 9, 7 };

	@Test
	public void foundUpperHalf() {
		int number = SearchInsertPosition.find(nums, 9, 0, nums.length - 1);
		Assert.assertEquals(5, number);
	}

	@Test
	public void foundLowerHalf() {
		int number = SearchInsertPosition.find(nums, 8, 0, nums.length - 1);
		Assert.assertEquals(1, number);
	}
	
	@Test
	public void notFound() {
		int number = SearchInsertPosition.find(nums, 6, 0, nums.length - 1);
		Assert.assertEquals(-1, number);
	}
	
}
