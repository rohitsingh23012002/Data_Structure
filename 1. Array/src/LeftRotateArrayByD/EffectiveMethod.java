package LeftRotateArrayByD;

public class EffectiveMethod {
    static void rev(int [] arr,int low,int high)
    {
        while (low<high)
        {
            int t=arr[low];
            arr[low]=arr[high];
            arr[high]=t;
            low++;
            high--;
        }
    }
    static void leftRotated(int [] arr,int d)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
       rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);

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
