package print_1_to_n;

public class tail_recursive {
    static void onton(int n,int k)
    {
        if (n==0)
            return;
        System.out.println(k);
        onton(n-1,k+1);
    }

    public static void main(String[] args) {
        onton(7,1);
    }
}
