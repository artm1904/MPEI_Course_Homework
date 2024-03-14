package ru.mpei.practicalLesson1.ex1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ru.mpei.practicalLesson1.ex1.Median.bubbleSort;
import static ru.mpei.practicalLesson1.ex1.Median.determineMedian;

class MedianaTest {
	@Test
	void SortTest1() {
		int[] array = {5, 1, 9, 8, 11, 3};
		Assertions.assertEquals(Arrays.toString(new int[]{1, 3, 5, 8, 9, 11}), Arrays.toString(bubbleSort(array)));
		Assertions.assertEquals(6.5, determineMedian(bubbleSort(array)));
	}


	@Test
	void SortTest2() {
		int[] array = {7, 6, 2, 5, 3};
		Assertions.assertEquals(Arrays.toString(new int[]{2,3,5,6,7}), Arrays.toString(bubbleSort(array)));
		Assertions.assertEquals(5, determineMedian(bubbleSort(array)));
	}
}