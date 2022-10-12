package FrequencyOfElements;

public class NaiveSolution
{
    static void frequencyOfElement(int [] arr)
    {
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
            if (flag==true)
            continue;
            int freq=1;
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                    freq++;
            }
            System.out.println("frequrncy of "+arr[i]+" is "+freq);
        }
    }

    public static void main(String[] args) {
//        int a[]={3,1,0,1,8,2,3,6};
        int a[]={8,3,7,3,1,7,8,9};
        frequencyOfElement(a);
    }

}
