package SubArrayWithGivenSum;

public class NaiveSolution {
    static boolean subGivensum(int [] arr,int sum)
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int curr_sum=0;
            for (int j=i;j<n;j++)
            {
                curr_sum+=arr[j];
                if (curr_sum==sum)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,-2,7,7,-1};
        System.out.println(subGivensum(a,11));
    }
}
