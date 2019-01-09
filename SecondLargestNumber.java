package Assignment6;

public class SecondLargestNumber {
    /* Function to print the second largest
	elements */
    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2)
        {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size ; i++)
        {
			/* If current element is smaller than
			first then update both first and second */
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }

			/* If arr[i] is in between first and
			second then update second */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"+
                    " element\n");
        else
            System.out.print("The second largest element"+
                    " is "+ second);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {1, 32, 545, 0, -3, 24};
        int n = arr.length;
        print2largest(arr, n);
    }
}

