package SumOfDigit;

public class sol2_better {
    static int sumOfDigit(int n)
    {
        if (n<=9)
            return n;
        return sumOfDigit(n/10)+n%10;
    }

    public static void main(String[] args) {
        int n=256;
        System.out.println("Sum of digit of "+n+" is "+sumOfDigit(n));
    }
}
