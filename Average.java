
public class Average{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
          count++;
          sum +=a[i];
        }
        int average = sum/count;
        System.out.println("Average: "+average);
    }
}