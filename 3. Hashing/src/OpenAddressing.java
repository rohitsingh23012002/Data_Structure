public class OpenAddressing {
int [] arr = new int[7];
int cap,size;

    public OpenAddressing(int c) {
        cap=c;
        size=0;
        for (int i=0;i<cap;i++)
            arr[i]=-1;
    }
    int hash(int key)
    {
        return key%cap;
    }


    boolean insert(int key)
    {
        if (size==cap)
            return false;
        int i=hash(key);
        while (arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
            i=(i+1)%cap;
        if (arr[i]==key)
            return false;
        else
        {
            arr[i]=key;
            size++;
            return true;
        }

    }


    boolean erase(int key)
    {
        int h=hash(key);
        int i=h;
        while (arr[i]!=-1)
        {
            if (arr[i]==key)
            {
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if (i==h)
                return false;
        }
        return false;
    }

    boolean search(int key)
    {
        int h=hash(key);
        int i=h;
        while (arr[i]!=-1)
        {
            if (arr[i]==key)
                return true;
            i=(i+1)%cap;
            if (i==h)
                return false;
        }
        return false;
    }

    void printt()
    {
        for (int i=0;i<cap;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        OpenAddressing o = new OpenAddressing(7);
        System.out.println(o.insert(49));
        System.out.println(o.insert(72));
        o.printt();
        System.out.println(o.erase(72));
        o.printt();
        System.out.println(o.search(49));
        System.out.println(o.search(72));
        System.out.println(o.search(99));
    }

}
