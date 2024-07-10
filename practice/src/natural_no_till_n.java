import java.util.Scanner;

public class natural_no_till_n {
    void print_natural(int n)
    {
        int i = 1;
        do{
            System.out.println(i+" ");
            i++;
        }while (i<=n);
    }

    public static void main(String[] args) {
        System.out.print("Eneter number till which you want natural no: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        natural_no_till_n nn = new natural_no_till_n();
        nn.print_natural(num);
    }
}
