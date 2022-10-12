public class sum_of_natural_number {
    static int sum(int n)
    {
        if (n==0)
            return n;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("sum of "+n+" first natural number is "+sum(n));
    }
}
