package com.datastractires.sorting;


// bubble sort example
public class BubbleSort {

	void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					//swaping value
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

	}

	//Print Array
	void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = { 12, 1, 45, 81, 10, 56, 5, 82 };
		bs.bubbleSort(arr);
		System.out.println(" Sorted array ");
		bs.printArray(arr);

	}
}