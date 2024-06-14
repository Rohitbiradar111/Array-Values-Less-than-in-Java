//This program prints an array whose values are less than k in Java

public class ArrayValueLessThan {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 6;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<k)
            {
                count = count + 1;
            }
        }

        int arr1[] = new int[count];
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<k)
            {
                arr1[index++] = arr[i];
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}