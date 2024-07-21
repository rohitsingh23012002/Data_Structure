public class p_5_NumberChangingPyramidPattern {
    public static void main(String[] args) {
        int n=6,i,j,k=1;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
