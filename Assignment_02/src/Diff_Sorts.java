
public class Diff_Sorts {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<   Inside Main  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<    Bubble  Sort   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int arr[] = { 5, 1, 4, 2, 8,9,2 };
		System.out.println("Given Array");
		printArray(arr);
		
		SortBubble.sort(arr);
		System.out.println("Sorted array");
        printArray(arr);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<    Quick  Sort   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int[] qarr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Given Array");
		printArray(qarr);
		
        SortQuick.sort(qarr);
        System.out.println("Sorted array");
        printArray(qarr);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<    Merge  Sort   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int marr[] = { 12, 11, 13, 5, 6, 7,5,3 };
	    System.out.println("Given Array");
	    printArray(marr);
	    
	    MergeSort ms = new MergeSort();
	    ms.sort(marr, 0, marr.length - 1);
	    System.out.println("Sorted array");
        printArray(marr);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<    Selection  Sort   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int sarr[] = { 13, 11, 15, 5, 6, 7,5,2 };
        System.out.println("Given Array");
        printArray(sarr);
        SortSelection.sort(sarr);
        System.out.println("Sorted array");
        printArray(sarr);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	// printing array 
    public static void printArray(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
