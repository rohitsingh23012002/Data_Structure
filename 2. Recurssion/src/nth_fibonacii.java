public class nth_fibonacii {
    static int fib(int n)
    {
        if (n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(n+"th fibonacci is "+fib(n));
    }
}
