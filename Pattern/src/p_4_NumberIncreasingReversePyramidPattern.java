public class p_4_NumberIncreasingReversePyramidPattern {
    public static void main(String[] args) {
        int n=6,i,j;
        for (i=1;i<=6;i++)
        {
            for (j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
