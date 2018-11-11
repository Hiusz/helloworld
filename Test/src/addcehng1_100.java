public class addcehng1_100 {
    public static void main(String[] args){
        int sumi=1;
        int count=1;
        int sum=0;
        do{
            sumi=sumi*count;
            sum=sum+sumi;
            count++;
        }while(count<=10);
        System.out.println(sum);
    }
}
