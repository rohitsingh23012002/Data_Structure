package ArraySortedOrNot;

public class nativeMethod {
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[i])
                    return false;
        return true;

    }
    public static void main(String[] args) {
        int [] a = {1,2,35,88,4};
        boolean l = isSorted(a);
        if (l==true)
            System.out.println("\nArray is sorted");
        else
            System.out.println("\nArray is not sorted");
    }
}
