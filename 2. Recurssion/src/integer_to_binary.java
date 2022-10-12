public class integer_to_binary {
    static void inttobin(int n)
    {
        if (n==0)
            return;
        inttobin(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.print("Binary of "+n+" is ");
        inttobin(n);
    }

}
