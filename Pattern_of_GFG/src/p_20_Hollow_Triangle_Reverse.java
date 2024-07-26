public class p_20_Hollow_Triangle_Reverse {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=2*n-1;i++)
            System.out.print("*");
        System.out.println();
        for (int i=n-1;i>=1;i--)
        {
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=1;j==1;j++)
                System.out.print("*");
            for (int j=1;j<=2*(i-1)-1;j++)
                System.out.print(" ");
            for (int j=1;j==1 && i!=1;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
