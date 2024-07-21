public class p_8_Rhombus_pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i = 1;i<=n;i++)
        {
            int count=0;
            for(int j = 1;j<=2*n-1;j++)
            {
                if(j>=7-i && count<n) {
                    System.out.print("*");
                    count++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
