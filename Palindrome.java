public class Palindrome{
    public static void main(String[] args) {
        int a[]={1,2,3,2,1};
        int flag=0;

        int i=0;
        int j=a.length-1;

        while(i<j)
        {
            if(a[i]!=a[j])
            {
                flag=1;
            }
            i++;
            j--;
        }
        if(flag==0)
        System.out.println("palindrome");
        else
        System.out.println("no");
    }
}
