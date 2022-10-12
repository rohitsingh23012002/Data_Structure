package CountDistintElements;

public class NaiveSolution {

    static int distintElement(int [] arr)
    {
        int res=0;
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            boolean flag=false;
            for (int j=0;j<i;j++)
            {
                if (arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
//        int a[]={3,1,0,1,8,2,3,6};
        int a[]={8,3,7,3,1,7,8,9};
        System.out.println(distintElement(a));
    }
}
