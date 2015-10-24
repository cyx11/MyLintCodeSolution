package sort;

public class Sort {

	public void insertSort(int[] list) {
		if (list == null || list.length == 0) {
			return;
		}
		int length = list.length;
		for(int i = 1; i < length; i++) {
			int temp = list[i];
			int j = 0;
			for (j = i - 1; j >= 0 && list[j] > temp; j--) {
				list[j + 1] = list[j];
			}
			list[j + 1] = temp;
		}
	}

	public void quickSort(int[] list) {
		quickSort2(list, 0, list.length - 1);
	}

	private void quickSort2(int[] list, int start, int end) {
		if(start >= end) {
			return;
		}
		int i = start, j = end;
		int pivot = list[end];
		while (i < j) {
			while (list[i] < pivot && i < j) {
				i++;
			}
			while (list[j] >= pivot && i < j) {
				j--;
			}
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		int temp = list[i];
		list[i] = list[end];
		list[end] = temp;
		quickSort2(list, start, i - 1);
		quickSort2(list, i + 1, end);
	}

	private void quickSort(int[] list, int start, int end) {
		if (start >= end) {
			return;
		}
		int i = start, j = end - 1;
		int pivot = list[end];
		while (i < j - 1) {
			while (list[i] < pivot && i < j - 1) {
				i++;
			}
			while (list[j] > pivot && i < j - 1) {
				j--;
			}
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
			//System.out.println("test");
		}
		if (list[i] > list[j]) {
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		if (pivot < list[i]) {
			int temp = list[end];
			list[end] = list[i];
			list[i] = temp;
			quickSort(list, start, i - 1);
			quickSort(list, i + 1, end);
		} else if (list[i] < pivot && pivot < list[j]) {
			int temp = list[end];
			list[end] = list[j];
			list[j] = temp;
			quickSort(list, start, j - 1);
			quickSort(list, j + 1, end);
		} else {
			int temp = list[end];
			list[end] = list[j+1];
			list[j+1] = temp;
			quickSort(list, start, j);
			quickSort(list, j + 2, end);
		}

	}

	public void mergeSort(int list[]){
		mergeSort(list, new int[list.length], 0, list.length - 1);
	}

	private void mergeSort(int list[], int temp[], int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(list, temp, left, mid);
		mergeSort(list, temp, mid + 1, right);
		merge(list, temp, left, mid, right);
	}

	private void merge(int list[], int temp[], int leftstart, int mid, int rightend) {
		if (leftstart >= rightend) {
			return;
		}
		int left = leftstart;
		int right = mid + 1;
		int temppos = left;
		while (left <= mid && right <= rightend) {
			if (list[left] < list[right]) {
				temp[temppos] = list[left];
				left++;
			} else {
				temp[temppos] = list[right];
				right++;
			}
			temppos++;
		}
		if (left > mid) {
			while (right <= rightend) {
				temp[temppos] = list[right];
				right++;
				temppos++;
			}
		} else {
			while (left <= mid) {
				temp[temppos] = list[left];
				left++;
				temppos++;
			}
		}
		for (int i = leftstart; i <= rightend; i++) {
			list[i] = temp[i];
		}
	}

}
