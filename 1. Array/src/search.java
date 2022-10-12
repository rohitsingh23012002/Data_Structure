import java.util.Scanner;

public class search {
    static int searchh(int arr[],int x)
    {
        int n = arr.length;
        for (int i = 0;i<n;i++)
            if(arr[i]==x)
                return i;
             return -1;
    }

    public static void main(String[] args) {
        int [] a = {22,44,98,33};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to be found: ");
        int f = s.nextInt();
        System.out.println(f+" is present at "+searchh(a,f)+" index");

    }
}
