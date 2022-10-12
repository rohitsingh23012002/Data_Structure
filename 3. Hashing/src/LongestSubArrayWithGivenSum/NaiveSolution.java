package LongestSubArrayWithGivenSum;

public class NaiveSolution {

    static int Longsubgivensum(int [] arr,int sum)
    {
        int res=0;
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int curr_sum=0;
            for (int j=i;j<n;j++)
            {
                curr_sum+=arr[j];
                if (curr_sum==sum)
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
//        int a[]={3,1,0,1,8,2,3,6};
        int a[]={8,3,7};
        System.out.println(Longsubgivensum(a,5));
    }
}
