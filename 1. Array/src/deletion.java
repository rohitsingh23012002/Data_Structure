import java.util.Scanner;

public class deletion {
    static int delete(int [] arr,int x)
    {

        int n=arr.length;
        System.out.println("Array berore deletion is:");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int i;
        for (i = 0;i<n;i++)
            if(arr[i]==x)
                break;
            if (i==n)
                return n;
            for (int j =i;j<n-1;j++)
                arr[j]=arr[j+1];
            return n-1;
    }

    public static void main(String[] args) {
        int [] a = {22,44,98,33};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to be deleted: ");
        int f = s.nextInt();
        int l = delete(a,f);
        System.out.println("\nArray after deletion of "+f+" is:");
        for (int i = 0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
