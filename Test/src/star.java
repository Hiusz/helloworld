public class star {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println();
            for (int j = 0; j <5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <((i-1)*2+1); j++) {
                System.out.print("*");
            }
        }
    }
}
