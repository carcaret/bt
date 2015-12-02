package com.bt;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

	private int[] nums = { 1, 3, 4, 6, 8, 9 };

	@Test
	public void foundUpperHalf() {
		int number = SearchInsertPosition.find(nums, 9, 0, nums.length - 1);
		Assert.assertEquals(5, number);
	}

	@Test
	public void foundLowerHalf() {
		int number = SearchInsertPosition.find(nums, 3, 0, nums.length - 1);
		Assert.assertEquals(1, number);
	}

	@Test
	public void notFound() {
		int number = SearchInsertPosition.find(nums, 5, 0, nums.length - 1);
		Assert.assertEquals(-1, number);
	}

}
