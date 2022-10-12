public class RopeCuttingProblem {
    static int maxPieces(int n,int a,int b,int c)
    {
        if (n==0)
            return 0;
        if (n<0)
            return -1;
        int res = max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c));
        if (res==-1)
            return -1;
        return res+1;
    }
    static int max(int x,int y,int z)
    {
        int m;
        if (x>y && x>z)
            m=x;
        else if (y>z)
            m=y;
        else
            m=z;
        return m;
    }

    public static void main(String[] args) {
        int p=maxPieces(23,11,9,12);
        System.out.println("Maximum pieces that can be cut are "+p);
    }
}
