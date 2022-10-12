package Selection_Sort;

public class EffectiveMethod {
    static void selSort(int[] arr) {
        int n = arr.length;
        System.out.println("Initial array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        for (int i = 0; i < n; i++)
        {
            int min_ind=i;
            for (int j = i+1; j < n; j++)
            {
                if(arr[j]<arr[min_ind])
                    min_ind=j;
            }
//            swapping arr[i],arr[min_ind]
            int t=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=t;
        }

        System.out.println("\nFinal array is: ");
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
    }

    public static void main(String[] args) {
        int s[] = {1, 4, 93, 07, 885, 69};
        selSort(s);
    }
}
