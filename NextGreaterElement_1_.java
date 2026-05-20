class Main
{
    public static void main(String[]aegs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> s=new Stack<>();
        int result[]=new int[n]
        for(int i=0;i<n;i++)
        {
            result[i]=-1;
        }
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }

            if(!s.isEmpty())
            {
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
    }
}
