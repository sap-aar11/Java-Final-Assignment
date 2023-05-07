
public class Check_SubsetArray {

	public static void main(String[] args) {
		int marr[] = {1,2,3,9,2,3,9};
		int sarr[] = {2,3,9};
		for(int i = 0; i < marr.length; i++)
		{
			boolean flag =false;
			int k=0;
			if(marr[i]==sarr[0])
			{
				for(int j=0;j<sarr.length;j++)
					{if(marr[i+j]==sarr[j])
						k++;
					}
				
				if(k==sarr.length)
					{flag=true;
					System.out.println("Array is subset of another Array");
					break;
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
