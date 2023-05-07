
public class UniqueArray {

	public static void main(String[] args) {
		int arr[] = { 5, 1, 5,2, 2, 8,8 };
		int len = arr.length;
		System.out.println("Given Array");
		printArray(arr);
		for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++) {
                if (arr[i] == arr[j])
                    {
                	System.out.print(" "+arr[i]);
                	}
			 }
        }
	}
	
	// printing array 
    public static void printArray(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
