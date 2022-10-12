package LeftRotateArrayByD;

public class NaiveMethod {
    static void leftRotate1(int [] arr,int n)
    {
        int t = arr[0];
        for (int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=t;
    }
    static void leftRotated(int [] arr,int d)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i=0;i<d;i++)
        {
            leftRotate1(arr,n);
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,2,2,3,4,5,5,9,9,9,9};
        leftRotated(a,3);
        System.out.println("\nArray after left rotate of element by 3 is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }


}
