
public class MergeSort {
	void merge(int arr[], int start, int mid, int end)
    {
        // Find sizes of two subarrays to be merged
        int len_l = mid - start + 1;
        int len_r = end - mid;
        /* Create temp arrays */
        int left_arr[] = new int[len_l];
        int right_arr[] = new int[len_r];
        /*Copy data to temp arrays*/
        for (int i = 0; i < len_l; ++i)
            left_arr[i] = arr[start + i];
        for (int j = 0; j < len_r; ++j)
            right_arr[j] = arr[mid + 1 + j];
         /* Merge the temp arrays */ // Initial indexes of first and second subarrays
        int i = 0, j = 0;
         // Initial index of merged subarray array
        int k = start;
        while (i < len_l && j < len_r) {
            if (left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            }
            else {
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < len_l) {
            arr[k] = left_arr[i];
            i++;
            k++;
        }
          /* Copy remaining elements of R[] if any */
        while (j < len_r) {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }
	 // function that sorts arr[l..r] 
    void sort(int arr[], int start, int end){
        if (start < end) {
            // Find the middle point
            int mid = start + (end - start) / 2;
            // Sort first and second halves
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }

	// printing array 
    static void printArray(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}
