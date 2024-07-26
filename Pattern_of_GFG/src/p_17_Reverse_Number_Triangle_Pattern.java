public class p_17_Reverse_Number_Triangle_Pattern {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++)
        {
            int k=i;
            for(int j=1;j<=i-1;j++)
                System.out.print(" ");
            for (int j=1;j<=7-i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
