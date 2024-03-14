package ru.mpei.practicalLesson1.ex1;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int[] array = {5, 1, 9, 8, 11, 3};
		int[] sortArr = bubbleSort(array);
		double median = determineMedian(array);
		System.out.println(Arrays.toString(sortArr));
		System.out.println(median);
	}

	public static int[] bubbleSort(int[] Arr) {
		int swap;
		for (int i = 0; i < Arr.length - 1; i++) {
			for (int j = 0; j < Arr.length - i - 1; j++) {
				if (Arr[j + 1] < Arr[j]) {
					swap = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = swap;
				}
			}
		}
		return Arr;
	}

	public static double determineMedian(int[] array) {
		double median;
		if (array.length % 2 == 0) {
			median = (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
		} else {
			median = array[array.length / 2];
		}
		return median;
	}
}
