package factorialnumber;

public class not_tail_recursive {
    static int fact(int n)
    {
        if (n==0 || n==1)
            return 1;
        return n*fact(n-1);  // ye tail recursive nahi hai qki fact call ho rha h phir multiply hoke return hoga....
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
