public class palindrome_check_string {
    static boolean ispalindrome(String s,int start,int end)
    {
        if (start>=end)
            return true;
        return (s.charAt(start)==s.charAt(end)) && ispalindrome(s,start+1,end-1);
    }

    public static void main(String[] args) {
        String s="abcdba";
        boolean a = ispalindrome(s,0,s.length()-1);
        System.out.println(a);
    }
}
