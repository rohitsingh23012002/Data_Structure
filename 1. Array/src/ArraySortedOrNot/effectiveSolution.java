package ArraySortedOrNot;

public class effectiveSolution {
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n-1; i++)
                if (arr[i+1] < arr[i])
                    return false;
        return true;

    }
    public static void main(String[] args) {
        int [] a = {1,2,35,88,488,80};
        boolean l = isSorted(a);
        if (l==true)
            System.out.println("\nArray is sorted");
        else
            System.out.println("\nArray is not sorted");
    }
}
