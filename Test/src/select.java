public class select {
    public static void main(String[] args) {
        int arr[]={0,3,4,5,9,48,65,95,102};
        int n=48;
        System.out.println(select2(arr,n));
    }
    public static int select2(int[] arr,int n)
    {
        int start = 0;
        int end = arr.length;
        do{
            int i = (start+end)/2;
            if(arr[i]>n){
                end = i;
            }
            else if(arr[i]<n){
                start = i;
            }
            else {
                return i;
            }
        }while(start<end);
        return -1;
    }
}
