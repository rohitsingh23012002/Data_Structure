public class p_18_Mirror_Image_Triangle {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++)
        {
            int k=i;
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for (int j=1;j<=n-i+1;j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        for (int i=2;i<=n;i++)
        {
            int k=n-i+1;
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }
    }
}
