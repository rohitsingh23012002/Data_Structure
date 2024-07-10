import java.util.Scanner;

public class income_tax {
    double tax(double sal)
    {
        if(sal<2.5)
        {
            return 0.0;
        }
        else if (sal>=2.5 && sal<5) {
            return 0.05*sal;
        }
        else if (sal>=5 && sal<10) {
            return 0.2*sal;
        }
        else
            return 0.3*sal;
    }

    public static void main(String[] args) {
        double sa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs: ");
        sa=sc.nextDouble();
        income_tax it = new income_tax();
        System.out.println("Your tax is "+it.tax(sa)+" lakhs or "+it.tax(sa)*100000+" rupees");
    }
}
