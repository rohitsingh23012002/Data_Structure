package factorialnumber;

public class tail_recursive {
    static int fact(int n,int k)
    {
        if (n==0 || n==1)
            return k;
        return fact(n-1,k*n);  // ye tail recursive hai qki fact call ho rha h return horaha hai....
    }

    public static void main(String[] args) {
        System.out.println(fact(3,1));
    }
}
