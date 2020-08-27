public class Q2
{
    public static String Q2()
    {
        int sum = 0;
        int n=1;
        int m=1;
        int curr=0;
        while(curr<4000000){
            if(curr%2==0){
                sum+=curr;
            }
            curr=m+n;
            n=m;
            m=curr;
        }
        return Integer.toString(sum);
    }
    public static void main(String[] args)
    {
        System.out.println(Q2());
    }
}