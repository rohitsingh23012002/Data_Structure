public class p_2_Number_TrianglePattern {
    public static void main(String[] args) {
        int i,j,n=6;
        for (i = 1; i<=n; i++) {
            for (j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
