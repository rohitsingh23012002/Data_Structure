public class p_6_Zero_one_triangle {
    public static void main(String[] args) {
        for(int i = 1 ; i<=6 ;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                if (i%2==1)
                {
                    if (j%2==1)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }
                else
                {
                    if (j%2==1)
                        System.out.print(0+" ");
                    else
                        System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
