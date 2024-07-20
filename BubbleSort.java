public class BubbleSort{
    static void print(int a[]){
for(int i =0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    static void sort(int a[],int j,int temp)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
             if(a[j] > a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
             }
            }
        }
        print(a);
    }
    public static void main(String[] args) {
        int a[] = {1,2,5,4,3};
        sort(a, 0, 0);
        
    }
}



