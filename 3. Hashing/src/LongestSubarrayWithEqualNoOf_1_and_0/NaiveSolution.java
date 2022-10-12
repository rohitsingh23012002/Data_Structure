package LongestSubarrayWithEqualNoOf_1_and_0;

public class NaiveSolution {

    static int Longsubequal_0_1(int [] arr)
    {
        int res=0;
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int c0=0,c1=0;
            for (int j=i;j<n;j++)
            {
                if (arr[j]==0)
                    c0++;
                else
                    c1++;
                if (c0==c1)
                    res=max(res,j-i+1);
            }
        }
        return res;
    }
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        return y;
    }

    public static void main(String[] args) {
        int a[]={0,0,1,1,1,1,1,0};
//        int a[]={1,1,0,1,0,0,1,1,1,1,1,1,};
        System.out.println(Longsubequal_0_1(a));
    }
}
