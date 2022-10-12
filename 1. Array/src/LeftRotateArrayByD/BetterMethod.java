package LeftRotateArrayByD;

public class BetterMethod {
    static void leftRotated(int [] arr,int d)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int t[] = new int[d];
        for (int i = 0;i<d;i++)
            t[i]=arr[i];
        for (int i=d;i<n;i++)
            arr[i-d]=arr[i];
        for (int i = 0;i<d;i++)
            arr[n-d+i]=t[i];
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
