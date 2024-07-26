public class p_16_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
