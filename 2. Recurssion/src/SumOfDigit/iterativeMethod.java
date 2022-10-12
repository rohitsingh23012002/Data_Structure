package SumOfDigit;

public class iterativeMethod {
    static int sumOfDigit(int n)
    {
        int res=0;
        while (n>0)
        {
            res= res + n%10;
            n=n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 256;
        System.out.println("Sum of digit of " + n + " is " + sumOfDigit(n));
    }
}
