public class p_10_Butterfly_Star_Pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i = 1;i<=n;i++)
        {
            for (int j=1;j<=2*n;j++)
            {
                if (j<=i || j>2*n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =n ;i>=1;i--)
        {
            for (int j=1;j<=2*n;j++)
            {
                if (j<=i || j>2*n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
