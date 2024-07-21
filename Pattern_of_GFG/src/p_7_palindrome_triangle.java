public class p_7_palindrome_triangle {
    public static void main(String[] args) {
        int temp,temp2,i,k,l;
        for (i = 1 ; i<=6;i++)
        {
            temp = i;
            temp2=2;
            for(int j = 1;j<=6;j++)
            {
                k=7-i;
                if (j>=k)
                {
                    System.out.print(temp+" ");
                    temp--;
                }
                else
                    System.out.print("  ");
            }
            for (int j=7;j<=11;j++)
            {
                l=6+i;
                if(j<l)
                {
                    System.out.print(temp2+" ");
                    temp2++;
                }
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
