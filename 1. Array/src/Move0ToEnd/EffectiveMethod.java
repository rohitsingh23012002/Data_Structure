package Move0ToEnd;

public class EffectiveMethod {
    static void m0e(int [] arr)
    {
        int n= arr.length;
        System.out.println("Array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int count=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]!=0) {
                int t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;
                count++;
            }

        }
    }

    public static void main(String[] args) {
        int a[]={1,2,0,3,0,4,0,5,0,3,3,0};
        m0e(a);
        System.out.println("\nArray after moving all zero to end is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
