import java.util.Scanner;

public class insertAtPosition {
    static int insert(int [] arr,int n,int x,int pos,int cap)
    {
//        int n = arr.length;
        System.out.println("Array berore insertion is:");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        if(n==cap)
            return n;
        int idx=pos-1;
        for (int i=n-1;i>=idx;i--)
            arr[i+1]=arr[i];
        arr[idx]=x;
        return n+1;
    }

    public static void main(String[] args) {
        int [] a = new int[8];
//        int a[]={1,2,6,3,};
        a[0]=9;
        a[1]=3;
        a[2]=9;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to be inserted: ");
        int in = s.nextInt();
        System.out.println("Enter position to be inseted: ");
        int p = s.nextInt();
        int l = insert(a,3,in,p,8);
        System.out.println("\nArray after insertion of "+in+" at positiom "+p+" is:");
        for (int i = 0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
