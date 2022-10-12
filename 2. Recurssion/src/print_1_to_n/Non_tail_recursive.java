package print_1_to_n;

public class Non_tail_recursive {
    static void oneton(int n)
    {
        if (n==0)
            return;
        oneton(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        oneton(7);
    }
}
