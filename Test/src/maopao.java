import java.util.Arrays;

public class maopao {
    public static void main(String[] args) {
        int arr[]={44,1,95,56,24,5,4,14,25,7,12,84,2,32};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

            System.out.println(Arrays.toString(arr));

    }
}
