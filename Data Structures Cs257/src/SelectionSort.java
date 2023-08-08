// Routines to sort arrays of integers.
// (c) 1997, 2001 duane a. bailey
// modified by spc

import java.util.Scanner;

public class SelectionSort
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array to sort: ");

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = (int) (Math.random() * 100);
        }

        long sec = System.currentTimeMillis();

        System.out.println("Sort the array upto ... element");
        //sort upto n
        int n = in.nextInt();
        if (n < size){
            System.out.println("The array sizes should match!");
        }else{
            selectionSort(arr,n);
            sec = System.currentTimeMillis() - sec;
        }

        System.out.println("Print the sorted array upto?");
        int upto = in.nextInt();

        for (int i = 0; i < upto; i++)
        {
            System.out.print(arr[i]+" ");
            if (((i+1) % 15) == 0) System.out.println();
        }
        System.out.println();
        System.out.println("Time to Sort: " + sec / 1000.0);
    }

    public static void selectionSort(int data[], int n)
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] are in ascending order
    {
        int numUnsorted = n;
        int index;	// general index
        int max;	// index of largest value
        while (numUnsorted > 0)
        {
            // determine maximum value in array
            max = 0;
            for (index = 1; index < numUnsorted; index++)
            {
                if (data[max] < data[index]) max = index;
            }
            swap(data,max,numUnsorted-1);
            numUnsorted--;
        }
    }
    public static void swap(int data[], int i, int j)
    // pre: 0 <= i,j < data.length
    // post: data[i] and data[j] are exchanged
    {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}