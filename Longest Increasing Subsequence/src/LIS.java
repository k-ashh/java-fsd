import java.util.Scanner;

public class LIS {
	
	static int lis(int arr[], int n) {
        int lis[] = new int[n];
        int i, j, max = 0;
        
        //	int list1[] = new int[n];
        //	int k=0;
 
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        // computing LIS values by iterating on the array
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    //	list1[k]=arr[i];
                    //	k++;
                }
 
        // Getting maximum number from lis to get the number of elements if longest increasing sequence
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
        
        // printing the elements of lis
        //	System.out.println("The elements of LIS are:\n");
        //	for(int aa:list1)
        //		System.out.println("\t"+aa); 
        
        //returning the answer
        return max;
	}
	

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of array:\n");
	    int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Please enter the elements of array:\n");
	    for(int i=0; i<n ; i++)
	    	arr[i]=sc.nextInt();
	    System.out.println("Length of lis is " + lis(arr, n)+ "\n");
	    
	}
	
}


