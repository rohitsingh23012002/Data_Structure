package largestInArray;

public class naiveMethod {
    static int largest(int [] arr)
    {
        int n=arr.length;
        System.out.println("Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0;i<n;i++) {
            boolean b = true;
            for (int j = 0; j < n; j++){
                if (arr[j] > arr[i]) {
                    b = false;
                    break;
                }
        }
            if(b==true)
                return i;

        }
        return -1;
    }



    public static void main(String[] args) {
        int [] a = {22,888,44,98,33};
        int l = largest(a);
        System.out.println("\nLargest element is: "+a[l]);
    }
}
