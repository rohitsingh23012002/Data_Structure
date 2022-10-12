package SubarrayWith0Sum;

public class NaiveSolution {
    static boolean sub0sum(int [] arr)
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int curr_sum=0;
            for (int j=i;j<n;j++)
            {
                curr_sum+=arr[j];
                if (curr_sum==0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,-2,-1,-1};
        System.out.println(sub0sum(a));
    }
}


