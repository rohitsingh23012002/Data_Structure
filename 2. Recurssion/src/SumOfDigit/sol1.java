package SumOfDigit;

public class sol1 {
    static int sumOfDigit(int n)
    {
        if (n==0)
            return 0;
        return sumOfDigit(n/10)+n%10;
    }

    public static void main(String[] args) {
        int n=256;
        System.out.println("Sum of digit of "+n+" is "+sumOfDigit(n));
    }
}
